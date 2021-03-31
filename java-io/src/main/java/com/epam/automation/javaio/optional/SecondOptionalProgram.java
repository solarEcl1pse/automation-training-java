package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * 2. Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.
 */
public class SecondOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file2.java");
        File outputFile = new File("optional_file2.txt");
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                String newLine = !line.contains("class") ? line.replace("public", "private") : line;
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
