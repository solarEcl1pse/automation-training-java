package com.epam.automation.javathreads.main;

public class Car extends Thread {

    private final Parking<ParkingPlace> parking;

    public Car(Parking<ParkingPlace> parking) {
        this.parking = parking;
    }

    public void run() {
        ParkingPlace parkingPlace = null;
        try {
            parkingPlace = parking.getParkingPlace(this);
            parkingPlace.using();
        } catch (NoFreeParkingPlaceException exception) {
            exception.getMessage();
        } finally {
            if (parkingPlace != null) {
                parking.releaseParkingPlace(this, parkingPlace);
            }
        }
    }
}
