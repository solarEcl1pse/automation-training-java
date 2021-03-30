package com.epam.automation.javafundamentals.optional;

import java.util.Arrays;

/**
 * 4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
 */
public class FourthOptionalProgram {

    public static void doTask(Integer[] numbers) {
        Integer[] distinctDigitsNumber = new Integer[]{null, 10};
        for (int number : numbers) {
            char[] digits = Integer.toString(number).toCharArray();
            Arrays.sort(digits);
            int distinctDigitsCounter = 0;
            for (int i = 0, j = i + 1; i < digits.length - 1; i++, j++) {
                if (!(digits[i] == digits[j])) {
                    distinctDigitsCounter++;
                }
            }
            if (distinctDigitsNumber[1] >= distinctDigitsCounter) {
                distinctDigitsNumber[1] = distinctDigitsCounter;
                distinctDigitsNumber[0] = number;
            }
        }
        System.out.println("Number with minimal distinct digits:\n" + distinctDigitsNumber[0]);
    }
}
