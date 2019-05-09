package com.kata.berlin.digitaltime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitalTime {
    private static final String TIME_REGEX = "^[0-2][0-3]:[0-5][0-9]:[0-5][0-9]$";
    private static final int SECONDS_POSITION = 2;
    private static final int MINUTES_POSITION = 1;
    private static final int HOURS_POSITION = 0;

    private final DigitalSecond digitalSecond;
    private final DigitalHour digitalHour;
    private final DigitalMinute digitalMinute;

    public DigitalTime(String time) throws InvalidDigitalTimeException {
        validate(time);

        String[] splitTime = time.split(":");
        digitalSecond = new DigitalSecond(splitTime[SECONDS_POSITION]);
        digitalMinute = new DigitalMinute(splitTime[MINUTES_POSITION]);
        digitalHour = new DigitalHour(splitTime[HOURS_POSITION]);
    }

    public DigitalSecond second() {
        return digitalSecond;
    }

    private void validate(String time) throws InvalidDigitalTimeException {
        if (time == null) {
            throw new InvalidDigitalTimeException("Time cannot be null");
        }
        time = time.trim();
        Pattern pattern = Pattern.compile(TIME_REGEX);
        Matcher matcher = pattern.matcher(time);
        if (!matcher.matches()) {
            throw new InvalidDigitalTimeException("Invalid Time format");
        }
    }

    public DigitalHour hour() {
        return digitalHour;
    }

    public DigitalMinute minute() {
        return digitalMinute;
    }
}
