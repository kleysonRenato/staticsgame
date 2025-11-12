// CarroRepository.kt
package com.sinodal.staticsgame.repository
import com.sinodal.staticsgame.model.Carro
import org.springframework.data.jpa.repository.JpaRepository

interface CarroRepository : JpaRepository<Carro, Long>

