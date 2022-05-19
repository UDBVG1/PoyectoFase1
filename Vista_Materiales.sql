create view Materiales_vista as SELECT m.codigo,m.idescrito,m.idaudiovisual,l.autor, l.editorial, l.num_pag, l.editorial, l.isbn,
l.periodicidad, l.publicacion, r.artista, r.genero, r.duracion, r.canciones, r.director, case when m.idescrito is not null then l.titulo 
WHEN m.idaudiovisual is not null THEN r.titulo 
else null end AS titulo,catalogacion,cantidad_total,cantidad_disponible
FROM material m LEFT join escrito l on m.idescrito=l.idescrito 
LEFT join audiovisual r on m.idaudiovisual=r.idaudiovisual