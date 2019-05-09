package com.kata.berlin.presenter;

import com.kata.berlin.berlintime.BerlinTime;
import com.kata.berlin.view.BerlinTimeView;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BerlinTimePresenterTest {

    private String inputText;
    private BerlinTimeView view;
    private BerlinTimePresenter presenter;

    @Before
    public void setUp() {
        inputText = "12:45:58";
        view = mock(BerlinTimeView.class);
        presenter = new BerlinTimePresenter(view);
    }

    @Test
    public void shouldCallShowBerlinTimeOnViewWhenConvertToBerlinTimeIsCalled() {
        presenter.convertToBerlinTime(inputText);

        verify(view, times(1)).showBerlinTime(any(BerlinTime.class));
    }

    @Test
    public void shouldCallInvalidInputTextOnViewWhenConvertToBerlinTimeAndInputIsInvalid() {
        presenter.convertToBerlinTime("aa:25:48");

        verify(view, times(1)).showInvalidInput(anyString());
    }
}
