package com.kata.berlin;

import com.kata.berlin.berlintime.BerlinSingleMinute;
import com.kata.berlin.digitaltime.DigitalMinute;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinSingleMinuteTest {
    @Test
    public void shouldReturnSingleMinuteAsOOOOWhenInitiatedWith0DigitalMinute() {
        assertBerlinSingleMinuteFor(0, "OOOO");
    }

    @Test
    public void shouldReturnSingleMinuteAsYOOOWhenDigitalMinuteIs1() {
        assertBerlinSingleMinuteFor(1, "YOOO");
    }

    @Test
    public void shouldReturnSingleMintueAsYYOOWhenDigitalMinuteIs2() {
        assertBerlinSingleMinuteFor(2, "YYOO");
    }

    @Test
    public void shouldReturnSingleMinuteAsYYYOWhenDigitalMinuteIs3() {
        assertBerlinSingleMinuteFor(3, "YYYO");
    }

    @Test
    public void shouldReturnSingleMinuteAsYYYYWhenDigitalMinuteIs4() {
        assertBerlinSingleMinuteFor(4, "YYYY");
    }

    @Test
    public void shouldReturnSingleMinuteAsOOOOWhenDigitalMinuteIs5() {
        assertBerlinSingleMinuteFor(5, "OOOO");
    }

    @Test
    public void shouldReturnSingleMinuteAsYOOOWhenDigitalMinuteIs6() {
        assertBerlinSingleMinuteFor(6, "YOOO");
    }

    private void assertBerlinSingleMinuteFor(int minute, String expectedSingleMinute) {
        DigitalMinute digitalMinute = new DigitalMinute(minute);
        BerlinSingleMinute berlinSingleMinute = new BerlinSingleMinute(digitalMinute);

        String singleMinute = berlinSingleMinute.singleMinute();

        assertEquals(expectedSingleMinute, singleMinute);
    }
}
