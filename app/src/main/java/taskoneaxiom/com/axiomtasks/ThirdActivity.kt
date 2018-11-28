package taskoneaxiom.com.axiomtasks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import task1axiom.com.axiomtasks.R

class ThirdActivity : AppCompatActivity() {
    private var imageArray = arrayOf(R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecreamsandwich, R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.mashmallow, R.drawable.nougat, R.drawable.oreo)
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val buttonNext = findViewById<Button>(R.id.button_image_next)
        val buttonPrevious = findViewById<Button>(R.id.button_image_previous)
        val imageView = findViewById<ImageView>(R.id.imageView)

        buttonNext.setOnClickListener {
            //            val r =  Random()
//            val n=r.nextInt(7)
            imageView.setImageResource(imageArray[count])
            count++
            if (count == imageArray.size){
                count = imageArray.lastIndex
            }

        } 
        buttonPrevious.setOnClickListener {
            //            val r =  Random()
//            val n=r.nextInt(7)
            imageView.setImageResource(imageArray[count])
            count--
            if (count <= 0){
                count = 0
            }

        }
    }
}
