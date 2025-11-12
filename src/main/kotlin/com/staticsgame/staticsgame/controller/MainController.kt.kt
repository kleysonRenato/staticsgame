package com.sinodal.staticsgame.controller

import com.sinodal.staticsgame.model.*
import com.sinodal.staticsgame.repository.*
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class MainController(
    private val carroRepository: CarroRepository,
    private val filmeRepository: FilmeRepository,
    private val produtoRepository: ProdutoRepository,
    private val motoRepository: MotoRepository
) {

    // ---------------- CARROS ----------------
    @GetMapping("/carros")
    fun listarCarros() = carroRepository.findAll()

    @PostMapping("/carros")
    fun criarCarro(@RequestBody carro: Carro) = carroRepository.save(carro)

    @PutMapping("/carros/{id}")
    fun atualizarCarro(@PathVariable id: Long, @RequestBody carro: Carro): Carro {
        val existente = carroRepository.findById(id).orElseThrow { RuntimeException("Carro não encontrado") }
        val atualizado = existente.copy(
            marca = carro.marca,
            modelo = carro.modelo,
            ano = carro.ano,
            preco = carro.preco
        )
        return carroRepository.save(atualizado)
    }

    @DeleteMapping("/carros/{id}")
    fun deletarCarro(@PathVariable id: Long) = carroRepository.deleteById(id)

    // ---------------- FILMES ----------------
    @GetMapping("/filmes")
    fun listarFilmes() = filmeRepository.findAll()

    @PostMapping("/filmes")
    fun criarFilme(@RequestBody filme: Filme) = filmeRepository.save(filme)

    @PutMapping("/filmes/{id}")
    fun atualizarFilme(@PathVariable id: Long, @RequestBody filme: Filme): Filme {
        val existente = filmeRepository.findById(id).orElseThrow { RuntimeException("Filme não encontrado") }
        val atualizado = existente.copy(
            titulo = filme.titulo,
            diretor = filme.diretor,
            anoLancamento = filme.anoLancamento,
            genero = filme.genero
        )
        return filmeRepository.save(atualizado)
    }

    @DeleteMapping("/filmes/{id}")
    fun deletarFilme(@PathVariable id: Long) = filmeRepository.deleteById(id)

    // ---------------- PRODUTOS ----------------
    @GetMapping("/produtos")
    fun listarProdutos() = produtoRepository.findAll()

    @PostMapping("/produtos")
    fun criarProduto(@RequestBody produto: Produto) = produtoRepository.save(produto)

    @PutMapping("/produtos/{id}")
    fun atualizarProduto(@PathVariable id: Long, @RequestBody produto: Produto): Produto {
        val existente = produtoRepository.findById(id).orElseThrow { RuntimeException("Produto não encontrado") }
        val atualizado = existente.copy(
            nome = produto.nome,
            descricao = produto.descricao,
            preco = produto.preco
        )
        return produtoRepository.save(atualizado)
    }

    @DeleteMapping("/produtos/{id}")
    fun deletarProduto(@PathVariable id: Long) = produtoRepository.deleteById(id)

    // ---------------- MOTOS ----------------
    @GetMapping("/motos")
    fun listarMotos() = motoRepository.findAll()

    @PostMapping("/motos")
    fun criarMoto(@RequestBody moto: Moto) = motoRepository.save(moto)

    @PutMapping("/motos/{id}")
    fun atualizarMoto(@PathVariable id: Long, @RequestBody moto: Moto): Moto {
        val existente = motoRepository.findById(id).orElseThrow { RuntimeException("Moto não encontrada") }
        val atualizado = existente.copy(
            marca = moto.marca,
            modelo = moto.modelo,
            ano = moto.ano,
            cilindrada = moto.cilindrada,
            preco = moto.preco
        )
        return motoRepository.save(atualizado)
    }

    @DeleteMapping("/motos/{id}")
    fun deletarMoto(@PathVariable id: Long) = motoRepository.deleteById(id)
}
