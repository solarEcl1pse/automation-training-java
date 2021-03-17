package com.epam.automation.javafundamentals.optional;

import com.epam.automation.javafundamentals.interfaces.OptionalProgram;

/**
 * 5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 */
public class FifthOptionalProgram implements OptionalProgram {

    @Override
    public void doTask(Integer[] numbers) {
        int evenDigitsNumberCounter = 0;
        int equalEvenOddDigitsNumberCounter = 0;
        for (int number : numbers) {
            char[] digits = Integer.toString(number).toCharArray();
            boolean hasEvenDigits = true;
            int evenDigitsCounter = 0, oddDigitsCounter = 0;
            for (int digit : digits) {
                if (!(digit % 2 == 0)) {
                    hasEvenDigits = false;
                    oddDigitsCounter++;
                } else {
                    evenDigitsCounter++;
                }
            }
            if (hasEvenDigits) {
                evenDigitsNumberCounter++;
            }
            if (evenDigitsCounter == oddDigitsCounter) {
                equalEvenOddDigitsNumberCounter++;
            }
        }
        System.out.println(evenDigitsNumberCounter > 0 ? "Quantity of numbers with even digits:\n" + evenDigitsNumberCounter : "There is no numbers with even digits!");
        System.out.println(equalEvenOddDigitsNumberCounter > 0 ? "Quantity of numbers with equal amount of even and odd digits :\n" + equalEvenOddDigitsNumberCounter : "There is no numbers with equal amount of even and odd digits!");
    }
}
