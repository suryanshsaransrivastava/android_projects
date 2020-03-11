package com.example.project7

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListView = findViewById<View>(R.id.my_list_view) as ListView

        val layoutID = android.R.layout.simple_list_item_1

        /**
         * Creating and applying an Adapter
         */
        val myStringArray = ArrayList<String>()

        val myAdapterInstance: ArrayAdapter<String>
        myAdapterInstance = ArrayAdapter(this, layoutID, myStringArray)

        myListView.adapter = myAdapterInstance


        myStringArray.add("The")
        myStringArray.add("quick")
        myStringArray.add("brown")
        myStringArray.add("fox")
        myStringArray.add("jumped")
        myStringArray.add("over")
        myStringArray.add("the")
        myStringArray.add("lazy")
        myStringArray.add("dog")
        myAdapterInstance.notifyDataSetChanged()

        /**
         * Listing 4-21: Using Customized Array Adapter with MyClass.
         */
        val myClassesArray: ArrayList<MyClass> = ArrayList<MyClass>()
        myClassesArray.add(MyClass("khojo"))
        myClassesArray.add(MyClass("mojo"))
        myClassesArray.add(MyClass("tojo"))
        myClassesArray.add(MyClass("dojo"))
        myClassesArray.add(MyClass("ping"))
        myClassesArray.add(MyClass("pong"))
        myClassesArray.add(MyClass("ding"))
        myClassesArray.add(MyClass("dong"))
        myClassesArray.add(MyClass("king"))
        myClassesArray.add(MyClass("kong"))
        val myArrayAdapter = MyArrayAdapter(this, layoutID, myClassesArray)
        myListView.adapter = myArrayAdapter

    }
}
