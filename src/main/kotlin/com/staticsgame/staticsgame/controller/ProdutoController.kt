package com.sinodal.staticsgame.controller

import com.sinodal.staticsgame.model.Produto
import com.sinodal.staticsgame.service.ProdutoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produtos")
class ProdutoController(private val service: ProdutoService) {

    @GetMapping
    fun listar() = service.listar()

    @GetMapping("/{id}")
    fun buscar(@PathVariable id: Long) =
        service.buscar(id).map { ResponseEntity.ok(it) }.orElse(ResponseEntity.notFound().build())

    @PostMapping
    fun criar(@RequestBody produto: Produto) = ResponseEntity.ok(service.criar(produto))

    @PutMapping("/{id}")
    fun atualizar(@PathVariable id: Long, @RequestBody produto: Produto) =
        ResponseEntity.ok(service.atualizar(id, produto))

    @DeleteMapping("/{id}")
    fun deletar(@PathVariable id: Long): ResponseEntity<Void> {
        service.deletar(id)
        return ResponseEntity.noContent().build()
    }
}
