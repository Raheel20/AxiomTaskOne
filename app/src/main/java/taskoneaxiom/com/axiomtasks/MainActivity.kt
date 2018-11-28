package taskoneaxiom.com.axiomtasks

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

import task1axiom.com.axiomtasks.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val buttonFirstTask: Button = findViewById(R.id.button_FirstTask)
        val buttonSecondTask: Button = findViewById(R.id.button_SecondTask)
        val buttonThirdTask: Button = findViewById(R.id.button_ThirdTask)
        val buttonFourthTask: Button = findViewById(R.id.button_FourthTask)

        buttonFirstTask.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
        buttonSecondTask.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        buttonThirdTask.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        buttonFourthTask.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
    }
}
