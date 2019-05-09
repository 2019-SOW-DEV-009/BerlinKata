package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalSecond;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BerlinSecond)) return false;
        BerlinSecond that = (BerlinSecond) o;
        return Objects.equals(digitalSecond, that.digitalSecond);
    }

    private boolean isOddSecond() {
        return digitalSecond.seconds() % 2 == 1;
    }
}
