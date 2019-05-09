package com.kata.berlin.presenter;

import com.kata.berlin.berlintime.BerlinTime;
import com.kata.berlin.digitaltime.DigitalTime;
import com.kata.berlin.digitaltime.InvalidDigitalTimeException;
import com.kata.berlin.view.BerlinTimeView;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BerlinTimePresenterTest {

    private static final String VALID_INPUT_TEXT = "12:45:58";
    private BerlinTimeView view;
    private BerlinTimePresenter presenter;

    @Before
    public void setUp() {
        view = mock(BerlinTimeView.class);
        presenter = new BerlinTimePresenter(view);
    }

    @Test
    public void shouldCallShowBerlinTimeOnViewWhenConvertToBerlinTimeIsCalled() {
        presenter.convertToBerlinTime(VALID_INPUT_TEXT);

        verify(view, times(1)).showBerlinTime(any(BerlinTime.class));
    }

    @Test
    public void shouldCallInvalidInputTextOnViewWhenConvertToBerlinTimeAndInputIsInvalid() {
        presenter.convertToBerlinTime("aa:25:48");

        verify(view, times(1)).showInvalidInput(anyString());
    }

    @Test
    public void shouldReturnBerlinTimeEquivalentToBerlinTimeOfValidInputText() throws InvalidDigitalTimeException {
        DigitalTime digitalTime = new DigitalTime(VALID_INPUT_TEXT);
        BerlinTime expectedBerlinTime = new BerlinTime(digitalTime);

        presenter.convertToBerlinTime(VALID_INPUT_TEXT);

        verify(view, times(1)).showBerlinTime(expectedBerlinTime);
    }
}
