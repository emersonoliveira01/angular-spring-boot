package com.demo.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
