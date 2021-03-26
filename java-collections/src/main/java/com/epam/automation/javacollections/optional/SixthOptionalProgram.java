package com.epam.automation.javacollections.optional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 6. Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
 */
public class SixthOptionalProgram {

    final static String SOURCE_PATH = "src/main/resources/poem.txt";

    public void doTask() {
        ArrayList<String> arrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(SOURCE_PATH))) {
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(arrayList.toString());
        Collections.sort(arrayList);
        System.out.println(arrayList.toString());
    }
}
