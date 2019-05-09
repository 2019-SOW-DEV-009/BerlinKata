package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;

class BerlinFiveMinute {

    private static final String ZERO_MINUTE = "OOOOOOOOOOO";
    private static final String FIVE_MINUTE = "YOOOOOOOOOO";
    private static final String TEN_MINUTE = "YYOOOOOOOOO";
    private static final String FIFTEEN_MINUTE = "YYROOOOOOOO";
    private static final String TWENTY_MINUTE = "YYRYOOOOOOO";
    private final DigitalMinute digitalTime;

    public BerlinFiveMinute(DigitalMinute digitalTime) {
        this.digitalTime = digitalTime;
    }

    public String fiveMinute() {
        int numberOfFiveMinutes = digitalTime.minute() / 5;
        switch (numberOfFiveMinutes) {
            case 1:
                return FIVE_MINUTE;
            case 2:
                return TEN_MINUTE;
            case 3:
                return FIFTEEN_MINUTE;
            case 4:
                return TWENTY_MINUTE;
            default:
                return ZERO_MINUTE;
        }
    }
}
