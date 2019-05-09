package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;

import java.util.HashMap;

class FiveMinute {

    private static final String ZERO_MINUTE = "OOOOOOOOOOO";
    private static final String FIVE_MINUTE = "YOOOOOOOOOO";
    private static final String TEN_MINUTE = "YYOOOOOOOOO";
    private static final String FIFTEEN_MINUTE = "YYROOOOOOOO";
    private static final String TWENTY_MINUTE = "YYRYOOOOOOO";
    private static final String TWENTYFIVE_MINUTE = "YYRYYOOOOOO";
    private static final String THIRTY_MINUTE = "YYRYYROOOOO";
    private static final String THIRTY_FIVE_MINUTE = "YYRYYRYOOOO";
    private static final String FORTY_MINUTE = "YYRYYRYYOOO";
    private static final String FORTY_FIVE_MINUTE = "YYRYYRYYROO";
    private static final String FIFTY_MINUTE = "YYRYYRYYRYO";
    private static final String FIFTY_FIVE_MINUTE = "YYRYYRYYRYY";

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
        FIVE_MINUTE_MAP.put(7, THIRTY_FIVE_MINUTE);
        FIVE_MINUTE_MAP.put(8, FORTY_MINUTE);
        FIVE_MINUTE_MAP.put(9, FORTY_FIVE_MINUTE);
        FIVE_MINUTE_MAP.put(10, FIFTY_MINUTE);
        FIVE_MINUTE_MAP.put(11, FIFTY_FIVE_MINUTE);
    }

    private final DigitalMinute digitalTime;

    public FiveMinute(DigitalMinute digitalTime) {
        this.digitalTime = digitalTime;
    }

    public String fiveMinute() {
        int numberOfFiveMinutes = digitalTime.minute() / 5;
        return FIVE_MINUTE_MAP.get(numberOfFiveMinutes);
    }
}
