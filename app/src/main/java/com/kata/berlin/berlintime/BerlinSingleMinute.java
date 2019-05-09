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
        int minute = digitalMinute.minute();
        switch (minute) {
            case 1:
            case 6:
                return ONE_MINUTE;
            case 2:
            case 7:
                return TWO_MINUTE;
            case 3:
            case 8:
                return THREE_MINUTE;
            case 4:
            case 9:
                return FOUR_MINUTE;
            default:
                return ZERO_MINUTE;
        }
    }
}
