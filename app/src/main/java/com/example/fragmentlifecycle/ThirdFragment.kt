package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ThirdFragment: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("ThirdFragment", "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("ThirdFragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onAttach(context: Context) {
        Log.e("ThirdFragment", "onAttach")
        super.onAttach(context)
    }

    override fun onStart() {
        super.onStart()
        Log.e("ThirdFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ThirdFragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ThirdFragment", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.e("ThirdFragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("ThirdFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ThirdFragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("ThirdFragment", "onDetach")
    }
}