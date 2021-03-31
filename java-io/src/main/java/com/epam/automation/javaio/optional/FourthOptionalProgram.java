package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * 4. Прочитать текст Java-программы и в каждом слове длиннее двух символов все строчные символы заменить прописными.
 */
public class FourthOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file4.java");
        File outputFile = new File("optional_file4.txt");
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                StringTokenizer stringTokenizer = new StringTokenizer(line, " ", true);
                StringBuilder stringBuilder = new StringBuilder();
                while (stringTokenizer.hasMoreTokens()) {
                    String word = stringTokenizer.nextToken();
                    if (word.length() > 2) {
                        stringBuilder.append(word.toLowerCase());
                    } else {
                        stringBuilder.append(word);
                    }
                }
                line = stringBuilder.toString();
                try {
                    fileWriter.write(line + "\n");
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
