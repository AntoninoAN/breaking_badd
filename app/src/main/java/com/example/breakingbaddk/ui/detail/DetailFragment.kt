package com.example.breakingbaddk.ui.detail

import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingbaddk.ui.adapter.ItemFragment

class DetailFragment: ItemFragment() {

    override val layoutManager: RecyclerView.LayoutManager
        get() = TODO("Not yet implemented")
    override val adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>
        get() = TODO("Not yet implemented")

    override fun onStart() {
        super.onStart()
        viewModel.liveDataCharacters.observe(this,
            Observer {
                //todo update adapter
            })
    }
}