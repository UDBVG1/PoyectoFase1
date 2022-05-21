create view Materiales_vista as SELECT m.codigo,m.idescrito,m.idaudiovisual,l.autor, l.editorial, l.num_pag, l.editorial, l.isbn,
l.periodicidad, l.publicacion, r.artista, r.genero, r.duracion, r.canciones, r.director, case when m.idescrito is not null then l.titulo 
WHEN m.idaudiovisual is not null THEN r.titulo 
else null end AS titulo,catalogacion,cantidad_total,cantidad_disponible
FROM material m LEFT join escrito l on m.idescrito=l.idescrito 
LEFT join audiovisual r on m.idaudiovisual=r.idaudiovisual

UPDATE `materiales_vista` SET `autor` = 'Leonard mitch' WHERE `materiales_vista`.`codigo` = 'LIB00023';

DELETE FROM `escrito` WHERE `escrito`.`idescrito` = 16

INSERT INTO `usuario` (`idusuario`, `nombre`, `identificacion`, `usuario`, `password`, `nivel`) VALUES ('2', 'Joanna', '645646', 'Jcerrito', '123', '2'), ('3', 'Tjorge', '465446', 'Viserys', '444', '3');