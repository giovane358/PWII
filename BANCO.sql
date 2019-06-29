create database ETEC_Feriados;

use ETEC_Feriados;
go

CREATE TABLE Feriado(
ID_Fer  int IDENTITY PRIMARY KEY not null,
constraint TP_feriado_FER   foreign key (Tipo_TP)    references tipo_feriado,
Des_Fer varchar (40) not null,
data_Fer dateTime not null,
);
go


create table tipo_feriado(
cod_TP int identity primary key not null,
Tipo_TP varchar (20) not null);
go

insert into tipo_feriado(  Tipo_TP)
values( 'Municipal'),
	  ('Estadual'),
	  ('Nacional'); 
go





select * from Feriado
select * from tipo_feriado
drop table tipo_feriado

select * from sysobjects where type ='TR';