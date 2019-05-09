package com.kata.berlin.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kata.berlin.R;
import com.kata.berlin.berlintime.BerlinTime;
import com.kata.berlin.presenter.BerlinTimePresenter;

import androidx.appcompat.app.AppCompatActivity;

public class DigitalToBerlinActivity extends AppCompatActivity implements BerlinTimeView {

    private BerlinTimePresenter presenter;
    private EditText digitalTimeInput;
    private TextView berlinTimeLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_to_berlin);
        presenter = new BerlinTimePresenter(this);
        initViews();
    }

    private void initViews() {
        digitalTimeInput = findViewById(R.id.digitalTimeInput);
        berlinTimeLabel = findViewById(R.id.berlinTime);
        Button convertButton = findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.convertToBerlinTime(digitalTimeInput.getText().toString());
            }
        });
    }

    @Override
    public void showBerlinTime(BerlinTime berlinTime) {
        berlinTimeLabel.setText(String.format("Time \t: %s", berlinTime.time()));
    }

    @Override
    public void showInvalidInput(String errorMessage) {
        berlinTimeLabel.setText(errorMessage);
        digitalTimeInput.setText("");
    }
}
