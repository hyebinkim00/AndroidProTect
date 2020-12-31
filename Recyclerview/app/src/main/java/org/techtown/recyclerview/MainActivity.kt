package org.techtown.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.boy,"안드로이드",1,"안드로이드 앱 개발자"),
            Profiles(R.drawable.girl,"안드로이드",2,"안드로이드 앱 개발자"),
            Profiles(R.drawable.boy,"안드로이드",3,"안드로이드 앱 개발자"),
            Profiles(R.drawable.girl,"안드로이드",4,"안드로이드 앱 개발자"),
            Profiles(R.drawable.boy,"안드로이드",5,"안드로이드 앱 개발자")

        )

        rv_profile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter= ProfileAdapter(profileList)


    }
}