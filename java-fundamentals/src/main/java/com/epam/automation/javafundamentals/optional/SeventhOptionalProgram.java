package com.epam.automation.javafundamentals.optional;

import java.util.Arrays;

/**
 * 7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
 */
public class SeventhOptionalProgram {

    public static void doTask(Integer[] numbers) {
        for (int number : numbers) {
            char[] digits = Integer.toString(number).toCharArray();
            Arrays.sort(digits);
            for (int i = 0, j = i + 1; i < digits.length - 1; i++, j++) {
                if (digits[i] == digits[j]) {
                    break;
                } else if (i == digits.length - 2) {
                    System.out.println("Number with distinct digits:\n" + number);
                    return;
                }
            }
        }
        System.out.println("There is no number with distinct digits!");
    }
}
