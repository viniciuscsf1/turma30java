-- Criando a base de dados do ecommerce
create database db_ecommerce;


-- Trocando a base de dados do rh para a base do ecommerce
use db_ecommerce;


-- Criando a tabela de funcionários com os cinco atributos
create table tb_produtos(
	codigo bigint(4) auto_increment,
    nome varchar (50) not null,
    marca varchar (50) ,
    estoque bigint (4) ,
    preco decimal (10,2) not null,
    primary key (codigo)
    );


-- Populando a tabela com cinco dados
insert into tb_produtos (nome, marca, estoque, preco) 
values ("Geladeira", "Brastemp", "5", 2250.00);
insert into tb_produtos (nome, marca, estoque, preco) 
values ("Fogão", "Brastemp", "4", 1400.00);
insert into tb_produtos (nome, marca, estoque, preco) 
values ("Ventilador", "Arno", "15", 75.00);
insert into tb_produtos (nome, marca, estoque, preco) 
values ("Panela de Pressão Elétrica", "Electrolux", "1", 500.00);
insert into tb_produtos (nome, marca, estoque, preco) 
values ("Smart-TV", "Samsung", "12", 2500.00);
insert into tb_produtos (nome, marca, estoque, preco) 
values ("Notebook", "Asus", "7", 3000.00);
insert into tb_produtos (nome, marca, estoque, preco) 
values ("Liquidificador", "Mondial", "29", 89.99);
insert into tb_produtos (nome, marca, estoque, preco) 
values ("Batedeira", "Mondial", "13", 109.90);


-- Selecionando os produtos que custam 500 reais ou mais
select * from tb_produtos where preco >= 500;


-- Selecionando os produtos que custam menos de 500 reais 
select * from tb_produtos where preco < 500;


-- Atualizando um dado da tabela
update tb_produtos set estoque = 10 where codigo = 4;