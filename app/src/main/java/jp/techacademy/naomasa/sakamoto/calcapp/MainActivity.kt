package jp.techacademy.naomasa.sakamoto.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.text.Editable
import android.util.Log
import com.google.android.material.snackbar.Snackbar

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
            if ((num1.text.isEmpty())||(num2.text.isEmpty())) {
                Snackbar.make(v, "2つの数値が入力されていません", Snackbar.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                val number1 = num1.text.toString().toDouble()
                val number2 = num2.text.toString().toDouble()
                intent.putExtra("VALUE1", number1)
                intent.putExtra("VALUE2", number2)
                when (v.id) {
                    R.id.button1 -> intent.putExtra("VALUE3", 1)
                    R.id.button2 -> intent.putExtra("VALUE3", 2)
                    R.id.button3 -> intent.putExtra("VALUE3", 3)
                    R.id.button4 -> intent.putExtra("VALUE3", 4)
                }
                startActivity(intent)
            }
    }
}