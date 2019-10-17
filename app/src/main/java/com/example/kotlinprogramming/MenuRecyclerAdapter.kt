package com.example.kotlinprogramming

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_menu.view.*

class MenuRecyclerAdapter(val context:Context,var menus:ArrayList<String>):RecyclerView.Adapter<MenuRecyclerAdapter.MenuViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(LayoutInflater.from(context).inflate(R.layout.row_menu,parent,false))
    }

    override fun getItemCount(): Int {
        return menus.size
    }


    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.itemView.tv_title.setText(menus.get(position))
    }


    class MenuViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }
}