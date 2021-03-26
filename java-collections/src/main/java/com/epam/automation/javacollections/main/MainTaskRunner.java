package com.epam.automation.javacollections.main;

import com.epam.automation.javacollections.main.recorder.SoundRecorder;
import com.epam.automation.javacollections.main.tracks.MusicTrack;

import java.time.Duration;
import java.util.Scanner;

import static com.epam.automation.javacollections.main.tracks.MusicGenre.POP;
import static com.epam.automation.javacollections.main.tracks.MusicGenre.ROCK;
import static com.epam.automation.javacollections.main.utils.DurationParser.parseStringToDuration;

/**
 * Java. Collections
 * Main task
 * <p>
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * Каждый класс должен иметь отражающее смысл название и информативный состав.
 * Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * Наследование должно применяться только тогда, когда это имеет смысл.
 * При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * Классы должны быть грамотно разложены по пакетам
 * Консольное меню должно быть минимальным.
 * Для хранения параметров инициализации можно использовать файлы.
 * <p>
 * Звукозапись.
 * 1. Определить иерархию музыкальных композиций.
 * 2. Записать на диск сборку.
 * 3. Подсчитать продолжительность.
 * 4. Провести перестановку композиций диска на основе принадлежности к стилю.
 * 5. Найти композицию, соответствующую заданному диапазону длины треков.
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class MainTaskRunner {

    public static void main(String[] args) {
        System.out.println("Welcome to Sound Recorder App!");
        Scanner scanner = new Scanner(System.in);
        SoundRecorder soundRecorder = new SoundRecorder();
        soundRecorder.addToTracklist(
                new MusicTrack("I See Stars", "Portals", parseStringToDuration("05:23"), ROCK),
                new MusicTrack("SLAVA MARLOW", "По глазам", parseStringToDuration("02:00"), POP),
                new MusicTrack("Normandie", "Hostage", parseStringToDuration("03:23"), ROCK));
        soundRecorder.displayMusicTracks();
        soundRecorder.calculateDuration();
        soundRecorder.sortMixtapeByStyle();
        System.out.print("Enter the track duration range:\n" +
                "Minimal duration: ");
        Duration minDuration = parseStringToDuration(scanner.next());
        System.out.print("Maximal duration: ");
        Duration maxDuration = parseStringToDuration(scanner.next());
        soundRecorder.findMusicTracksByGivenLength(minDuration, maxDuration);
        scanner.close();
    }
}
