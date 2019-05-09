package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;

class BerlinTime {
    private final BerlinSecond berlinSecond;
    private final BerlinFiveMinute fiveMinutes;
    private final BerlinSingleMinute singleMinutes;
    private final BerlinSingleHour singleHour;

    public BerlinTime(DigitalTime digitalTime) {
        berlinSecond = new BerlinSecond(digitalTime.second());
        fiveMinutes = new BerlinFiveMinute(digitalTime.minute());
        singleMinutes = new BerlinSingleMinute(digitalTime.minute());
        singleHour = new BerlinSingleHour(digitalTime.hour());
    }

    public String time() {
        return null;
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
}
