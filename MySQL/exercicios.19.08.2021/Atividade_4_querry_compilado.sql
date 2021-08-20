-- Criando o banco de dados
create database db_cidade_das_carnes;


-- Selecionando o banco de dados criado 
use db_cidade_das_carnes;


-- Criando as tabelas
create table tb_categoria(
id int(3) auto_increment, 
carne varchar(30) not null, 
condicao_venda varchar(30) not null,
primary key (id)) engine=InnoDB;

create table tb_produto(
id_produto int(4) auto_increment,
corte varchar (150) not null, 
preco double(5,2) not null, 
frigorifico varchar (30)  not null,
id int(3) not null,
foreign key (id) references tb_categoria(id) , primary key(id_produto)) engine=InnoDB;


-- Conferindo se as tabelas foram criadas
show tables;
desc tb_categoria;
select * from tb_categoria;
select * from tb_produto;
desc tb_produto;


-- Populando dados nas tabelas

insert into tb_categoria (carne, condicao_venda) values ("Bovina", "Peça"), ("Bovina", "Moída"),
("Frango","Sem osso"), ("Frango","Filé"), ("Frango","Bandeja");

insert into tb_produto (corte, preco, frigorifico, id) values ("Acem", 29.90, "Friboi", 2), ("Acem", 28.50, "Friboi", 1),
("Coxa de Frango", 16.40 , "Sadia", 5), ("Peito de Frango", 15.00 , "Sadia", 4), ("Picanha", 69.00, "Marfrig", 1), 
("Coxão Duro", 27.90, "Marfrig" , 1), ("Sobrecoxa de Frango", 20.00, "Sadia", 3), ("Maminha", 45.00, "Friboi", 1);


-- Selecionando os produtos que custam mais de 50 reais
select * from tb_produto where preco > 50;


-- Selecionando os produtos com valores entre 3 e 60 reais
select * from tb_produto where preco between 3 and 60;


-- Selecionando os produtos cujos nomes começam com a letra B
select * from tb_produto where corte like "C%";


-- inner join entre as tabelas
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id;


-- Selecionando todos as carnes que são de frango
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id
where tb_categoria.carne = "Frango";