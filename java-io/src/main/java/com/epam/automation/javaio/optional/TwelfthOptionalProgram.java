package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * 12. Из текстового файла ввести последовательность строк. Выделить отдельные слова, разделяемые пробелами. Написать метод поиска слова по образцу-шаблону. Вывести найденное слово в другой файл.
 */
public class TwelfthOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file12.txt");
        File outputFile = new File("optional_file12.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the search word:");
        String searchWord = scanner.next();
        var statement = new Object() {
            boolean searchCompleted = false;
        };
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                if (!statement.searchCompleted) {
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " ", false);
                    while (stringTokenizer.hasMoreTokens()) {
                        String word = stringTokenizer.nextToken();
                        if (word.equals(searchWord)) {
                            try {
                                fileWriter.write(word + "\n");
                                statement.searchCompleted = true;
                                break;
                            } catch (IOException exception) {
                                exception.printStackTrace();
                            }
                        }
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
