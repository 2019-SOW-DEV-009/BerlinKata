package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;

class BerlinTime {
    private final BerlinSecond berlinSecond;
    private final BerlinFiveMinute fiveMinutes;

    public BerlinTime(DigitalTime digitalTime) {
        berlinSecond = new BerlinSecond(digitalTime.second());
        fiveMinutes = new BerlinFiveMinute(digitalTime.minute());
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
}
