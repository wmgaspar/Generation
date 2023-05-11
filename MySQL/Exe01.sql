create database db_Empresa;

create table colaboradores (
    id int not null auto_increment,
    nome varchar(100) not null,
    idade int,
    cargo varchar(100),
    salario decimal,
    departamento varchar(100),
    PRIMARY KEY (id)
);
insert into colaboradores (nome, idade, cargo, salario, departamento) VALUES
('João', 35, 'Gerente de Vendas', 5000, 'Vendas'),
('Maria', 28, 'Analista de RH', 2500, 'Recursos Humanos'),
('Pedro', 42, 'Coordenador de TI', 3500, 'Tecnologia da Informação'),
('Ana', 31, 'Desenvolvedora', 1800, 'Tecnologia da Informação'),
('José', 45, 'Gerente de Operações', 4000, 'Operações');

select * from colaboradores where salario > 2000;
select * from colaboradores where salario < 2000;

update colaboradores set salario = 2000 where nome = 'Ana';

