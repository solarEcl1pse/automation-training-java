package com.epam.automation.javathreads.optional;

public class Airplane extends Thread {

    private final Airport<Runway> airport;

    public Airplane(Airport<Runway> airport) {
        this.airport = airport;
    }

    public void run() {
        Runway runway = null;
        try {
            runway = airport.getRunway(this);
            runway.using();
        } catch (NoFreeRunwayException exception) {
            exception.getMessage();
        } finally {
            if (runway != null) {
                airport.releaseRunway(this, runway);
            }
        }
    }
}
