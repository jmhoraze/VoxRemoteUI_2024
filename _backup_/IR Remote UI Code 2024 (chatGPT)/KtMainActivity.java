package com.wavvox.remoteuiapplication;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import com.wavvox.remoteuiapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Power Button
        findViewById(R.id.btn_power).setOnClickListener(v -> sendIrSignal("POWER"));

        // Volume Buttons
        findViewById(R.id.btn_volume_up).setOnClickListener(v -> sendIrSignal("VOLUME_UP"));
        findViewById(R.id.btn_volume_down).setOnClickListener(v -> sendIrSignal("VOLUME_DOWN"));

        // Channel Buttons
        findViewById(R.id.btn_channel_up).setOnClickListener(v -> sendIrSignal("CHANNEL_UP"));
        findViewById(R.id.btn_channel_down).setOnClickListener(v -> sendIrSignal("CHANNEL_DOWN"));

        // Navigation Buttons
        findViewById(R.id.btn_up).setOnClickListener(v -> sendIrSignal("UP"));
        findViewById(R.id.btn_down).setOnClickListener(v -> sendIrSignal("DOWN"));
        findViewById(R.id.btn_left).setOnClickListener(v -> sendIrSignal("LEFT"));
        findViewById(R.id.btn_right).setOnClickListener(v -> sendIrSignal("RIGHT"));
        findViewById(R.id.btn_ok).setOnClickListener(v -> sendIrSignal("OK"));
    }

    private void sendIrSignal(String command) {
        // Here, you would implement the logic to send IR commands using the Android Consumer IR API
        // For demo purposes, we'll just show a Toast message
        Toast.makeText(this, "Sending command: " + command, Toast.LENGTH_SHORT).show();
    }
}

