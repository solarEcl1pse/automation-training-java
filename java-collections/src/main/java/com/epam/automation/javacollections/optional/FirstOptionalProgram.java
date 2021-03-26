package com.epam.automation.javacollections.optional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */
public class FirstOptionalProgram {

    final static String INPUT_FILE_PATH = "src/main/resources/poem.txt";
    final static String OUTPUT_FILE_PATH = "src/main/resources/reverse_poem.txt";

    public void doTask() {
        ArrayList<String> arrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(INPUT_FILE_PATH))) {
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (FileWriter fileWriter = new FileWriter(OUTPUT_FILE_PATH)) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                fileWriter.write(arrayList.get(i) + "\n");
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
