package com.epam.automation.javaio.main;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Java. I/O
 * Main task
 * <p>
 * Реализовать программу, которая получает в качестве аргумента командной строки путь к директории и записывает в текстовый файл структуру папок и файлов в виде, похожем на выполнение программы tree /F.
 * Если в качестве параметра в программу передается не путь к директории, а путь к txt файлу - прочитать файл и вывести в консоль следующие данные:
 * Количество папок
 * Количество файлов
 * Среднее количество файлов в папке
 * Среднюю длину названия файла
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class MainTaskRunner {

    public static void main(String[] args) {
        DirectoryReader.readDirectory(new File("src/main/resources/Too Close To Touch"));
        DirectoryReader.readDirectory(new File("main_file.txt"));
    }

    static class DirectoryReader {

        public DirectoryReader() {
        }

        public static void readDirectory(File path) {
            if (path.isDirectory()) {
                try (PrintStream printStream = new PrintStream("main_file.txt")) {
                    Files.walkFileTree(Paths.get(path.toString()), new SimpleFileVisitor<>() {
                        @Override
                        public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {
                            Files.walk(path, FileVisitOption.FOLLOW_LINKS)
                                    .map(Path::toFile)
                                    .forEach(file -> printStream.println((file.isDirectory() ? "" : "|---") + file.getName()));
                            return FileVisitResult.SKIP_SUBTREE;
                        }
                    });
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            } else {
                try {
                    AtomicInteger directoryCounter = new AtomicInteger();
                    AtomicInteger fileCounter = new AtomicInteger();
                    AtomicInteger fileNameLengthCounter = new AtomicInteger();
                    Stream<String> streamLines = Files.lines(path.toPath());
                    streamLines.forEach(line -> {
                        if (line.startsWith("|--")) {
                            fileCounter.getAndIncrement();
                            fileNameLengthCounter.getAndAdd(line.length());
                        } else {
                            directoryCounter.getAndIncrement();
                        }
                    });
                    System.out.println("Number of directories: " + directoryCounter);
                    System.out.println("Number of files: " + fileCounter);
                    System.out.println("Average number of files per directory: " + (fileCounter.intValue() / directoryCounter.intValue()));
                    System.out.println("Average length of file name: " + (fileNameLengthCounter.intValue() / fileCounter.intValue()));
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}
