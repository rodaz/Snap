package com.snap.tasks;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Locale;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) {
        FileHandler fileHandler;
        Logger log = Logger.getLogger(Greeting.class.getName());

        try {
            fileHandler = new FileHandler("log.txt");
            log.addHandler(fileHandler);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            log.log(Level.WARNING, e.getMessage(), e);
        }

        Greeting greeting = new Greeting();
//        log.info(greeting.say(LocalTime.now(), Locale.getDefault()));
        System.out.println(Locale.forLanguageTag("ru"));
    }
}