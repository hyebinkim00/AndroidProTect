package org.techtown.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {  //액티비티 최초 실행시 실행 되는곳

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener{
          val intent = Intent(this,SubActivity::class.java)

            intent.putExtra("msg",textView.text.toString())
            startActivity(intent);

        }



    }


}