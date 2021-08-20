-- Criando o banco de dados
create database db_generation_game_online;


-- Selecionando o banco de dados criado 
use db_generation_game_online;


-- Criando as tabelas
create table tb_classe(
id_classe int(3) auto_increment, 
classe varchar(25) not null, 
tipoataque varchar(15) not null,
primary key (id_classe)) engine=InnoDB;

create table tb_personagem(
id_personagem int(3) not null, 
nome varchar (30) not null, 
ataque int(6) not null, 
defesa int(6) not null,
id_classe int(3) not null,
foreign key (id_classe) references tb_classe(id_classe) , primary key(id_personagem)) engine=InnoDB;


-- Conferindo se as tabelas foram criadas
show tables;
desc tb_classe;
select * from tb_classe;
select * from tb_personagem;
desc tb_personagem;


-- Populando dados nas tabelas

insert into tb_classe (classe, tipoataque) values ("Atirador", "A distância"), ("Tanque","Corpo a Corpo"),
("Assassino","Corpo a Corpo"), ("Mago","Ataque Magico"), ("Lutador","Corpo a Corpo");

insert into tb_personagem (id_personagem, id_classe, nome, ataque, defesa) values (67, 1,"Jhin", 4500, 1000), 
(4, 2,"Dr. Mundo", 1300, 4100) ,(12, 5, "Lee sin", 2750, 2300), (22, 4, "Brand", 3500, 800), (45, 3, "Zed", 5000, 1200), 
(16, 2, "Sejuani", 900, 3800), (11, 4,"Karma", 2500, 1600), (113, 1,"Samira", 4800, 1200);


-- Selecionando os personagens com mais de 2000 de ataque
select * from tb_personagem where ataque > 2000;


-- Selecionando os personagens com defesa entre 1000 e 2000
select * from tb_personagem where defesa >= 1000 and defesa <= 2000;


-- Selecionando os personagens cujos nomes começam com a letra S
select * from tb_personagem where nome like "s%";


-- inner join entre as tabelas
select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.id_classe;


-- Selecionando todos os personagens da classe Tanque
select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.id_classe 
where tb_classe.classe = "Tanque";


