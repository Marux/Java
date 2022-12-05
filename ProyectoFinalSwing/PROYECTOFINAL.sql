create table Empleado (
id_empleado integer primary key,
nombre varchar(30) not null,
edad int(2) not null,
direccion varchar(30) not null,
email varchar(30) not null,
comuna varchar(30) not null,
numero_telefonico int(9) not null,
nombre_cargo varchar(30) not null,
sueldo_base int not null
);


CREATE TABLE `asistencia` (
  `id_registro` int(11) NOT NULL,
  `id_empleado` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora_entrada` time NOT NULL,
  `hora_salida` time DEFAULT NULL
) 

INSERT INTO `empleado` (`id_empleado`, `nombre`, `edad`, `direccion`, `email`, `comuna`, `numero_telefonico`, `nombre_cargo`, `sueldo_base`) VALUES
(1, 'Hector', 23, '4801 Av. Vicuña Mackena', 'poo@ipst.cl', 'San Joaquin', 999999999, 'Analista', 900000),
(2, 'Maria', 62, '200 Av. Raquel', 'poo2@ipst.cl', 'San Joaquin', 988888888, 'Supervisor', 1000000),
(3, 'Roberto', 30, '4090 Av. Arrieta', 'rob.p.g@secret.ipst.cl', 'Peñalolen', 976544321, 'Secretario', 800000),
(191851803, 'Alexander', 27, '621B Camino Peñalolen', 'a.galleguillos13@ipst.cl', 'Peñalolen', 976012929, 'Analista', 1490000);




CREATE TABLE `usuario` (
  `id_Usuario` int(11) NOT NULL,
  `id_empleado` int(11) DEFAULT NULL,
  `pass` int(11) DEFAULT NULL
)
INSERT INTO `usuario` (`id_Usuario`, `id_empleado`, `pass`) VALUES
(1, 191851803, 123234),
(2, 2, 9000);





SELECT * FROM Empleado;
SELECT * FROM ASISTENCIA

insert into usuario(id_usuario, id_empleado, pass) values (1,1,123);
select * from usuario;
