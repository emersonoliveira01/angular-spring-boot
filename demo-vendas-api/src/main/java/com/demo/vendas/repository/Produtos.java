package com.demo.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
