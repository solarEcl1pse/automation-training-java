package com.epam.automation.javafundamentals.optional;

import java.util.Scanner;

/**
 * Java. Fundamentals
 * Optional task 1
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class OptionalTaskRunner {

    public static void main(String[] args) {
        System.out.println("Choose one of the programs below and enter its number:\n" +
                "1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.\n" +
                "2. Вывести числа в порядке возрастания (убывания) значений их длины.\n" +
                "3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.\n" +
                "4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.\n" +
                "5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.\n" +
                "6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.\n" +
                "7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.");
        Scanner scanner = new Scanner(System.in);
        int program = scanner.nextInt();
        switch (program) {
            case 1 -> FirstOptionalProgram.doTask(ArrayCreator.createArray());
            case 2 -> SecondOptionalProgram.doTask(ArrayCreator.createArray());
            case 3 -> ThirdOptionalProgram.doTask(ArrayCreator.createArray());
            case 4 -> FourthOptionalProgram.doTask(ArrayCreator.createArray());
            case 5 -> FifthOptionalProgram.doTask(ArrayCreator.createArray());
            case 6 -> SixthOptionalProgram.doTask(ArrayCreator.createArray());
            case 7 -> SeventhOptionalProgram.doTask(ArrayCreator.createArray());
        }
        scanner.close();
    }
}
