package com.example.breakingbaddk.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingbaddk.data.model.DataCharacter
import com.example.breakingbaddk.databinding.ItemBreakingListBinding
import com.squareup.picasso.Picasso

class CharacterListAdapter(private val clickListener: ()-> Unit):
    RecyclerView.Adapter<CharacterListAdapter.CharacterViewHolder>(){

    class CharacterViewHolder(val binding: ItemBreakingListBinding) :
            RecyclerView.ViewHolder(binding.root){

        fun onBind(characterItem: DataCharacter,
                   clickListener: ()-> Unit){
            itemView.setOnClickListener { clickListener.invoke() }
            binding.tvCharacterName.text = characterItem.name
            Picasso.get().load(characterItem.image)
                .into(binding.ivCharacterPortrait)
        }
    }

    private var dataSet: List<DataCharacter>? = null

    fun setDataSet(dataSet: List<DataCharacter>){
        this.dataSet = dataSet
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(
            ItemBreakingListBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false)
        )
    }

    override fun getItemCount(): Int {
        return dataSet?.size ?: 0
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        dataSet?.let {
            holder.onBind(it[position], clickListener)
        }
    }


}