package com.epam.automation.javacollections.main.utils;

import java.time.Duration;

public class DurationParser {

    private static final String DURATION_FORMAT = "%02d:%02d";

    public static Duration parseStringToDuration(String duration) {
        long minutes = Integer.parseInt(duration.substring(0, 2));
        long seconds = Integer.parseInt(duration.substring(3, 5));
        return Duration.ofMinutes(minutes).plus(Duration.ofSeconds(seconds));
    }

    public static String parseDurationToString(Duration duration) {
        return String.format(DURATION_FORMAT, duration.toMinutes(), duration.toSeconds() % 60);
    }
}
