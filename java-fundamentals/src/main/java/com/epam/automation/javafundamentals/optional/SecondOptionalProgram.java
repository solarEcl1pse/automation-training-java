package com.epam.automation.javafundamentals.optional;

import com.epam.automation.javafundamentals.interfaces.OptionalProgram;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2. Вывести числа в порядке возрастания (убывания) значений их длины.
 */
public class SecondOptionalProgram implements OptionalProgram {

    @Override
    public void doTask(Integer[] numbers) {
        Arrays.sort(numbers, Comparator.comparingInt(number -> String.valueOf(Math.abs(number)).length()));
        System.out.println("Ascending:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        Arrays.sort(numbers, Comparator.comparingInt(number -> String.valueOf(Math.abs((Integer) number)).length()).reversed());
        System.out.println("\nDescending:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
