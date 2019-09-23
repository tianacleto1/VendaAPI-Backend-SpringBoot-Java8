package com.anacleto.vendas.resource;

import com.anacleto.vendas.model.Cliente;
import com.anacleto.vendas.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

    @Autowired
    private Clientes clientes;

    @GetMapping
    public List<Cliente> listar() {
        return clientes.findAll();
    }
}
