package org.techtown.listviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
            User(R.drawable.android,"Test","20","안녕하세요"),
            User(R.drawable.android,"Test1","21","안녕하세요"),
            User(R.drawable.android,"Test2","22","안녕하세요"),
            User(R.drawable.android,"Test3","23","안녕하세요"),
            User(R.drawable.android,"Test3","24","안녕하세요")


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val item = arrayOf("사과","배","딸기","키위")
        PlistView.adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,item) // ArrayList 는 adapter 선언이 꼭 필요하다
        //simple_list_item _1은 기본 제공 테마*/

        //2.커스텀 어댑터 (list_item_user)

    val Adapter =UserAdapter(this,UserList)
        PlistView.adapter =Adapter



        PlistView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val selectitem= parent.getItemAtPosition(position) as User

            Toast.makeText(this,selectitem.name,Toast.LENGTH_SHORT).show()



        }



    }
}