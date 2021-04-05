package com.epam.automation.javathreads.optional;

import java.util.ArrayList;
import java.util.List;

/**
 * Java. Threads
 * Optional task
 * <p>
 * В аэропорту есть 5 взлетно-посадочных полос.
 * Самолету требуется 3 минуты чтобы выйти на полосу, набрать скорость и взлететь.
 * После этого полоса свободна для вылета следующего самолета.
 * Реализовать симуляцию вылета 10 самолетов используя все доступные полосы.
 * 1 минуту реально времени заменить на 1 секунду в симуляции.
 * <p>
 * Вывести в консоль информацию о следующих событиях:
 * Самолет начал выход на полосу
 * Самолет взлетел
 * Полоса "приняла" самолет
 * Полоса освободилась
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class OptionalTaskRunner {

    public static void main(String[] args) {
        List<Runway> runways = new ArrayList<>() {
            {
                this.add(new Runway(1));
                this.add(new Runway(2));
                this.add(new Runway(3));
                this.add(new Runway(4));
                this.add(new Runway(5));
            }
        };
        Airport<Runway> airport = new Airport<>(runways);
        for (int i = 0; i < 10; i++) {
            new Airplane(airport).start();
        }
    }
}
