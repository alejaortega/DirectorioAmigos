
package autonoma.directoriodeamigos.views;
import autonoma.directoriodeamigos.models.DirectorioAmigos;
import java.awt.Color;
import javax.swing.JPanel;

/**
 * @author Gilary
 * @since 20250322
 * @version 1.0
 */
public class PgPrincipal extends javax.swing.JFrame {

    private DirectorioAmigos directorioAmigos;

    public PgPrincipal() {
        initComponents();
        this.directorioAmigos = new DirectorioAmigos();
          this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Informacion = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AgregarAmigo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BuscarAmigo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EliminarAmigo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MostrarAmigos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(83, 102, 107));

        jPanel2.setBackground(new java.awt.Color(32, 164, 159));

        Informacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InformacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InformacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InformacionMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directoriodeamigos/images/Informacion.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setText("Información acerca de la App");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        javax.swing.GroupLayout InformacionLayout = new javax.swing.GroupLayout(Informacion);
        Informacion.setLayout(InformacionLayout);
        InformacionLayout.setHorizontalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel13)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformacionLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformacionLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(89, 89, 89))))
        );
        InformacionLayout.setVerticalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("CONEXIÓNAMIGA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        AgregarAmigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 164, 159), 10));
        AgregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarAmigoMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directoriodeamigos/images/AñadirAmigo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("Agregar Amigo");

        javax.swing.GroupLayout AgregarAmigoLayout = new javax.swing.GroupLayout(AgregarAmigo);
        AgregarAmigo.setLayout(AgregarAmigoLayout);
        AgregarAmigoLayout.setHorizontalGroup(
            AgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarAmigoLayout.createSequentialGroup()
                .addGroup(AgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarAmigoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2))
                    .addGroup(AgregarAmigoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        AgregarAmigoLayout.setVerticalGroup(
            AgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addGroup(AgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BuscarAmigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 164, 159), 10));
        BuscarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarAmigoMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directoriodeamigos/images/BuscarAmigo.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setText("Buscar Amigo");

        javax.swing.GroupLayout BuscarAmigoLayout = new javax.swing.GroupLayout(BuscarAmigo);
        BuscarAmigo.setLayout(BuscarAmigoLayout);
        BuscarAmigoLayout.setHorizontalGroup(
            BuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarAmigoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(BuscarAmigoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)))
                .addGap(15, 15, 15))
        );
        BuscarAmigoLayout.setVerticalGroup(
            BuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(14, 14, 14))
        );

        EliminarAmigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 164, 159), 10));
        EliminarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarAmigoMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directoriodeamigos/images/EliminarAmigo.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("Eliminar Amigo");

        javax.swing.GroupLayout EliminarAmigoLayout = new javax.swing.GroupLayout(EliminarAmigo);
        EliminarAmigo.setLayout(EliminarAmigoLayout);
        EliminarAmigoLayout.setHorizontalGroup(
            EliminarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarAmigoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(EliminarAmigoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EliminarAmigoLayout.setVerticalGroup(
            EliminarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        MostrarAmigos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 164, 159), 10));
        MostrarAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarAmigosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MostrarAmigosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MostrarAmigosMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directoriodeamigos/images/MostrarAmigo.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setText("Mostrar Amigos");

        javax.swing.GroupLayout MostrarAmigosLayout = new javax.swing.GroupLayout(MostrarAmigos);
        MostrarAmigos.setLayout(MostrarAmigosLayout);
        MostrarAmigosLayout.setHorizontalGroup(
            MostrarAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostrarAmigosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MostrarAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarAmigosLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarAmigosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29))))
        );
        MostrarAmigosLayout.setVerticalGroup(
            MostrarAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostrarAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AgregarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MostrarAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BuscarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AgregarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EliminarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MostrarAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        MostrarAmigos.getAccessibleContext().setAccessibleParent(MostrarAmigos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarAmigosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarAmigosMouseExited
    this.mouseExited(MostrarAmigos);
    }//GEN-LAST:event_MostrarAmigosMouseExited

    private void MostrarAmigosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarAmigosMouseEntered
    this.mouseEntered(MostrarAmigos);
    }//GEN-LAST:event_MostrarAmigosMouseEntered

    private void EliminarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarAmigoMouseExited
    this.mouseExited(EliminarAmigo);    
    }//GEN-LAST:event_EliminarAmigoMouseExited

    private void EliminarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarAmigoMouseEntered
    this.mouseEntered(EliminarAmigo);
    }//GEN-LAST:event_EliminarAmigoMouseEntered

    private void EliminarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarAmigoMouseClicked
        EliminarAmigo eliminarAmigoVentana = new EliminarAmigo(this, true, directorioAmigos);
        eliminarAmigoVentana.setVisible(true);
    }//GEN-LAST:event_EliminarAmigoMouseClicked

    private void BuscarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarAmigoMouseExited
    this.mouseExited(BuscarAmigo);
    }//GEN-LAST:event_BuscarAmigoMouseExited

    private void BuscarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarAmigoMouseEntered
    this.mouseEntered(BuscarAmigo);
    }//GEN-LAST:event_BuscarAmigoMouseEntered

    private void BuscarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarAmigoMouseClicked
        BuscarAmigo buscar = new BuscarAmigo(this, true, directorioAmigos);
        buscar.setVisible(true);
    }//GEN-LAST:event_BuscarAmigoMouseClicked

    private void AgregarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarAmigoMouseExited
    this.mouseExited(AgregarAmigo);
    }//GEN-LAST:event_AgregarAmigoMouseExited

    private void AgregarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarAmigoMouseEntered
     this.mouseEntered(AgregarAmigo);
    }//GEN-LAST:event_AgregarAmigoMouseEntered

    private void AgregarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarAmigoMouseClicked
    AgregarAmigo agregarAmigo = new AgregarAmigo (this, true, this.directorioAmigos);
    agregarAmigo.setVisible(true);
    }//GEN-LAST:event_AgregarAmigoMouseClicked

    private void InformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformacionMouseExited
    this.mouseExited(Informacion);
    }//GEN-LAST:event_InformacionMouseExited

    private void InformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformacionMouseEntered
    this.mouseEntered(Informacion);
    }//GEN-LAST:event_InformacionMouseEntered

    private void InformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformacionMouseClicked
        Informacion info = new Informacion (this, true);
        info.setVisible(true);
    }//GEN-LAST:event_InformacionMouseClicked

    private void MostrarAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarAmigosMouseClicked
    MostrarAmigo mostrar = new MostrarAmigo (this, true, this.directorioAmigos);
    mostrar.setVisible(true);
    }//GEN-LAST:event_MostrarAmigosMouseClicked

    private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(110, 233, 228));
        
    }
    private void mouseExited(JPanel panel){
        panel.setBackground(new Color(242,242,242));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarAmigo;
    private javax.swing.JPanel BuscarAmigo;
    private javax.swing.JPanel EliminarAmigo;
    private javax.swing.JPanel Informacion;
    private javax.swing.JPanel MostrarAmigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
