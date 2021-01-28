package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController


/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitleFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    // working with any widgets need to be done here because this is when the layout
    // starts to actually exist
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_title, container, false)

        // manipulate all the widgets here in between inflating and returning
        rootView.button_titleFragment_navTest.setonClickListener { view : View ->
            if(Math.random() < .5) {
                view.findNavController().navigate(R.id.action_titleFragment_to_secondFragment)
            } else {
                view.findNavController().navigate(R.id.action_titleFragment_to_thirdFragment)
            }
        }

        // return the inflated rootView
        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            TitleFragment()
    }
}