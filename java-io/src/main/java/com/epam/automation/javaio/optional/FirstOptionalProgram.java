package com.epam.automation.javaio.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * 1. Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
 */
public class FirstOptionalProgram {

    public static void doTask() {
        File file = new File("optional_file1.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            Random random = new Random();
            List<Integer> list = Stream.generate(random::nextInt)
                    .limit(5)
                    .sorted(Comparator.comparingInt(number -> number))
                    .collect(toList());
            list.forEach(number -> {
                try {
                    fileWriter.write(number.toString() + "\n");
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
