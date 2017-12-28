package com.hala.kotlinandroidsamples.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hala.kotlinandroidsamples.R

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2017-12-27
 */

class ViewPagerFragment : Fragment() {

    companion object {

        fun newInstance(): ViewPagerFragment {
            return ViewPagerFragment()
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_view_pager, container, false)
    }

}