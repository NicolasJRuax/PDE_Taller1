package com.example.aaa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private Button saveButton;
    private TextView displayNameTextView;
    private Button goToSettingsButton;
    private View rootView;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        rootView = findViewById(R.id.rootView);
        usernameEditText = findViewById(R.id.usernameEditText);
        saveButton = findViewById(R.id.saveButton);
        displayNameTextView = findViewById(R.id.displayNameTextView);
        goToSettingsButton = findViewById(R.id.goToSettingsButton);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        // Load saved background color
        int savedColor = sharedPreferences.getInt("backgroundColor", Color.WHITE);
        rootView.setBackgroundColor(savedColor);

        // Load saved name
        String savedName = sharedPreferences.getString("username", "");
        displayNameTextView.setText(savedName);

        saveButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            sharedPreferences.edit().putString("username", username).apply();
            displayNameTextView.setText(username);
        });

        goToSettingsButton.setOnClickListener(v -> {
            Intent intent = new Intent(UserActivity.this, SettingsActivity.class);
            startActivity(intent);
        });
    }
}
