package com.hala.kotlinandroidsamples.viewpager

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.RelativeLayout
import com.hala.kotlinandroidsamples.R
import android.widget.LinearLayout




/**
 * @author  anupamsingh
 * @version 1.0
 * @since 31/05/18
 */

public class Layouts021 : View {

    constructor(context: Context) : this(context, null) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context)
    }

    private fun init(context: Context) {
        if (layoutParams.height == 50) { //Donot do this , it will cause a nullpointer exception
            // doSomething()
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        if (layoutParams.height == 50) { //getLayout Params will not return null here
            // doSomething()
        }
    }


}