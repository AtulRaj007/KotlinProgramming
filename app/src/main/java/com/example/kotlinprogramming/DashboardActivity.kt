package com.example.kotlinprogramming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*

class DashboardActivity : AppCompatActivity() {
    var menus: ArrayList<String> =ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initialise()
    }

    private fun initialise() {
        menus.add("First")
        menus.add("Second")
        menus.add("Third")
        menus.add("Fourth")
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = MenuRecyclerAdapter(this,menus)
    }
}
