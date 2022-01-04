package com.bolusarz.starapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.text.TextPaint
import android.util.AttributeSet
import android.view.View


class StarView : View {

    var mRating: Int = 0
    var mMaximumRating = 5
    var mOutlineColor = Color.YELLOW
    var mFillColor = Color.YELLOW
    var mOutlineWidth = 3f

    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(attrs, defStyle)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {
        // Load attributes
        val a = context.obtainStyledAttributes(
            attrs, R.styleable.StarView, defStyle, 0
        )

        a.recycle()

    }


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }
}