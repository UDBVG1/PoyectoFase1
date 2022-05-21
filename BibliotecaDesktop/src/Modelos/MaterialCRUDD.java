/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Entidad.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eveling Santos
 */
public class MaterialCRUDD extends CRUDD{
//Declaracion de variables SQL
    
    private String SQLMaterial="SELECT m.codigo,m.idescrito,m.idaudiovisual, case when m.idescrito is not null then l.titulo \n" +
                                        "WHEN m.idaudiovisual is not null THEN r.titulo \n" +
                                        "else null end AS titulo,catalogacion,cantidad_total,cantidad_disponible\n" +
                                        "FROM material m LEFT join escrito l on m.idescrito=l.idescrito \n" +
                                        "LEFT join audiovisual r on m.idaudiovisual=r.idaudiovisual\n" +
                                        ";";
    
    private final String SQL_DELETE_ESCRITO="DELETE a,b FROM material a LEFT JOIN libros b ON b.id_libros = a.idlibros WHERE codigo = ? ;";
   private final String SQL_DELETE_AUDIOVISUAL="DELETE a,b FROM material a LEFT JOIN libros b ON b.id_libros = a.idlibros WHERE a.idlibros = ? ;";
    private final String SQL_SELECTRN = "select count(*) from material where codigo = ?;"; 
    private String SQL_INSERT="";
     private String SQL_MATERIAL="";
     /*
    
    */
     
    private final ArrayList<String> matriz_entidad = new ArrayList<>();
    private final ArrayList<String> matriz_material = new ArrayList<>();

        
    public String InsertarEscrito(Escrito Entidad){
        String codigo; 
        int i,j,a,b,c;

        i=j=0;
        a=b=c=100;
        /*Asignar a String*/
        matriz_entidad.clear();
        matriz_material.clear();
        matriz_entidad.add(Entidad.getTitulo());
        matriz_entidad.add(Entidad.getTipo());
        matriz_entidad.add(Entidad.getAutor());
        matriz_entidad.add(String.valueOf(Entidad.getNumPaginas()));
        a=3;
        matriz_entidad.add(Entidad.getEditorial());
        SQL_INSERT="INSERT INTO `escrito` (`titulo`, `tipo`, `autor`, `num_pag`, `editorial`,";
        switch (Entidad.getTipo()){
            case "LIB":
                matriz_entidad.add(String.valueOf(Entidad.getISBN()));
                matriz_entidad.add(String.valueOf(Entidad.getFechaPubli()));
                SQL_INSERT=SQL_INSERT + "`isbn`,`publicacion`) values(?,?,?,?,?,?,?);";
                b=5;c=6;
                break;
            case "REV":
                matriz_entidad.add(Entidad.getPeriodicidad());
                b=100; c=100;
                SQL_INSERT=SQL_INSERT + " `periodicidad`) values(?,?,?,?,?,?);";
                break;
            case "OBR":
                matriz_entidad.add(String.valueOf(Entidad.getFechaPubli()));
                SQL_INSERT=SQL_INSERT + " `publicacion`) values(?,?,?,?,?,?);";
                b=5;c=100;
                break;
               
            default:
                System.out.println("error"); 
        } 
        i=matriz_entidad.size();
        matriz_material.add(Entidad.getcatalogacion());
        matriz_material.add(String.valueOf(Entidad.getCantTotal()));
        matriz_material.add(String.valueOf(Entidad.getCantDisp()));
        matriz_material.add(String.valueOf(Entidad.getTiempo()));
        j=4;
        SQL_MATERIAL="INSERT INTO `material` (`codigo`, `catalogacion`, `cantidad_total`, `cantidad_disponible`, `tiempo`, `idescrito`)\n" +
                                       "VALUES (?, ?,?,?,?,?);";
        codigo=super.NumRandom(SQL_SELECTRN,Entidad.tipo);

        
        super.insertarDatos(SQL_INSERT, SQL_MATERIAL,matriz_entidad ,matriz_material, codigo,i,j,a,b,c); 
        return codigo;
    }
    
    public String InsertarAudio(Audiovisual Entidad){
        String codigo; 
        int i,j,a,b,c;

        i=j=0;
        a=b=c=100;
        /*Asignar a String*/
        matriz_entidad.clear();
        matriz_material.clear();
        matriz_entidad.add(Entidad.getTitulo());
        matriz_entidad.add(Entidad.getTipo());
        matriz_entidad.add(Entidad.getAutor());
        matriz_entidad.add(Entidad.getGenero());
        matriz_entidad.add(Entidad.getDuracion());
        SQL_INSERT="INSERT INTO `audiovisual` (`titulo`, `tipo`,"; 
        if ("CDA".equals(Entidad.getTipo())){
                SQL_INSERT=SQL_INSERT + " `artista`,`genero`,`duracion`,`canciones`) values(?,?,?,?,?,?);";
                matriz_entidad.add(String.valueOf(Entidad.getNumCanciones()));
                a=6;b=100;c=100;
        }
        else{
           SQL_INSERT=SQL_INSERT + " `director`,`genero`,`duracion`) values(?,?,?,?,?);"; 
        }

        i=matriz_entidad.size();
        
        SQL_MATERIAL="INSERT INTO `material` (`codigo`, `catalogacion`, `cantidad_total`, `cantidad_disponible`, `tiempo`, `idaudiovisual`)\n" +
                                       "VALUES (?, ?,?,?,?,?);";
        matriz_material.add(Entidad.getcatalogacion());
        matriz_material.add(String.valueOf(Entidad.getCantTotal()));
        matriz_material.add(String.valueOf(Entidad.getCantDisp()));
        matriz_material.add(String.valueOf(Entidad.getTiempo()));
        j=4;
        
        codigo=super.NumRandom(SQL_SELECTRN,Entidad.tipo);

        
        super.insertarDatos(SQL_INSERT, SQL_MATERIAL,matriz_entidad ,matriz_material, codigo,i,j,a,b,c); 
        return codigo;
    }
    
    public DefaultTableModel listarMateriales(){
        SQLMaterial="select codigo, titulo, catalogacion from materiales_vista;";
        DefaultTableModel dtm=super.material_lista(SQLMaterial,0,"null");
        return dtm;
    }
    
    public DefaultTableModel BuscarMaterial(String codigo, String datos){
        
        SQLMaterial="select codigo,titulo,catalogacion,";
        switch(datos){
        case "LIB":
            SQLMaterial=SQLMaterial + " autor ";  
            break;
        case "OBR":
            SQLMaterial=SQLMaterial + " autor ";  
            break;
        case "REV":
            SQLMaterial=SQLMaterial + " periodicidad ";  
            break;
        case "CDA":
            SQLMaterial=SQLMaterial + "artista";  
          break;
        case "DVD":
            SQLMaterial= SQLMaterial + " director "; 
            break;
        }
        
        SQLMaterial=SQLMaterial + "from materiales_vista where codigo=?;";
      DefaultTableModel dtm=super.material_lista(SQLMaterial,1,codigo);
      return dtm;
    }
    
}
