package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;

class BerlinFiveMinute {

    private static final String ZERO_MINUTE = "OOOOOOOOOOO";
    private static final String FIVE_MINUTE = "YOOOOOOOOOO";
    private static final String TEN_MINUTE = "YYOOOOOOOOO";
    private static final String FIFTEEN_MINUTE = "YYROOOOOOOO";
    private final DigitalMinute digitalTime;

    public BerlinFiveMinute(DigitalMinute digitalTime) {
        this.digitalTime = digitalTime;
    }

    public String fiveMinute() {
        int minutes = digitalTime.minute();
        switch (minutes) {
            case 5:
                return FIVE_MINUTE;
            case 10:
                return TEN_MINUTE;
            case 15:
                return FIFTEEN_MINUTE;
            default:
                return ZERO_MINUTE;
        }
    }
}
