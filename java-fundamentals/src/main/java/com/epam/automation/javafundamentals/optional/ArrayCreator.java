package com.epam.automation.javafundamentals.optional;

import java.util.Scanner;

public class ArrayCreator {

    public Integer[] createArray() {
        System.out.println("Enter the quantity of numbers:");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("The input is not a number.\nEnter the quantity of numbers:");
            scanner.next();
        }
        int quantity = scanner.nextInt();
        Integer[] numbers = new Integer[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the number:");
            while (!scanner.hasNextInt()) {
                System.out.println("The input is not a number.\nEnter the number:");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}
