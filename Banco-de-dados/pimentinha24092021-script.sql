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
('jacare', 'lacoste', 'reptil', 20210517, '1'), 
('gato', 'garfield', 'felino', 20200905, '2'), 
('cachorro', 'scooby', 'vira-lata', 20170503, '2'), 
('ave', 'tony', 'calopsita', 20180914, '3'), 
('cachorro', 'toto', 'labrador', 20150304, '4'), 
('gato', 'julio', 'felino', 20200102, '5'), 
('ave', 'benta', 'galinha', 20191123, '6');

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






