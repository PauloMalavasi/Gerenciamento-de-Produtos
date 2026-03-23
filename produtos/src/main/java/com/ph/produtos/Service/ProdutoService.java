package com.ph.produtos.Service;

import com.ph.produtos.Entity.ProdutoEntity;
import com.ph.produtos.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    public ProdutoRepository produtoRepository;

    public List<ProdutoEntity> findAll(){
        return produtoRepository.findAll();
    }

    public ProdutoEntity create(ProdutoEntity produtoEntity){
        return produtoRepository.save(produtoEntity);
    }

    public void delete(Long id){
        produtoRepository.deleteById(id);
    }

    public Optional<ProdutoEntity> findId(Long id){
        return produtoRepository.findById(id);
    }
}
