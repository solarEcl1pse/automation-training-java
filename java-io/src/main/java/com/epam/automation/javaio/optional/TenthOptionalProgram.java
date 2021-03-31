package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * 10. Прочитать строки из файла и поменять местами первое и последнее слова в каждой строке.
 */
public class TenthOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file10.txt");
        File outputFile = new File("optional_file10.txt");
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                String[] words = line.split("\\s");
                String firstWord = words[0];
                String lastWord = words[words.length - 1];
                words[0] = lastWord;
                words[words.length - 1] = firstWord;
                for (String word : words) {
                    if (!word.equals(words[words.length - 1])) {
                        try {
                            fileWriter.write(word + " ");
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    } else {
                        try {
                            fileWriter.write(word + "\n");
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
