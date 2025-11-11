package com.sinodal.staticsgame.service

import com.sinodal.staticsgame.model.Produto
import com.sinodal.staticsgame.repository.ProdutoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProdutoService(private val repo: ProdutoRepository) {

    fun listar(): List<Produto> = repo.findAll()

    fun buscar(id: Long): Optional<Produto> = repo.findById(id)

    fun criar(produto: Produto): Produto = repo.save(produto)

    fun atualizar(id: Long, produto: Produto): Produto {
        val existente = repo.findById(id).orElseThrow { NoSuchElementException("Produto não encontrado: $id") }
        existente.nome = produto.nome
        existente.preco = produto.preco
        return repo.save(existente)
    }

    fun deletar(id: Long) = repo.deleteById(id)
}
