package com.epam.automation.javafundamentals.main;

import java.util.Scanner;

/**
 * 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */
public class FourthMainProgram {

    public static void doTask() {
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("The input is not a number.\nEnter the first number:");
            scanner.next();
        }
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        while (!scanner.hasNextInt()) {
            System.out.println("The input is not a number.\nEnter the second number:");
            scanner.next();
        }
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum:\n" + sum);
        int product = firstNumber * secondNumber;
        System.out.println("Product:\n" + product);
        scanner.close();
    }
}
