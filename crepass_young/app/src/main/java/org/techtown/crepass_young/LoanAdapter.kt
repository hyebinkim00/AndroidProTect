package org.techtown.crepass_young

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class LoanAdapter(val loanlist : ArrayList<Loans>) : RecyclerView.Adapter<LoanAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoanAdapter.CustomViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)

        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos :Int = adapterPosition
                val loans : Loans =loanlist.get(curPos)
                Toast.makeText(parent.context,"Text: ${loans.title}",Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun getItemCount(): Int {
        return loanlist.size
    }

    override fun onBindViewHolder(holder: LoanAdapter.CustomViewHolder, position: Int) {
        holder.sold.setImageResource(loanlist.get(position).sold)
        holder.price.text =loanlist.get(position).price
        holder.won.text =loanlist.get(position).won
        holder.title.text = loanlist.get(position).title
        holder.number.text =loanlist.get(position).number
        holder.month.text =loanlist.get(position).month
        holder.text.text =loanlist.get(position).text
        holder.age.text =loanlist.get(position).age
        holder.chat.text=loanlist.get(position).chat.toString()
        holder.progress.progress=loanlist.get(position).progress
        holder.tv_progress.text=loanlist.get(position).tv_progress



    }


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sold = itemView.findViewById<ImageView>(R.id.sold_img)
        val price =itemView.findViewById<TextView>(R.id.tv_price)
        val won = itemView.findViewById<TextView>(R.id.tv_won)
        val title = itemView.findViewById<TextView>(R.id.tv_title)
        val number = itemView.findViewById<TextView>(R.id.tv_number)
        val month = itemView.findViewById<TextView>(R.id.tv_month)
        val text = itemView.findViewById<TextView>(R.id.tv_text)
        val age = itemView.findViewById<TextView>(R.id.tv_age)
        val chat = itemView.findViewById<TextView>(R.id.tv_chat)
        val progress = itemView.findViewById<ProgressBar>(R.id.progressBar)
        val tv_progress = itemView.findViewById<TextView>(R.id.tv_progress)

    }
}


