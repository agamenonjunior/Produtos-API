package io.github.agamenonjunior.produtosapi.controller;

import io.github.agamenonjunior.produtosapi.model.Produto;
import io.github.agamenonjunior.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("")
    public String listar(){
        return "Lista de produtos";
    }




    @PostMapping
    public Produto salvar (@RequestBody Produto produto){

        System.out.println("Produto recebido" + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;

    }

}
