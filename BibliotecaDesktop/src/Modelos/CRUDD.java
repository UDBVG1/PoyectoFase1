/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Utilidades.Conexion;
import Entidad.*;
import static java.lang.Math.floor;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Eveling Santos
 */
public class CRUDD {
    
    
//Función que ejecuta sentencia para listar miembros de una base de datos.
    
    public ArrayList<Material> material_lista(String SQL, int Tipo){
        

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Material> ListaMaterial=new ArrayList<Material>();
        Material mat;
       
        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL);          
            rs = stmt.executeQuery();

            while (rs.next()) {
                    mat= new Material();
                    mat.codigo=rs.getString("codigo");
                    mat.titulo=rs.getString("titulo");
                    mat.catalogacion=rs.getString("catalogacion");
                    mat.CantDisp=Integer.parseInt(rs.getString("cantidad_disponible"));
                    mat.CantTotal=Integer.parseInt(rs.getString("cantidad_total"));
                    switch (Tipo){
                        case 1:
                            break;
                        default:
                            
                    }
                    ListaMaterial.add(mat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
            Conexion.closeResulset(rs);
        }
        return ListaMaterial;
    }    
    
    public void insertarDatos(String SQL,String SQL2,ArrayList<String> Informacion,ArrayList<String> Informacion2,String codigo, int i, int j,int a, int b, int c) {
        int rows = 0;
        int idEscrito=0;

        Connection conn = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2= null;
        
        int x;
        try {
            conn = Conexion.getConexion();
            //Ingresando en escrito
            stmt = conn.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
            int index = 1;

            for (x=0; x<i;x++){
                    if(x==a || x==b || x==c){

                        JOptionPane.showMessageDialog(null,index + "   "+Informacion.get(x) + " x: " + x + " i: " +i);
                        stmt.setInt(index++, Integer.parseInt(Informacion.get(x)));
                        
                    }
                    else{
                    stmt.setString(index++, Informacion.get(x));
                    JOptionPane.showMessageDialog(null,index + "   "+Informacion.get(x) + " x: " + x + " i: "+ i);
                    }
            }
            
            JOptionPane.showMessageDialog( null," x: " + x + " i: "+ i);
            rows = stmt.executeUpdate();
            System.out.println(SQL);        
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso" + "/n" + "Registros afectados" + rows, "Ingresado", JOptionPane.INFORMATION_MESSAGE);
            }
            ResultSet getidescrito = stmt.getGeneratedKeys();
            
            if(getidescrito.next()){ 
                idEscrito = getidescrito.getInt(1);
            }
            
            //Ingresando en materiales
            stmt2 = conn.prepareStatement(SQL2);
            index = 1;
            rows=0;
            
            stmt2.setString(index++, codigo);
            stmt2.setString(index++, Informacion2.get(0));
                for (x=1; x<j;x++){
                    stmt2.setInt(index++,Integer.parseInt(Informacion2.get(x)));
                }
            stmt2.setInt(index, idEscrito);
            rows = stmt2.executeUpdate();
            
            if (rows > 0) {
                System.out.println("Registro exitoso de material" + "/n" + "Registros afectados" + rows);
            }
            else{
            System.out.println("Registro NO exitoso del material!!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos", "Alta", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
        }
    }
    
     /*   public void insertarDatos2(String SQL,String SQL2,Audiovisual Entidad,String codigo) {
        int rows = 0;
        int idEscrito=0;

        Connection conn = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2= null;
        try {
            conn = Conexion.getConexion();
            //Ingresando en escrito
            stmt = conn.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
            int index = 1;
            System.out.println(Entidad.toString());
            stmt.setString(index++, Entidad.titulo);
            stmt.setString(index++, "LIB");
            stmt.setString(index++, Entidad.autor);
            stmt.setInt(index++, Entidad.numCanciones);

          
            rows = stmt.executeUpdate();
            System.out.println(SQL);        
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso" + "/n" + "Registros afectados" + rows, "Ingresado", JOptionPane.INFORMATION_MESSAGE);
            }
            ResultSet getidescrito = stmt.getGeneratedKeys();
            
            if(getidescrito.next()){ 
                idEscrito = getidescrito.getInt(1);
            }
            
            //Ingresando en materiales
            stmt2 = conn.prepareStatement(SQL2);
            index = 1;
            rows=0;
            stmt2.setString(index++, codigo);
            stmt2.setString(index++,Entidad.catalogacion);
            stmt2.setInt(index++,Entidad.CantTotal);
            stmt2.setInt(index++,Entidad.CantDisp);
            stmt2.setInt(index++,Entidad.tiempo);
            stmt2.setInt(index, idEscrito);
            rows = stmt2.executeUpdate();
            
            if (rows > 0) {
                System.out.println("Registro exitoso de material" + "/n" + "Registros afectados" + rows);
            }
            else{
            System.out.println("Registro NO exitoso del material!!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos", "Alta", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
        }
    }*/
        public String NumRandom(String SQL,String tipo){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String cadena = "";
        try{

            while(rs == null){
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL); 
            int fiveDigits = (int) floor(10000 + Math.random() * 90000);
            
            cadena = tipo + String.valueOf(fiveDigits);
            stmt.setString(1, cadena);
            rs = stmt.executeQuery();
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el id", "extraer", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
        }
        return cadena;
        }
}
        
    
        

