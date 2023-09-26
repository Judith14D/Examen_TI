use cibertec2023;
drop table if exists Empleado;
CREATE TABLE Empleado(
IdEmpleado char(7) not null primary key,
Apellidos VARCHAR(40) NOT NULL,
Nombres VARCHAR(40) NOT NULL,
Edad SMALLINT NOT NULL,
Sexo CHAR(1) NOT NULL,
Salario double NOT NULL,
CHECK(Edad >= 18),
CHECK(Sexo IN ('M','F')),
CHECK(Salario >=1500 and Salario <= 2500)
);

drop table Empleado;

insert into Empleado 
values('1','Martinez Torres',20, 'Renato Enrique', 1800.0,'M');
select * from Empleado;
