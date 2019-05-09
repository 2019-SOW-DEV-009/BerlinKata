package com.kata.berlin;

import com.kata.berlin.berlintime.BerlinSingleMinute;
import com.kata.berlin.digitaltime.DigitalMinute;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinSingleMinuteTest {
    @Test
    public void shouldReturnSingleMinuteAsOOOOWhenInitiatedWith0DigitalMinute() {
        DigitalMinute digitalMinute = new DigitalMinute(0);
        BerlinSingleMinute berlinSingleMinute = new BerlinSingleMinute(digitalMinute);

        String singleMinute = berlinSingleMinute.singleMinute();

        assertEquals("OOOO", singleMinute);
    }

    @Test
    public void shouldReturnSingleMinuteAsYOOOWhenDigitalMinuteIs1() {
        DigitalMinute digitalMinute = new DigitalMinute(1);
        BerlinSingleMinute berlinSingleMinute = new BerlinSingleMinute(digitalMinute);

        String singleMinute = berlinSingleMinute.singleMinute();

        assertEquals("YOOO", singleMinute);
    }
}
