package com.epam.automation.javacollections.optional;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * 5. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.
 */
public class FifthOptionalProgram {

    public static void doTask() {
        Random random = new Random();
        List<Integer> arrayList = Stream.generate(random::nextInt)
                .limit(5)
                .collect(toList());
        System.out.println(arrayList.toString());
        arrayList.sort((e1, e2) -> e2);
        System.out.println(arrayList.toString());
    }
}
