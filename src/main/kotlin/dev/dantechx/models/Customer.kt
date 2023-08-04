package dev.dantechx.models

import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id:Int, val name:String, val email:String)

val customerStorage = mutableListOf<Customer>()

val customer = Customer(1, "Agaba Tinah", "agaba@gmail.com")
val customer2 = Customer(2, "Nantambi Asia", "asia@gmail.com")

val customer3 = Customer(3, "Kasule Edward", "kasule1sudo@gmail.com")
val customer4 = Customer(4, "Namulondo Lilly", "namlilly@gmail.com")

val c1 = customerStorage.add(customer)
val c2 = customerStorage.add(customer2)

val c3 = customerStorage.add(customer3)
val c4 = customerStorage.add(customer4)
