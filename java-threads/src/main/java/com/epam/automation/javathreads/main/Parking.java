package com.epam.automation.javathreads.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Parking<T extends ParkingPlace> {

    private final static int POOL_SIZE = 10;
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
    private final ArrayList<ParkingPlace> parkingPlaces = new ArrayList<>();

    public Parking(List<ParkingPlace> source) {
        parkingPlaces.addAll(source);
    }

    public ParkingPlace getParkingPlace(Car car) throws NoFreeParkingPlaceException {
        try {
            if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
                for (ParkingPlace parkingPlace : parkingPlaces) {
                    if (!parkingPlace.isBusy()) {
                        parkingPlace.setBusy(true);
                        System.out.println("Car #" + car.getId() + " took " + parkingPlace.toString() + ".");
                        return parkingPlace;
                    }
                }
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
        throw new NoFreeParkingPlaceException();
    }

    public void releaseParkingPlace(Car car, ParkingPlace parkingPlace) {
        parkingPlace.setBusy(false);
        System.out.println("Car #" + car.getId() + " left " + parkingPlace.toString() + ".");
        semaphore.release();
        System.out.println(parkingPlace.toString() + " is free.");
    }
}
