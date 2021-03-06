package com.engineer.imitate.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.engineer.imitate.R
import com.engineer.imitate.interfaces.SimpleProgressChangeListener
import com.xw.repo.BubbleSeekBar
import kotlinx.android.synthetic.main.fragment_evelation.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private const val TAG = "EvelationFragment"

/**
 * A simple [Fragment] subclass.
 *
 */
class EvelationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_evelation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardElevationSeekBar.onProgressChangedListener = object : SimpleProgressChangeListener() {
            override fun onProgressChanged(bubbleSeekBar: BubbleSeekBar?, progress: Int, progressFloat: Float, fromUser: Boolean) {
                super.onProgressChanged(bubbleSeekBar, progress, progressFloat, fromUser)
                cardView.cardElevation = progressFloat
                fab.compatElevation = progressFloat
            }
        }

        cardRadiusSeekBar.onProgressChangedListener = object : SimpleProgressChangeListener() {
            override fun onProgressChanged(bubbleSeekBar: BubbleSeekBar?, progress: Int, progressFloat: Float, fromUser: Boolean) {
                super.onProgressChanged(bubbleSeekBar, progress, progressFloat, fromUser)
                cardView.radius = progressFloat
            }
        }

    }


}
