// ProdutoRepository.kt
package com.sinodal.staticsgame.repository
import com.sinodal.staticsgame.model.Produto
import org.springframework.data.jpa.repository.JpaRepository

interface ProdutoRepository : JpaRepository<Produto, Long>
