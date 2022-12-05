package Vista;

public class Pos extends javax.swing.JFrame {
    
    public Pos() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Backgound = new javax.swing.JPanel();
        background2 = new javax.swing.JLabel();
        MenuAdmin = new javax.swing.JLabel();
        txtOperaciones = new javax.swing.JLabel();
        bModificar = new javax.swing.JButton();
        bNewTrabajador = new javax.swing.JButton();
        bGenerarInforme = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backgound.setBackground(new java.awt.Color(255, 255, 255));
        Backgound.setPreferredSize(new java.awt.Dimension(810, 500));

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city.png"))); // NOI18N

        MenuAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        MenuAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuAdmin.setText("Bienvenido Administrador");

        txtOperaciones.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtOperaciones.setText("Operaciones Administrativas");

        bModificar.setBackground(new java.awt.Color(255, 255, 255));
        bModificar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bModificar.setText("Modificar Asistencia");
        bModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bNewTrabajador.setBackground(new java.awt.Color(255, 255, 255));
        bNewTrabajador.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bNewTrabajador.setText("Nuevo Trabajador");
        bNewTrabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bNewTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewTrabajadorActionPerformed(evt);
            }
        });

        bGenerarInforme.setBackground(new java.awt.Color(255, 255, 255));
        bGenerarInforme.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bGenerarInforme.setForeground(new java.awt.Color(255, 0, 102));
        bGenerarInforme.setText("Generar Informe*(pendiente)");
        bGenerarInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bGenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGenerarInformeActionPerformed(evt);
            }
        });

        bSalir.setBackground(new java.awt.Color(255, 255, 255));
        bSalir.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bSalir.setText("Cerrar Sesion");
        bSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgoundLayout = new javax.swing.GroupLayout(Backgound);
        Backgound.setLayout(BackgoundLayout);
        BackgoundLayout.setHorizontalGroup(
            BackgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgoundLayout.createSequentialGroup()
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgoundLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(txtOperaciones))
                    .addGroup(BackgoundLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(BackgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(bNewTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(BackgoundLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(BackgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bGenerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        BackgoundLayout.setVerticalGroup(
            BackgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgoundLayout.createSequentialGroup()
                .addComponent(MenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOperaciones)
                .addGap(18, 18, 18)
                .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bNewTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bGenerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login L = new Login();
        L.setVisible(true);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bGenerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGenerarInformeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bGenerarInformeActionPerformed

    private void bNewTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewTrabajadorActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        NuevoTrabajador N = new NuevoTrabajador();
        N.setVisible(true);
    }//GEN-LAST:event_bNewTrabajadorActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ModificarAsistencia M = new ModificarAsistencia();
        M.setVisible(true);
    }//GEN-LAST:event_bModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgound;
    private javax.swing.JLabel MenuAdmin;
    private javax.swing.JButton bGenerarInforme;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bNewTrabajador;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel background2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel txtOperaciones;
    // End of variables declaration//GEN-END:variables
}
