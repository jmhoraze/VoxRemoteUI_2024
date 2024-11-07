package com.wavvox.remoteuiapplication;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import com.wavvox.remoteuiapplication.R;

/**
 * initial release:
 * this App, now being relabeled from remoteuiapplication to VoxRemoteUI,
 * is the modified Android Studio 2024.2.1 sample "Remote UI Application"
 * incorporating the MainActivity.java (original: MainActivity.kotlin)
 * and the res/layout/activity_main had been replaced
 *
 * kudos to
 *      _  IR Remote UI Code - chatGPT (02-Nov-2024) _ @link:
 *            chatgpt.com/share/67267ec3-3f04-8010-bbee-9af5065393ba
 *      _  Free Kotlin to Java Code Converter |
 *         Online Programming Language Transformer _ @link:
 *            syntha.ai/converters/kotlin-to-java
 *
 * Jûrgen Menge, San José, California, 04-Nov-2024
 *
 * update #1
 * as Cradle changed its syntax again and deprecated features just released
 * the original used link to wavvoxlibrary in app/build.cradle had to be
 * modified again; luckily, I found a web page elaborating the solution
 *
 * kudos to
 *      _  Import .AAR/.JAR in Android Studio
 *         (Romman Sabbir, 08-Apr-2024) _ @link:
 *            rommansabbir.com/import-aarjar-in-android-studio
 *
 * Jûrgen Menge, San José, California, 05-Nov-2024
 *
 * update #2
 * incorporating the logic from VoxDigits15 to two new classes:
 *      _ HandleOptions (iactivity) to allow pull-down menus
 *           . generation
 *           . senderAB + packetKind
 *           . liveDebugLevel + Volume +/–
 *        using SharedPrefsHelper
 * and
 *      _ TransmitWavvoxCodes (Uiactivity) to create array of Codes
 *        allowing Aaa, A-B, A-B-C packets then calling
 *        WavvoxPlayCodes to transmit the resulting audio array
 *
 * Jûrgen Menge, San José, California, 07-Nov-2024
 */

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

