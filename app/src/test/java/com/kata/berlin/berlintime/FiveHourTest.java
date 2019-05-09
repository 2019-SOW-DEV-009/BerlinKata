package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.Hour;
import com.kata.berlin.digitaltime.InvalidDigitalHourException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FiveHourTest {
    @Test
    public void shouldReturnFiveHourAsOOOOWhenDigitalHourIsLessThen5() {
        assertBerlinFiveHourFor(4, "OOOO");
    }

    @Test
    public void shouldReturnFiveHourAsROOOWhenDigitalHourIs5() {
        assertBerlinFiveHourFor(5, "ROOO");
    }

    @Test
    public void shouldReturnFiveHourAsRROOWhenDigitalHourIs10() {
        assertBerlinFiveHourFor(10, "RROO");
    }

    @Test
    public void shouldReturnFiveHourAsRRROWhenDigitalHourIs15() {
        assertBerlinFiveHourFor(15, "RRRO");
    }

    @Test
    public void shouldReturnFiveHourAsRRRRWhenDigitalHourIs20() {
        assertBerlinFiveHourFor(20, "RRRR");
    }

    @Test
    public void shouldReturnTrueWhenTwoFiveHoursAreEqual() throws InvalidDigitalHourException {
        assertEquals(createFiveHourWith(20), createFiveHourWith(20));
    }

    private FiveHour createFiveHourWith(int hour) throws InvalidDigitalHourException {
        Hour hourOne = new Hour(hour);
        return new FiveHour(hourOne);
    }

    private void assertBerlinFiveHourFor(int hour, String expectedFiveHour) {
        Hour digitalHour = null;
        try {
            digitalHour = new Hour(hour);
        } catch (InvalidDigitalHourException e) {
            fail();
        }
        FiveHour berlinFiveHour = new FiveHour(digitalHour);

        String fiveHour = berlinFiveHour.fiveHour();

        assertEquals(expectedFiveHour, fiveHour);
    }
}
