package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 11. Ввести из текстового файла, связанного с входным потоком, последовательность строк. Выбрать и сохранить m последних слов в каждой из последних n строк.
 */
public class EleventhOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file11.txt");
        File outputFile = new File("optional_file11.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of last words (m):");
        int lastWordsNumber = scanner.nextInt();
        System.out.println("Enter the quantity of last lines (n):");
        int lastLinesNumber = scanner.nextInt();
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            String[] lines = streamLines.toArray(String[]::new);
            for (int i = 0; i < lines.length - lastLinesNumber; i++) {
                try {
                    fileWriter.write(lines[i] + "\n");
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
            ArrayList<String> lastLines = new ArrayList<>();
            for (int i = 1; i <= lastLinesNumber; i++) {
                lastLines.add(lines[lines.length - i]);
            }
            lastLines.forEach(line -> {
                StringBuilder stringBuilder = new StringBuilder();
                String[] words = line.split("\\s");
                for (int i = 0; i < words.length - lastWordsNumber; i++) {
                    if (i != words.length - lastWordsNumber - 1) {
                        stringBuilder.append(words[i]).append(" ");
                    } else {
                        stringBuilder.append(words[i]);
                    }
                }
                try {
                    fileWriter.write(stringBuilder.toString() + "\n");
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
