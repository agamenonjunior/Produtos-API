package io.github.agamenonjunior.produtosapi.controller;

import io.github.agamenonjunior.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping("")
    public String listar(){
        return "Lista de produtos";
    }

    @PostMapping
    public Produto salvar (@RequestBody Produto produto){

        System.out.println("Produto recebido" + produto);
        return produto;

    }

}
