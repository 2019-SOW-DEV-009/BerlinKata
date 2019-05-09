package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;

public class BerlinSingleMinute {

    private static final String SINGLE_MINUTE = "OOOO";
    private final DigitalMinute digitalMinute;

    public BerlinSingleMinute(DigitalMinute digitalMinute) {
        this.digitalMinute = digitalMinute;
    }

    public String singleMinute() {
        if (digitalMinute.minute() == 1) {
            return "YOOO";
        }
        return SINGLE_MINUTE;
    }
}
