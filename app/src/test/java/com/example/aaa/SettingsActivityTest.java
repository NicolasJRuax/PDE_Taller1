package com.example.aaa;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SettingsActivityTest {

    private SharedPreferences sharedPreferences;

    @Before
    public void setUp() {
        sharedPreferences = ApplicationProvider.getApplicationContext()
                .getSharedPreferences("MyPrefs", 0);
    }

    @Test
    public void testChangeBackgroundColor() {
        SettingsActivity activity = new SettingsActivity();
        activity.changeBackgroundColor(Color.RED);
        int savedColor = sharedPreferences.getInt("backgroundColor", Color.WHITE);
        assertEquals(Color.RED, savedColor);
    }
}
