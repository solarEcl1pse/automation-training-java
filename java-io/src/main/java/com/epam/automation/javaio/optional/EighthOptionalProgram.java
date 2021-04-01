package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * 8. Прочитать текст Java-программы и удалить из него все «лишние» пробелы и табуляции, оставив только необходимые для разделения операторов.
 */
public class EighthOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file8.java");
        File outputFile = new File("optional_file8.txt");
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                String newLine = line.replaceAll("[\\s&&[^\r?\n]]{2,}", " ")
                        .replaceAll("( ?(\r\n)){2,}", "\r\n")
                        .replaceAll("( ?\n){2,}", "\n")
                        .replaceAll("^ ", "");
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
