
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edit_text)
        val textView = findViewById<TextView>(R.id.textViewName)
        val buttonOkay = findViewById<Button>(R.id.buttonOkay)
        val buttonNext = findViewById<Button>(R.id.buttonNext)

        buttonOkay.setOnClickListener {
            val name = editText.text.toString()
            textView.text = name
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
