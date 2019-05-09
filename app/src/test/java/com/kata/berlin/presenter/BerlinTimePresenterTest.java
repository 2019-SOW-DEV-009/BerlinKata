package com.kata.berlin.presenter;

import com.kata.berlin.berlintime.BerlinTime;
import com.kata.berlin.digitaltime.InvalidDigitalTimeException;
import com.kata.berlin.view.BerlinTimeView;

import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BerlinTimePresenterTest {
    @Test
    public void shouldCallShowBerlinTimeOnViewWhenConvertToBerlinTimeIsCalled() throws InvalidDigitalTimeException {
        String inputText = "12:45:58";
        BerlinTimeView view = mock(BerlinTimeView.class);
        BerlinTimePresenter presenter = new BerlinTimePresenter(view);

        presenter.convertToBerlinTime(inputText);

        verify(view, times(1)).ShowBerlinTime(any(BerlinTime.class));
    }
}
