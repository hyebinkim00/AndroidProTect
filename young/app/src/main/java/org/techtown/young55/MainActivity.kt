package org.techtown.young55


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowCustomEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(false)
        var actionView = layoutInflater.inflate(R.layout.custom,null)
        supportActionBar?.customView=actionView



        btn_1.setOnClickListener{
            setFrag(0)



        }

       btn_2.setOnClickListener{
           setFrag(1)
           btn_1.setBackgroundColor(Color.WHITE)
       }
    }

    private fun setFrag(fragnum : Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragnum)
        {
            0->{
                ft.replace(R.id.main_frame, Fragment1()).commit()
            }

            1->{
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }

        }
    }
}

