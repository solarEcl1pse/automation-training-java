package com.epam.automation.javacollections.main.recorder;

import com.epam.automation.javacollections.main.tracks.MusicTrack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.epam.automation.javacollections.main.utils.DurationParser.parseDurationToString;

public class SoundRecorder {

    ArrayList<MusicTrack> tracklist = new ArrayList<>();

    public void addToTracklist(MusicTrack... musicTracks) {
        Collections.addAll(tracklist, musicTracks);
    }

    public void displayMusicTracks() {
        System.out.println("Tracklist of the disc:");
        tracklist.forEach(System.out::println);
    }

    public void calculateDuration() {
        Duration duration = Duration.ofMinutes(0);
        for (MusicTrack musicTrack : tracklist) {
            duration = duration.plus(musicTrack.getDuration());
        }
        System.out.println("Duration of tracklist on the disc is " + parseDurationToString(duration) + " minutes.");
    }

    public void sortMixtapeByStyle() {
        System.out.println("Music tracks sorted by a music genre:");
        List<MusicTrack> tracklistSorted = new ArrayList<>(tracklist);
        tracklistSorted.sort(Comparator.comparing(MusicTrack::getMusicGenre));
        tracklistSorted.forEach(System.out::println);
    }

    public void findMusicTracksByGivenLength(Duration minDuration, Duration maxDuration) {
        System.out.println("Music track/tracks of a given duration (from " +
                parseDurationToString(minDuration) + " to " + parseDurationToString(maxDuration) + "):");
        tracklist.stream()
                .filter(musicTrack -> musicTrack.getDuration().compareTo(minDuration) >= 0 && musicTrack.getDuration().compareTo(maxDuration) <= 0)
                .forEach(System.out::println);
    }
}
