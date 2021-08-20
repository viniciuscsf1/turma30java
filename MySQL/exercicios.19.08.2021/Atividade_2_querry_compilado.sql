-- Criando o banco de dados
create database db_pizzaria_legal;


-- Selecionando o banco de dados criado 
use db_pizzaria_legal;


-- Criando as tabelas
create table tb_categoria(
id int(3) auto_increment, 
tamanho varchar(20) not null, 
borda varchar(35) not null,
primary key (id)) engine=InnoDB;


create table tb_pizza(
id_pizza int(3) not null, 
nome varchar (50) not null, 
preco decimal(5,2) not null, 
ingredientes varchar(255) not null,
id int(3) not null,
foreign key (id) references tb_categoria(id) , primary key(id_pizza)) engine=InnoDB;


-- Conferindo se as tabelas foram criadas
show tables;
desc tb_categoria;
select * from tb_categoria;
select * from tb_pizza;
desc tb_pizza;


-- Populando dados nas tabelas

insert into tb_categoria (tamanho, borda) values ("Brotinho", "Recheada com catupiry"), ("Brotinho","Crocante"),
("Grande","Recheada com Catupiry"), ("Grande","Recheada com Chocolate"), ("Grande","Crocante");

insert into tb_pizza  values (1,"Mussarela", 23.00, "Mussarela, orégano, tomate e azeitona", 1), 
(2,"Calabresa Acebolada", 30.00, "Calabresa, orégano, cebola e azeitona", 3) ,(3,"Camarão", 60.00, "Camarão refogado, orégano, cebola, pimentão e catupiry", 3),
(4, "Frango com Catupiry", 33.00, "Frango, catupiry, oregano e cebola", 5), (5, "Prestígio", 40.00, "Chocolate com coco", 4), 
(6, "Sensação", 44.00, "Chocolate com morango", 4), (7, "Atum", 53.00, "Atum refogado, orégano, cebola", 3),
(8, "Paulista", 25.00, "Mussarela, calabresa e cebola", 2);


-- Selecionando as pizzas que custam mais de 45 reais
select * from tb_pizza where preco > 45.00;


-- Selecionando as pizzas com valor entre 29 e 60 reais
select * from tb_pizza where preco between 29 and 60;


-- Selecionando as pizzas que começam com C
select * from tb_pizza where nome like "c%";


-- inner join entre as tabelas
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.id;


-- Selecionando todos as pizzas que são do tamanho grande
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.id 
where tb_categoria.tamanho = "Grande";