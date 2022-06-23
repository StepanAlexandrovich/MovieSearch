package java.android.moviesearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.buttonUp).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.buttonDown).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

        when (p0?.getId()) {
            R.id.buttonUp -> message("UP")
            R.id.buttonDown -> message("DOWN")
        }
    }

    private fun message(text:String){
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
    }
}