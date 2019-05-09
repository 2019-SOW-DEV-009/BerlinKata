package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;

import java.util.HashMap;

public class BerlinSingleMinute {

    private static final String ZERO_MINUTE = "OOOO";
    private static final String ONE_MINUTE = "YOOO";
    private static final String TWO_MINUTE = "YYOO";
    private static final String THREE_MINUTE = "YYYO";
    private static final String FOUR_MINUTE = "YYYY";
    private static final HashMap<Integer, String> SINGLE_MINUTE_MAP;

    static {
        SINGLE_MINUTE_MAP = new HashMap<>();
        SINGLE_MINUTE_MAP.put(0, ZERO_MINUTE);
        SINGLE_MINUTE_MAP.put(1, ONE_MINUTE);
        SINGLE_MINUTE_MAP.put(2, TWO_MINUTE);
        SINGLE_MINUTE_MAP.put(3, THREE_MINUTE);
        SINGLE_MINUTE_MAP.put(4, FOUR_MINUTE);
    }

    private final DigitalMinute digitalMinute;

    public BerlinSingleMinute(DigitalMinute digitalMinute) {
        this.digitalMinute = digitalMinute;
    }

    public String singleMinute() {
        int proportionToFive = digitalMinute.minute() % 5;
        return SINGLE_MINUTE_MAP.get(proportionToFive);
    }
}
