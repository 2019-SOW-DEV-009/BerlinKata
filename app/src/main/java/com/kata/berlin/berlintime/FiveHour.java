package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.Hour;

import java.util.HashMap;
import java.util.Objects;

class FiveHour {

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

    private final Hour hour;

    public FiveHour(Hour hour) {
        this.hour = hour;
    }

    public String fiveHour() {
        int hour = this.hour.hour() / 5;
        return FIVE_HOUR_MAP.get(hour);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FiveHour)) return false;
        FiveHour fiveHour = (FiveHour) o;
        return Objects.equals(hour, fiveHour.hour);
    }
}
