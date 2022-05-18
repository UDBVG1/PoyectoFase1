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
    
    private final String SQLMaterial="SELECT m.codigo,m.idescrito,m.idaudiovisual, case when m.idescrito is not null then l.titulo \n" +
                "WHEN m.idaudiovisual is not null THEN r.titulo \n" +
                "else null end AS titulo,catalogacion,cantidad_total,cantidad_disponible\n" +
                "FROM material m LEFT join escrito l on m.idescrito=l.idescrito \n" +
                "LEFT join audiovisual r on m.idaudiovisual=r.idaudiovisual\n" +
                ";";
     private final String SQL_SELECTRN = "select count(*) from material where codigo = ?;"; 
     private String SQL_INSERT="";
    private final String SQL_INSERTAUDIO="INSERT INTO `audiovisual` (`idaudiovisual`, `titulo`, `tipo`, `artista`, `genero`, `duracion`, `canciones`, `director`)\n" +
                                            " VALUES (?, ?,?, ?,?, ?',?,?,?);";
     private String SQL_MATERIAL="";
     /*
    
    */
     
    private final ArrayList<String> matriz_entidad = new ArrayList<String>();
    private final ArrayList<String> matriz_material = new ArrayList<String>();
/*
    public DefaultTableModel Matriz_material(){
        Object[] Titulos=new Object[]{"Codigo","Titulo","Cantidad Disponible","Cantidad Total", "Catalogacion"};

        ArrayList<Material> miLista=super.material_lista(SQLMaterial,0);
        DefaultTableModel matriz = new DefaultTableModel(Titulos,0);
        
        for (int i=0 ; i<miLista.size() ; i++){
                   matriz.addRow(new Object[]{
                   miLista.get(i).getCodigo() + "",
                   miLista.get(i).getTitulo() + "",
                   miLista.get(i).getCantDisp() + "",
                   miLista.get(i).getCantTotal() + "",
                   miLista.get(i).getcatalogacion()
               });
        }
        
        return matriz;
    }*/
    
        public DefaultTableModel Matriz_material(){
        Object[] Titulos=new Object[]{"Codigo","Titulo","Cantidad Disponible","Cantidad Total", "Catalogacion"};

        List<List<String>> miLista=super.Listar(SQLMaterial,0);
        DefaultTableModel matriz = new DefaultTableModel(Titulos,0);
        
        for (int i=0 ; i<miLista.size() ; i++){
                   matriz.addRow(new Object[]{
                   miLista.get(i).get(0) + "",
                   miLista.get(i).get(1) + "",
                   miLista.get(i).get(2) + "",
                   miLista.get(i).get(3) + "",
                   miLista.get(i).get(4)
               });
        }
        
        return matriz;
    }
    
        public ArrayList<String> Buscar_Material(){
            ArrayList<String> Material =new ArrayList();
            
            
            return Material;
        }
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
        if (Entidad.getTipo()=="CDA"){
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
    
    
    
}