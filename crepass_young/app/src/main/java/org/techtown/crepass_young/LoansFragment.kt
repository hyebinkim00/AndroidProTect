package org.techtown.crepass_young

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_loans.*
import kotlinx.android.synthetic.main.fragment_loans.view.*
import kotlinx.android.synthetic.main.list.*


class LoansFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_loans,container,false)


        val adapter = LoanAdapter(loanData())
        view.rv_profile.adapter = adapter
        view.rv_profile.layoutManager = LinearLayoutManager(context)

        return view

    }
    fun loanData() : ArrayList<Loans>{
        val list = arrayListOf<Loans>(
                Loans(R.drawable.soldout,"3,300,000","원","C-121","항공 관제사의 꿈을 이루기 위해\n관제 교육원 진학을 준비중입니다",R.drawable.star,"1개월","원리금균등","20대 여성",10,15,"15%"),
                Loans(R.drawable.soldout,"2,000,000","원","C-122","프로그래머를 꿈꾸는 미래 개발자 입니다",R.drawable.star,"1개월","원리금균등","20대 여성",25,60,"60%"),
                Loans(R.drawable.soldout,"5,000,000","원","C-123","프로그래머를 꿈꾸는 미래 개발자 입니다",R.drawable.star,"1개월","원리금균등","20대 여성",70,25,"25%"),
                Loans(R.drawable.soldout,"4,000,000","원","C-121","항공 관제사의 꿈을 이루기 위해 관제 교육원 진학을 준비중입니다",R.drawable.star,"1개월","원리금균등","20대 여성",15,50,"50%")
        )
        return list

    }



}