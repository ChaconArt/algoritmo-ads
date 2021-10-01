create database petshop;

use petshop;

create table cliente (
idcliente int primary key auto_increment,
nomecliente varchar(45),
telefonefixocliente int, 
telefonecelularcliente int,
enderecocliente varchar(45)
) auto_increment 1;

create table pet (
idpets int primary key auto_increment,
tipopet varchar(45),
nomepet varchar(45),
racapet varchar(45),
datanascimentopet date,
fk_cliente int,
foreign key (fk_cliente) references cliente (idcliente)
) auto_increment 101;

alter table pet add column precopet decimal(10,2);

select * from pet;

insert into cliente (nomecliente, telefonefixocliente, telefonecelularcliente, enderecocliente) values
('wesley santos', '11112222', '12122121', 'rua do batidao'),
('gabriel damas ', '23233232', '64644646', 'bahia'),
('gustavo costa', '99998888', '98988989', 'embaixo da ponte'),
('arthur chacon', '93933939', '19199191', 'hollywood'),
('joao chacon', '38388383', '58588585', 'cazaquistao'),
('christian ronaldo', '27277979', '47477575', 'carrefour');

insert into pet (tipopet, nomepet, racapet, datanascimentopet, fk_cliente, precopet) values 
('jacare', 'lacoste', 'reptil', 20210517, '1', '777.77'), 
('gato', 'garfield', 'felino', 20200905, '2', '20.50'), 
('cachorro', 'scooby', 'vira-lata', 20170503, '2', '50.75'), 
('ave', 'tony', 'calopsita', 20180914, '3', '100.25'), 
('cachorro', 'toto', 'labrador', 20150304, '4', '200.50'), 
('gato', 'julio', 'felino', 20200102, '5', '40.40'), 
('ave', 'benta', 'galinha', 20191123, '6', '15.50');

select * from pet; 

select * from cliente;

alter table cliente modify column nomecliente varchar(30);

select * from pet where tipopet = 'cachorro';

select nomepet, datanascimentopet from pet;

select * from pet order by nomepet;

select * from cliente order by enderecocliente desc;

select * from pet where nomepet like 't%';

select * from cliente where nomecliente like '%chacon';

update cliente set telefonefixocliente = '40028922' where idcliente = 1;

select * from cliente where idcliente = 1;

select * from pet
join cliente on pet.fk_cliente = cliente.idcliente;

select * from cliente 
join pet on pet.fk_cliente = cliente.idcliente where idcliente = 2;

delete from pet where idpets = 101; 

select * from pet;

delete from pet;

select nomecliente, precopet from pet 
join cliente on pet.fk_cliente = cliente.idcliente where idcliente = 5;

select nomepet, nomecliente from pet pe
join cliente cl on pe.fk_cliente = cl.idcliente;

select sum(precopet) from pet; 
-- soma todos os valores da coluna precopet 

select avg(precopet) from pet;
-- calcula a média de todos os valores na coluna precopet

select round(precopet) from pet;
-- arredonda todos os valores na coluna precopet

select min(precopet) from pet;
-- busca o valor minimo na coluna precopet

 select max(precopet), nomepet from pet;
-- busca o valor maximo na coluna precopet

select count(tipopet) from pet;
-- conta quantos tipos de pet estão inseridos na tabela

select avg(round(precopet)) from pet;
-- primeiro arredondou e depois calculou a media de todos valores na coluna precopet

select avg(round(precopet)) as media_arredondada from pet;
-- o AS renomeu o nome da coluna que aparece os valores para media_arredondada

select truncate(precopet,1) from pet;
-- define a quantidade de casas decimais após a virgula

create table agendamento (
idagendamento int primary key auto_increment,
nomeagenda varchar(20),
dia date,
hora time
);

alter table agendamento add column fk_cliente int;
-- primeiro adiciona a coluna da fk
alter table agendamento add foreign key (fk_cliente) references cliente (idcliente);
-- da outro alter table declarando a fk e referenciando a tabela que será relacionada


select * from agendamento;

insert into agendamento (nomeagenda, dia, hora, fk_cliente) values
('tomar CoronaPet' , 20211010, 12, 1) ,
('banho' , 20211010, 09, 2),
('consulta da pata' , 20210911, 10, 3),
('tomar CoronaPet' , 20210817, 08, 4), 
('cirurgia' , 20211212, 06, 5),
('banho e tosa' , 20211011, 11, 6);

select * from agendamento;

select agendamento*, nomepet, nomecliente from agendamento 
join cliente on agendamento.fk_cliente = cliente.idcliente; 