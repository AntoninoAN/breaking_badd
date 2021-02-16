package com.example.breakingbaddk.ui.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingbaddk.databinding.MainFragmentBinding
import com.example.breakingbaddk.ui.main.MainViewModel

abstract class ItemFragment: Fragment() {

    protected lateinit var viewModel: MainViewModel
    protected lateinit var recyclerView: RecyclerView
    protected abstract val layoutManager: RecyclerView.LayoutManager
    protected abstract val adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>
    private var __binding: MainFragmentBinding? = null
    private val binding: MainFragmentBinding get() = __binding!!


    override fun onStart() {
        super.onStart()
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        __binding = MainFragmentBinding.inflate(inflater, container , false)
        recyclerView = binding.rvDisplay
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        __binding = null
    }
}