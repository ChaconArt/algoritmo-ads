CREATE DATABASE SMARTMOVEMENT;

USE SMARTMOVEMENT;

CREATE TABLE CLIENTE (
IDCLIENTE INT PRIMARY KEY AUTO_INCREMENT,
RAZAO_SOCIAL VARCHAR(50),
CNPJ VARCHAR(15));

CREATE TABLE CONTATO (
IDCONTATO INT PRIMARY KEY AUTO_INCREMENT,
EMAIL VARCHAR(50),
TELEFONE1 VARCHAR(50),
NOMEREPRESENTANTE1 VARCHAR(50),
TELEFONE2 VARCHAR(50),
NOMEREPRESENTANTE2 VARCHAR(50),
TELEFONE3 VARCHAR(50),
NOMEREPRESENTANTE3 VARCHAR(50),
FAX VARCHAR(50));

CREATE TABLE ENDEREÇO (
IDENDEREÇO INT PRIMARY KEY AUTO_INCREMENT,
LOGRADOURO VARCHAR(100),
NUMERO VARCHAR(10),
COMPLEMENTO VARCHAR(20),
REFERENCIA VARCHAR(200),
CEP VARCHAR(10),
BAIRRO VARCHAR(100),
CIDADE VARCHAR(100),
UF CHAR(2));

CREATE TABLE SENSORES (
IDSENSORES INT PRIMARY KEY AUTO_INCREMENT,
HORA TIME,
DATA DATE);

insert into CLIENTE (RAZAO_SOCIAL, CNPJ) values 
("Iguatemi Empresa de Shopping Centers S.A.", "00000000/000001"),
("SHOPPING CIDADE JARDIM S.A.", "00000000/000002"), 
("Sd Tiete Plaza Shopping Ltda", "00000000/000003"),
("SCP - SAO BERNARDO PLAZA SHOPPING", "00000000/000004"),
("ADMINISTRADORA GOLDEN SQUARE SHOPPING LTDA.", "00000000/000005"),
("RJ Plaza S.A", "00000000/000006"),
("Condominio Grand Plaza Shopping", "00000000/000007"),
("Condominio Shopping Center Plaza Sul", "00000000/000008"),
("Niteroi Plaza S.A", "00000000/000009"),
("ASSOCIACAO ATRIUM SHOPPING SANTO ANDRE", "00000000/000010");

select * from cliente;  

insert into contato (email, telefone1, nomerepresentante1, telefone2, nomerepresentante2, telefone3, nomerepresentante3, fax) values
("iguate@gmail.com.br", "1010-2020", "Mauro", "1111-2222", "Patricia", "1212-2121", "Marcela", "4040-4040"),
("shopping.jardincidade@gmail.com.br", "1111-1111", "Pedro", "4050-2318", "Paula", "4545-5454", "Cintia", "8080-8050"),
("tieteplaza.shopping@gmail.com.br", "2323-2323", "Ricardo", "6565-6565", "Richard", "8787-5858", "Thamires", "2020-6565"),
("sbc.plazashopping@gmail.com.br", "0808-0707", "Lucas", "7474-6565", "Leandro", "1515-2121", "Vanessa", "2020-9999"),
("shopping.goldensquare@gmail.com.br", "4596-0707", "Lima", "7589-6565", "Valdo", "3489-2121", "Julia", "2560-9816"),
("rjplaza.schopping@gmail.com.br", "4596-0111", "Gustavo", "4758-6255", "Rogério", "3489-7269", "Estela", "0863-6526"),
("shopping.grandplaza@gmail.com.br", "8484-5655", "Guilherme", "7887-1131", "Julio", "1598-5265", "Isabela", "0454-6446"),
("shopping.plazasul@gmail.com.br", "8444-5444", "Eduardo", "7444-1444", "Jean", "1269-5545", "Robson", "0452-6446"),
("cttparkshoppingsaocaetano@gmail.com.br", "8333-5333", "João", "7333-1333", "Joaquim", "1269-8888", "Luciano", "0101-6446"),
("stcttshop@gmail.com.br", "8080-9099", "Jessica", "7777-7877", "Gabriela", "1449-4488", "Isadora", "0222-6226");

select * from contato;

insert into endereço (logradouro, numero, complemento, referencia, cep, bairro, cidade, uf) values
("Av brigadeiro faria lima", "024", "Sala 232", "Próximo à Avenida Paulista", "08080808", "Jardim paulistano", "São paulo", "SP"),
("Anchieta","4369","Sala 555", "perto do centro","7120345","Avenida Kennedy","São Bernardo do Campo","SP"),
("Avenida Tiete","547", "Sala 021", "Perto do calçadão", "85967855","Jd Tiete","São Paulo","SP"),
("Alameda rio negro", "237","Loja A08", "em frente ao supermercado extra","08089090", "St Olivia", "São Bernardo do Campo", "SP"),
("Paço municipal","632","Loja 21", "centro de sbc", "5423010","paço municipal","São bernardo do campo","SP"),
("Avenida niteroi","3456", "Loja 777","proximo a galeria","7102365", "av.augusto niteroi","Rio de Janeiro","RJ"), 
("Rua Coimbra" ,"839", "Loja 636" ,"em frente ao pão de açucar"," 03328010", "Eucalipto"," São Paulo", "SP"),
("Avenida conselheiro rodrigues alves", "2021", "Loja 15", "próximo do metrô", "04013027","Vila Mariana","São Paulo","SP"),
("Av Parana","8612", "Loja 78", "em frente a praia", "7896312","avenida copacabana","Rio de Janeiro","RJ"),
("Rua Paraiba", "5050", "Loja 96", "em frente ao calçadão","55544445", "Pq das Estrelas", "Santo André", "SP"); 

select * from endereço; 

alter table sensores add column Fluxo int;

insert into sensores (hora, dia, fluxo) values
("12:00", "2021-08-07", "206"),
("12:00", "2021-08-07", "450"),
("12:00", "2021-08-07", "500"),
("12:00", "2021-08-07", "600"),
("12:00", "2021-08-07", "520"),
("12:00", "2021-08-07", "583"),
("12:00", "2021-08-07", "444"),
("12:00", "2021-08-07", "222"),
("12:00", "2021-08-07", "228"),
("12:00", "2021-08-07", "305");

select * from sensores;






