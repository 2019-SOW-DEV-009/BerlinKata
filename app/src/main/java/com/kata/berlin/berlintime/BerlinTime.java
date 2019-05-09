package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;

class BerlinTime {
    private final BerlinSecond berlinSecond;
    private final FiveMinute fiveMinutes;
    private final BerlinSingleMinute singleMinutes;
    private final SingleHour singleHour;
    private final FiveHour fiveHours;

    public BerlinTime(DigitalTime digitalTime) {
        berlinSecond = new BerlinSecond(digitalTime.second());
        fiveMinutes = new FiveMinute(digitalTime.minute());
        singleMinutes = new BerlinSingleMinute(digitalTime.minute());
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

    public BerlinSingleMinute singleMinutes() {
        return singleMinutes;
    }

    public SingleHour singleHour() {
        return singleHour;
    }

    public FiveHour fiveHours() {
        return fiveHours;
    }
}
