/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Modelos.PrestamosCRUD;
import Modelos.Validaciones;
import java.util.ArrayList;
import Utilidades.ParametrosGlobales;
import static java.lang.Integer.parseInt;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
/**
 *
 * @author admin
 */
public class Prestamo extends javax.swing.JPanel {
        Validaciones validar;
        PrestamosCRUD prestamo;
    /**
     * Creates new form Prestamo
     */
    public Prestamo() {
        initComponents();
        validar = new Validaciones();
        prestamo = new PrestamosCRUD();
        jTableDatos.setModel(prestamo.mostrar(prestamo.SQL_SELECTall));
        acceso();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        ComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabeleditorial = new javax.swing.JLabel();
        generoLabel = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        warning = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        Prestar = new javax.swing.JButton();
        Reservar = new javax.swing.JButton();
        Devolucion = new javax.swing.JButton();
        filtrado = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tituloDev = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonFiltrarUsuario = new javax.swing.JButton();
        IDUsuario = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setText("Titulo");
        add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabelAutor.setText("Autor");
        add(jLabelAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        ComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Libro", "Revista", "CD", "DVD" }));
        ComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoActionPerformed(evt);
            }
        });
        add(ComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 20));

        jLabel1.setText("Tipo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 20));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 140, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 150, -1));

        jLabeleditorial.setText("Editorial");
        add(jLabeleditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 10));

        generoLabel.setText("Genero");
        add(generoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 20));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, 20));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 100, 20));
        add(warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        Prestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/PrestarIcon.png"))); // NOI18N
        Prestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestarActionPerformed(evt);
            }
        });
        jToolBar1.add(Prestar);

        Reservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/Reservar.png"))); // NOI18N
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });
        jToolBar1.add(Reservar);

        Devolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/DevolucionIcon.png"))); // NOI18N
        Devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevolucionActionPerformed(evt);
            }
        });
        jToolBar1.add(Devolucion);

        filtrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/filtrar.png"))); // NOI18N
        filtrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtradoActionPerformed(evt);
            }
        });
        jToolBar1.add(filtrado);

        add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 340));

        jTableDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDatosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableDatos);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 700, 120));

        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 350, 160));

        tituloDev.setText("Informacion acerca sus prestamos");
        add(tituloDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jLabel3.setText("PRESTAMO");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        botonFiltrarUsuario.setText("Filtrar por usuario");
        botonFiltrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarUsuarioActionPerformed(evt);
            }
        });
        add(botonFiltrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 20));
        add(IDUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoActionPerformed
       String item = (String) ComboBoxTipo.getSelectedItem();        
        try{
        switch(item){
            case "Libro":
            labelsNames("Editorial","ISBN");
            jTableDatos.setModel(prestamo.mostrar(prestamo.SQL_SELECTlibros));
            ParametrosGlobales.TipoPrestamo = 1;
                break;
            case "Revista":
            labelsNames("Periodicidad","Año ublicacion");
            jTableDatos.setModel(prestamo.mostrar(prestamo.SQL_SELECTrevista));
            ParametrosGlobales.TipoPrestamo = 2;
 
                break;
            case "CD":
            labelsNames("Genero","Duracion");
            jTableDatos.setModel(prestamo.mostrar(prestamo.SQL_SELECTcd));
            ParametrosGlobales.TipoPrestamo = 3;

                break;
            case "DVD":
            labelsNames("Genero","Duracion");
            jTableDatos.setModel(prestamo.mostrar(prestamo.SQL_SELECTdvd));
            ParametrosGlobales.TipoPrestamo = 4;

                break;
            case "Tesis":
            

                break;
            case "Obra":

                break;
            default:
            jTableDatos.setModel(prestamo.mostrar(prestamo.SQL_SELECTall));
            ParametrosGlobales.TipoPrestamo = 0;

                break;
        } 
        
        }catch(Exception e){
            System.out.println("error prestamo: " +e);
        }
    }//GEN-LAST:event_ComboBoxTipoActionPerformed
    
    public String agregarSimbolo(String texto){
        String NuevoTexto;
        if(!texto.equals("")){
           return NuevoTexto = "%"+texto+"%"; 
        }else{
            return texto;
        } 
    }
    
    private void filtradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtradoActionPerformed
        String titulo=agregarSimbolo(jTextField1.getText()),
        autor = agregarSimbolo(jTextField2.getText()),
        edit = agregarSimbolo(jTextField3.getText()),
        isbn = agregarSimbolo(jTextField4.getText()),
        periodicidad=edit,publicacion=isbn,
        genero=edit,duracion=isbn;
        //para usuario buscar mediante titulo y lo demas para realizar el prestamo
        //para nivel 2 y 3 por codigo
        
        switch(ParametrosGlobales.TipoPrestamo){
            case 1:
            jTableDatos.setModel(prestamo.Filtrar(prestamo.SQL_BUSCARL,titulo ,autor ,edit ,isbn ));       
                break;
            case 2:
            jTableDatos.setModel(prestamo.Filtrar(prestamo.SQL_BUSCARR,titulo ,autor ,periodicidad ,publicacion ));             
                break;
            case 3:
            jTableDatos.setModel(prestamo.Filtrar(prestamo.SQL_BUSCARC,titulo ,autor ,genero ,duracion )); 
           
                break;
            case 4:
            jTableDatos.setModel(prestamo.Filtrar(prestamo.SQL_BUSCARD,titulo ,autor ,genero ,duracion )); 
            
                break;
        }
        
    }//GEN-LAST:event_filtradoActionPerformed

    private void PrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestarActionPerformed
      prestamo.updateMaterial(1,codigo());  
      int idsocio;
      idsocio = prestamo.GetUsuario((String) usuario());
      prestamo.insertarPrestamo(codigo(),ParametrosGlobales.GlobalAccesId);
      prestamo.Updateestado("3",idsocio,codigo()); 
      
    }//GEN-LAST:event_PrestarActionPerformed

    private void DevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevolucionActionPerformed

        int idsocio;
        idsocio = prestamo.GetUsuario((String) usuario());
        String msg = JOptionPane.showInputDialog(null, "Introduce cuantos desea Devolver");
        int devolver = parseInt(msg);
        int rows = prestamo.Updateestado("2",idsocio, codigoDev());
        prestamo.updateMaterial(devolver,codigoDev());  
        if(ParametrosGlobales.GlobalAccesId==3){
          jTable1.setModel(prestamo.mostrarRev());   
        }
        if(rows >0){
        JOptionPane.showMessageDialog(null, "Devolucion exitosa", "Ingresado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_DevolucionActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
      String msg = JOptionPane.showInputDialog(null, "Introduce cuantos desea reservar");
      int reservado = parseInt(msg);
      prestamo.insertarReserva(codigo(),ParametrosGlobales.GlobalAccesId,reservado);
      prestamo.updateMaterial(-reservado,codigo());  
    }//GEN-LAST:event_ReservarActionPerformed

    private void botonFiltrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarUsuarioActionPerformed
        int idsocio;
        idsocio = prestamo.GetUsuario(IDUsuario.getText());
        jTable1.setModel(prestamo.mostrarPrestamoUsuario(idsocio,prestamo.SQL_SELECTPRESX));
    }//GEN-LAST:event_botonFiltrarUsuarioActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(ParametrosGlobales.GlobalAccesNivel == 1){
        jTableDatos.setModel(prestamo.FiltrarSeleccion(prestamo.SQL_SelectFiltrado,codigoDev() ));
        }
        Prestar.setEnabled(false);
        Reservar.setEnabled(false);
        filtrado.setEnabled(false);
        Devolucion.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDatosMouseClicked
        Prestar.setEnabled(true);
        Reservar.setEnabled(true);
        filtrado.setEnabled(true);
        Devolucion.setEnabled(false);
    }//GEN-LAST:event_jTableDatosMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTipo;
    private javax.swing.JButton Devolucion;
    private javax.swing.JTextField IDUsuario;
    private javax.swing.JButton Prestar;
    private javax.swing.JButton Reservar;
    private javax.swing.JButton botonFiltrarUsuario;
    private javax.swing.JButton filtrado;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabeleditorial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel tituloDev;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
    public void labelsNames(String nombre1,String nombre2){
        jLabeleditorial.setText(nombre1);
        generoLabel.setText(nombre2); 
    }


    
    public Object codigo(){
        Object codigo = null;
        int fila = jTableDatos.getSelectedRow();
        System.out.println(codigo);
        return codigo = jTableDatos.getValueAt(fila, 0);
    }
    
    public Object codigoDev(){
        Object codigo = null;
        int fila = jTable1.getSelectedRow();
        System.out.println("codigo :"+codigo);
        return codigo = jTable1.getValueAt(fila, 0); 
    }

    public Object usuario(){
        Object usuario = null;
        int fila = jTable1.getSelectedRow();
        System.out.println(usuario);
        return usuario = jTable1.getValueAt(fila, 4); 
    }
        
    private void acceso() {
        switch (ParametrosGlobales.GlobalAccesNivel) {
            case 1:
              tituloDev.setText("Reservados");
              Prestar.setVisible(true); 
              Devolucion.setVisible(true);
              jTable1.setModel(prestamo.mostrarRev());       
             IDUsuario.setVisible(true);
             botonFiltrarUsuario.setVisible(true);
             jLabel3.setText("PRESTAMOS");
             
                break;
            case 2:
              tituloDev.setText("Reservados");
              Prestar.setVisible(true); 
              Devolucion.setVisible(true);
              jTable1.setModel(prestamo.mostrarRev()); 

             IDUsuario.setVisible(true);
             botonFiltrarUsuario.setVisible(true);
             jLabel3.setText("PRESTAMOS");
                break;
            case 3:
             tituloDev.setText("Informacion acerca de sus prestamos");
             Prestar.setVisible(false);
             Devolucion.setVisible(false);
             jTable1.setModel(prestamo.mostrarPrestamoUsuario(ParametrosGlobales.GlobalAccesId,prestamo.SQL_SELECTPRESX));
             jTable1.setRowSelectionAllowed(false);
             jTable1.setColumnSelectionAllowed(false);
             jTable1.setCellSelectionEnabled(false); 
             IDUsuario.setVisible(false);
             botonFiltrarUsuario.setVisible(false);
             jLabel3.setText("RESERVAS");

                break;
        }
    }

}
