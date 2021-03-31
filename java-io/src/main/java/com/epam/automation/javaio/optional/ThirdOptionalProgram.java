package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * 3. Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.
 */
public class ThirdOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file3.java");
        File outputFile = new File("optional_file3.txt");
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                StringBuilder newLine = new StringBuilder(line);
                newLine.reverse();
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
