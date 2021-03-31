package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * 7. Из файла удалить все слова, содержащие от трех до пяти символов, но при этом из каждой строки должно быть удалено только максимальное четное количество таких слов.
 */
public class SeventhOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file7.txt");
        File outputFile = new File("optional_file7.txt");
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                StringTokenizer stringTokenizer1 = new StringTokenizer(line, " ", true);
                StringBuilder stringBuilder = new StringBuilder();
                int definiteWordsCounter = 0;
                while (stringTokenizer1.hasMoreTokens()) {
                    String word = stringTokenizer1.nextToken();
                    if (word.length() >= 3 & word.length() <= 5) {
                        definiteWordsCounter++;
                    }
                }
                int definiteWordsMaxValue = definiteWordsCounter;
                StringTokenizer stringTokenizer2 = new StringTokenizer(line, " ", true);
                while (stringTokenizer2.hasMoreTokens()) {
                    String word = stringTokenizer2.nextToken();
                    boolean commonWord = word.length() < 3 | word.length() > 5;
                    if (definiteWordsMaxValue % 2 == 0) {
                        if (commonWord) {
                            stringBuilder.append(word);
                        }
                    } else {
                        if (commonWord) {
                            stringBuilder.append(word);
                        } else {
                            definiteWordsCounter--;
                            if (definiteWordsCounter == 0) {
                                stringBuilder.append(word);
                            }
                        }
                    }
                }
                String newLine = stringBuilder.toString();
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
