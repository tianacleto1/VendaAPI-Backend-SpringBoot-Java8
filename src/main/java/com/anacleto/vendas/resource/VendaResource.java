package com.anacleto.vendas.resource;

import com.anacleto.vendas.model.Venda;
import com.anacleto.vendas.repository.VendaRepository;
import com.anacleto.vendas.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendaResource {

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> listar() {
        return vendaRepository.findAll();
    }

    @PostMapping
    public Venda adicionarVenda(@RequestBody @Valid Venda venda) {
        return vendaService.adicionarVenda(venda);
    }
}
