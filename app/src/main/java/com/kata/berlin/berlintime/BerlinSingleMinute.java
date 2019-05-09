package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;

public class BerlinSingleMinute {

    private static final String ZERO_MINUTE = "OOOO";
    private static final String ONE_MINUTE = "YOOO";
    private static final String TWO_MINUTE = "YYOO";
    private static final String THREE_MINUTE = "YYYO";
    private static final String FOUR_MINUTE = "YYYY";
    private final DigitalMinute digitalMinute;

    public BerlinSingleMinute(DigitalMinute digitalMinute) {
        this.digitalMinute = digitalMinute;
    }

    public String singleMinute() {
        if (digitalMinute.minute() == 1) {
            return ONE_MINUTE;
        }
        if (digitalMinute.minute() == 2) {
            return TWO_MINUTE;
        }
        if (digitalMinute.minute() == 3) {
            return THREE_MINUTE;
        }
        if (digitalMinute.minute() == 4) {
            return FOUR_MINUTE;
        }
        return ZERO_MINUTE;
    }
}
