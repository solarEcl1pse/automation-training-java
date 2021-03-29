package com.epam.automation.javafundamentals.main;

import java.util.Scanner;

/**
 * Java. Fundamentals
 * Main task
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class MainTaskRunner {

    public static void main(String[] args) {
        System.out.println("Choose one of the programs below and enter its number:\n" +
                "1. Приветствовать любого пользователя при вводе его имени через командную строку.\n" +
                "2. Отобразить в окне консоли аргументы командной строки в обратном порядке.\n" +
                "3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.\n" +
                "4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.\n" +
                "5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
        Scanner scanner = new Scanner(System.in);
        int program = scanner.nextInt();
        switch (program) {
            case 1 -> FirstMainProgram.doTask();
            case 2 -> SecondMainProgram.doTask();
            case 3 -> ThirdMainProgram.doTask();
            case 4 -> FourthMainProgram.doTask();
            case 5 -> FifthMainProgram.doTask();
        }
        scanner.close();
    }
}
