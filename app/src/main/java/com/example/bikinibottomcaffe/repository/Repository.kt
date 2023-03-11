package com.example.bikinibottomcaffe.data

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

interface Repository {
    fun getAllProducts(): SharedFlow<List<Product>>
    fun getAllOrders(): SharedFlow<List<Order>>
}

internal class RepositoryImpl : Repository{

    private val flowScope = CoroutineScope(Dispatchers.Default)

    val db = Firebase.firestore
    val drinksRef=db.collection("drinks")
    val ordersRef=db.collection("orders")

    val drinksPublisher = MutableSharedFlow<List<Product>>()
    val ordersPublisher=MutableSharedFlow<List<Order>>()

    override fun getAllProducts(): SharedFlow<List<Product>> {
        TODO("Not yet implemented")
    }

    override fun getAllOrders(): SharedFlow<List<Order>> {
        TODO("Not yet implemented")
    }
}