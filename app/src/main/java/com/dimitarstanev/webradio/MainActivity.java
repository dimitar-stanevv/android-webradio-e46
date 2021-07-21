package com.dimitarstanev.webradio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureLayout();


    }

    /**
     * Perform initial layout work
     */
    private void configureLayout() {
        // Hide app bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}