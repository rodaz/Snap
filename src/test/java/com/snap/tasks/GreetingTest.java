package com.snap.tasks;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.Locale;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreetingTest {

    private Greeting greeting;
    private String message;

    @Before
    public void setUp() {
        greeting = new Greeting();
    }

    @Test
    public void shouldGreetingMorningEng() throws Exception {
        message = greeting.say(LocalTime.of(7,0), Locale.ENGLISH);
        assertThat(message, is("Good morning, World!"));
    }

    @Test
    public void shouldGreetingDayEng() throws Exception {
        message = greeting.say(LocalTime.of(13,0), Locale.ENGLISH);
        assertThat(message, is("Good day, World!"));
    }

    @Test
    public void shouldGreetingEveningEng() throws Exception {
        message = greeting.say(LocalTime.of(20,0), Locale.ENGLISH);
        assertThat(message, is("Good evening, World!"));
    }

    @Test
    public void shouldGreetingNightEng() throws Exception {
        message = greeting.say(LocalTime.of(2,0), Locale.ENGLISH);
        assertThat(message, is("Good night, World!"));
    }

    @Test
    public void shouldGreetingMorningRus() throws Exception {
        message = greeting.say(LocalTime.of(6,0), Locale.getDefault());
        assertThat(message, is("Доброе утро, мир!"));
    }

    @Test
    public void shouldGreetingDayRus() throws Exception {
        message = greeting.say(LocalTime.of(12,0), Locale.getDefault());
        assertThat(message, is("Добрый день, мир!"));
    }

    @Test
    public void shouldGreetingEveningRus() throws Exception {
        message = greeting.say(LocalTime.of(19,0), Locale.getDefault());
        assertThat(message, is("Добрый вечер, мир!"));
    }

    @Test
    public void shouldGreetingNightRus() throws Exception {
        message = greeting.say(LocalTime.of(1,0), Locale.getDefault());
        assertThat(message, is("Доброй ночи, мир!"));
    }
}
