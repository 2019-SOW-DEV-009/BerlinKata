package com.kata.berlin.view;

import com.kata.berlin.berlintime.BerlinTime;

public interface BerlinTimeView {
    void showBerlinTime(BerlinTime berlinTime);

    void showInvalidInput(String errorMessage);
}
