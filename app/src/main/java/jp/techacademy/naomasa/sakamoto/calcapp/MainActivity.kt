package jp.techacademy.naomasa.sakamoto.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        val num1 = num1.text
        val num2 = num2.text
        intent.putExtra("VALUE1", num1)
        intent.putExtra("VALUE2", num2)
        when (v.id) {
            R.id.button1 -> intent.putExtra("VALUE3", 1)
            R.id.button2 -> intent.putExtra("VALUE3", 2)
            R.id.button3 -> intent.putExtra("VALUE3", 3)
            R.id.button4 -> intent.putExtra("VALUE3", 4)
        }
        Log.d("testlog", num1.toString())
        startActivity(intent)
    }
}