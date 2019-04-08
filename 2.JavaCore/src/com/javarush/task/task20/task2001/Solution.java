package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("C:\\11\\MyFile.txt");
            InputStream inputStream = new FileInputStream("C:\\11\\MyFile.txt");

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if (somePerson.equals(ivanov)) System.out.println("bro");
            else System.out.println("nope!");

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try (PrintWriter writer = new PrintWriter(outputStream, true)) {
                writer.write(name);
                writer.write(System.lineSeparator());
                String isHumanPresent = assets.isEmpty() ? "yes" : "no";
                writer.write(isHumanPresent);
                writer.write(System.lineSeparator());
                if (isHumanPresent.equals("no")) {
                    Integer size = assets.size();
                    writer.write(size.toString());
                    writer.write(System.lineSeparator());
                    assets.forEach(asset -> writer.write(asset.getName() + " " + asset.getPrice() + System.lineSeparator()));
                    writer.write(System.lineSeparator());
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNext()) {
                name = sc.nextLine();
                if (sc.nextLine().equals("no")) {
                    int co = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < co; i++) {
                        String[] strings = sc.nextLine().split(" ");
                        assets.add(new Asset(strings[0], Double.parseDouble(strings[1])));
                    }
                }

            }
        }
    }
}

