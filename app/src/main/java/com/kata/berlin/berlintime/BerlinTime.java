package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;

class BerlinTime {
    private final BerlinSecond berlinSecond;

    public BerlinTime(DigitalTime digitalTime) {
        berlinSecond = new BerlinSecond(digitalTime.second());
    }

    public String time() {
        return null;
    }

    public BerlinSecond seconds() {
        return berlinSecond;
    }
}
