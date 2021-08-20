-- Criando o banco de dados
create database db_construindo_a_nossa_vida;


-- Selecionando o banco de dados criado 
use db_construindo_a_nossa_vida;


-- Criando as tabelas
create table tb_categoria(
id int(3) auto_increment, 
forma_de_venda varchar(30) not null, 
disponibilidade varchar(30) not null,
primary key (id)) engine=InnoDB;

create table tb_produto(
id_produto int(4) auto_increment,
produto varchar (150) not null, 
preco double(5,2) not null, 
estoque int (5),
id int(3) not null,
foreign key (id) references tb_categoria(id) , primary key(id_produto)) engine=InnoDB;


-- Conferindo se as tabelas foram criadas
show tables;
desc tb_categoria;
select * from tb_categoria;
select * from tb_produto;
desc tb_produto;


-- Populando dados nas tabelas

insert into tb_categoria (forma_de_venda, disponibilidade) values ("Sacas", "Disponível"), ("Por peso (kg)", "Sob encomenda"),
("Unidade","Sob encomenda"), ("Unidade","Disponível"), ("Caixa","Sob encomenda");

insert into tb_produto (produto, preco, estoque, id) values ("Areia", 4.00, 0 , 2), ("Cimento", 39.00, 300 , 1),
("Vergalhão", 25.00 , 0, 3), ("Tubo PVC 4 polegadas", 80.00 , 60, 4), ("Piso porcelanato", 150.00, 0, 5), 
("Conduíte", 15.00, 80 , 4), ("Serrote", 55.00, 12, 4), ("Brita", 2.50, 0, 2);


-- Selecionando os produtos que custam mais de 50 reais
select * from tb_produto where preco > 50;


-- Selecionando os produtos com valores entre 3 e 60 reais
select * from tb_produto where preco between 3 and 60;


-- Selecionando os produtos cujos nomes começam com a letra C
select * from tb_produto where produto like "C%";


-- inner join entre as tabelas
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id;


-- Selecionando todos os produtos cuja venda é feita por unidade
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id
where tb_categoria.forma_de_venda = "Unidade";