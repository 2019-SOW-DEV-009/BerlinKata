package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;

import java.util.HashMap;

class BerlinFiveHour {

    private static final String LESS_THAN_FIVE_HOURS = "OOOO";
    private static final String FIVE_HOURS = "ROOO";
    private static final String TEN_HOURS = "RROO";
    private static final String FIFTEEN_HOURS = "RRRO";
    private static final String TWENTY_HOURS = "RRRR";
    private static final HashMap<Integer, String> FIVE_HOUR_MAP;


    static {
        FIVE_HOUR_MAP = new HashMap<>();
        FIVE_HOUR_MAP.put(0, LESS_THAN_FIVE_HOURS);
        FIVE_HOUR_MAP.put(1, FIVE_HOURS);
        FIVE_HOUR_MAP.put(2, TEN_HOURS);
        FIVE_HOUR_MAP.put(3, FIFTEEN_HOURS);
        FIVE_HOUR_MAP.put(4, TWENTY_HOURS);
    }

    private final DigitalHour digitalHour;

    public BerlinFiveHour(DigitalHour digitalHour) {
        this.digitalHour = digitalHour;
    }

    public String fiveHour() {
        int hour = digitalHour.hour() / 5;
        return FIVE_HOUR_MAP.get(hour);
    }
}