package com.sinodal.staticsgame.service

import com.sinodal.staticsgame.model.Produto
import com.sinodal.staticsgame.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoService(private val produtoRepository: ProdutoRepository) {

    fun atualizarProduto(id: Long, novoProduto: Produto): Produto {
        val produtoExistente = produtoRepository.findById(id)
            .orElseThrow { RuntimeException("Produto não encontrado") }

        // Use 'val' para imutáveis, apenas criando um novo objeto
        val produtoAtualizado = produtoExistente.copy(
            nome = novoProduto.nome,
            descricao = novoProduto.descricao,
            preco = novoProduto.preco
        )
        return produtoRepository.save(produtoAtualizado)
    }
}
