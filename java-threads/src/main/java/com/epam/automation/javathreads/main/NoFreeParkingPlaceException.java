package com.epam.automation.javathreads.main;

public class NoFreeParkingPlaceException extends Throwable {

    public NoFreeParkingPlaceException() {
        System.out.println("There is no parking place available!");
    }
}
