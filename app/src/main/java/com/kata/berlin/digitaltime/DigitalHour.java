package com.kata.berlin.digitaltime;

public class DigitalHour {
    private final int hour;

    public DigitalHour(int hour) throws InvalidDigitalHourException {
        validate(hour);
        this.hour = hour;
    }

    public DigitalHour(String hour) throws InvalidDigitalHourException {
        this(Integer.parseInt(hour));
    }

    public int hour() {
        return hour;
    }

    private void validate(int hour) throws InvalidDigitalHourException {
        if (hour < 0) {
            throw new InvalidDigitalHourException("Hours cannot be in negative");
        }
        if (hour > 23) {
            throw new InvalidDigitalHourException("Hour cannot be more than 23");
        }
    }
}
