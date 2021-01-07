package org.techtown.loan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sv_searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                val str = sv_searchView.toString()
                Log.d("로그테스트",str.toString())

                return false
            }
        })




        val adapter = FragmentAdapter(this)
        val fragments = listOf<Fragment>(SoldLoansFragment(), SoldLoansFragment())
        val tabTitles = listOf<String>("진행중 펀드","완료된 펀드")
        adapter.fragments.addAll(fragments)

        viewPager.adapter =adapter

        TabLayoutMediator(tab_layout, viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()

    }




}

class FragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){


    val fragments = mutableListOf<Fragment>()

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {

        return fragments[position]

    }

}