package com.example.app_404


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
        val newView: LinearLayout
        if (convertView == null) {
            newView = LinearLayout(context)
            val inflater = Context.LAYOUT_INFLATER_SERVICE
            val li: LayoutInflater
            li = context.getSystemService(inflater) as LayoutInflater
            li.inflate(resource, newView, true)
        } else {
            newView = convertView as LinearLayout
        }
        val classInstance: MyClass? = getItem(position)
        val text = newView.findViewById<View>(android.R.id.text1) as TextView
        text.setText(classInstance?.name)

        return newView
    }

}