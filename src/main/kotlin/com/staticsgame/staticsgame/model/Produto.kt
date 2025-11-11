package com.sinodal.staticsgame.model

import jakarta.persistence.*

@Entity
@Table(name = "produto")
data class Produto(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var nome: String = "",

    var preco: Double = 0.0
)
