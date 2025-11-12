// MotoRepository.kt
package com.sinodal.staticsgame.repository
import com.sinodal.staticsgame.model.Moto
import org.springframework.data.jpa.repository.JpaRepository

interface MotoRepository : JpaRepository<Moto, Long>