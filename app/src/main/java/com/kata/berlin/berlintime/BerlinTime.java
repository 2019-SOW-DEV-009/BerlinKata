package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;

class BerlinTime {
    private final BerlinSecond berlinSecond;
    private final BerlinFiveMinute fiveMinutes;
    private final BerlinSingleMinute singleMinutes;

    public BerlinTime(DigitalTime digitalTime) {
        berlinSecond = new BerlinSecond(digitalTime.second());
        fiveMinutes = new BerlinFiveMinute(digitalTime.minute());
        singleMinutes = new BerlinSingleMinute(digitalTime.minute());
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
}
