package com.kata.berlin.digitaltime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitalTime {
    private static final String TIME_REGEX = "^[0-2][0-3]:[0-5][0-9]:[0-5][0-9]$";
    private final DigitalSecond digitalSecond;

    public DigitalTime(String time) throws InvalidDigitalTimeException {
        validate(time);

        String[] splitTime = time.split(":");
        digitalSecond = new DigitalSecond(splitTime[2]);
    }

    public DigitalSecond second() {
        return digitalSecond;
    }

    private void validate(String time) throws InvalidDigitalTimeException {
        if (time == null) {
            throw new InvalidDigitalTimeException("Time cannot be null");
        }
        if (time.trim().length() != 8) {
            throw new InvalidDigitalTimeException("Invalid Time");
        }

        Pattern pattern = Pattern.compile(TIME_REGEX);
        Matcher matcher = pattern.matcher(time);
        if (!matcher.matches()) {
            throw new InvalidDigitalTimeException("Invalid Time format");
        }

    }
}
