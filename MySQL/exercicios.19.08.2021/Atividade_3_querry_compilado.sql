-- Criando o banco de dados
create database db_farmacia_do_bem;


-- Selecionando o banco de dados criado 
use db_farmacia_do_bem;


-- Criando as tabelas
create table tb_categoria(
id int(3) auto_increment, 
tarja varchar(15) not null, 
tipo_produto varchar(20) not null,
primary key (id)) engine=InnoDB;

create table tb_produto(
id_produto int(4) auto_increment,
nome varchar (150) not null, 
preco double(5,2) not null, 
estoque int(4) not null,
id int(3) not null,
foreign key (id) references tb_categoria(id) , primary key(id_produto)) engine=InnoDB;


-- Conferindo se as tabelas foram criadas
show tables;
desc tb_categoria;
select * from tb_categoria;
select * from tb_produto;
desc tb_produto;


-- Populando dados nas tabelas

insert into tb_categoria (tarja, tipo_produto) values ("Preta", "Medicamento"), ("Vermelha", "Medicamento"),
("Amarela","Medicamento"), ("Sem Tarja","Medicamento"), ("Sem tarja","Cosméticos");

insert into tb_produto (nome, preco, estoque, id) values ("Rivotril", 150.00, 6, 1), ("Tylenol", 15.00, 80, 3),
("Benegripe",12.00 , 50, 4), ("Aspirina",20.00 , 62, 2), ("Rosuvastatina Cálcica", 35.00, 22, 2), 
("Anastrozol", 120.00, 8, 2), ("Bepantol", 23.90, 6, 5), ("Estomazil", 2.90, 500, 4);


-- Selecionando os produtos que custam mais de 50 reais
select * from tb_produto where preco > 50;


-- Selecionando os produtos com valores entre 3 e 60 reais
select * from tb_produto where preco between 3 and 60;


-- Selecionando os personagens cujos nomes começam com a letra B
select * from tb_produto where nome like "B%";


-- inner join entre as tabelas
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id;


-- Selecionando todos os produtos cuja categoria é de cosmético
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id
where tb_categoria.tipo_produto = "Cosméticos";