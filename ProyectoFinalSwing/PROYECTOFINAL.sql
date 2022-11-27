create table Empleado (
id_empleado integer primary key,
nombre varchar(30) not null,
edad int(2) not null,
direccion varchar(30) not null,
email varchar(30) not null,
comuna varchar(30) not null,
numero_telefonico int(9) not null,
nombre_cargo varchar(30) not null,
sueldo_base int
)
