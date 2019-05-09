package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;
import com.kata.berlin.digitaltime.InvalidDigitalTimeException;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinTimeTest {
    @Test
    @Ignore
    public void shouldReturnBerlinTimeAsYOOOOOOOOOOOOOOOOOOOOOOOWhenDigitalTimeIsAllO() throws InvalidDigitalTimeException {
        DigitalTime digitalTime = new DigitalTime("00:00:00");
        BerlinTime berlinTime = new BerlinTime(digitalTime);

        String time = berlinTime.time();

        assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO", time);
    }

    @Test
    public void shouldReturnBerlinSecondAsYWhenInitiatedWithDigitalTime12_58_20() throws InvalidDigitalTimeException {
        DigitalTime digitalTime = new DigitalTime("12:58:20");
        BerlinTime berlinTime = new BerlinTime(digitalTime);

        BerlinSecond berlinSeconds = berlinTime.seconds();

        assertEquals("Y", berlinSeconds.seconds());
    }
}
