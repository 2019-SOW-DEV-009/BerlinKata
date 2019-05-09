package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;

class BerlinFiveHour {

    private static final String LESS_THAN_FIVE_HOURS = "OOOO";
    private static final String FIVE_HOUR = "ROOO";
    private final DigitalHour digitalHour;

    public BerlinFiveHour(DigitalHour digitalHour) {
        this.digitalHour = digitalHour;
    }

    public String fiveHour() {
        if (digitalHour.hour() == 5) {
            return FIVE_HOUR;
        }
        return LESS_THAN_FIVE_HOURS;
    }
}
