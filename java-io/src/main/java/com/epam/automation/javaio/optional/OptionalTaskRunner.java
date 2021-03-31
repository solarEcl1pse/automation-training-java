package com.epam.automation.javaio.optional;

import java.util.Scanner;

/**
 * Java. I/O
 * Optional task
 * <p>
 * Выполнить указанные действия по чтению информации из файла, ее обработке и записи в файл.
 * При разработке для вывода результатов создавать новую директорию и файл средствами класса File.
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class OptionalTaskRunner {

    public static void main(String[] args) {
        System.out.println("Choose one of the programs below and enter its number:\n" +
                "1. Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.\n" +
                "2. Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.\n" +
                "3. Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.\n" +
                "4. Прочитать текст Java-программы и в каждом слове длиннее двух символов все строчные символы заменить прописными.\n" +
                "5. В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов, которые имеют средний балл более 7.\n" +
                "6. Файл содержит символы, слова, целые числа и числа с плавающей запятой. Определить все данные, тип которых вводится из командной строки.\n" +
                "7. Из файла удалить все слова, содержащие от трех до пяти символов, но при этом из каждой строки должно быть удалено только максимальное четное количество таких слов.\n" +
                "8. Прочитать текст Java-программы и удалить из него все «лишние» пробелы и табуляции, оставив только необходимые для разделения операторов.\n" +
                "9. Из текста Java-программы удалить все виды комментариев.\n" +
                "10. Прочитать строки из файла и поменять местами первое и последнее слова в каждой строке.\n" +
                "11. Ввести из текстового файла, связанного с входным потоком, последовательность строк. Выбрать и сохранить m последних слов в каждой из последних n строк.\n" +
                "12. Из текстового файла ввести последовательность строк. Выделить отдельные слова, разделяемые пробелами. Написать метод поиска слова по образцу-шаблону. Вывести найденное слово в другой файл.\n" +
                "13. Сохранить в файл, связанный с выходным потоком, записи о телефонах и их владельцах. Вывести в файл записи, телефоны в которых начинаются на k и на j.");
        Scanner scanner = new Scanner(System.in);
        int program = scanner.nextInt();
        switch (program) {
            case 1 -> FirstOptionalProgram.doTask();
            case 2 -> SecondOptionalProgram.doTask();
            case 3 -> ThirdOptionalProgram.doTask();
            case 4 -> FourthOptionalProgram.doTask();
            case 5 -> FifthOptionalProgram.doTask();
            case 6 -> SixthOptionalProgram.doTask(); //toDo
            case 7 -> SeventhOptionalProgram.doTask();
            case 8 -> EighthOptionalProgram.doTask(); //toDo
            case 9 -> NinthOptionalProgram.doTask();
            case 10 -> TenthOptionalProgram.doTask();
            case 11 -> EleventhOptionalProgram.doTask(); //toDo
            case 12 -> TwelfthOptionalProgram.doTask(); //toDo
            case 13 -> ThirteenthOptionalProgram.doTask(); //toDo
        }
        scanner.close();
    }
}
