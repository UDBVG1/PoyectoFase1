/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author amgoo
 */
public class JPMaterialesPanel extends javax.swing.JPanel {

    /**
     * Creates new form JPMaterialesPanel
     */
    public JPMaterialesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTBMaterial = new javax.swing.JToolBar();
        jLIconoAgregarM = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTBMaterial.setFloatable(false);
        jTBMaterial.setRollover(true);
        jTBMaterial.setToolTipText("");

        jLIconoAgregarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/AgregarMaterial.png"))); // NOI18N
        jTBMaterial.add(jLIconoAgregarM);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/EditarMaterial.png"))); // NOI18N
        jTBMaterial.add(jLabel5);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/EliminarMaterial.png"))); // NOI18N
        jTBMaterial.add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Recursos/ListarMaterial.png"))); // NOI18N
        jTBMaterial.add(jLabel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 258, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLIconoAgregarM;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToolBar jTBMaterial;
    // End of variables declaration//GEN-END:variables
}
