package com.demo.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
