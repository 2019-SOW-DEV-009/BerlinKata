package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;

public class BerlinSingleMinute {

    private static final String ZERO_MINUTE = "OOOO";
    private static final String ONE_MINUTE = "YOOO";
    private final DigitalMinute digitalMinute;

    public BerlinSingleMinute(DigitalMinute digitalMinute) {
        this.digitalMinute = digitalMinute;
    }

    public String singleMinute() {
        if (digitalMinute.minute() == 1) {
            return ONE_MINUTE;
        }
        return ZERO_MINUTE;
    }
}
