package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * 6. Файл содержит символы, слова, целые числа и числа с плавающей запятой. Определить все данные, тип которых вводится из командной строки.
 */
public class SixthOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file6.txt");
        File outputFile = new File("optional_file6.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of data:");
        String type = scanner.next();
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                StringTokenizer stringTokenizer = new StringTokenizer(line, " ", false);
                while (stringTokenizer.hasMoreTokens()) {
                    String data = stringTokenizer.nextToken();
                    switch (type) {
                        case "Integer", "int" -> {
                            if (data.matches("\\d+")) {
                                try {
                                    fileWriter.write(data + "\n");
                                } catch (IOException exception) {
                                    exception.printStackTrace();
                                }
                            }
                        }
                        case "Float", "float", "Double", "double" -> {
                            if (data.matches(".")) {
                                try {
                                    fileWriter.write(data + "\n");
                                } catch (IOException exception) {
                                    exception.printStackTrace();
                                }
                            }
                        }
                        case "Character", "char" -> {
                            if (data.length() == 1 && !data.matches("\\d")) {
                                try {
                                    fileWriter.write(data + "\n");
                                } catch (IOException exception) {
                                    exception.printStackTrace();
                                }
                            }
                        }
                        case "String" -> {
                            if (data.length() > 1 && !data.matches("\\d")) {
                                try {
                                    fileWriter.write(data + "\n");
                                } catch (IOException exception) {
                                    exception.printStackTrace();
                                }
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
