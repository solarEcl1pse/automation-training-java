package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * 9. Из текста Java-программы удалить все виды комментариев.
 */
public class NinthOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file9.java");
        File outputFile = new File("optional_file9.txt");
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                String newLine = line.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", "");
                try {
                    fileWriter.write(newLine + "\n");
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
