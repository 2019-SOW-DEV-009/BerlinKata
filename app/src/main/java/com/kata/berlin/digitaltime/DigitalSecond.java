package com.kata.berlin.digitaltime;

public class DigitalSecond {
    private final int seconds;

    public DigitalSecond(int seconds) throws InvalidDigitalSecondsException {
        validate(seconds);
        this.seconds = seconds;
    }

    public DigitalSecond(String seconds) throws InvalidDigitalSecondsException {
        this(Integer.parseInt(seconds));
    }

    public int seconds() {
        return seconds;
    }

    private void validate(int seconds) throws InvalidDigitalSecondsException {
        if (seconds < 0) {
            throw new InvalidDigitalSecondsException("Seconds cannot be negative");
        }
        if (seconds > 59) {
            throw new InvalidDigitalSecondsException("Seconds cannot be more than 59");
        }
    }
}
