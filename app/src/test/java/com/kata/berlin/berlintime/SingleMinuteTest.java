package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.InvalidDigitalMinuteException;
import com.kata.berlin.digitaltime.Minute;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SingleMinuteTest {
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

    @Test
    public void shouldReturnSingleMinuteAsYYOOWhenDigitalMinuteIs7() {
        assertBerlinSingleMinuteFor(7, "YYOO");
    }

    @Test
    public void shouldReturnSingleMinuteAsYYYOWhenDigitalMinuteIs8() {
        assertBerlinSingleMinuteFor(8, "YYYO");
    }

    @Test
    public void shouldReturnSingleMinuteAsYYYYWhenDigitalMinuteIs9() {
        assertBerlinSingleMinuteFor(9, "YYYY");
    }

    private void assertBerlinSingleMinuteFor(int minute, String expectedSingleMinute) {
        Minute digitalMinute = null;
        try {
            digitalMinute = new Minute(minute);
        } catch (InvalidDigitalMinuteException e) {
            fail();
        }
        SingleMinute berlinSingleMinute = new SingleMinute(digitalMinute);

        String singleMinute = berlinSingleMinute.singleMinute();

        assertEquals(expectedSingleMinute, singleMinute);
    }
}
