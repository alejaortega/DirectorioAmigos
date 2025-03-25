package autonoma.directoriodeamigos.views;

import autonoma.directoriodeamigos.exceptions.AmigoNoEncontradoException;
import autonoma.directoriodeamigos.exceptions.DatoObligatorioException;
import autonoma.directoriodeamigos.exceptions.TelefonoInvalidoException;
import autonoma.directoriodeamigos.models.Amigo;
import autonoma.directoriodeamigos.models.DirectorioAmigos;
import javax.swing.JOptionPane;

/**
 * @author Luisa Fernanda Henao
 * @since 20250323
 * @version 1.0.0
 */
public class EliminarAmigo extends javax.swing.JDialog {

    private final DirectorioAmigos directorioAmigos;

    public EliminarAmigo(java.awt.Frame parent, boolean modal, DirectorioAmigos directorioAmigos) {
        super(parent, modal);
        this.directorioAmigos = directorioAmigos;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefonoEliminar = new javax.swing.JTextField();
        btnEliminarAmigo = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(83, 102, 107));

        jPanel2.setBackground(new java.awt.Color(32, 164, 159));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("ELIMINAR AMIGO");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Ingresa el telefono del amigo que deseas eliminar");

        txtTelefonoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEliminarActionPerformed(evt);
            }
        });

        btnEliminarAmigo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminarAmigo.setText("Eliminar Amigo");
        btnEliminarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAmigoActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnEliminarAmigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtTelefonoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefonoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEliminarActionPerformed
    // Obtener el teléfono desde el campo de texto
   String telefono = txtTelefonoEliminar.getText().trim();
    // Verificar si el teléfono está vacío
    if (telefono.isEmpty()) {
       JOptionPane.showMessageDialog(this, "Por favor ingresa un número de teléfono.", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
        return;
    }
    try {
    // Llamar al método eliminarAmigo usando el teléfono proporcionado
    directorioAmigos.eliminarAmigo(telefono); 
    // Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Amigo eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    // Limpiar el campo después de eliminar con éxito
   txtTelefonoEliminar.setText(""); 
   } catch (AmigoNoEncontradoException e) {
     // Mostrar mensaje si no se encuentra el amigo con el teléfono proporcionado
     JOptionPane.showMessageDialog(this, "No se encontró un amigo con ese teléfono.", "Error", JOptionPane.ERROR_MESSAGE);
        }                             
    }//GEN-LAST:event_txtTelefonoEliminarActionPerformed

    private void btnEliminarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAmigoActionPerformed
        try {
        String telefono = txtTelefonoEliminar.getText().trim();
        
        if (telefono.isEmpty()) {
            throw new DatoObligatorioException();
        }
        
        // Depuración mejorada
        System.out.println("=== Depuración: Lista completa de amigos ===");
        for (Amigo a : directorioAmigos.getListaAmigos()) {
            System.out.println("Nombre: " + a.getNombre() + 
                             " | Teléfono: " + a.getTelefono() + 
                             " | Correo: " + a.getCorreoElectronico());
        }
        
        // Validación adicional del formato del teléfono
        if (!telefono.startsWith("30") && !telefono.startsWith("606")) {
            throw new TelefonoInvalidoException();
        }
        
        directorioAmigos.eliminarAmigo(telefono);
        
        JOptionPane.showMessageDialog(this, 
            "Amigo con teléfono " + telefono + " eliminado correctamente.", 
            "Éxito", 
            JOptionPane.INFORMATION_MESSAGE);
            
        this.dispose();
        
    } catch (DatoObligatorioException e) {
        JOptionPane.showMessageDialog(this, 
            "Error: Debes ingresar un número de teléfono.", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    } catch (TelefonoInvalidoException e) {
        JOptionPane.showMessageDialog(this, 
            "Error: El teléfono debe comenzar con '30' o '606'.", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    } catch (AmigoNoEncontradoException e) {
        JOptionPane.showMessageDialog(this, 
            "Error: No existe un amigo con el teléfono: " + txtTelefonoEliminar.getText().trim(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnEliminarAmigoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarAmigo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtTelefonoEliminar;
    // End of variables declaration//GEN-END:variables
}
