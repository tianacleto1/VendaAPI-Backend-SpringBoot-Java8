package com.anacleto.vendas.repository;

import com.anacleto.vendas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<Cliente, Long> {
}
