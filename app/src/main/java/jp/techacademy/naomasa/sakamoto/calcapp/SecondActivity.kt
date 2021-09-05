package jp.techacademy.naomasa.sakamoto.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        //Log.d("testlog2", value1.toString())

        when (intent.getIntExtra("VALUE3", 0)) {
            1 -> textView.text = "${value1 + value2}"
            2 -> textView.text = "${value1 - value2}"
            3 -> textView.text = "${value1 * value2}"
            4 -> textView.text = "${value1 / value2}"
        }
        //Log.d("testlog2", textView.text.toString())

    }
}