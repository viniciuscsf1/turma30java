-- Criando o banco de dados
create database db_cursoDaMinhaVida;


-- Selecionando o banco de dados criado 
use db_cursoDaMinhaVida;


-- Criando as tabelas
create table tb_categoria(
id int(3) auto_increment, 
tipo varchar(50) not null, 
areadeconhecimento varchar(50) not null,
primary key (id)) engine=InnoDB;

create table tb_curso(
id_curso int(4) auto_increment,
curso varchar (150) not null, 
preco double(10,2) not null, 
cargahoraria_em_horas int (5) not null,
id int(3) not null,
foreign key (id) references tb_categoria(id) , primary key(id_curso)) engine=InnoDB;


-- Conferindo se as tabelas foram criadas
show tables;
desc tb_categoria;
select * from tb_categoria;
select * from tb_curso;
desc tb_curso;


-- Populando dados nas tabelas

insert into tb_categoria (tipo, areadeconhecimento) values ("Bacharelado", "Engenharia"), ("PosGraduacao", "Engenharia"),
("Livre","Tecnologia"), ("Tecnólogo","Ciencias Ambientais"), ("Técnico","Ciencias Humanas");

insert into tb_curso (curso, preco, cargahoraria_em_horas, id) values ("Engenharia Civil", 40000.00, 4000 , 1), ("Excel avançado", 39.00, 80 , 3),
("Engenharia de Segurança do Trabalho", 16000.00 , 360, 2), ("Secretariado", 5000.00 , 800, 5), ("Gestão Ambiental", 15000.00, 2400, 4), 
("Python do básico ao avançado", 110.00, 160 , 3), ("Engenharia de Producao", 35000.00, 3400, 1), ("Segurança do trabalho", 8000.00, 1200, 5);


-- Selecionando os cursos que custam mais de 5000 reais
select * from tb_curso where preco > 5000;


-- Selecionando os cursos com valores entre 3000 e 20000 reais
select * from tb_curso where preco between 3000 and 20000;


-- Selecionando os cursos cujos nomes começam com a letra E
select * from tb_curso where curso like "E%";


-- inner join entre as tabelas
select * from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.id;


-- Selecionando todos os cursos da categoria bacharelado
select * from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.id
where tb_categoria.tipo = "Bacharelado";