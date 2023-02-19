package com.example.bikinibottomcaffe.data

val drink1=Product(
    id = 100,
    categoryId = 200,
    name="Coca Cola",
    price=2.0,
    servingSize = 2.5
)

val drink2= Product (
    id = 101,
    categoryId = 200,
    name = "Fanta",
    price=2.0,
    servingSize = 2.5
)

val drink3 = Product (
    id=102,
    categoryId = 200,
    name="Sprite",
    price=2.0,
    servingSize = 2.5
)

val drinks : MutableList<Product> = mutableListOf(drink1, drink2, drink3)

val order1=Order(
    id=1000,
    products = drinks,
    status=1,
    totalPrice = 6.0,
    tableNumber = 10,
    waiterId = 5
)

val order2=Order(
    id=10001,
    products = drinks,
    status=1,
    totalPrice = 6.0,
    tableNumber = 10,
    waiterId = 5
)