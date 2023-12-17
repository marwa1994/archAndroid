package com.marwa.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Testa {
   suspend fun test(){
        withContext(Dispatchers.IO){

        }
    }
}