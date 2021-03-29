package com.epam.automation.javacollections.optional;

import java.io.File;
import java.util.Arrays;

/**
 * 3. Создать список из элементов каталога и его подкаталогов.
 */
public class ThirdOptionalProgram {

    final static String DIRECTORY_PATH = "src/main/resources";

    public static void doTask() {
        File directory = new File(DIRECTORY_PATH);
        System.out.println(Arrays.toString(directory.list()));
    }
}
