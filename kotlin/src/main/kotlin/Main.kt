package org.example

import okhttp3.OkHttpClient
import okhttp3.Request
import kotlinx.coroutines.*
import okio.IOException

val client = OkHttpClient()

fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var countX = 0
    var countO = 0

    for (c in strLower) {
        when (c) {
            'x' -> countX++
            'o' -> countO++
        }
    }

    return countO == countX && countO != 0
}

suspend fun tellCatFact(): String {
    val urlRequest = "https://catfact.ninja/fact"

    val request = Request.Builder()
        .url(urlRequest)
        .build()

    return withContext(Dispatchers.IO) {
        client.newCall(request).execute().use {
            response ->
            if(!response.isSuccessful) throw IOException("Unexpected error -> ${response.message}")
            response.body.string()
        }
    }

}

fun divide(numA: Int, numbB: Int): Int {
    if(numbB == 0) throw IllegalArgumentException("It is not possible divide by 0")
    return numA / numbB
}

class Pet(var id: Int?, val animal: String, var age: Int, name: String, var ownerEmail: String)

interface IPetRepository {
    fun create(pet: Pet): Pet
    fun findById(i: Int): Pet?
}

class PetService(private val _petRepository: IPetRepository) {

   fun create(pet: Pet): Pet {
      return this._petRepository.create(pet)
   }

    fun findById(id: Int): Pet? {
        return this._petRepository.findById(id)
    }
}