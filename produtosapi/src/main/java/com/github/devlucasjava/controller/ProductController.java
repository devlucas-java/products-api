package com.github.devlucasjava.controller;


import com.github.devlucasjava.model.Product;
import com.github.devlucasjava.repository.ProductRepository;
import com.github.devlucasjava.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RequestMapping
@RestController
public class ProductController {

    private ProductRepository productRepository;

    public  ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // esse ele salva o product
    @PostMapping("/save")
    public Product salvar(@RequestBody Product product) { // PERCEBI QUE SEM O   *@RequestBody*  , ELE NAO CONSEQUE PACTURAR OS DADOS QUE O USUARIO PASSOU PELA REQUISICAO
        System.out.println("Produto salvo com sucesso" + product);

        var id = UUID.randomUUID().toString(); //Universal Unique ID
        product.setId(id);// Rardom e aleatorio toString ele formata para string na msm forma do toInt ou toDouble etc...

        productRepository.save(product);
        System.out.println("Produto salvo com sucesso" + product);
        return product;
    }

    // esse ele obtem o procuct pelo id
    @GetMapping("/find/{id}")
    public Product fingById(@PathVariable("id") String id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
        //return productRepository.findById(id).orElse(null);
    }

    // esse ele deleta o procuct pelo id
    @DeleteMapping("/delete/{id}")
    public void deletar(@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }

    // esse ele atualiza o procuct pelo id
    @PutMapping("/update/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Product product) {
        product.setId(id);
        productRepository.save(product);
        System.out.println("Produto atualizado com sucesso" + product);
    }

    @GetMapping("/find/name/{name}")
    public List<Product> findNome( @PathVariable("name") String name) {
        return productRepository.findByName(name);
    }
}
