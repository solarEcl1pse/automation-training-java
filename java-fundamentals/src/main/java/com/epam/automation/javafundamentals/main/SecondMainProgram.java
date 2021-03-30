package com.epam.automation.javafundamentals.main;

import java.util.Scanner;

/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class SecondMainProgram {

    public static void doTask() {
        System.out.println("Enter the arguments:");
        Scanner scanner = new Scanner(System.in);
        String args = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(args);
        StringBuilder reversedArgs = stringBuilder.reverse();
        System.out.println("Reversed arguments:\n" + reversedArgs.toString());
        scanner.close();
    }
}
