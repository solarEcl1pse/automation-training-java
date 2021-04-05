package com.epam.automation.javathreads.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Java. Threads
 * Main task
 * <p>
 * Разработать консольное многопоточное приложение.
 * Использовать возможности, предоставляемые пакетом java.util.concurrent.
 * Все сущности, желающие получить доступ к ресурсу, должны быть потоками.
 * <p>
 * Автостоянка.
 * Доступно несколько машиномест.
 * На одном месте может находиться только один автомобиль.
 * Если все места заняты, то автомобиль не станет ждать больше определенного времени и уедет на другую стоянку.
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class MainTaskRunner {

    public static void main(String[] args) {
        List<ParkingPlace> parkingPlaces = new ArrayList<>() {
            {
                this.add(new ParkingPlace(1));
                this.add(new ParkingPlace(2));
                this.add(new ParkingPlace(3));
                this.add(new ParkingPlace(4));
                this.add(new ParkingPlace(5));
                this.add(new ParkingPlace(6));
                this.add(new ParkingPlace(7));
                this.add(new ParkingPlace(8));
                this.add(new ParkingPlace(9));
                this.add(new ParkingPlace(10));

            }
        };
        Parking<ParkingPlace> parking = new Parking<>(parkingPlaces);
        for (int i = 0; i < 15; i++) {
            new Car(parking).start();
        }
    }
}
