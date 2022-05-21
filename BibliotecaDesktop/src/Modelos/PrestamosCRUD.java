/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import static UI.JFLogin.logger;
import Utilidades.Conexion;
import Utilidades.ParametrosGlobales;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author admin
 */
public class PrestamosCRUD {
     private final String SQL_SELECTMORA = "SELECT TIMESTAMPDIFF(DAY,fechaprestamo,fechaentrega)  as newfecha FROM prestamos WHERE codigo = ?;";
     
     public String SQL_SELECTlibros ="select codigo as Codigo,l.titulo as Titulo,l.autor as Autor,l.num_pag as Paginas,l.editorial as Editorial,l.isbn as ISBN\n" +
                                            "from libros l\n" +
                                            "right join material m\n" +
                                            "on l.idlibros = m.idlibros\n" +
                                            "where m.codigo like \"LIB%\";";
     
     public String SQL_SELECTrevista = "select codigo as Codigo,r.titulo as Titulo,r.editorial as Editorial,r.periodicidad as Periodicidad,r.publicacion as Publicidad\n" +
                                        "from revista r\n" +
                                        "right join material m\n" +
                                        "on r.idrevistas = m.idrevistas\n" +
                                        "where m.codigo like \"REV%\";";
             
     public String SQL_SELECTcd="select codigo as Codigo,cd.titulo as Titulo,cd.artista as Artista,cd.genero as Genero,cd.duracion as Duracion,cd.canciones as \"Numero de Canciones\"\n" +
                                "from m_cd cd\n" +
                                "right join material m\n" +
                                "on cd.idm_cd= m.idm_cd\n" +
                                "where m.codigo like \"CDA%\";";
             
     public String SQL_SELECTdvd="select codigo as Codigo,dvd.titulo as Titulo,dvd.director as Director,dvd.duracion as Duracion,dvd.genero as Genero\n" +
                                "from m_dvd dvd\n" +
                                "right join material m\n" +
                                "on DVD.idm_dvd = m.idm_dvd\n" +
                                "where m.codigo like \"DVD%\";";     
     
     public String SQL_SELECTall="SELECT codigo as Codigo,case when m.idlibros is not null then l.titulo\n" +
                                "when m.idrevistas is not null then r.titulo\n" +
                                "when m.idm_cd is not null then mc.titulo\n" +
                                "when m.idm_dvd is not null then md.titulo\n" +
                                "else null end AS titulo,cantidad_disponible\n" +
                                "FROM material m\n" +
                                "LEFT join libros l on m.idlibros=l.idlibros\n" +
                                "LEFT join revista r on m.idrevistas=r.idrevistas\n" +
                                "LEFT join m_cd mc on m.idm_cd=mc.idm_cd\n" +
                                "LEFT join m_dvd md on m.idm_dvd=md.idm_dvd; ";
     
     public String SQL_BUSCARL ="SELECT codigo as Codigo,titulo as Titulo,autor as Autor,num_pag as \"Numero de paginar\",editorial as Editorial,isbn as ISBN from libros l \n" +
                                "right join material m on l.idlibros = m.idlibros\n" +
                                "where titulo like ? or autor like ? or editorial like ? or isbn like ?;";
     public String SQL_BUSCARR ="SELECT codigo as Codigo,titulo as Titulo,editorial as Editorial,periodicidad as Periodicidad,CONVERT(publicacion, CHAR) as \"Año publicacion\" from revista r\n" +
                                "right join material m on r.idrevistas = m.idrevistas\n" +
                                "where titulo like ? or editorial like ? or periodicidad like ? or publicacion like ?;";
     public String SQL_BUSCARC ="SELECT codigo as Codigo,titulo as Titulo,artista as Artista,genero as Genero,duracion as Duracion, canciones as Canciones from m_cd cd\n" +
                                "right join material m on cd.idm_cd = m.idm_cd\n" +
                                "where titulo like ? or artista like ? or genero like ? or duracion like ?;";
     public String SQL_BUSCARD ="SELECT codigo as Codigo,titulo as Titulo,director as Director,duracion as Duracion,genero as Genero from m_dvd d\n" +
                                "right join material m on d.idm_dvd = m.idm_dvd\n" +
                                "where titulo like ? or director like ? or genero like ? or duracion like ?;";
     
