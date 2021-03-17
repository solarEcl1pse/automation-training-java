package com.epam.automation.javafundamentals.optional;

import com.epam.automation.javafundamentals.interfaces.OptionalProgram;

/**
 * 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */
public class ThirdOptionalProgram implements OptionalProgram {

    @Override
    public void doTask(Integer[] numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += String.valueOf(Math.abs(number)).length();
        }
        int average = sum / numbers.length;
        System.out.println("Shorter than average numbers:");
        for (Integer number : numbers) {
            int length = String.valueOf(Math.abs(number)).length();
            if (length < average) {
                System.out.println(number + ". Its length: " + length);
            }
        }
        System.out.println("\nNumbers with average length:");
        for (Integer number : numbers) {
            int length = String.valueOf(Math.abs(number)).length();
            if (length == average) {
                System.out.println(number + ". Its length: " + length);
            }
        }
        System.out.println("\nLonger than average numbers:");
        for (Integer number : numbers) {
            int length = String.valueOf(Math.abs(number)).length();
            if (length > average) {
                System.out.println(number + ". Its length: " + length);
            }
        }
    }
}
