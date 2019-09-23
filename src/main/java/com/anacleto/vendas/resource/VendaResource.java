package com.anacleto.vendas.resource;

import com.anacleto.vendas.model.Venda;
import com.anacleto.vendas.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaResource {

    @Autowired
    private VendaRepository vendaRepository;

    @GetMapping
    public List<Venda> listar() {
        return vendaRepository.findAll();
    }
}
