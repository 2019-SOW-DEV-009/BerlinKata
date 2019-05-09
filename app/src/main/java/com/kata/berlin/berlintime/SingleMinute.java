package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.Minute;

import java.util.HashMap;
import java.util.Objects;

public class SingleMinute {

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

    private final Minute minute;

    public SingleMinute(Minute minute) {
        this.minute = minute;
    }

    public String singleMinute() {
        int proportionToFive = minute.minute() % 5;
        return SINGLE_MINUTE_MAP.get(proportionToFive);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleMinute)) return false;
        SingleMinute that = (SingleMinute) o;
        return Objects.equals(minute, that.minute);
    }
}
