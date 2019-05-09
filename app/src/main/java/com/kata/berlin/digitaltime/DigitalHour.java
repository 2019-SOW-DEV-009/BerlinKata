package com.kata.berlin.digitaltime;

public class DigitalHour {
    private final int hour;

    public DigitalHour(int hour) throws InvalidDigitalHourException {
        if (hour < 0) {
            throw new InvalidDigitalHourException("Hours cannot be in negative");
        }
        if (hour > 23) {
            throw new InvalidDigitalHourException("Hour cannot be more than 23");
        }
        this.hour = hour;
    }

    public int hour() {
        return hour;
    }
}
