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
        ArrayCreator arrayCreator = new ArrayCreator();
        int program = scanner.nextInt();
        switch (program) {
            case 1 -> {
                FirstOptionalProgram firstOptionalProgram = new FirstOptionalProgram();
                firstOptionalProgram.doTask(arrayCreator.createArray());
            }
            case 2 -> {
                SecondOptionalProgram secondOptionalProgram = new SecondOptionalProgram();
                secondOptionalProgram.doTask(arrayCreator.createArray());
            }
            case 3 -> {
                ThirdOptionalProgram thirdOptionalProgram = new ThirdOptionalProgram();
                thirdOptionalProgram.doTask(arrayCreator.createArray());
            }
            case 4 -> {
                FourthOptionalProgram fourthOptionalProgram = new FourthOptionalProgram();
                fourthOptionalProgram.doTask(arrayCreator.createArray());
            }
            case 5 -> {
                FifthOptionalProgram fifthOptionalProgram = new FifthOptionalProgram();
                fifthOptionalProgram.doTask(arrayCreator.createArray());
            }
            case 6 -> {
                SixthOptionalProgram sixthOptionalProgram = new SixthOptionalProgram();
                sixthOptionalProgram.doTask(arrayCreator.createArray());
            }
            case 7 -> {
                SeventhOptionalProgram seventhOptionalProgram = new SeventhOptionalProgram();
                seventhOptionalProgram.doTask(arrayCreator.createArray());
            }
        }
        scanner.close();
    }
}
