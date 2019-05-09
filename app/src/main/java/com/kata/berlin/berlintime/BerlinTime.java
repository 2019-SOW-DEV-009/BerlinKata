package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;

class BerlinTime {
    private final BerlinSecond berlinSecond;
    private final BerlinFiveMinute fiveMinutes;
    private final BerlinSingleMinute singleMinutes;
    private final BerlinSingleHour singleHour;
    private final BerlinFiveHour fiveHours;

    public BerlinTime(DigitalTime digitalTime) {
        berlinSecond = new BerlinSecond(digitalTime.second());
        fiveMinutes = new BerlinFiveMinute(digitalTime.minute());
        singleMinutes = new BerlinSingleMinute(digitalTime.minute());
        singleHour = new BerlinSingleHour(digitalTime.hour());
        fiveHours = new BerlinFiveHour(digitalTime.hour());
    }

    public String time() {
        return berlinSecond.seconds() + fiveHours.fiveHour() + singleHour.singleHour() + fiveMinutes.fiveMinute() + singleMinutes.singleMinute();
    }

    public BerlinSecond seconds() {
        return berlinSecond;
    }

    public BerlinFiveMinute fiveMinutes() {
        return fiveMinutes;
    }

    public BerlinSingleMinute singleMinutes() {
        return singleMinutes;
    }

    public BerlinSingleHour singleHour() {
        return singleHour;
    }

    public BerlinFiveHour fiveHours() {
        return fiveHours;
    }
}
