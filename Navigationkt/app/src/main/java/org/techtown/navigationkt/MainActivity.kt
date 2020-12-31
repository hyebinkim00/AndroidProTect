 package org.techtown.navigationkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_menu.setOnClickListener {
            layout_drawer.openDrawer(GravityCompat.START)  //Start : 왼쪽 End : 오른쪽
        }
        naviView.setNavigationItemSelectedListener(this)   //네비게이션 메뉴 아이템에 클릭 속성 부여
    }

     override fun onNavigationItemSelected(item: MenuItem): Boolean {  //네비게이션 매뉴 아이템 클릭시 수행
         when(item.itemId)
         {
             R.id.menu1 -> Toast.makeText(applicationContext,"접근성",Toast.LENGTH_SHORT).show()
             R.id.menu2 -> Toast.makeText(applicationContext,"이메일",Toast.LENGTH_SHORT).show()
             R.id.menu3 -> Toast.makeText(applicationContext,"메세지",Toast.LENGTH_SHORT).show()
         }
        layout_drawer.closeDrawers()
         return false
     }

     override fun onBackPressed() {  //백버튼 누를시 수행
         if(layout_drawer.isDrawerOpen(GravityCompat.START)){
             layout_drawer.closeDrawers()
         }

         super.onBackPressed()

     }
 }