package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;

class BerlinFiveMinute {

    private static final String ZERO_MINUTE = "OOOOOOOOOOO";
    private static final String FIVE_MINUTE = "YOOOOOOOOOO";
    private final DigitalMinute digitalTime;

    public BerlinFiveMinute(DigitalMinute digitalTime) {
        this.digitalTime = digitalTime;
    }

    public String fiveMinute() {
        if (digitalTime.minute() == 5) {
            return FIVE_MINUTE;
        }
        return ZERO_MINUTE;
    }
}
