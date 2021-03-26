package com.epam.automation.javacollections.main.tracks;

public enum MusicGenre {

    ROCK, POP;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
