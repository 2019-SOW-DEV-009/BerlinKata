package com.kata.berlin.digitaltime;

public class Hour {
    private final int hour;

    public Hour(int hour) throws InvalidDigitalHourException {
        validate(hour);
        this.hour = hour;
    }

    public Hour(String hour) throws InvalidDigitalHourException {
        this(Integer.parseInt(hour));
    }

    public int hour() {
        return hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hour)) return false;
        Hour hour1 = (Hour) o;
        return hour == hour1.hour;
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
