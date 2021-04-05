package com.epam.automation.javathreads.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Airport<T extends Runway> {

    private final static int POOL_SIZE = 5;
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
    private final ArrayList<Runway> runways = new ArrayList<>();

    public Airport(List<Runway> source) {
        runways.addAll(source);
    }

    public Runway getRunway(Airplane airplane) throws NoFreeRunwayException {
        try {
            if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
                for (Runway runway : runways) {
                    if (!runway.isBusy()) {
                        runway.setBusy(true);
                        System.out.println("Airplane #" + airplane.getId() + " took " + runway.toString() + ".");
                        return runway;
                    }
                }
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
        throw new NoFreeRunwayException();
    }

    public void releaseRunway(Airplane airplane, Runway runway) {
        runway.setBusy(false);
        System.out.println("Airplane #" + airplane.getId() + " left " + runway.toString() + ".");
        semaphore.release();
        System.out.println(runway.toString() + " is free.");
    }
}
