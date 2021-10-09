package com.ishuinzu.uogsgpacgpacalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ishuinzu.uogsgpacgpacalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();
    }

    private void init() {
    }
}