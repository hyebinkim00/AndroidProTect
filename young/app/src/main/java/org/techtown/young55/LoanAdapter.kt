package org.techtown.young55

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LoanAdapter(val loanlist : ArrayList<Loans>) : RecyclerView.Adapter<LoanAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoanAdapter.CustomViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return loanlist.size
    }

    override fun onBindViewHolder(holder: LoanAdapter.CustomViewHolder, position: Int) {
        holder.sold.setImageResource(loanlist.get(position).sold)
        holder.price.text =loanlist.get(position).price
        holder.won.text =loanlist.get(position).won
    }


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sold = itemView.findViewById<ImageView>(R.id.sold_img)
        val price =itemView.findViewById<TextView>(R.id.tv_price)
        val won = itemView.findViewById<TextView>(R.id.tv_won)

    }
}


