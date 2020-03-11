package com.example.app_404


import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.*

class MainActivity : Activity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val myListView = findViewById<View>(R.id.my_list_view) as ListView
        val layoutID = android.R.layout.simple_list_item_1

        val myStringArray = ArrayList<String>()
        val myAdapterInstance: ArrayAdapter<String>
        myAdapterInstance = ArrayAdapter(this, layoutID, myStringArray)
        myListView.adapter = myAdapterInstance
        myStringArray.add("The")
        myStringArray.add("quick")
        myStringArray.add("green")
        myStringArray.add("Android")
        myStringArray.add("jumped")
        myStringArray.add("over")
        myStringArray.add("the")
        myStringArray.add("lazy")
        myAdapterInstance.notifyDataSetChanged()

    }
}