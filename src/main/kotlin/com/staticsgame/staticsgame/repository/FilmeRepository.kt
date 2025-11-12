// FilmeRepository.kt
package com.sinodal.staticsgame.repository
import com.sinodal.staticsgame.model.Filme
import org.springframework.data.jpa.repository.JpaRepository

interface FilmeRepository : JpaRepository<Filme, Long>
