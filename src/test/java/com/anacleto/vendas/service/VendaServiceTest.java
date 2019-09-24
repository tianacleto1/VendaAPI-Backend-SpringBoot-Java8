package com.anacleto.vendas.service;

import com.anacleto.vendas.model.Cliente;
import com.anacleto.vendas.model.Item;
import com.anacleto.vendas.model.Produto;
import com.anacleto.vendas.model.Venda;
import com.anacleto.vendas.repository.ProdutoRepository;
import com.anacleto.vendas.repository.VendaRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VendaServiceTest {

    @MockBean
    private ProdutoRepository produtoRepositoryMock;

    @Autowired
    private VendaService vendaService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenAdicionarVendaServiceIsCalled_itShouldCalculateTotalItensPricePlusFreatAndReturnSavedVendaTest() {
        Mockito.when(produtoRepositoryMock.findById(Mockito.anyLong())).thenReturn(Optional.of(produtoMock()));
       // Mockito.when(vendaRepositoryMock.save(Mockito.any())).thenReturn(vendaMock());

        Venda savedVenda = vendaService.adicionarVenda(vendaMock());

        Assert.assertEquals(5020, savedVenda.getTotal().intValue());
    }

    private Produto produtoMock() {
        Produto produtoMock = new Produto();
        produtoMock.setId(2L);
        produtoMock.setNome("IPhone 8");
        produtoMock.setValor(new BigDecimal(2500.0));

        return produtoMock;
    }

    private Venda vendaMock() {
        Cliente cliente = new Cliente();
        cliente.setId(1L);

        Item item = new Item();
        item.setProduto(produtoMock());
        item.setQuantidade(2);

        List<Item> itens = new ArrayList<>();
        itens.add(item);

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setFrete(new BigDecimal(20.0));
        venda.setItens(itens);

        return venda;
    }
}
