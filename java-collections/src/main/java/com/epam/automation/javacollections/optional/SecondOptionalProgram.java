package com.epam.automation.javacollections.optional;

import java.util.Scanner;
import java.util.Stack;

/**
 * 2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
 */
public class SecondOptionalProgram {

    public void doTask() {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        char[] digits = Integer.toString(scanner.nextInt()).toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char digit : digits) {
            stack.push(digit);
        }
        char[] reversedDigits = new char[stack.size()];
        while (!stack.isEmpty()) {
            for (int i = 0; i < reversedDigits.length; i++) {
                reversedDigits[i] = stack.pop();
            }
        }
        int reversedNumber = Integer.parseInt(new String(reversedDigits));
        System.out.println(reversedNumber);
        scanner.close();
    }
}
