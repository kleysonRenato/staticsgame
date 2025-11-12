// Moto.kt
package com.sinodal.staticsgame.model
import jakarta.persistence.*

@Entity
data class Moto(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val marca: String,
    val modelo: String,
    val ano: Int,
    val cilindrada: Int,
    val preco: Double
)