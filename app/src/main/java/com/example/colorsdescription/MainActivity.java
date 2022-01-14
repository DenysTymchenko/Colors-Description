package com.example.colorsdescription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerColors;
    private TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerColors = findViewById(R.id.spinnerColors);
        textViewDescription = findViewById(R.id.textViewDescription);
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        textViewDescription.setText(findDescription(position));
    }

    public String findDescription(int position){
        String[] description = getResources().getStringArray(R.array.descriptions);
        return description[position];
    }
}