create database Atletas;

use Atletas;

create table Atletas (
idatleta int primary key auto_increment,
nomeatleta varchar(40), 
modalidade varchar(40),
qtdmedalhas int
);

insert into Atletas (nomeatleta, modalidade, qtdmedalhas) values
('Jailson', 'Salto a distância', 12),
('Arthur', 'Futebol', 99),
('Eduardo', 'Corrida', 3),
('Kauã', 'Natação', 6),
('Jessica', 'Volei', 98),
('Julia', 'Basquete', 55),
('Paulo', 'Arremesso', 12),
('Marcelo', 'Futebol de areia', 25);

select * from Atletas;

select nomeatleta, qtdmedalhas from Atletas;

select * from Atletas where modalidade = 'Futebol';

select * from Atletas order by modalidade;

select * from Atletas order by qtdmedalhas desc;

select * from Atletas where nomeatleta like '%s%';

select * from Atletas where nomeatleta like 'a%';

select * from Atletas where nomeatleta like '%o';

select * from Atletas where nomeatleta like 'r_';

delete from Atletas;
