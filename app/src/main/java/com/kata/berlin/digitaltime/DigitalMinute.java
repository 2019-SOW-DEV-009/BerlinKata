package com.kata.berlin.digitaltime;

public class DigitalMinute {
    private final int minute;

    public DigitalMinute(int minute) throws InvalidDigitalMinuteException {
        validate(minute);
        this.minute = minute;
    }

    public DigitalMinute(String minute) throws InvalidDigitalMinuteException {
        this(Integer.parseInt(minute));
    }

    public int minute() {
        return minute;
    }

    private void validate(int minute) throws InvalidDigitalMinuteException {
        if (minute < 0) {
            throw new InvalidDigitalMinuteException("Minute cannot be in negative");
        }
        if (minute > 59) {
            throw new InvalidDigitalMinuteException("Minute cannot be more than 59");
        }
    }
}
