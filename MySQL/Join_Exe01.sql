create database db_generation_game_online;
use db_generation_game_online;

create table tb_classes (
id bigint auto_increment not null,
nome varchar(100),
descricao varchar(255),
primary key (id)
);

create table tb_personagens (
id bigint auto_increment not null,
nome varchar(100),
tipo varchar(100),
poder_ataque int,
poder_defesa int,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_classes(id) 
);

insert into tb_classes (nome,descricao) values 
("attacker", "ofensivo"),
("defender","defensivo"),
("speedster","rapido e agil"),
("supporter","assistencia e cura"),
("all-rouder","versatil");

insert into tb_personagens (nome,tipo,poder_ataque,poder_defesa,categoria_id) values
('Pikachu', 'Elétrico', 3000, 1500, 1),
('Bulbasaur', 'Planta', 2500, 2000, 1),
('Charmander', 'Fogo', 2800, 1400, 5),
('Squirtle', 'Água', 2000, 2500, 2),
('Snorlax', 'Normal', 3500, 2000, 2),
('Wigglytuff', 'Fada', 1500, 1500, 4),
('Gengar', 'Fantasma', 2700, 1200, 3),
('Machamp', 'Lutador', 3200, 1600, 5);

select*from tb_classes;
select*from tb_personagens where poder_defesa > 2000;
select*from tb_personagens where poder_ataque between 1000 and 2000;
select*from tb_personagens where nome like "%c%";
select*from tb_personagens join tb_classes on tb_personagens.categoria_id = tb_classes.id;
select nome,tipo,posicao,descricao from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.categoria_id where categoria_id = 1;

alter table tb_classes change nome posicao varchar(100);

