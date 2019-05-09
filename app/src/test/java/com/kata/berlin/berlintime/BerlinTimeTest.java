package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;
import com.kata.berlin.digitaltime.InvalidDigitalTimeException;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinTimeTest {

    private DigitalTime digitalTime;
    private BerlinTime berlinTime;

    @Before
    public void setUp() throws Exception {
        digitalTime = new DigitalTime("12:58:20");
        berlinTime = new BerlinTime(digitalTime);
    }

    @Test
    public void shouldReturnBerlinTimeAsYOOOOOOOOOOOOOOOOOOOOOOOWhenDigitalTimeIsAllO() throws InvalidDigitalTimeException {
        DigitalTime digitalTime = new DigitalTime("00:00:00");
        BerlinTime berlinTime = new BerlinTime(digitalTime);

        String time = berlinTime.time();

        assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO", time);
    }

    @Test
    public void shouldReturnBerlinSecondAsYWhenInitiatedWithDigitalTime12_58_20() {
        BerlinSecond berlinSeconds = berlinTime.seconds();

        assertEquals("Y", berlinSeconds.seconds());
    }

    @Test
    public void shouldReturnBerlinFiveMinuteAsYYRYYRYYRYYWhenInitiatedWithDigitalTime12_58_20() {
        FiveMinute fiveMinute = berlinTime.fiveMinutes();

        assertEquals("YYRYYRYYRYY", fiveMinute.fiveMinute());
    }

    @Test
    public void shouldReturnBerlinSingleMinuteAsYYYO() {
        BerlinSingleMinute berlinSingleMinute = berlinTime.singleMinutes();

        assertEquals("YYYO", berlinSingleMinute.singleMinute());
    }

    @Test
    public void shouldReturnBerlinSingleHourAsRROO() {
        SingleHour singleHour = berlinTime.singleHour();

        assertEquals("RROO", singleHour.singleHour());
    }

    @Test
    public void shouldReturnBerlinFiveHourAsRROO() {
        FiveHour fiveHour = berlinTime.fiveHours();

        assertEquals("RROO", fiveHour.fiveHour());
    }

    @Test
    public void shouldReturnYRROORROOYYRYYRYYRYYYYYO() {
        String time = berlinTime.time();

        assertEquals("YRROORROOYYRYYRYYRYYYYYO", time);
    }
}
