/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Utilidades.ParametrosGlobales;
import java.awt.BorderLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;
/**
 *
 * @author amgoo
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    
    int LX;
    int LY;
    int vp0=1;
    int vp1=1;
    int vp2=1;
    LocalDateTime now = LocalDateTime.now();
    public JFPrincipal() {
        initComponents();
        setLocationWindow();
        jDateLogin.setText(now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        jGlobalUsuario.setText(ParametrosGlobales.GlobalUser);
        jPSetPanel.setVisible(false);
        //jMenuOptionMT.setVisible(false);
    }
    
    private void setLocationWindow(){
        setLocationRelativeTo(null);
    } 
    private void ShowOption(JPanel p){
        p.setSize(750, 340);
        p.setLocation(0,0);
        jPSetPanel.setVisible(true);
        jPSetPanel.add(p, BorderLayout.CENTER);
        jPSetPanel.removeAll();
        jPSetPanel.add(p);
        jPSetPanel.revalidate();
        jPSetPanel.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloPrincipal = new javax.swing.JLabel();
        cerrarPrincipal1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMostrarPanel = new javax.swing.JPanel();
        jPMostrar = new javax.swing.JPanel();
        jPSetPanel = new javax.swing.JPanel();
        jBLogout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBMaterialIcon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jGlobalUsuario = new javax.swing.JLabel();
        jDateLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tituloPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        tituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/Titulo Bar.png"))); // NOI18N
        tituloPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tituloPrincipalMouseDragged(evt);
            }
        });
        tituloPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tituloPrincipalMousePressed(evt);
            }
        });

        cerrarPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/close-app.png"))); // NOI18N
        cerrarPrincipal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarPrincipal1MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/minimizar-app.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(tituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(cerrarPrincipal1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cerrarPrincipal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tituloPrincipal, javax.swing.GroupLayout.Alignment.TRAILING))))
        );

        jMostrarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPMostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPSetPanel.setBackground(new java.awt.Color(233, 233, 233));

        javax.swing.GroupLayout jPSetPanelLayout = new javax.swing.GroupLayout(jPSetPanel);
        jPSetPanel.setLayout(jPSetPanelLayout);
        jPSetPanelLayout.setHorizontalGroup(
            jPSetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPSetPanelLayout.setVerticalGroup(
            jPSetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jPMostrar.add(jPSetPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 340));

        jBLogout.setBackground(new java.awt.Color(0, 46, 105));
        jBLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/cerrar-sesion.png"))); // NOI18N
        jBLogout.setContentAreaFilled(false);
        jBLogout.setFocusPainted(false);
        jBLogout.setFocusable(false);
        jBLogout.setOpaque(false);
        jBLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogoutActionPerformed(evt);
            }
        });
        jPMostrar.add(jBLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/PanelBack2principal.png"))); // NOI18N
        jPMostrar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 340));

        jMostrarPanel.add(jPMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 750, 340));

        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/HomeIcon.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/UsuariosIcon.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuarios");
        jToolBar1.add(jLabel3);

        jBMaterialIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/IconoMateriales.png"))); // NOI18N
        jBMaterialIcon.setFocusable(false);
        jBMaterialIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBMaterialIcon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBMaterialIcon);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Materiales");
        jToolBar1.add(jLabel2);

        jMostrarPanel.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 340));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/Back2principal.png"))); // NOI18N
        jMostrarPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 340));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jGlobalUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jGlobalUsuario.setForeground(new java.awt.Color(153, 153, 153));

        jDateLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDateLogin.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jGlobalUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDateLogin)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGlobalUsuario)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMostrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 829, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jMostrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarPrincipal1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarPrincipal1MousePressed
        System.exit(0);
    }//GEN-LAST:event_cerrarPrincipal1MousePressed

    private void tituloPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloPrincipalMousePressed
        if (evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            LX = evt.getX();
            LY = evt.getY();
        }
    }//GEN-LAST:event_tituloPrincipalMousePressed

    private void tituloPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloPrincipalMouseDragged
        this.setLocation(evt.getXOnScreen()-LX, evt.getYOnScreen()-LY);
    }//GEN-LAST:event_tituloPrincipalMouseDragged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPSetPanel.setVisible(false);
        jBLogout.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JPUsuarioPanel OpcionUsuario1 = new JPUsuarioPanel();
        jBLogout.setVisible(false);
        ShowOption(OpcionUsuario1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogoutActionPerformed
        JFLogin LogOut=new JFLogin();
            LogOut.setVisible(true);
            dispose();
    }//GEN-LAST:event_jBLogoutActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrarPrincipal1;
    private javax.swing.JButton jBLogout;
    private javax.swing.JButton jBMaterialIcon;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jDateLogin;
    private javax.swing.JLabel jGlobalUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jMostrarPanel;
    private javax.swing.JPanel jPMostrar;
    private javax.swing.JPanel jPSetPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
