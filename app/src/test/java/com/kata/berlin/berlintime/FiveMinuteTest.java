package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.InvalidDigitalMinuteException;
import com.kata.berlin.digitaltime.Minute;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FiveMinuteTest {
    @Test
    public void shouldReturnFiveMinuteAs11_O_WhenDigitalMinuteIs0() {
        assertBerlinFiveMinuteFor(0, "OOOOOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs11_O_WhenDigitalMinuteIsLessThan5() {
        assertBerlinFiveMinuteFor(4, "OOOOOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_Y_And_10_O_WhenDigitalMinuteIs5() {
        assertBerlinFiveMinuteFor(5, "YOOOOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YY_And_9_O_WhenDigitalMinuteIs10() {
        assertBerlinFiveMinuteFor(10, "YYOOOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYR_8_O_WhenDigitalMinuteIs15() {
        assertBerlinFiveMinuteFor(15, "YYROOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYR_8_O_WhenDigitalMinuteIs16() {
        assertBerlinFiveMinuteFor(16, "YYROOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYRY_7_O_WhenDigitalMinuteIs20() {
        assertBerlinFiveMinuteFor(20, "YYRYOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYRYY_6_O_WhenDigitalMinuteIs25() {
        assertBerlinFiveMinuteFor(25, "YYRYYOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYRYYR_5_O_WhenDigitalMinuteIs30() {
        assertBerlinFiveMinuteFor(30, "YYRYYROOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYRYYRY_4_O_WhenDigitalMinuteIs35() {
        assertBerlinFiveMinuteFor(35, "YYRYYRYOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYRYYRYY_3_O_WhenDigitalMinuteIs40() {
        assertBerlinFiveMinuteFor(40, "YYRYYRYYOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYRYYRYYR_2_O_WhenDigitalMinuteIs45() {
        assertBerlinFiveMinuteFor(45, "YYRYYRYYROO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYRYYRYYRYO_WhenDigitalMinuteIs50() {
        assertBerlinFiveMinuteFor(50, "YYRYYRYYRYO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_YYRYYRYYRYY_WhenDigitalMinuteIs55() {
        assertBerlinFiveMinuteFor(55, "YYRYYRYYRYY");
    }

    private void assertBerlinFiveMinuteFor(int minute, String expectedFiveMinute) {
        Minute digitalTime = null;
        try {
            digitalTime = new Minute(minute);
        } catch (InvalidDigitalMinuteException e) {
            fail();
        }
        FiveMinute berlinFiveMinute = new FiveMinute(digitalTime);

        String fiveMinute = berlinFiveMinute.fiveMinute();

        assertEquals(expectedFiveMinute, fiveMinute);
    }
}
