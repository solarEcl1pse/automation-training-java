package com.epam.automation.javafundamentals.optional;

import com.epam.automation.javafundamentals.interfaces.OptionalProgram;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */
public class FirstOptionalProgram implements OptionalProgram {

    @Override
    public void doTask(Integer[] numbers) {
        Arrays.sort(numbers, Comparator.comparingInt(number -> String.valueOf(Math.abs(number)).length()));
        System.out.println("The shortest number:\n" + numbers[0].toString());
        System.out.println("Its length:\n" + String.valueOf(Math.abs(numbers[0])).length());
        System.out.println("The longest number:\n" + numbers[numbers.length - 1].toString());
        System.out.println("Its length:\n" + String.valueOf(Math.abs(numbers[numbers.length - 1])).length());
    }
}
