package com.example.applemarket

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applemarket.databinding.ItemBinding

class adapter(val mItems: MutableList<item>) : RecyclerView.Adapter<adapter.Holder>() {

    interface ItemClick {
        fun onClick(view : View, position : Int)
    }

    var itemClick : ItemClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener {  //클릭이벤트추가부분
            itemClick?.onClick(it, position)
        }
        holder.iconImageView.setImageResource(mItems[position].image)
        holder.name.text = mItems[position].title
        holder.where.text = mItems[position].where
        holder.number.text = mItems[position].number
        holder.like.text = mItems[position].like.toString()
        holder.chat.text = mItems[position].chat.toString()
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
//        Log.i("adapter","${mItems.size}")
        return mItems.size

    }

    inner class Holder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val iconImageView = binding.imageView
        val name = binding.title
        val where = binding.where
        val number = binding.number
        var like = binding.like
        var chat = binding.chatnum
    }
}