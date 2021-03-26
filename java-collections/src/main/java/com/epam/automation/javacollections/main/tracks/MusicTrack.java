package com.epam.automation.javacollections.main.tracks;

import java.time.Duration;

import static com.epam.automation.javacollections.main.utils.DurationParser.parseDurationToString;

public class MusicTrack {

    private String artist;
    private String name;
    private Duration duration;
    private MusicGenre musicGenre;

    public MusicTrack(String artist, String name, Duration duration, MusicGenre musicGenre) {
        this.artist = artist;
        this.name = name;
        this.duration = duration;
        this.musicGenre = musicGenre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }

    @Override
    public String toString() {
        return '\'' + artist + '\'' + " - " +
                '\'' + name + '\'' +
                ", " + parseDurationToString(duration) +
                " (" + musicGenre + ')';
    }
}
