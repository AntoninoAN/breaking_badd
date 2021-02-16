package com.example.breakingbaddk.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingbaddk.R
import com.example.breakingbaddk.ui.adapter.ItemFragment

class ListFragment : ItemFragment() {

    override val layoutManager: RecyclerView.LayoutManager
        get() = LinearLayoutManager(context)

    override val adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>
        get() = TODO("Not yet implemented")


    override fun onStart() {
        super.onStart()
        viewModel.liveDataCharacters.observe(this,
        Observer {
            //todo update adapter
        })
    }

    interface Listener{
        fun onClickCharacter(position: Int)
    }

}