package ru.netology

fun main() {
    val itemPrice = 20000
    val itemCount = 1
    val discount = 100
    val totalPrice = itemPrice * itemCount
    val regularCustomer = true

    val result = if (totalPrice >= 1001 && totalPrice <= 10000) totalPrice - discount
        else if (totalPrice >= 10001) (totalPrice * 0.95) .toInt()
        else totalPrice

    val final = if (regularCustomer) (result * 0.99) else result
    println("Ваша сумма покупки $final")
}