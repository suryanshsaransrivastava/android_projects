package com.example.project7

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView

class MyArrayAdapter(
    context: Context?,
    var resource: Int,
    items: List<MyClass?>?
) :
    ArrayAdapter<MyClass?>(context!!, resource, items!!) {
    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        // Create and inflate the View to display
        val newView: LinearLayout
        if (convertView == null) {
            // Inflate a new view if this is not an update.
            newView = LinearLayout(context)
            val inflater = Context.LAYOUT_INFLATER_SERVICE
            val li: LayoutInflater
            li = context.getSystemService(inflater) as LayoutInflater
            li.inflate(resource, newView, true)
        } else {
            // Otherwise we'll update the existing View
            newView = convertView as LinearLayout
        }
        val classInstance = getItem(position)
        val text = newView.findViewById<View>(R.id.text1) as TextView
        text.text = classInstance!!.name


        return newView
    }

}