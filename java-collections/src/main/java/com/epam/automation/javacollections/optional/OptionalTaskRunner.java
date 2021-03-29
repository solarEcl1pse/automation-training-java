package com.epam.automation.javacollections.optional;

import java.util.Scanner;

/**
 * Java. Collections
 * Optional task
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class OptionalTaskRunner {

    public static void main(String[] args) {
        System.out.println("Choose one of the programs below and enter its number:\n" +
                "1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.\n" +
                "2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.\n" +
                "3. Создать список из элементов каталога и его подкаталогов.\n" +
                "4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.\n" +
                "5. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.\n" +
                "6. Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.\n" +
                "7. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок. Использовать стек.\n" +
                "8. Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.");
        Scanner scanner = new Scanner(System.in);
        int program = scanner.nextInt();
        switch (program) {
            case 1 -> FirstOptionalProgram.doTask();
            case 2 -> SecondOptionalProgram.doTask();
            case 3 -> ThirdOptionalProgram.doTask();
            case 4 -> FourthOptionalProgram.doTask();
            case 5 -> FifthOptionalProgram.doTask();
            case 6 -> SixthOptionalProgram.doTask();
            case 7 -> SeventhOptionalProgram.doTask();
            case 8 -> EighthOptionalProgram.doTask();
        }
        scanner.close();
    }
}
