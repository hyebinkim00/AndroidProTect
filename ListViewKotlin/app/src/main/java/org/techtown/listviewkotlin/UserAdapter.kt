package org.techtown.listviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class UserAdapter(val context: Context, val UserList:ArrayList<User>):BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View =LayoutInflater.from(context).inflate(R.layout.list_item_user, null)

        val profile = view.findViewById<ImageView>(R.id.img_android)

        val name= view.findViewById<TextView>(R.id.textView)
        val age= view.findViewById<TextView>(R.id.textView2)

        val user =UserList[position]

        profile.setImageResource(user.profile)
        name.text =user.name
        age.text=user.age

        return view
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return UserList.size
    }

}
