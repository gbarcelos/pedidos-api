create table pedido (
  id bigint not null auto_increment,
  data_hora datetime not null,
  status varchar(255) not null,
  valor_total decimal(10,2) not null,
  primary key (id)
) engine=InnoDB default charset=UTF8MB4;

create table item_pedido (
  id bigint not null auto_increment,
  pedido_id bigint(20) not null,
  descricao varchar(255),
  quantidade int(11) not null,
  valor_unitario decimal(10,2) not null,
  valor_total decimal(10,2) not null,
  primary key (id)
) engine=InnoDB default charset=UTF8MB4;

alter table item_pedido add constraint fk_item_pedido_pedido
foreign key (pedido_id) references pedido (id);