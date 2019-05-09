package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalSecond;

class BerlinSecond {
    private final DigitalSecond digitalSecond;

    public BerlinSecond(DigitalSecond digitalSecond) {
        this.digitalSecond = digitalSecond;
    }

    public String seconds() {
        if (isOddSecond()) {
            return "O";
        }
        return "Y";
    }

    private boolean isOddSecond() {
        return digitalSecond.seconds() % 2 == 1;
    }
}
