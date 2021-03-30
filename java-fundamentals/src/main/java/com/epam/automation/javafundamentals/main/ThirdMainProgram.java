package com.epam.automation.javafundamentals.main;

import java.util.Random;
import java.util.Scanner;

/**
 * 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */
public class ThirdMainProgram {

    public static void doTask() {
        System.out.println("Enter the quantity of random numbers:");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("The input is not a number.\nEnter the quantity of random numbers:");
            scanner.next();
        }
        int quantity = scanner.nextInt();
        int[] numbers = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
            System.out.println(randomNumber);
        }
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        scanner.close();
    }
}
