package com.javarush.task.task33.task3309;

import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

/*
Комментарий внутри xml
*/
public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) {
        StringWriter stringWriter = new StringWriter();
        try {
            //Создаем новый инстанс JAXBContext
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            //Из инстанса контекста получаем marshaller
            Marshaller marshaller = context.createMarshaller();
            //У marshaller устанавливаем свойство Marshaller.JAXB_FORMATTED_OUTPUT в истину, чтобы вывод был разбит по строчкам
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            //Создаем фабрику DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //Для преобразования CDATA узлов в текст устанавливаем factory.setCoalescing(true)
            factory.setCoalescing(true);
            //Создаем новый DocumentBuilder
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            //С помощью билдера создаем новый документ
            Document document = documentBuilder.newDocument();
            //Маршализуем объект в документ
            marshaller.marshal(obj, document);
            //из документа получаем список всех узлов
            NodeList nodeList = document.getElementsByTagName("*");
            //Перебираем узлы
            for (int i = 0; i < nodeList.getLength(); i++) {
                //Получаем узел
                Node node = nodeList.item(i);
                //Если имя узла соответствует заданному, то вставляем перед ним comment
                if (node.getNodeName().equals(tagName))
                    //заменяем
                    node.getParentNode().insertBefore(document.createComment(comment), node);
                //Если тип первого дочернего узла ревен Node.TEXT_NODE и содержит символы <>&\', то заменяем узел на CDATASection
                if (node.getFirstChild().getNodeType() == node.TEXT_NODE && node.getFirstChild().getTextContent().matches(".*[<>&\'\"].*")) {
                    //Создаем CDATASection из контекста дочернего узла
                    CDATASection cdataSection = document.createCDATASection(node.getFirstChild().getTextContent());
                    //заменяем
                    node.replaceChild(cdataSection, node.getFirstChild());
                }
            }
            //Получаем инстанс TransformerFactory
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            //Получаем transformer
            Transformer transformer = transformerFactory.newTransformer();
            //Устанавливаем свойства вывода
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");  // для пеерноса строк
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); // кодировка
            transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
            //Трансформируем данные из документа в StringWriter
            transformer.transform(new DOMSource(document), new StreamResult(stringWriter));
        } catch (JAXBException | ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }

        return stringWriter.toString();
    }

    public static void main(String[] args) {

    }
}
