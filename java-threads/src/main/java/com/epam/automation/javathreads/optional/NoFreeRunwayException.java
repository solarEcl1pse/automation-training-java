package com.epam.automation.javathreads.optional;

public class NoFreeRunwayException extends Throwable {

    public NoFreeRunwayException() {
        System.out.println("There is no runway available!");
    }
}
