create database bicicleta;
use bicicleta;

create table bicicletas(
	id int auto_increment primary key,
    marca varchar(30) not null,
    modelo varchar(4) not null,
    color varchar(15) not null,
    tipo varchar(30) not null,
    precio double not null,
    categoria varchar(10) not null,
    stock int not null
);