/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Utilidades.Conexion;
import Modelos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author amgoo
 */
public class CRUDLogin {
    private final String SqlUsuarioAcceso = "SELECT idsocio,nombre,usuario,password,nivel FROM socio where usuario=? and password=?;";
    
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
    
}
