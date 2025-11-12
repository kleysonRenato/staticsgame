// Carro.kt
package com.sinodal.staticsgame.model
import jakarta.persistence.*

@Entity
data class Carro(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val marca: String,
    val modelo: String,
    val ano: Int,
    val preco: Double
)
