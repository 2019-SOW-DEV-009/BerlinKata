package com.kata.berlin.digitaltime;

public class DigitalSecond {
    private final int seconds;

    public DigitalSecond(int seconds) {
        this.seconds = seconds;
    }

    public DigitalSecond(String seconds) {
        this(Integer.parseInt(seconds));
    }

    public int seconds() {
        return seconds;
    }
}
