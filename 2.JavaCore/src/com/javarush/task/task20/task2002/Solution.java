package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.System.in;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("C:\\11\\MyFile.txt");
            InputStream inputStream = new FileInputStream("C:\\11\\MyFile.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User userMike = new User();
            userMike.setFirstName("Mike");
            userMike.setLastName("Brown");
            userMike.setBirthDate(new Date());
            userMike.setCountry(User.Country.RUSSIA);
            userMike.setMale(true);
//            javaRush.users.add(userMike);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if (javaRush.equals(loadedObject)) System.out.println("yeah!");
            else System.out.println("NO");

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try (PrintWriter writer = new PrintWriter(outputStream, true)){
                if (users.size() != 0){
                    writer.write(users.size() + System.lineSeparator());
                    users.forEach(user -> writer.write(user.getFirstName() + System.lineSeparator() + user.getLastName() + System.lineSeparator() +
                            user.getBirthDate().getTime() + System.lineSeparator() + user.getCountry() + System.lineSeparator() + user.isMale() + System.lineSeparator()));
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            if (br.ready()) {
                int count = Integer.parseInt(br.readLine());
                for (int i = 0; i < count; i++) {
                    User user = new User();
                    user.setFirstName(br.readLine());
                    user.setLastName(br.readLine());
                    user.setBirthDate(new Date(Long.parseLong(br.readLine())));
                    String country = br.readLine();
                    switch (country) {
                        case "RUSSIA":
                            user.setCountry(User.Country.RUSSIA);
                            break;
                        case "UKRAINE":
                            user.setCountry(User.Country.UKRAINE);
                            break;
                        case "OTHER":
                            user.setCountry(User.Country.OTHER);
                            break;
                    }
                    boolean male = br.readLine().equals("true");
                    user.setMale(male);
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
