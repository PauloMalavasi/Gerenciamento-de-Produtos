package com.ph.produtos.Controller;

import com.ph.produtos.Entity.ProdutoEntity;
import com.ph.produtos.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    public ProdutoService produtoService;

    @PostMapping
    public ProdutoEntity create(@RequestBody ProdutoEntity produtoEntity){
        return produtoService.create(produtoEntity);
    }

    @GetMapping
    public List<ProdutoEntity> findAll(){
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoEntity> findById(@PathVariable Long id){
        return produtoService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        produtoService.delete(id);
    }
}