     public String SQL_BUSCARCR = "";
     
     private String SQL_INSERTREV = "INSERT INTO reserva(fechareserva,estado,reservado,codigo,idsocio) values (CURDATE(),?,?,?,?);";
     
     private String SQL_INSERTPRE ="insert into prestamos(fechaprestamo,fechaentrega,prestado,codigo,idsocio) values (curdate(),?,?,?,?)";
     
     private String SQL_UPDATEPD = "update material set cantidad_disponible = (cantidad_disponible + ?) where codigo = ?;";
    
     public String SQL_SELECTPRESALL = "SELECT 	m.codigo as Codigo,case when m.idlibros is not null then l.titulo\n" +
                                        "when m.idrevistas is not null then r.titulo\n" +
                                        "when m.idm_cd is not null then mc.titulo\n" +
                                        "when m.idm_dvd is not null then md.titulo\n" +
                                        "else null end AS titulo,CONVERT(p.fechaprestamo, CHAR) as Fecha_Prestamo,CONVERT(p.fechaentrega, CHAR)as Fecha_Entrega,p.mora\n" +
                                        "FROM material m\n" +
                                        "LEFT join libros l on m.idlibros=l.idlibros\n" +
                                        "LEFT join revista r on m.idrevistas=r.idrevistas\n" +
                                        "LEFT join m_cd mc on m.idm_cd=mc.idm_cd\n" +
                                        "LEFT join m_dvd md on m.idm_dvd=md.idm_dvd\n" +
                                        "LEFT join prestamos p on m.codigo = p.codigo\n" +
                                        "where p.idsocio != 0;";
     
     public String SQL_SELECTPRESX = "SELECT case when m.idlibros is not null then l.titulo\n" +
                                    "when m.idrevistas is not null then r.titulo\n" +
                                    "when m.idm_cd is not null then mc.titulo\n" +
                                    "when m.idm_dvd is not null then md.titulo\n" +
                                    "else null end AS titulo,CONVERT(p.fechaentrega, CHAR)as Fecha_Entrega,p.mora\n" +
                                    "FROM material m\n" +
                                    "LEFT join libros l on m.idlibros=l.idlibros\n" +
                                    "LEFT join revista r on m.idrevistas=r.idrevistas\n" +
                                    "LEFT join m_cd mc on m.idm_cd=mc.idm_cd\n" +
                                    "LEFT join m_dvd md on m.idm_dvd=md.idm_dvd\n" +
                                    "LEFT join prestamos p on m.codigo = p.codigo\n" +
                                    "where p.idsocio = ?;"; // buscar los prestamos segun usuario que esta logueado
     
     public String FechaEntrega(){//agregando 5 dias mas
        LocalDateTime hoy = LocalDateTime.now();
        LocalDateTime hoyCorto = hoy.plusDays(5);
        //LocalDateTime hoyCorto = hoy.minusDays(5);//5 dias menos
        String fechaEntrega = hoyCorto.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return fechaEntrega;
        }
    
