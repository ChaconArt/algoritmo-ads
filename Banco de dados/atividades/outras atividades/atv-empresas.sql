create database SuperFacul;

use SuperFacul;

create table Empresa (
idEmpresa int primary key,
nome varchar(50),
responsável varchar (40)
);

alter table Empresa modify responsável varchar(50);

insert into Empresa (idEmpresa, nome, responsável) values
(1, 'Fleury', 'Maria'),
(2, 'C6', 'Pedro'),
(3, 'TIVIT', 'Camila'),
(4, 'SAFRA', 'Natalia');

select * from Empresa;

select nome, responsável from Empresa;

select * from Empresa order by nome;

select * from Empresa order by responsável desc;

select * from Empresa where nome like '%r%';

select * from Empresa where nome like 'c%';

select * from Empresa where nome like '%r_';

update Empresa set responsável = 'Paulo' where idEmpresa = 2;

select * from Empresa;

delete from Empresa where idEmpresa = 3;

select * from Empresa;

delete from Empresa;