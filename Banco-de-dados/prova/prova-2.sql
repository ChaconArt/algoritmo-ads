create database Jornal;

use Jornal;

-- Arthur Pereira Chacon

create table tb_telejornal (
idtelejornal int primary key auto_increment,
nometelejornal varchar(45),
duracao_minutos_telejornal decimal(4,2),
regiaotelejornal varchar(45)
) auto_increment 100;

insert into tb_telejornal (nometelejornal, duracao_minutos_telejornal, regiaotelejornal) values
('Jornal Nacional', 40.00, 'Nacional'),
('SP Noticias', 30.00, 'São Paulo'),
('Bom dia Guri', 20.00, 'Rio Grande do Sul'),
('Café com Bixcoito', 25.00, 'Rio de Janeiro');

select * from tb_telejornal;

-- Arthur Pereira Chacon

create table tb_jornalista (
idjornalista int primary key auto_increment,
nomejornalista varchar(45),
nascimentojornalista date,
telefonejornalista decimal,
estadociviljornalista char(1),
check (estadociviljornalista = 'C' or estadociviljornalista = 'S'),
fk_telejornal int, 
foreign key (fk_telejornal) references tb_telejornal(idtelejornal)
) auto_increment 01;

insert into tb_jornalista (nomejornalista, nascimentojornalista, telefonejornalista, estadociviljornalista, fk_telejornal) values 
('Albert', 19990110, 21211212, 'S', 100),
('Angela', 19970621, 45009800, 'S', 100),
('Guilherme', 20001212, 56009800, 'C', 101),
('Pedro', 19971111, 52003400, 'C', 101),
('Joao', 19960708, 12566521, 'C', 102),
('Livia', 19801101, 91918282, 'S', 102),
('Samara', 19931201, 73732727, 'S', 103),
('William', 20051101, 09091212, 'S', 103);

select * from tb_jornalista;

-- Arthur Pereira Chacon

alter table tb_jornalista add column quantidadefilhos decimal;

-- Arthur Pereira Chacon

select * from tb_telejornal 
join tb_jornalista on tb_telejornal.idtelejornal = tb_jornalista.fk_telejornal;

-- Arthur Pereira Chacon

select nometelejornal, tb_jornalista.* from tb_telejornal
join tb_jornalista on tb_telejornal.idtelejornal = tb_jornalista.fk_telejornal where idtelejornal = '100';

-- Arthur Pereira Chacon

select * from tb_telejornal 
join tb_jornalista on tb_telejornal.idtelejornal = tb_jornalista.fk_telejornal where estadociviljornalista = 'C'; 

-- Arthur Pereira Chacon

select avg(duracao_minutos_telejornal) as 'Média do tempo de duração dos telejornais' from tb_telejornal;

-- Arthur Pereira Chacon

select round(avg(duracao_minutos_telejornal),2) as 'Média do tempo de duração dos telejornais' from tb_telejornal;

-- Arthur Pereira Chacon

update tb_telejornal 
set nometelejornal = 'Record News', duracao_minutos_telejornal = 35.00 
where idtelejornal = 101; 

-- Arthur Pereira Chacon

select nometelejornal as 'Novo nome', duracao_minutos_telejornal as 'Novo valor' 
from tb_telejornal where idtelejornal = 101;

-- Arthur Pereira Chacon

select min(duracao_minutos_telejornal) as 'Menor tempo de duração', nometelejornal 
from tb_telejornal;

-- Arthur Pereira Chacon

drop table tb_telejornal;
drop table tb_jornalista;

-- Arthur Pereira Chacon
