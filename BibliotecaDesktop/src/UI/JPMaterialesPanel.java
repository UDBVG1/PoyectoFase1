/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Modelos.MaterialCRUDD;
import Entidad.*;
import Utilidades.ParametrosGlobales;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author amgoo
 */
public class JPMaterialesPanel extends javax.swing.JPanel {

    /**
     * Creates new form JPMaterialesPanel
     */
    public String[] Lista={"Libro","Obra","Revista","CDA","DVD"};
    public MaterialCRUDD Nuevo_material=new MaterialCRUDD();
    private DefaultTableModel info=Nuevo_material.Matriz_material();
    public String cod;
    public JPMaterialesPanel() {
        initComponents();
        Accesos();
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
        jTBMaterial = new javax.swing.JToolBar();
        jAgregar = new javax.swing.JButton();
        jEditar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jMostrarTodo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLcodigo = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLtitulo = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        jLtipo = new javax.swing.JLabel();
        jLcatalogacion = new javax.swing.JLabel();
        catalogacion = new javax.swing.JTextField();
        jLtiempo = new javax.swing.JLabel();
        tiempo = new javax.swing.JTextField();
        jLcant_total = new javax.swing.JLabel();
        cant_total = new javax.swing.JTextField();
        jLcant_disponible = new javax.swing.JLabel();
        cant_disponible = new javax.swing.JTextField();
        jLautor = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        jLcambiante = new javax.swing.JLabel();
        cambiante = new javax.swing.JTextField();
        jLcambiante1 = new javax.swing.JLabel();
        cambiante1 = new javax.swing.JTextField();
        jLcambiante2 = new javax.swing.JLabel();
        cambiante2 = new javax.swing.JTextField();
        jLcambiante3 = new javax.swing.JLabel();
        cambiante3 = new javax.swing.JTextField();
        jAccion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTBMaterial.setFloatable(false);
        jTBMaterial.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jTBMaterial.setRollover(true);
        jTBMaterial.setToolTipText("");

        jAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/AgregarMaterial.png"))); // NOI18N
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });
        jTBMaterial.add(jAgregar);

        jEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/EditarMaterial.png"))); // NOI18N
        jTBMaterial.add(jEditar);

        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/EliminarMaterial.png"))); // NOI18N
        jTBMaterial.add(jEliminar);

        jMostrarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/ListarMaterial.png"))); // NOI18N
        jMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMostrarTodoActionPerformed(evt);
            }
        });
        jTBMaterial.add(jMostrarTodo);

        jLcodigo.setText("Codigo:");

        codigo.setToolTipText("");

        jLtitulo.setText("Titulo:");

        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoItemStateChanged(evt);
            }
        });
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        jLtipo.setText("Tipo de Material:");

        jLcatalogacion.setText("Ubicacion:");

        catalogacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogacionActionPerformed(evt);
            }
        });

        jLtiempo.setText("Tiempo de Prestamo:");

        jLcant_total.setText("Cantidad Total");

        cant_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_totalActionPerformed(evt);
            }
        });

        jLcant_disponible.setText("Cantidad Disponible:");

        cant_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_disponibleActionPerformed(evt);
            }
        });

        jLautor.setText("Autor:");

        jLcambiante.setText("cambiante");

        jLcambiante1.setText("cambiante1");

        cambiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiante1ActionPerformed(evt);
            }
        });

        jLcambiante2.setText("cambiante2");

        cambiante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiante2ActionPerformed(evt);
            }
        });

        jLcambiante3.setText("cambiante3");

        cambiante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiante3ActionPerformed(evt);
            }
        });

        jAccion.setText("Agregar");
        jAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLtiempo)
                            .addComponent(jLcant_disponible))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(cant_disponible))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLcant_total, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cant_total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jAccion))
                        .addGap(39, 39, 39)
                        .addComponent(jLcambiante3, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cambiante2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cambiante3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cambiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cambiante, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLcodigo)
                        .addGap(18, 18, 18)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLtipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLcatalogacion)
                                    .addComponent(jLautor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(catalogacion, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(autor)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLtitulo)
                                .addGap(27, 27, 27)
                                .addComponent(titulo)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLcambiante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLcambiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLcambiante2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(168, 168, 168))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLcodigo)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLtipo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLtitulo)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cambiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcambiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLautor)
                            .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLcambiante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cambiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcatalogacion)
                    .addComponent(catalogacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcambiante2)
                    .addComponent(cambiante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtiempo)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcant_total)
                    .addComponent(cant_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcambiante3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cambiante3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcant_disponible)
                    .addComponent(jAccion))
                .addContainerGap())
        );

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Cantidad Disponible", "Cantidad Total", "Catalogacion"
            }
        ));
        Tabla1.setRequestFocusEnabled(false);
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        Tabla1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Tabla1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMostrarTodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMostrarTodoActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        // TODO add your handling code here:
        clear();
            
    }//GEN-LAST:event_jAgregarActionPerformed

    private void cant_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cant_disponibleActionPerformed

    private void cant_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cant_totalActionPerformed

    private void catalogacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catalogacionActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed

    }//GEN-LAST:event_tipoActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void cambiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiante1ActionPerformed

    private void cambiante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiante2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiante2ActionPerformed

    private void cambiante3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiante3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiante3ActionPerformed

    private void tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoItemStateChanged

        String valor;
        valor=(String)tipo.getSelectedItem();
        if (valor == null){
            MostrarLibro();
        }
        else{
        switch (valor){
            case "Libro":
                ParametrosGlobales.tipo="LIB";
                MostrarLibro();
                break;
            case "Revista":
                ParametrosGlobales.tipo="REV";
                MostrarRevista();
                break;
            case "Obra":
                ParametrosGlobales.tipo="OBR";
                MostrarObra();
                break;
            case "CDA":
                ParametrosGlobales.tipo="CDA";
                MostrarCDA();
                break;
            case "DVD":
                ParametrosGlobales.tipo="DVD";
                MostrarDVD();
                break;
            }
        }
 
    }//GEN-LAST:event_tipoItemStateChanged

    private void jAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccionActionPerformed
        // TODO add your handling code here:
        String tipo_material, valor;

        //Cargando datos en entidad
        
        valor=(String)tipo.getSelectedItem();
        if (ParametrosGlobales.tipo.equals("CDA") || ParametrosGlobales.tipo.equals("DVD")){
            Audiovisual MiAudiovisual=new Audiovisual();
            tipo_material=valor;
            try{
            MiAudiovisual.titulo=titulo.getText();
            MiAudiovisual.tipo=ParametrosGlobales.tipo;
            MiAudiovisual.autor=autor.getText();
            MiAudiovisual.catalogacion=catalogacion.getText();
            MiAudiovisual.tiempo= Integer.parseInt(tiempo.getText());
            MiAudiovisual.CantTotal=Integer.parseInt(cant_total.getText());
            MiAudiovisual.CantDisp=Integer.parseInt(cant_disponible.getText());
            MiAudiovisual.genero=cambiante.getText();
            MiAudiovisual.duracion=cambiante1.getText();
            if (ParametrosGlobales.tipo=="CDA"){
            MiAudiovisual.numCanciones=Integer.parseInt(cambiante2.getText());
            }
            cod=Nuevo_material.InsertarAudio(MiAudiovisual);
            
            clear();
            construir_tabla();
            }catch(NumberFormatException ex){
        	System.out.println(ex);
            }
        }
        else{
            try{
            Escrito MiEscrito=new Escrito();
            tipo_material=ParametrosGlobales.tipo;
            
            MiEscrito.titulo=titulo.getText();
            MiEscrito.tipo=tipo_material;
            MiEscrito.autor=autor.getText();
            MiEscrito.catalogacion=catalogacion.getText();
            MiEscrito.tiempo= Integer.parseInt(tiempo.getText());
            MiEscrito.CantTotal=Integer.parseInt(cant_total.getText());
            MiEscrito.CantDisp=Integer.parseInt(cant_disponible.getText());
            MiEscrito.editorial=cambiante.getText();
            switch(tipo_material){
                case "LIB":
                    MiEscrito.ISBN=Integer.parseInt(cambiante1.getText());
                    MiEscrito.numPaginas=Integer.parseInt(cambiante2.getText());
                    MiEscrito.fechaPubli=Integer.parseInt(cambiante3.getText());
                    break;
                case "OBR":
                    MiEscrito.numPaginas=Integer.parseInt(cambiante1.getText());
                    MiEscrito.fechaPubli=Integer.parseInt(cambiante2.getText());
                    break;
                case "REV":
                    MiEscrito.numPaginas=Integer.parseInt(cambiante1.getText());
                    MiEscrito.periodicidad=cambiante2.getText();
                    break;
                default:
                                   
            }
            
            cod=Nuevo_material.InsertarEscrito(MiEscrito);
            JOptionPane.showMessageDialog(null, "Nuevo Codigo Generado: " + cod, "Alta", JOptionPane.INFORMATION_MESSAGE);
            clear();
            construir_tabla();
            }catch(NumberFormatException ex){
        	System.out.println(ex);
            }        
        }
    }//GEN-LAST:event_jAccionActionPerformed

    private void Tabla1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabla1KeyPressed
  
        
    }//GEN-LAST:event_Tabla1KeyPressed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
        String dato=String.valueOf(info.getValueAt(Tabla1.getSelectedRow(),0));
         System.out.println(dato);
        
    }//GEN-LAST:event_Tabla1MouseClicked
    
    public void MostrarLibro(){
            ParametrosGlobales.mat_table=true;
            jLautor.setText("Autor:");
            jLcambiante.setVisible(true);
            cambiante.setVisible(true);
            jLcambiante.setText("Editorial:");
            jLcambiante1.setVisible(true);
            cambiante1.setVisible(true);
            jLcambiante1.setText("ISBN:");
            jLcambiante2.setVisible(true);
            cambiante2.setVisible(true);
            jLcambiante2.setText("Cant. Paginas:");
            jLcambiante3.setVisible(true);
            cambiante3.setVisible(true);
            jLcambiante3.setText("Año Publicacion:");
    }
    
    public void MostrarRevista(){
            ParametrosGlobales.mat_table=true;
            jLautor.setText("Autor:");
            jLcambiante.setVisible(true);
            cambiante.setVisible(true);
            jLcambiante.setText("Editorial:");
            jLcambiante1.setVisible(true);
            cambiante1.setVisible(true);
            jLcambiante1.setText("Cant. Paginas:");
            jLcambiante2.setVisible(true);
            cambiante2.setVisible(true);
            jLcambiante2.setText("Periodicidad:");
            jLcambiante3.setVisible(false);
            cambiante3.setVisible(false);
    }
    
    public void MostrarObra(){
            ParametrosGlobales.mat_table=true;
            jLautor.setText("Autor:");
            jLcambiante.setVisible(true);
            cambiante.setVisible(true);
            jLcambiante.setText("Editorial:");
            jLcambiante1.setVisible(true);
            cambiante1.setVisible(true);
            jLcambiante1.setText("Cant. Paginas:");
            jLcambiante2.setVisible(true);
            cambiante2.setVisible(true);
            jLcambiante2.setText("Año Publicacion:");
            jLcambiante3.setVisible(false);
            cambiante3.setVisible(false);
    }
    
    public void MostrarDVD(){
            ParametrosGlobales.mat_table=false;
            jLautor.setText("Director:");
            jLcambiante.setVisible(true);
            cambiante.setVisible(true);
            jLcambiante1.setVisible(true);
            cambiante1.setVisible(true);
            jLcambiante.setText("Genero:");
            jLcambiante1.setText("Duración:");
            jLcambiante2.setVisible(false);
            cambiante2.setVisible(false);
            jLcambiante3.setVisible(false);
            cambiante3.setVisible(false);
    }
    
    public void MostrarCDA(){
            ParametrosGlobales.mat_table=false;
            jLautor.setText("Cantante:");
            jLcambiante.setText("Genero:");
            jLcambiante.setVisible(true);
            cambiante.setVisible(true);
            jLcambiante1.setVisible(true);
            cambiante1.setVisible(true);
            jLcambiante1.setText("Duración:");
            jLcambiante2.setVisible(true);
            cambiante2.setVisible(true);
            jLcambiante2.setText("Cant. Canciones:");
            jLcambiante3.setVisible(false);
            cambiante3.setVisible(false);
    }
    
    private void Accesos(){
        codigo.setEnabled(false);
        tipo.removeAllItems();
        for(int i=0; i<5;i++){
        tipo.addItem(Lista[i]);
        }
        construir_tabla();
        switch (ParametrosGlobales.GlobalAccesNivel) {
            
           case 1:

                jAgregar.setVisible(true);
                jEditar.setVisible(true);
                jEliminar.setVisible(true);
                jMostrarTodo.setVisible(true);
                tipo.removeAllItems();
                for(int i=0; i<5;i++){
                tipo.addItem(Lista[i]);
                }
                construir_tabla();
                break;
            case 2:

                jAgregar.setVisible(false);
                jEditar.setVisible(false);
                jEliminar.setVisible(false);
                jMostrarTodo.setVisible(false);
                construir_tabla();
                break;
            case 3:

                break;
        } 
        
    }
    
    public void clear(){
        codigo.setText(" ");
        titulo.setText(" ");
        autor.setText("");
        catalogacion.setText("");
        cant_disponible.setText("");
        cant_total.setText("");
        tiempo.setText("");
        cambiante.setText("");
        cambiante1.setText("");
        cambiante2.setText("");
        cambiante3.setText("");
    }
    
    private void construir_tabla(){
     info=Nuevo_material.Matriz_material();
     Tabla1.setModel(info);
 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JTextField autor;
    private javax.swing.JTextField cambiante;
    private javax.swing.JTextField cambiante1;
    private javax.swing.JTextField cambiante2;
    private javax.swing.JTextField cambiante3;
    private javax.swing.JTextField cant_disponible;
    private javax.swing.JTextField cant_total;
    private javax.swing.JTextField catalogacion;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton jAccion;
    private javax.swing.JButton jAgregar;
    private javax.swing.JButton jEditar;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jLautor;
    private javax.swing.JLabel jLcambiante;
    private javax.swing.JLabel jLcambiante1;
    private javax.swing.JLabel jLcambiante2;
    private javax.swing.JLabel jLcambiante3;
    private javax.swing.JLabel jLcant_disponible;
    private javax.swing.JLabel jLcant_total;
    private javax.swing.JLabel jLcatalogacion;
    private javax.swing.JLabel jLcodigo;
    private javax.swing.JLabel jLtiempo;
    private javax.swing.JLabel jLtipo;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JButton jMostrarTodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jTBMaterial;
    private javax.swing.JTextField tiempo;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables

}
