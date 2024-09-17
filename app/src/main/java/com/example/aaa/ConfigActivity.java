package com.example.aaa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ConfigActivity extends AppCompatActivity {

    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(v -> finish());  // Regresar a la pantalla anterior
    }
}
