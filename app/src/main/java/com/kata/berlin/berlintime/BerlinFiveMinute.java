package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;

import java.util.HashMap;

class BerlinFiveMinute {

    private static final String ZERO_MINUTE = "OOOOOOOOOOO";
    private static final String FIVE_MINUTE = "YOOOOOOOOOO";
    private static final String TEN_MINUTE = "YYOOOOOOOOO";
    private static final String FIFTEEN_MINUTE = "YYROOOOOOOO";
    private static final String TWENTY_MINUTE = "YYRYOOOOOOO";
    private static final String TWENTYFIVE_MINUTE = "YYRYYOOOOOO";
    private static final String THIRTY_MINUTE = "YYRYYROOOOO";

    private static final HashMap<Integer, String> FIVE_MINUTE_MAP;

    static {
        FIVE_MINUTE_MAP = new HashMap<>();
        FIVE_MINUTE_MAP.put(0, ZERO_MINUTE);
        FIVE_MINUTE_MAP.put(1, FIVE_MINUTE);
        FIVE_MINUTE_MAP.put(2, TEN_MINUTE);
        FIVE_MINUTE_MAP.put(3, FIFTEEN_MINUTE);
        FIVE_MINUTE_MAP.put(4, TWENTY_MINUTE);
        FIVE_MINUTE_MAP.put(5, TWENTYFIVE_MINUTE);
        FIVE_MINUTE_MAP.put(6, THIRTY_MINUTE);
    }

    private final DigitalMinute digitalTime;

    public BerlinFiveMinute(DigitalMinute digitalTime) {
        this.digitalTime = digitalTime;
    }

    public String fiveMinute() {
        int numberOfFiveMinutes = digitalTime.minute() / 5;
        return FIVE_MINUTE_MAP.get(numberOfFiveMinutes);
    }
}
