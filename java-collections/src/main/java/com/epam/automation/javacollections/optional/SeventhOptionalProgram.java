package com.epam.automation.javacollections.optional;

import java.util.Scanner;
import java.util.Stack;

/**
 * 7. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок. Использовать стек.
 */
public class SeventhOptionalProgram {

    private boolean isOpeningBracket(char bracket) {
        return "({[".indexOf(bracket) != -1;
    }

    private boolean isClosingBracket(char bracket) {
        return ")}]".indexOf(bracket) != -1;
    }

    private boolean isPair(char opening, char closing) {
        return opening == '(' && closing == ')' || opening == '['
                && closing == ']' || opening == '{' && closing == '}';
    }

    public static void doTask() {
        System.out.println("Enter the expression with brackets:");
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        for (char c : input.toCharArray()) {
            if (isClosingBracket(c) && stack.isEmpty()) {
                System.out.println("The brackets are in wrong order!");
            }
            if (isOpeningBracket(c)) {
                stack.push(c);
            }
            if (isClosingBracket(c)) {
                if (isPair(stack.peek(), c)) {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("The brackets are in right order!");
        } else {
            System.out.println("The brackets are in wrong order!");
        }
    }
}
