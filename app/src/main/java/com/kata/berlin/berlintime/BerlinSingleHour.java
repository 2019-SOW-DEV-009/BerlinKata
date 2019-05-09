package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;

class BerlinSingleHour {

    private static final String ZERO_HOUR = "OOOO";
    private static final String ONE_HOUR = "ROOO";
    private static final String TWO_HOUR = "RROO";
    private final DigitalHour digitalHour;

    public BerlinSingleHour(DigitalHour digitalHour) {
        this.digitalHour = digitalHour;
    }

    public String singleHour() {
        int hour = digitalHour.hour();
        if (hour == 1) {
            return ONE_HOUR;
        }
        if (hour == 2) {
            return TWO_HOUR;
        }
        return ZERO_HOUR;
    }
}
