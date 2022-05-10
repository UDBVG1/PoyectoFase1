/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import Utilidades.Conexion;
import Entidad.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author amgoo
 */
public class UsuariosCRUD {
    private final String SqlUsuarioAcceso = "SELECT idusuario,nombre,usuario,password,nivel FROM usuario where usuario=? and password=?;";
    private final String SqlUsuarios = "SELECT idusuario,nombre,usuario, nivel, (select descripcion from config where estado='nivel usuario' and valor=nivel) as nivel_nombre FROM usuario;";
    private final String SqlComboNivel="select descripcion from config where estado='nivel usuario';";
    private final String SqlUsuario="SELECT idusuario,nombre,usuario,password,nivel FROM usuario where idusuario=?";
    public Usuario usuarioAcceso(String Usuario, String Password){
        Connection conn =null;
        PreparedStatement stmt =null;
        ResultSet rs=null;
        Usuario obUsuario = new Usuario();
        try{
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SqlUsuarioAcceso);
            int index=1;
            stmt.setString(index++, Usuario);
            stmt.setString(index, Password);
            rs = stmt.executeQuery();
            while (rs.next()) {
                obUsuario.setIdUs(Integer.parseInt(rs.getObject(1).toString()));
                obUsuario.setNombre(rs.getObject(2).toString());
                obUsuario.setUsuario(rs.getObject(3).toString());
                obUsuario.setClave(rs.getObject(4).toString());
                obUsuario.setNivel(Integer.parseInt(rs.getObject(5).toString()));
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Intentar Ingresar", "Error", JOptionPane.INFORMATION_MESSAGE); 
        } finally {
            Conexion.closeConnection(conn);
            Conexion.closeStatement(stmt);
            Conexion.closeResulset(rs);
        }
        return obUsuario;
    }
    public DefaultTableModel usuariosLista(){
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SqlUsuarios);
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
    public ArrayList usuarioList(){
        ArrayList dtm=new ArrayList();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SqlComboNivel);
            rs = stmt.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            //int numberOfColumns = meta.getColumnCount(); 
            int num = 1;
            while (rs.next()) {
                    dtm.add(rs.getObject(num));
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
    public Usuario usuarioData(int id){
        Usuario data = new Usuario();
        Connection conn =null;
        PreparedStatement stmt =null;
        ResultSet rs=null;
        try{
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SqlUsuario);
            int index=1;
            stmt.setInt(index, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                data.setIdUs(Integer.parseInt(rs.getObject(1).toString()));
                data.setNombre(rs.getObject(2).toString());
                data.setUsuario(rs.getObject(3).toString());
                data.setClave(rs.getObject(4).toString());
                data.setNivel(Integer.parseInt(rs.getObject(5).toString()));
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Intentar Ingresar", "Error", JOptionPane.INFORMATION_MESSAGE); 
        } finally {
            Conexion.closeConnection(conn);
            Conexion.closeStatement(stmt);
            Conexion.closeResulset(rs);
        }
        return data;
    }
}
