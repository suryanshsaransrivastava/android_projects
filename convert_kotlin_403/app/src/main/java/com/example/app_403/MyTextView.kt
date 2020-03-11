package com.example.app_403

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.TextView


class MyTextView : TextView {
    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyle: Int
    ) : super(context, attrs, defStyle) {
    }

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {
    }
}