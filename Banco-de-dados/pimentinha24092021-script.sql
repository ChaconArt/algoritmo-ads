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

insert into cliente (nomecliente, telefonefixocliente, telefonecelularcliente, enderecocliente) values
('wesley santos', '11112222', '12122121', 'rua do batidao'),
('gabriel damas ', '23233232', '64644646', 'bahia'),
('gustavo costa', '99998888', '98988989', 'embaixo da ponte'),
('arthur chacon', '93933939', '19199191', 'hollywood'),
('joao chacon', '38388383', '58588585', 'cazaquistao'),
('christian ronaldo', '27277979', '47477575', 'carrefour');

insert into pet (tipopet, nomepet, racapet, datanascimentopet, fk_cliente) values 
('jacare', 'lacoste', 'reptil', 17/05/2021, '1'), 
('gato', 'garfield', 'felino', 22/09/2021, '2'), 
('cachorro', 'scooby', 'vira-lata', 17/08/2020, '2'), 
('ave', 'tony', 'calopsita', 12/12/2018, '3'), 
('cachorro', 'toto', 'labrador', 11/04/2007, '4'), 
('gato', 'julio', 'felino', 13/06/2015, '5'), 
('ave', 'benta', 'galinha', 09/09/2014, '6');

select * from pet; 

