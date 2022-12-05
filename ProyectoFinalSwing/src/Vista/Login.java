package Vista;

import Entidades.Usuario;
import Negocio.NegocioLogin;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    String usuarioSesion = null;
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Background = new javax.swing.JPanel();
        txtusuario = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        btlogin = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        NombreEmpresa = new javax.swing.JLabel();
        imgCity = new javax.swing.JLabel();
        imgICON = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtusuario.setText("Identificador");
        Background.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 180, 180, 20));

        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUser.setText("Ingrese su identificador");
        txtUser.setToolTipText("");
        txtUser.setActionCommand("<Not Set>");
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        Background.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 200, -1));

        Password.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setText("Contraseña");
        Background.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 180, 20));

        btlogin.setBackground(new java.awt.Color(255, 255, 255));
        btlogin.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btlogin.setText("Entrar");
        btlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });
        Background.add(btlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 110, 40));

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        Background.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 280, 180));

        NombreEmpresa.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        NombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreEmpresa.setText("Asistence Control");
        NombreEmpresa.setToolTipText("");
        Background.add(NombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 260, 70));

        imgCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city.png"))); // NOI18N
        Background.add(imgCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 470));

        imgICON.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        imgICON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        imgICON.setText("Asistence Control");
        Background.add(imgICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 90));

        IniciarSesion.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        IniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IniciarSesion.setText("INICIAR SESIÓN");
        Background.add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 20));

        txtpass.setForeground(new java.awt.Color(204, 204, 204));
        txtpass.setText("********");
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpassMousePressed(evt);
            }
        });
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        Background.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed
        // TODO add your handling code here:
//        Usuario u = new Usuario();
        NegocioLogin n = new NegocioLogin();

        String usuario = txtUser.getText();
        String pasword = txtpass.getText();

//        u.setIdEmpleado(Integer.parseInt(usuario));
//        u.setPass(Integer.parseInt(pasword));

//        int respuesta = n.validaLoginNeg(u);
        int respuesta = n.validaLoginNeg(usuario, pasword);
        if (respuesta == 1) {
            //System.out.println("ok");
            this.setVisible(false);
            Pos p = new Pos();
            p.setVisible(true);
        }    else if (respuesta == 2) {
            usuarioSesion = usuario;
            this.setVisible(false);
            VistaColaborador VV = new VistaColaborador(usuarioSesion);
            VV.setVisible(true);
        
            //JOptionPane.showMessageDialog(null, "usuario correcto");
        } else {
            //System.out.println("no ok");
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
        }

    }//GEN-LAST:event_btloginActionPerformed

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        // TODO add your handling code here:
        if (txtUser.getText().equals("Ingrese su identificador")) {
            txtUser.setText("");
            txtUser.setForeground(Color.black);
        }
        if (String.valueOf(txtpass.getPassword()).isEmpty()) {
            txtpass.setText("********");
            txtpass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserMousePressed

    private void txtpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMousePressed
        // TODO add your handling code here:
        if (String.valueOf(txtpass.getPassword()).equals("********")) {
            txtpass.setText("");
            txtpass.setForeground(Color.black);
        }
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Ingrese su identificador");
            txtUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtpassMousePressed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JLabel NombreEmpresa;
    private javax.swing.JLabel Password;
    private javax.swing.JButton btlogin;
    private javax.swing.JLabel imgCity;
    private javax.swing.JLabel imgICON;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JLabel txtusuario;
    // End of variables declaration//GEN-END:variables
}
