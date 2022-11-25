package Vista;

import javax.swing.JOptionPane;
//import Entidades.Formulario;
//import Negocio.NegocioFormulario;
import Entidades.Empleados;
import Entidades.Cargos;
import Negocio.NegocioFormulario;



/**
 *
 * @author victortrimpai
 */
public class NuevoTrabajador extends javax.swing.JFrame {

    /**
     * Creates new form NuevoTrabajador
     */
    public NuevoTrabajador() {
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

        background = new javax.swing.JPanel();
        background2 = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();
        nuevoColabolador = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        identificador = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        comuna = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIdentificador = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        bGuardar = new javax.swing.JButton();
        obli1 = new javax.swing.JLabel();
        obli2 = new javax.swing.JLabel();
        obli3 = new javax.swing.JLabel();
        obli4 = new javax.swing.JLabel();
        obli5 = new javax.swing.JLabel();
        obli6 = new javax.swing.JLabel();
        obli7 = new javax.swing.JLabel();
        obli8 = new javax.swing.JLabel();
        boxCargo = new javax.swing.JComboBox<>();
        boxComuna = new javax.swing.JComboBox<>();
        bListar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bConfirmar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jPanelDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        background.setBackground(new java.awt.Color(255, 255, 255));

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city.png"))); // NOI18N

        bVolver.setBackground(new java.awt.Color(255, 255, 255));
        bVolver.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bVolver.setText("Volver");
        bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        nuevoColabolador.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        nuevoColabolador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nuevoColabolador.setText("Datos Colaborador");
        nuevoColabolador.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        nombre.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        nombre.setText("Nombre Completo:");

        identificador.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        identificador.setText("Identificador:");

        edad.setText("Edad:");

        direccion.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        direccion.setText("Direccion:");

        comuna.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        comuna.setText("Comuna:");

        email.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        email.setText("Email:");

        telefono.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        telefono.setText("Telefono:");

        cargo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        cargo.setText("Cargo:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificadorKeyTyped(evt);
            }
        });

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        bGuardar.setBackground(new java.awt.Color(231, 249, 255));
        bGuardar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        obli1.setForeground(new java.awt.Color(255, 51, 51));
        obli1.setText("*");

        obli2.setForeground(new java.awt.Color(255, 51, 51));
        obli2.setText("*");

        obli3.setForeground(new java.awt.Color(255, 51, 51));
        obli3.setText("*");

        obli4.setForeground(new java.awt.Color(255, 51, 51));
        obli4.setText("*");

        obli5.setForeground(new java.awt.Color(255, 51, 51));
        obli5.setText("*");

        obli6.setForeground(new java.awt.Color(255, 51, 51));
        obli6.setText("*");

        obli7.setForeground(new java.awt.Color(255, 51, 51));
        obli7.setText("*");

        obli8.setForeground(new java.awt.Color(255, 51, 51));
        obli8.setText("*");

        boxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colabolador", "Supervisor" }));
        boxCargo.setSelectedIndex(-1);
        boxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCargoActionPerformed(evt);
            }
        });

        boxComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cerrillos", "Cerro Navia", "Conchalí", "El Bosque", "Estación Central", "Huechuraba", "Independencia", "La Cisterna", "La Florida", "La Granja", "La Pintana", "La Reina", "Las Condes", "Lo Barnechea", "Lo Espejo", "Lo Prado", "Macul", "Maipú", "Ñuñoa", "Padre Hurtado", "Pedro Aguirre Cerda", "Peñalolén", "Pirque", "Providencia", "Pudahuel", "Puente Alto", "Quilicura", "Quinta Normal", "Recoleta", "Renca", "San Bernardo", "San Joaquín", "San José de Maipo", "San Miguel", "San Ramón", "Santiago" }));
        boxComuna.setSelectedIndex(-1);

        bListar.setBackground(new java.awt.Color(231, 249, 255));
        bListar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bListar.setText("Listar");
        bListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarActionPerformed(evt);
            }
        });

        bEditar.setBackground(new java.awt.Color(231, 249, 255));
        bEditar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bEditar.setText("Editar");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bConfirmar.setBackground(new java.awt.Color(231, 249, 255));
        bConfirmar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bConfirmar.setText("Confirmar");
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        bEliminar.setBackground(new java.awt.Color(231, 249, 255));
        bEliminar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        jPanelDatos.setBackground(new java.awt.Color(245, 255, 255));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Id", "Edad", "Direccion", "Comuna", "Email", "Telefono", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(nombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(obli1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(identificador)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(obli2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bListar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(edad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(obli3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nuevoColabolador, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(email)
                                            .addComponent(comuna))
                                        .addGap(65, 65, 65)
                                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(boxComuna, 0, 263, Short.MAX_VALUE)
                                            .addComponent(txtEmail))
                                        .addGap(18, 18, 18)
                                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(obli5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(obli6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cargo)
                                    .addComponent(telefono))
                                .addGap(62, 62, 62)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boxCargo, 0, 263, Short.MAX_VALUE)
                                    .addComponent(txtTelefono))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(obli7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(obli8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(direccion)
                                .addGap(59, 59, 59)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(obli4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(nuevoColabolador, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombre)
                                .addComponent(obli1))
                            .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(obli2)
                            .addComponent(bListar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(identificador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bEditar)
                                .addComponent(bConfirmar)
                                .addComponent(obli3))
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edad)))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(obli4)
                                .addComponent(bEliminar))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(direccion)))
                        .addGap(6, 6, 6)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(obli5)
                                .addComponent(boxComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(comuna)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(obli6)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(email)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(obli7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(obli8)
                            .addComponent(boxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bVolver)
                            .addComponent(cargo))
                        .addGap(18, 18, 18)
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(background2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Pos P = new Pos();
        P.setVisible(true);
    }//GEN-LAST:event_bVolverActionPerformed

    private void boxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCargoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_boxCargoActionPerformed

    private void bListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bListarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEditarActionPerformed

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bConfirmarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEliminarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // nombre maximo 30 caracteres
        if (txtNombre.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        // Aqui va el boton GUARDAR
        if (txtNombre.getText().isEmpty() || txtEmail.getText().isEmpty()  || txtDireccion.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Por favor complete el formulario");
        }else   {
        
        
        String Nombre = txtNombre.getText();
        String Email = txtEmail.getText();
        String Direccion = txtDireccion.getText();
        
        

        int Identificador = 0;
        try {
            Identificador = Integer.parseInt(txtIdentificador.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de Ingreso: Ingrese RUT sin puntos ni guión y con dígito verificador (ejemplo: 178324138).");
        }

        int Edad = 0;
        try {
            Edad = Integer.parseInt(txtEdad.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de Ingreso: Favor Ingrese edad");
        }

        int Telefono = 0;
        try {
            Telefono = Integer.parseInt(txtTelefono.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de Ingreso: Debes ingresar únicamente los 8 o 9 dígitos del número telefonico.");
        }

        String Comuna = (String) boxComuna.getSelectedItem();
        String Cargo = (String) boxCargo.getSelectedItem();

        Empleados e = new Empleados();
        Cargos c = new Cargos();
        
        e.setNombre(Nombre);
        e.setIdEmpleado(Identificador);
        e.setEdad(Edad);
        e.setEmail(Email);
        e.setNumeroTelefonico(Telefono);
        e.setDireccion(Direccion);
        e.setComuna(Comuna);
        c.setNombreCargo(Cargo);
    
        NegocioFormulario nf = new NegocioFormulario();
        boolean respuesta = nf.InsertarDatosFormulario(e);
        boolean respuesta2 = nf.InsertarDatosFormulario(c);
        
//        Formulario f = new Formulario();
//         f.setNombre(Nombre);
//         f.setIdentificador(Identificador);
//         f.setEdad(Edad);
//         f.setEmail(Email);
//         f.setTelefono(Telefono);
//         f.setDireccion(Direccion);
//         f.setComuna(Comuna);
//         f.setCargo(Cargo);
//         
//         NegocioFormulario nf = new NegocioFormulario();
//         int respuesta = nf.InsertarDatosFormulario(f);
 
         
        }
        
    }//GEN-LAST:event_bGuardarActionPerformed

    private void txtIdentificadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorKeyTyped
        // rut maximo 9 numeros
        if (txtIdentificador.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificadorKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // limite de edad;
        if (txtEdad.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // limite de caracteres direccion;
        if (txtDireccion.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // limite de caracteres de email;
        if (txtEmail.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // limite de 8numeros
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
        }

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here: El jefe me mando esto
        
        
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(NuevoTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton bConfirmar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bListar;
    private javax.swing.JButton bVolver;
    private javax.swing.JPanel background;
    private javax.swing.JLabel background2;
    private javax.swing.JComboBox<String> boxCargo;
    private javax.swing.JComboBox<String> boxComuna;
    private javax.swing.JLabel cargo;
    private javax.swing.JLabel comuna;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel email;
    private javax.swing.JLabel identificador;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nuevoColabolador;
    private javax.swing.JLabel obli1;
    private javax.swing.JLabel obli2;
    private javax.swing.JLabel obli3;
    private javax.swing.JLabel obli4;
    private javax.swing.JLabel obli5;
    private javax.swing.JLabel obli6;
    private javax.swing.JLabel obli7;
    private javax.swing.JLabel obli8;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
