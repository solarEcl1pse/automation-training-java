package com.epam.automation.javafundamentals.optional;

import com.epam.automation.javafundamentals.interfaces.OptionalProgram;

/**
 * 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
 */
public class SixthOptionalProgram implements OptionalProgram {

    @Override
    public void doTask(Integer[] numbers) {
        for (int number : numbers) {
            char[] digits = Integer.toString(number).toCharArray();
            for (int i = 0, j = i + 1; i < digits.length - 1; i++, j++) {
                if (digits[i] > digits[j]) {
                    break;
                } else if (i == digits.length - 2) {
                    System.out.println("Number with ascending digits:\n" + number);
                    return;
                }
            }
        }
        System.out.println("There is no number with ascending digits!");
    }
}
