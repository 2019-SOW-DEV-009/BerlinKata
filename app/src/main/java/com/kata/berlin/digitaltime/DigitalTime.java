package com.kata.berlin.digitaltime;

public class DigitalTime {
    private final DigitalSecond digitalSecond;

    public DigitalTime(String time) {
        String[] splitTime = time.split(":");
        digitalSecond = new DigitalSecond(splitTime[2]);
    }

    public DigitalSecond second() {
        return digitalSecond;
    }
}
