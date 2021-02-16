package com.example.breakingbaddk.data.repository

import com.example.breakingbaddk.data.model.DataCharacter

interface CharacterRepository {
    suspend fun getCharacterByName(inputName: String): List<DataCharacter>
}