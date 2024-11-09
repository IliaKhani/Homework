import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val buttonClick = findViewById<Button>(R.id.buttonClick)

        buttonClick.setOnClickListener {
            val number = editTextNumber.text.toString().toIntOrNull() ?: 0
            editTextNumber.setText((number + 1).toString())
        }
    }
}
