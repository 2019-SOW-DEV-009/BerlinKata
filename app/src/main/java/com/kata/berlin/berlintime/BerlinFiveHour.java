package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;

class BerlinFiveHour {

    private static final String LESS_THAN_FIVE_HOURS = "OOOO";
    private static final String FIVE_HOUR = "ROOO";
    private static final String TEN_HOUR = "RROO";
    private final DigitalHour digitalHour;

    public BerlinFiveHour(DigitalHour digitalHour) {
        this.digitalHour = digitalHour;
    }

    public String fiveHour() {
        int hour = digitalHour.hour();
        if (hour == 5) {
            return FIVE_HOUR;
        }
        if (hour == 10) {
            return TEN_HOUR;
        }
        return LESS_THAN_FIVE_HOURS;
    }
}
