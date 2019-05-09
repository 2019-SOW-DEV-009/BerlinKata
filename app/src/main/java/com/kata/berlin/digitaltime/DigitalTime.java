package com.kata.berlin.digitaltime;

public class DigitalTime {
    private final DigitalSecond digitalSecond;

    public DigitalTime(String time) throws InvalidDigitalTimeException {
        if(time==null){
            throw new InvalidDigitalTimeException("Time cannot be null");
        }
        String[] splitTime = time.split(":");
        digitalSecond = new DigitalSecond(splitTime[2]);
    }

    public DigitalSecond second() {
        return digitalSecond;
    }
}
