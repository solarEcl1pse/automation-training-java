package com.epam.automation.javafundamentals.main;

import com.epam.automation.javafundamentals.interfaces.MainProgram;

import java.util.Scanner;

/**
 * 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */
public class FifthMainProgram implements MainProgram {

    @Override
    public void doTask() {
        System.out.println("Enter the month number from 1 to 12:");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("The input is not a number.\nEnter the month number from 1 to 12:");
            scanner.next();
        }
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1 -> System.out.println(monthNumber + " is January");
            case 2 -> System.out.println(monthNumber + " is February");
            case 3 -> System.out.println(monthNumber + " is March");
            case 4 -> System.out.println(monthNumber + " is April");
            case 5 -> System.out.println(monthNumber + " is May");
            case 6 -> System.out.println(monthNumber + " is June");
            case 7 -> System.out.println(monthNumber + " is July");
            case 8 -> System.out.println(monthNumber + " is August");
            case 9 -> System.out.println(monthNumber + " is September");
            case 10 -> System.out.println(monthNumber + " is October");
            case 11 -> System.out.println(monthNumber + " is November");
            case 12 -> System.out.println(monthNumber + " is December");
            default -> System.out.println("There are only 12 months in a year!");
        }
        scanner.close();
    }
}
