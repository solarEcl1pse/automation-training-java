package com.epam.automation.javafundamentals.main;

import com.epam.automation.javafundamentals.interfaces.MainProgram;

import java.util.Scanner;

/**
 * 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */
public class FirstMainProgram implements MainProgram {

    @Override
    public static void doTask() {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hi, " + name + "!");
        scanner.close();
    }
}
