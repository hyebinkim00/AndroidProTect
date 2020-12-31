package org.techtown.imageviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener{

            img1.setImageResource(R.drawable.ic_launcher_background)   //이미지 변경
            Toast.makeText(this@MainActivity,"버튼 클릭 되었습니다.",Toast.LENGTH_LONG).show()  //toast
            

        }

    }
}