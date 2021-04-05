package com.epam.automation.javathreads.main;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ParkingPlace {

    private final int parkingPlaceId;
    private volatile boolean busy;

    public ParkingPlace(int parkingPlaceId) {
        this.parkingPlaceId = parkingPlaceId;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void using() {
        try {
            System.out.println(this.toString() + " is busy.");
            TimeUnit.SECONDS.sleep(new Random().nextInt(5));
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Parking place #" + parkingPlaceId;
    }
}
