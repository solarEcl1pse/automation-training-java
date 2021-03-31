package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * 5. В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов, которые имеют средний балл более 7.
 */
public class FifthOptionalProgram {

    public static void doTask() {
        File inputFile = new File("src/main/resources/optional_file5.txt");
        File outputFile = new File("optional_file5.txt");
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            Stream<String> streamLines = Files.lines(inputFile.toPath());
            streamLines.forEach(line -> {
                String surname = line.replaceAll("\\W*\\d*\\s*", "");
                String marksLine = line.replace(surname + " - ", "");
                StringTokenizer stringTokenizer = new StringTokenizer(marksLine, " ", false);
                int marksSum = 0;
                double marksCounter = stringTokenizer.countTokens();
                while (stringTokenizer.hasMoreTokens()) {
                    marksSum += Integer.parseInt(stringTokenizer.nextToken());
                }
                double averageMark = marksSum / marksCounter + marksSum % marksCounter;
                String newSurname;
                if (averageMark > 7) {
                    newSurname = surname.toUpperCase();
                    try {
                        fileWriter.write(newSurname + "\n");
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
