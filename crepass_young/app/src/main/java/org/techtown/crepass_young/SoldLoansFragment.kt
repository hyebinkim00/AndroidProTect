package org.techtown.crepass_young

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_sold_loans.view.*


class SoldLoansFragment : Fragment() {

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            val view =inflater.inflate(R.layout.fragment_sold_loans,container,false)

            val adapter =LoansoldAdapter(loanData())
      view.rv_loan.adapter =adapter
      view.rv_loan.layoutManager = LinearLayoutManager(context)

        return view
    }

    fun loanData() : ArrayList<Loand>{
        val list = arrayListOf<Loand>(
                Loand(R.drawable.kumsn,"2,000,000","원","C-121","항공 관제사의 꿈을 이루기 위해 관제 교육원 진학을 준비중입니다",R.drawable.star,"1개월","원리금균등","20대여성",10,15,"15%"),
                Loand(R.drawable.foodtruck,"2,100,000","원","C-122","프로그래머를 꿈꾸는 미래 개발자 입니다",R.drawable.star,"1개월","원리금균등","30대 여성",25,60,"60%"),
                Loand(R.drawable.mubang,"2,100,000","원","C-123","프로그래머를 꿈꾸는 미래 개발자 입니다",R.drawable.star,"1개월","원리금균등","30대 여성",70,25,"25%"),
                Loand(R.drawable.mubang,"2,200,000","원","C-121","항공 관제사의 꿈을 이루기 위해 관제 교육원 진학을 준비중입니다",R.drawable.star,"1개월","원리금균등","30대 여성",15,50,"50%")
        )
        return list





    }





}