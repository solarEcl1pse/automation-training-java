package com.epam.automation.javathreads.optional;

import java.util.concurrent.TimeUnit;

public class Runway {

    private final int runwayId;
    private volatile boolean busy;

    public Runway(int runwayId) {
        this.runwayId = runwayId;
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
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Runway #" + runwayId;
    }
}
