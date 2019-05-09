package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;

import java.util.HashMap;

class BerlinSingleHour {

    private static final String ZERO_HOUR = "OOOO";
    private static final String ONE_HOUR = "ROOO";
    private static final String TWO_HOUR = "RROO";
    private static final String THREE_HOUR = "RRRO";
    private static final String FOUR_HOUR = "RRRR";
    private static final HashMap<Integer, String> SINGLE_HOUR_MAP;

    static {
        SINGLE_HOUR_MAP = new HashMap<>();
        SINGLE_HOUR_MAP.put(0, ZERO_HOUR);
        SINGLE_HOUR_MAP.put(1, ONE_HOUR);
        SINGLE_HOUR_MAP.put(2, TWO_HOUR);
        SINGLE_HOUR_MAP.put(3, THREE_HOUR);
        SINGLE_HOUR_MAP.put(4, FOUR_HOUR);
    }

    private final DigitalHour digitalHour;

    public BerlinSingleHour(DigitalHour digitalHour) {
        this.digitalHour = digitalHour;
    }

    public String singleHour() {
        int hourProportionToFive = digitalHour.hour() % 5;
        return SINGLE_HOUR_MAP.get(hourProportionToFive);
    }
}
