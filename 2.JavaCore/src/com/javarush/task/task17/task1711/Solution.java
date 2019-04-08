package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);


        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], format.parse(args[i + 2])));
                            System.out.println(allPeople.size() - 1);
                        } else if (args[i + 1].equals("ж")) {
                            allPeople.add(Person.createFemale(args[i], format.parse(args[i + 2])));
                            System.out.println(allPeople.size() - 1);
                        }
                    }

                }
                break;


            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        int id = Integer.parseInt(args[i]);

                        allPeople.get(id).setName(args[i + 1]);

                        if (args[i + 2].equals("м")) {
                            allPeople.get(id).setSex(Sex.MALE);
                        } else if (args[i + 2].equals("ж")) {
                            allPeople.get(id).setSex(Sex.FEMALE);
                        }

                        allPeople.get(id).setBirthDate(format.parse(args[i + 3]));
                    }

                }
                break;


            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);

                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                    }

                }
                break;


            case "-i":
                synchronized (allPeople) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                    if (args[0].equals("-i")) {

                        for (int i = 1; i < args.length; i++) {
                            int id = Integer.parseInt(args[i]);

                            if (allPeople.get(id).getSex().equals(Sex.FEMALE))
                                System.out.println(allPeople.get(id).getName() + " ж " + sdf.format(allPeople.get(id).getBirthDate()));
                            if (allPeople.get(id).getSex().equals(Sex.MALE))
                                System.out.println(allPeople.get(id).getName() + " м " + sdf.format(allPeople.get(id).getBirthDate()));
                        }
                    }

                }
                break;


        }
    }
}
