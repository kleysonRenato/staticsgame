// Filme.kt
package com.sinodal.staticsgame.model
import jakarta.persistence.*

@Entity
data class Filme(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val titulo: String,
    val diretor: String,
    val anoLancamento: Int,
    val genero: String
)
