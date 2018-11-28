package taskoneaxiom.com.axiomtasks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import task1axiom.com.axiomtasks.R

class SecondActivity : AppCompatActivity() {
    private var count = 0

    private val nameList = arrayListOf("")
    private val emailList = arrayListOf("")
    private val contactList = arrayListOf("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val editTextName: EditText = findViewById(R.id.edit_text_name)
        val editTextEmail: EditText = findViewById(R.id.edit_text_email)
        val editTextContact: EditText = findViewById(R.id.edit_text_contact)
        val buttonSubmit: Button = findViewById(R.id.button_submit)
        val buttonNext: Button = findViewById(R.id.button_next)
        val buttonPrevious: Button = findViewById(R.id.button_previous)

        val outputTextViewName: TextView = findViewById(R.id.output_name)
        val outputTextViewEmail: TextView = findViewById(R.id.output_email)
        val outputTextViewContact: TextView = findViewById(R.id.output_phone)



        buttonSubmit.setOnClickListener {

            val name = editTextName.text.toString()
            nameList.add(name)

            val email = editTextEmail.text.toString()
            emailList.add(email)
            val contact = editTextContact.text.toString()
            contactList.add(contact)
         Toast.makeText(applicationContext, "Info Added", Toast.LENGTH_LONG).show()

        }
        buttonNext.setOnClickListener { 
            outputTextViewName.text = nameList[count]
            outputTextViewEmail.text = emailList[count]
            outputTextViewContact.text = contactList[count]

            count++
            if (count ==nameList.size){
                count = 0
            }
            

        } 
        buttonPrevious.setOnClickListener { 
            outputTextViewName.text = nameList[count]
            outputTextViewEmail.text = emailList[count]
            outputTextViewContact.text = contactList[count]

            count--
            if (count == 0){
                count = nameList.size
            }
            

        }
    }
}

    
