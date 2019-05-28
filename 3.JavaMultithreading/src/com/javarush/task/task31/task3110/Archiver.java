package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;
import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

import static java.lang.System.in;

public class Archiver {

    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("Выберите операцию:");
        ConsoleHelper.writeMessage(Operation.CREATE.ordinal() + " - create archive");
        ConsoleHelper.writeMessage(Operation.ADD.ordinal() + " - add file to archive");
        ConsoleHelper.writeMessage(Operation.REMOVE.ordinal() + " - remove file from archive");
        ConsoleHelper.writeMessage(Operation.EXTRACT.ordinal() + " - extract files from archive");
        ConsoleHelper.writeMessage(Operation.CONTENT.ordinal() + " - content archive");
        ConsoleHelper.writeMessage(Operation.EXIT.ordinal() + " - exit");

        return Operation.values()[ConsoleHelper.readInt()];
    }

    public static void main(String[] args) {
        Operation operation = null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        } while (operation != Operation.EXIT);
    }
}
