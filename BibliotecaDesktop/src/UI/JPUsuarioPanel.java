/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Entidad.Usuario;
import Utilidades.ParametrosGlobales;
import Modelos.UsuariosCRUD;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.w3c.dom.events.EventException;
//import javax.swing.ComboBoxModel;

/**
 *
 * @author amgoo
 */
public class JPUsuarioPanel extends javax.swing.JPanel {

    /**
     * Creates new form JPMetodos
     */
    //private ComboBoxModel<String> modelbox;
    private final UsuariosCRUD data = new UsuariosCRUD();
    private String message =new String();;
    public JPUsuarioPanel() { 
        initComponents();
        accesos();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTFNombre = new javax.swing.JTextField();
        jTFUsuario = new javax.swing.JTextField();
        jTFIdentificacion = new javax.swing.JTextField();
        jCBNivel = new javax.swing.JComboBox<>();
        jPFContrasena = new javax.swing.JPasswordField();
        jPFContrasenaConf = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTBUsuario = new javax.swing.JToolBar();
        jBAgregar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 173, 173));
        setPreferredSize(new java.awt.Dimension(750, 340));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFNombre.setNextFocusableComponent(jTFApellido);

        jTFUsuario.setNextFocusableComponent(jCBNivel);
        jTFUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFUsuarioFocusGained(evt);
            }
        });

        jTFIdentificacion.setNextFocusableComponent(jBAgregar);

        jCBNivel.setName(""); // NOI18N
        jCBNivel.setNextFocusableComponent(jPFContrasena);

        jPFContrasena.setNextFocusableComponent(jPFContrasenaConf);

        jPFContrasenaConf.setNextFocusableComponent(jTFIdentificacion);

        jLabel1.setText("Identificacion");

        jLabel2.setText("Nombre");

        jLabel3.setText("Usuario");

        jLabel4.setText("Nivel");

        jLabel5.setText("Confirmar Contrase??a");

        jLabel6.setText("Contrase??a");

        jTFApellido.setNextFocusableComponent(jTFUsuario);
        jTFApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFApellidoKeyPressed(evt);
            }
        });

        jLabel7.setText("Apellido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(jTFNombre))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jTFApellido))))
                    .addComponent(jLabel4)
                    .addComponent(jCBNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPFContrasena)
                    .addComponent(jPFContrasenaConf)
                    .addComponent(jTFIdentificacion)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addGap(378, 378, 378))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPFContrasenaConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(58, 58, 58))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jPFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 700, 200));

        jTBUsuario.setFloatable(false);
        jTBUsuario.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jTBUsuario.setRollover(true);
        jTBUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/AgregarUsuario.png"))); // NOI18N
        jBAgregar.setFocusable(false);
        jBAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });
        jTBUsuario.add(jBAgregar);

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/AgregarGuardar.png"))); // NOI18N
        jBGuardar.setFocusable(false);
        jBGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jTBUsuario.add(jBGuardar);

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/EliminarUsuario.png"))); // NOI18N
        jBEliminar.setFocusable(false);
        jBEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        jTBUsuario.add(jBEliminar);

        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/LimpiarUsuario.png"))); // NOI18N
        jBLimpiar.setFocusable(false);
        jBLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jTBUsuario.add(jBLimpiar);

        add(jTBUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 200));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTUsuariosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 201, 750, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        Usuario usuario = new Usuario();
        char[] pass = jPFContrasena.getPassword();
        char[] passC = jPFContrasenaConf.getPassword();
        String spass = new String(pass);
        String spassC = new String(passC);
        usuario.setNombre(jTFNombre.getText()+" "+jTFApellido.getText());
        usuario.setUsuario(jTFUsuario.getText());
        usuario.setNivel(jCBNivel.getSelectedIndex()+1);
        usuario.setIdentificador(jTFIdentificacion.getText());
        if(spass.equals(spassC)){
            usuario.setClave(spass);
            int rows=data.insertarUsuario(usuario);
            limpiar();
            JOptionPane.showMessageDialog(null, rows+" Usuario Ingresado", "Completado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Contrase??a no coinciden", "Incompletado", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        Usuario usuario = new Usuario();
        boolean proceso = true;
        char[] pass = jPFContrasena.getPassword();
        char[] passC = jPFContrasenaConf.getPassword();
        String spass = new String(pass);
        String spassC = new String(passC);
        usuario.setIdUs(Integer.parseInt(jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(),0).toString()));
        usuario.setNombre(jTFNombre.getText()+" "+jTFApellido.getText());
        usuario.setUsuario(jTFUsuario.getText());
        usuario.setNivel(jCBNivel.getSelectedIndex()+ParametrosGlobales.GlobalAccesNivel);
        if(spass.equals(spassC)){
            if (spass.isEmpty()){
                usuario.setClave(null);
            }else{
                usuario.setClave(spass);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Contrase??a no coinciden", "Incompletado", JOptionPane.WARNING_MESSAGE);
            proceso=false;
        }
        usuario.setIdentificador(jTFIdentificacion.getText());
        if (proceso){
            int rows=data.updateUsuario(usuario);
            JOptionPane.showMessageDialog(null, rows+" Cambio Aplicado", "Proceso", JOptionPane.INFORMATION_MESSAGE);
            jTUsuarios.removeAll();
            jTUsuarios.setModel(data.usuariosLista(ParametrosGlobales.GlobalAccesNivel));
        } 
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        message = data.eliminarUsuario(jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(),0).toString());
        JOptionPane.showMessageDialog(null, message, "Completado", JOptionPane.INFORMATION_MESSAGE);
        jTUsuarios.removeAll();
        jTUsuarios.setModel(data.usuariosLista(ParametrosGlobales.GlobalAccesNivel));
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuariosMousePressed
        jBAgregar.setVisible(false);
        jBGuardar.setVisible(true);
        String nombre = jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(),1).toString().trim(); 
        String[] newStr = nombre.split("\\s+");
        jTFNombre.setText(newStr[0]);
        jTFApellido.setText(newStr[1]);
        jTFUsuario.setText(jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(),2).toString());
        jCBNivel.setSelectedIndex(Integer.parseInt(jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(),3).toString())-ParametrosGlobales.GlobalAccesNivel);
        jTFIdentificacion.setText(jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(),5).toString());
    }//GEN-LAST:event_jTUsuariosMousePressed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jBAgregar.setVisible(true);
        jBGuardar.setVisible(false);
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTFApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFApellidoKeyPressed

    }//GEN-LAST:event_jTFApellidoKeyPressed

    private void jTFUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFUsuarioFocusGained
        try{
            String iniciales;
            String nombre = jTFNombre.getText();
            String apellido = jTFApellido.getText();
            iniciales=nombre.substring(0,1)+apellido.substring(0, 1);
            System.out.println(iniciales);
            jTFUsuario.setText(data.usuarioGenerate(iniciales));
        }catch(EventException e){
            JFLogin.logger.error(e.toString());
        }
    }//GEN-LAST:event_jTFUsuarioFocusGained
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCBNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPFContrasena;
    private javax.swing.JPasswordField jPFContrasenaConf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jTBUsuario;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFIdentificacion;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFUsuario;
    private javax.swing.JTable jTUsuarios;
    // End of variables declaration//GEN-END:variables
    private void metodoCombobox(int nivelus){
        ArrayList usuariolista=data.usuarioList();
        for(int i=nivelus-1;i<usuariolista.size();i++){
            jCBNivel.addItem(usuariolista.get(i).toString());
        }
    }
    private void accesos() {
        switch (ParametrosGlobales.GlobalAccesNivel) {
            case 1:
                jTUsuarios.setModel(data.usuariosLista(ParametrosGlobales.GlobalAccesNivel));
                metodoCombobox(ParametrosGlobales.GlobalAccesNivel);
                jBGuardar.setVisible(false);
                break;
            case 2:
                jTUsuarios.setModel(data.usuariosLista(ParametrosGlobales.GlobalAccesNivel));
                jBGuardar.setVisible(false);
                metodoCombobox(ParametrosGlobales.GlobalAccesNivel);
                jTFUsuario.setEnabled(false);
                break;
            case 3:
                jBEliminar.setVisible(false);
                jBAgregar.setVisible(false);
                jBLimpiar.setVisible(false);
                jTUsuarios.setVisible(false);
                jLabel4.setVisible(false);
                jCBNivel.setVisible(false);
                jLabel1.setVisible(false);
                jTFIdentificacion.setVisible(false);
                jTFUsuario.setEnabled(false);
                Usuario datos = data.usuarioData(ParametrosGlobales.GlobalAccesId);
                String nombre = datos.getNombre().trim();
                String[] newStr = nombre.split("\\s+");
                jTFNombre.setText(newStr[0]);
                jTFApellido.setText(newStr[1]);
                jTFUsuario.setText(datos.getUsuario());
                break;
        }
    }

    private void limpiar() {
        jTFNombre.setText(null);
        jTFApellido.setText(null);
        jTFUsuario.setText(null);
        jTFIdentificacion.setText(null);
        jPFContrasena.setText(null);
        jPFContrasenaConf.setText(null);
    }
}
