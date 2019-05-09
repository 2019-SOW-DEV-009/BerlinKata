package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalSecond;

class BerlinSecond {
    private final DigitalSecond digitalSecond;

    public BerlinSecond(DigitalSecond digitalSecond) {
        this.digitalSecond = digitalSecond;
    }

    public String seconds() {
        if (digitalSecond.seconds() == 1) {
            return "O";
        }
        return "Y";
    }
}
