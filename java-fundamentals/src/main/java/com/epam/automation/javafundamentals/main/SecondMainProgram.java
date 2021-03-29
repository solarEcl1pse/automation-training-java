package com.epam.automation.javafundamentals.main;

import com.epam.automation.javafundamentals.interfaces.MainProgram;

import java.util.Scanner;

/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class SecondMainProgram implements MainProgram {

    @Override
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
