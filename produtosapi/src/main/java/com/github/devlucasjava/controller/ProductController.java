package com.github.devlucasjava.controller;


import com.github.devlucasjava.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ProductController {

    @PostMapping("/products")
    public Product salvar(@RequestBody Product product) { // PERCEBI QUE SEM O   *@RequestBody*  , ELE NAO CONSEQUE PACTURAR OS DADOS QUE O USUARIO PASSOU PELA REQUISICAO
        System.out.println("Produto salvo com sucesso" + product);
        return product;
    }
}
