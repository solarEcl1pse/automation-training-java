package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 13. Сохранить в файл, связанный с выходным потоком, записи о телефонах и их владельцах. Вывести в файл записи, телефоны в которых начинаются на k и на j.
 */
public class ThirteenthOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file13.txt");
        File outputFile = new File("optional_file13.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phone number start digit (k):");
        int startNumberK = scanner.nextInt();
        System.out.println("Enter the phone number start digit (j):");
        int startNumberJ = scanner.nextInt();
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                String surname = line.replaceAll("\\W*\\d*\\s*", "");
                String phoneNumber = line.replace(surname + " - ", "");
                if (phoneNumber.startsWith(String.valueOf(startNumberK)) || phoneNumber.startsWith(String.valueOf(startNumberJ))) {
                    try {
                        fileWriter.write(line + "\n");
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
