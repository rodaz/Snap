package com.snap.tasks;

import java.time.LocalTime;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

class Greeting {
    private final LocalTime MORNING_TIME = LocalTime.of(5,59,59);
    private final LocalTime DAY_TIME = LocalTime.of(8,59,59);
    private final LocalTime EVENING_TIME = LocalTime.of(18,59,59);
    private final LocalTime NIGHT_TIME = LocalTime.of(22,59,59);

    String say(LocalTime time, Locale locale) {
        String message;
        ResourceBundle rb = PropertyResourceBundle.getBundle("greetings", locale);

        if (time.isAfter(MORNING_TIME) && time.isBefore(DAY_TIME.plusSeconds(1)))
            message = rb.getString("morning");
        else if (time.isAfter(DAY_TIME) && time.isBefore(EVENING_TIME.plusSeconds(1)))
            message = rb.getString("day");
        else if (time.isAfter(EVENING_TIME) && time.isBefore(NIGHT_TIME.plusSeconds(1)))
            message = rb.getString("evening");
        else
            message = rb.getString("night");
        return message;
    }
}