    public DefaultTableModel mostrar(String select){
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(select);
            rs = stmt.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            int numberOfColumns = meta.getColumnCount();
            for (int i = 1; i<= numberOfColumns; i++) {
            dtm.addColumn(meta.getColumnLabel(i));
            }
            while (rs.next()) {
                    
                    Object[] fila = new Object[numberOfColumns];
                    for (int i = 0; i<numberOfColumns; i++) {
                    fila[i]=rs.getObject(i+1);
                    }
                    dtm.addRow(fila);
            }
        } catch (SQLException e) {
            logger.error("ERROR en la conexion bd", e);
        } finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
            Conexion.closeResulset(rs);
        }
        return dtm;
    }
    
    public DefaultTableModel Filtrar(String select,String box1,String box2,String box3,String box4){
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(select);
            int index = 1;
            stmt.setString(index++,box1);
            stmt.setString(index++,box2);
            stmt.setString(index++,box3);
            stmt.setString(index,box4);
            
            rs = stmt.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            int numberOfColumns = meta.getColumnCount();
            for (int i = 1; i<= numberOfColumns; i++) {
            dtm.addColumn(meta.getColumnLabel(i));
            }
            while (rs.next()) {
                    
                    Object[] fila = new Object[numberOfColumns];
                    for (int i = 0; i<numberOfColumns; i++) {
                    fila[i]=rs.getObject(i+1);
                    }
                    dtm.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
            Conexion.closeResulset(rs);
        }
        return dtm;
    }   
     
    public void insertarReserva(Object codigo,int idsocio){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        int reservado;
        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_INSERTREV);
            int index = 1;
            stmt.setString(index++,"Activo");
            String msg = JOptionPane.showInputDialog(null, "Introduce cuantos desea reservar");
            reservado = parseInt(msg);
            stmt.setInt(index++,reservado);
            stmt.setObject(index++,codigo);
            stmt.setInt(index,idsocio);
            rows = stmt.executeUpdate();
        if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso" + "/n" + "Registros afectados" + rows, "Ingresado", JOptionPane.INFORMATION_MESSAGE);
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            System.out.println("error mora sistema: "+e2);
        }finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
        }
    }
    
    public void updateMaterial(int Indicador,Object codigo){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_UPDATEPD);
            int index = 1;
            stmt.setInt(index++,Indicador);
            stmt.setObject(index++,codigo);
            
            rows = stmt.executeUpdate();
        if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso" + "/n" + "Registros afectados" + rows, "Ingresado", JOptionPane.INFORMATION_MESSAGE);
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            System.out.println("error mora sistema: "+e2);
        }finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
        }
    }
    
    public DefaultTableModel mostrarPrestamoUsuario(){
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;      
        try{
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_SELECTPRESX);
            int index = 1;
            stmt.setInt(index++,ParametrosGlobales.GlobalAccesId);
            rs = stmt.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            int numberOfColumns = meta.getColumnCount();
            for (int i = 1; i<= numberOfColumns; i++) {
            dtm.addColumn(meta.getColumnLabel(i));
            }
            while (rs.next()) {
                    
                    Object[] fila = new Object[numberOfColumns];
                    for (int i = 0; i<numberOfColumns; i++) {
                    fila[i]=rs.getObject(i+1);
                    }
                    dtm.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
            Conexion.closeResulset(rs);
        }
        return dtm;
    }  
    
    public DefaultTableModel mostrarPrestamos(){
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;      
        try{
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_SELECTPRESALL);
            rs = stmt.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            int numberOfColumns = meta.getColumnCount();
            for (int i = 1; i<= numberOfColumns; i++) {
            dtm.addColumn(meta.getColumnLabel(i));
            }
            while (rs.next()) {
                    
                    Object[] fila = new Object[numberOfColumns];
                    for (int i = 0; i<numberOfColumns; i++) {
                    fila[i]=rs.getObject(i+1);
                    }
                    dtm.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
            Conexion.closeResulset(rs);
        }
        return dtm;
    }
    
    public void insertarPrestamo(Object codigo,int idsocio){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        int prestado;
        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_INSERTPRE);
            int index = 1;
            stmt.setObject(index++,FechaEntrega());
            String msg = JOptionPane.showInputDialog(null, "Introduce cuantos desea reservar");
            prestado = parseInt(msg);
            stmt.setInt(index++,prestado);
            stmt.setObject(index++,codigo);
            stmt.setInt(index,idsocio);
            rows = stmt.executeUpdate();
        if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso" + "/n" + "Registros afectados" + rows, "Ingresado", JOptionPane.INFORMATION_MESSAGE);
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            System.out.println("error prestamos sistema: "+e2);
        }finally {
            Conexion.closeStatement(stmt);
            Conexion.closeConnection(conn);
        }
    }
}
