package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;

class BerlinSingleHour {

    private static final String ZERO_HOUR = "OOOO";
    private static final String ONE_HOUR = "ROOO";
    private final DigitalHour digitalHour;

    public BerlinSingleHour(DigitalHour digitalHour) {
        this.digitalHour = digitalHour;
    }

    public String singleHour() {
        if (digitalHour.hour() == 1) {
            return ONE_HOUR;
        }
        return ZERO_HOUR;
    }
}
