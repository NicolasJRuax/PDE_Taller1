package com.example.aaa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    private Button redButton;
    private Button greenButton;
    private Button blueButton;
    private Button backButton;
    private View rootView;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        rootView = findViewById(R.id.rootView);
        redButton = findViewById(R.id.redButton);
        greenButton = findViewById(R.id.greenButton);
        blueButton = findViewById(R.id.blueButton);
        backButton = findViewById(R.id.backButton);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        // Load saved background color
        int savedColor = sharedPreferences.getInt("backgroundColor", Color.WHITE);
        rootView.setBackgroundColor(savedColor);

        redButton.setOnClickListener(v -> changeBackgroundColor(Color.RED));
        greenButton.setOnClickListener(v -> changeBackgroundColor(Color.GREEN));
        blueButton.setOnClickListener(v -> changeBackgroundColor(Color.BLUE));

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    public void changeBackgroundColor(int color) {
        rootView.setBackgroundColor(color);
        sharedPreferences.edit().putInt("backgroundColor", color).apply();
    }
}
