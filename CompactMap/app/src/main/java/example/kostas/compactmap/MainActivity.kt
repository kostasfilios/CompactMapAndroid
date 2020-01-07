package example.kostas.compactmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stringArray = mutableListOf<String>("1", "2", "three")
        val compactMappedArray = stringArray.compactMap { it.toIntOrNull() }
    }
}
