package com.kata.berlin.presenter;

import com.kata.berlin.berlintime.BerlinTime;
import com.kata.berlin.digitaltime.DigitalTime;
import com.kata.berlin.digitaltime.InvalidDigitalTimeException;
import com.kata.berlin.view.BerlinTimeView;

class BerlinTimePresenter {
    private final BerlinTimeView view;

    public BerlinTimePresenter(BerlinTimeView view) {
        this.view = view;
    }

    public void convertToBerlinTime(String inputText) {
        DigitalTime digitalTime = null;
        try {
            digitalTime = new DigitalTime(inputText);
            BerlinTime berlinTime = new BerlinTime(digitalTime);
            view.showBerlinTime(berlinTime);
        } catch (InvalidDigitalTimeException e) {
            view.showInvalidInput(e.getMessage());
        }
    }
}
