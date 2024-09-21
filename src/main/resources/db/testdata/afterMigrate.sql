set foreign_key_checks = 0;

lock tables pedido write, item_pedido write;

delete from pedido;
delete from item_pedido;

set foreign_key_checks = 1;

alter table pedido auto_increment = 1;
alter table item_pedido auto_increment = 1;

insert into pedido (id, data_hora, status, valor_total) values
(1, utc_timestamp, 'REALIZADO', 40);

insert into item_pedido (id, pedido_id, quantidade, descricao, valor_unitario, valor_total) values
(1, 1, 1, 'Descricao produto 1', 10, 10),
(2, 1, 2, 'Descricao produto 2', 15, 30);

unlock tables;