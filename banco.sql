create database tgi;

use tgi;

create table Cliente(
ID int,
nome varchar(50), 
rg varchar(15), 
endereco varchar(50), 
telefone varchar(20), 
email varchar(20), 
login varchar(50), 
senha varchar (50)
);

alter table Cliente add constraint pk_cliente primary key (ID); 
alter table Cliente modify ID int auto_increment;

create table Agenda (
ID int,
exame varchar(50),
convenio varchar(50), 
medico varchar (50), 
data varchar (15), 
status varchar (50)
);

alter table Agenda add constraint pk_agenda primary key (ID); 
alter table Agenda modify ID int auto_increment;

create table Exame(
 ID int,
 exame varchar(50), 
 convenio varchar(50),
 medico varchar(50), 
 data varchar(15)
);

alter table Exame add constraint pk_exame primary key (ID); 
alter table Exame modify ID int auto_increment;