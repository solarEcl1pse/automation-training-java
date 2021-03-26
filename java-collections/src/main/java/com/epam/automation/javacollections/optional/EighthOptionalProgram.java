package com.epam.automation.javacollections.optional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

/**
 * 8. Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.
 */
public class EighthOptionalProgram {

    final static String ENGLISH_TEXT_PATH = "src/main/resources/english_text.txt";

    public void doTask() {
        HashSet<String> hashSet = new HashSet<>();
        try (Scanner scanner = new Scanner(new File(ENGLISH_TEXT_PATH))) {
            while (scanner.hasNextLine()) {
                String word = scanner.next();
                hashSet.add(word.toLowerCase(Locale.ROOT));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(hashSet.toString());
    }
}
