package taskoneaxiom.com.axiomtasks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import task1axiom.com.axiomtasks.R

class FirstActivity : AppCompatActivity() {
    var value= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val buttonPlus: Button = findViewById(R.id.button_plus)
        val buttonMinus: Button = findViewById(R.id.button_minus)
        val textViewNumber: TextView = findViewById(R.id.text_view_number)



        buttonPlus.setOnClickListener(object : View.OnClickListener{

            override fun onClick(v: View?) {
                value++
                textViewNumber.text = "$value"
            }

        })

        buttonMinus.setOnClickListener(object : View.OnClickListener{
    
    override fun onClick(v: View?) {
        value--
        textViewNumber.text = "$value"
    }

})  
         
       
        }
    }


