package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;

import java.util.Objects;

public class BerlinTime {
    private final BerlinSecond berlinSecond;
    private final FiveMinute fiveMinutes;
    private final SingleMinute singleMinutes;
    private final SingleHour singleHour;
    private final FiveHour fiveHours;

    public BerlinTime(DigitalTime digitalTime) {
        berlinSecond = new BerlinSecond(digitalTime.second());
        fiveMinutes = new FiveMinute(digitalTime.minute());
        singleMinutes = new SingleMinute(digitalTime.minute());
        singleHour = new SingleHour(digitalTime.hour());
        fiveHours = new FiveHour(digitalTime.hour());
    }

    public String time() {
        return berlinSecond.seconds() + fiveHours.fiveHour() + singleHour.singleHour() + fiveMinutes.fiveMinute() + singleMinutes.singleMinute();
    }

    public BerlinSecond seconds() {
        return berlinSecond;
    }

    public FiveMinute fiveMinutes() {
        return fiveMinutes;
    }

    public SingleMinute singleMinutes() {
        return singleMinutes;
    }

    public SingleHour singleHour() {
        return singleHour;
    }

    public FiveHour fiveHours() {
        return fiveHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BerlinTime)) return false;
        BerlinTime that = (BerlinTime) o;
        return Objects.equals(berlinSecond, that.berlinSecond) &&
                Objects.equals(fiveMinutes, that.fiveMinutes) &&
                Objects.equals(singleMinutes, that.singleMinutes) &&
                Objects.equals(singleHour, that.singleHour) &&
                Objects.equals(fiveHours, that.fiveHours);
    }
}
