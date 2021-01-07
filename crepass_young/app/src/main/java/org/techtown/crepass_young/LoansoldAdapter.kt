package org.techtown.crepass_young

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.*
import java.sql.Driver


class LoansoldAdapter(val loanlist : ArrayList<Loand>) : RecyclerView.Adapter<LoansoldAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoansoldAdapter.CustomViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.listloand,parent,false)

        return CustomViewHolder(view).apply {
            star.setOnClickListener {
                val curPos :Int = adapterPosition
                star.setImageResource(R.drawable.star_select)
            }

            itemView.setOnClickListener {
                val curPos :Int = adapterPosition
                val loans : Loand =loanlist.get(curPos)

                Toast.makeText(parent.context,"Text: ${loans.price}",Toast.LENGTH_SHORT).show()
            }


        }
    }



    override fun getItemCount(): Int {
        return loanlist.size
    }

    override fun onBindViewHolder(holder: LoansoldAdapter.CustomViewHolder, position: Int) {
        holder.mubang.setImageResource(loanlist.get(position).munbang)
        holder.price.text =loanlist.get(position).price
        holder.won.text =loanlist.get(position).won
        holder.title.text = loanlist.get(position).title
        holder.star.setImageResource(loanlist.get(position).star)
        holder.number.text =loanlist.get(position).number
        holder.month.text =loanlist.get(position).month
        holder.text.text =loanlist.get(position).text
        holder.age.text =loanlist.get(position).age
        holder.chat.text=loanlist.get(position).chat.toString()
        holder.progress.progress=loanlist.get(position).progress
        holder.tv_progress.text=loanlist.get(position).tv_progress



    }


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mubang = itemView.findViewById<ImageView>(R.id.mubang)
        val price =itemView.findViewById<TextView>(R.id.tv_price)
        val won = itemView.findViewById<TextView>(R.id.tv_won)
        val title = itemView.findViewById<TextView>(R.id.tv_title)
        val star = itemView.findViewById<ImageView>(R.id.star_blank)
        val number = itemView.findViewById<TextView>(R.id.tv_number)
        val month = itemView.findViewById<TextView>(R.id.tv_month)
        val text = itemView.findViewById<TextView>(R.id.tv_text)
        val age = itemView.findViewById<TextView>(R.id.tv_age)
        val chat = itemView.findViewById<TextView>(R.id.tv_chat)
        val progress = itemView.findViewById<ProgressBar>(R.id.progressBar)
        val tv_progress = itemView.findViewById<TextView>(R.id.tv_progress)

    }

}


