
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Power Button
        findViewById<Button>(R.id.btn_power).setOnClickListener {
            sendIrSignal("POWER")
        }

        // Volume Buttons
        findViewById<Button>(R.id.btn_volume_up).setOnClickListener {
            sendIrSignal("VOLUME_UP")
        }
        findViewById<Button>(R.id.btn_volume_down).setOnClickListener {
            sendIrSignal("VOLUME_DOWN")
        }

        // Channel Buttons
        findViewById<Button>(R.id.btn_channel_up).setOnClickListener {
            sendIrSignal("CHANNEL_UP")
        }
        findViewById<Button>(R.id.btn_channel_down).setOnClickListener {
            sendIrSignal("CHANNEL_DOWN")
        }

        // Navigation Buttons
        findViewById<Button>(R.id.btn_up).setOnClickListener {
            sendIrSignal("UP")
        }
        findViewById<Button>(R.id.btn_down).setOnClickListener {
            sendIrSignal("DOWN")
        }
        findViewById<Button>(R.id.btn_left).setOnClickListener {
            sendIrSignal("LEFT")
        }
        findViewById<Button>(R.id.btn_right).setOnClickListener {
            sendIrSignal("RIGHT")
        }
        findViewById<Button>(R.id.btn_ok).setOnClickListener {
            sendIrSignal("OK")
        }
    }

    private fun sendIrSignal(command: String) {
        // Here, you would implement the logic to send IR commands using the Android Consumer IR API
        // For demo purposes, we'll just show a Toast message
        Toast.makeText(this, "Sending command: $command", Toast.LENGTH_SHORT).show()
    }
}



