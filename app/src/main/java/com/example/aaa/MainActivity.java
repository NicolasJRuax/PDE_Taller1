package com.example.aaa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView greetingText;
    private Button mainActivityButton;
    private View rootView;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootView = findViewById(R.id.rootView);
        greetingText = findViewById(R.id.greetingText);
        mainActivityButton = findViewById(R.id.mainActivityButton);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        // Load saved background color
        int savedColor = sharedPreferences.getInt("backgroundColor", Color.WHITE);
        rootView.setBackgroundColor(savedColor);

        setGreetingMessage();

        mainActivityButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, UserActivity.class);
            startActivity(intent);
        });
    }

    private void setGreetingMessage() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        String greeting = "";
        if (hour >= 6 && hour < 12) {
            greeting = "Buenos días";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Buenas tardes";
        } else {
            greeting = "Buenas noches";
        }

        // Append the user's name if available
        String username = sharedPreferences.getString("username", "");
        if (!username.isEmpty()) {
            greeting += ", " + username;
        }

        greetingText.setText(greeting);
    }
}
