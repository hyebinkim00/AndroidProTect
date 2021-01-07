package org.techtown.loan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
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
                Loand(R.drawable.soldout,"20","원","C-121","항공 관제사의 꿈을 이루기 위해 관제 교육원 진학을 준비중입니다","1개월","원리금리","2",10,15,"15%"),
                Loand(R.drawable.mubang,"202","원","C-122","프로그래머를 꿈꾸는 미래 개발자 입니다","1개월","원리금리","2",25,60,"60%"),
                Loand(R.id.mubang,"202","원","C-123","프로그래머를 꿈꾸는 미래 개발자 입니다","1개월","원리금리","2",70,25,"25%"),
                Loand(R.id.mubang,"202","원","C-121","항공 관제사의 꿈을 이루기 위해 \n관제 교육원 진학을 준비중입니다","1개월","원리금리","2",15,50,"50%")
        )
        return list





    }


}