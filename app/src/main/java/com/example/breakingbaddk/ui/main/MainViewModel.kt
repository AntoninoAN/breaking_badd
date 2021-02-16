package com.example.breakingbaddk.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    val liveDataCharacters: MediatorLiveData<Any> = MediatorLiveData()
    private lateinit var dataCharacters: LiveData<Any>

    fun getListCharacterByName(){}

    private fun updateDataCharacters(){}
}