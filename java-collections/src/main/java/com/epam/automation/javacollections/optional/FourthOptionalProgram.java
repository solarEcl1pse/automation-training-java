package com.epam.automation.javacollections.optional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
 */
public class FourthOptionalProgram {

    final static String POEM_PATH = "src/main/resources/poem.txt";

    public static void doTask() {
        ArrayList<String> arrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(POEM_PATH))) {
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(arrayList.toString());
        arrayList.sort(Comparator.comparingInt(String::length));
        System.out.println(arrayList.toString());
    }
}
