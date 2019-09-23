insert into cliente (id, nome) values (1, 'Loja Eletrônicos');
insert into cliente (id, nome) values (2, 'Smart Compras');

insert into produto (id, nome, valor) values (1, 'Dell Laptop', 2950.0);
insert into produto (id, nome, valor) values (2, 'IPhone 8 32GB', 3050.0);
insert into produto (id, nome, valor) values (3, 'IPad Mini 128GB', 2699.0);

insert into venda (id, cliente_id, frete, total, cadastro) values (1, 1, 15.0, 2950.0, sysdate());
insert into item (id, venda_id, produto_id, quantidade) values (1, 1, 1, 1);

