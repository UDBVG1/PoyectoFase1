# Inserts usuario
INSERT INTO poo.usuario
(idusuario, nombre, identificacion, usuario, password, nivel)
VALUES(1, 'Julio Cerritos', NULL, 'JC0001', '1', 1);
INSERT INTO poo.usuario
(idusuario, nombre, identificacion, usuario, password, nivel)
VALUES(2, 'Olaf Carbon', NULL, 'OC0001', '1', 2);
INSERT INTO poo.usuario
(idusuario, nombre, identificacion, usuario, password, nivel)
VALUES(3, 'Gabriela MR', '098776566', 'GM0001', '1', 3);
INSERT INTO poo.usuario
(idusuario, nombre, identificacion, usuario, password, nivel)
VALUES(4, 'Juan Cervantes', NULL, 'JC0010', '1', 3);
INSERT INTO poo.usuario
(idusuario, nombre, identificacion, usuario, password, nivel)
VALUES(10, 'Julio Test', NULL, 'JT0001', '2', 3);

###########################################################################
# inserts config
INSERT INTO poo.config
(idconfig, descripcion, valor, estado)
VALUES(1, 'Administrador', 1, 'nivel usuario');
INSERT INTO poo.config
(idconfig, descripcion, valor, estado)
VALUES(2, 'Bibliotecario', 2, 'nivel usuario');
INSERT INTO poo.config
(idconfig, descripcion, valor, estado)
VALUES(3, 'Usuario', 3, 'nivel usuario');
INSERT INTO poo.config
(idconfig, descripcion, valor, estado)
VALUES(4, 'Activo', 1, 'estado reserva');
INSERT INTO poo.config
(idconfig, descripcion, valor, estado)
VALUES(5, 'Inactivo', 2, 'estado reserva');