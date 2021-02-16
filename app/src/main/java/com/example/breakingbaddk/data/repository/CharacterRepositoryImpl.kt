package com.example.breakingbaddk.data.repository

import com.example.breakingbaddk.data.model.DataCharacter
import com.example.breakingbaddk.data.remote.CharacterAPI

class CharacterRepositoryImpl(val characterRemote: CharacterAPI) : CharacterRepository{

    override suspend fun getCharacterByName(inputName: String): List<DataCharacter> {
        return characterRemote.getCharacters(inputName)
    }
}