package com.anacleto.vendas.repository;

import com.anacleto.vendas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Long> {
}
