package penjadwalanpelajaran.admin;

import java.awt.Color;

public class JFrameAdminDataGuru extends javax.swing.JFrame {

    public JFrameAdminDataGuru() {
        initComponents();
        setExtendedState(JFrameAdminDataGuru.MAXIMIZED_BOTH);
        jPanelLihatGuru.setVisible(true);
        jPanelTambahGuru.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelBarLihatGuru = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelBarTambahGuru = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelBarKembali = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelUtama = new javax.swing.JPanel();
        jPanelLihatGuru = new javax.swing.JPanel();
        jPanelTambahGuru = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/icondataguru.png"))); // NOI18N
        jLabel1.setText(" Data Guru");

        jPanelBarLihatGuru.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarLihatGuru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBarLihatGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarLihatGuruMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelBarLihatGuruMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBarLihatGuruMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBarLihatGuruMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBarLihatGuruMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lihat Guru");

        javax.swing.GroupLayout jPanelBarLihatGuruLayout = new javax.swing.GroupLayout(jPanelBarLihatGuru);
        jPanelBarLihatGuru.setLayout(jPanelBarLihatGuruLayout);
        jPanelBarLihatGuruLayout.setHorizontalGroup(
            jPanelBarLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBarLihatGuruLayout.setVerticalGroup(
            jPanelBarLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanelBarTambahGuru.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarTambahGuru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBarTambahGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarTambahGuruMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelBarTambahGuruMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBarTambahGuruMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBarTambahGuruMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBarTambahGuruMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tambah Guru");

        javax.swing.GroupLayout jPanelBarTambahGuruLayout = new javax.swing.GroupLayout(jPanelBarTambahGuru);
        jPanelBarTambahGuru.setLayout(jPanelBarTambahGuruLayout);
        jPanelBarTambahGuruLayout.setHorizontalGroup(
            jPanelBarTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanelBarTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBarTambahGuruLayout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelBarTambahGuruLayout.setVerticalGroup(
            jPanelBarTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanelBarTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBarTambahGuruLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanelBarKembali.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBarKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarKembaliMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelBarKembaliMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBarKembaliMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBarKembaliMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBarKembaliMouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconbackbutton.png"))); // NOI18N
        jLabel6.setText("Kembali");

        javax.swing.GroupLayout jPanelBarKembaliLayout = new javax.swing.GroupLayout(jPanelBarKembali);
        jPanelBarKembali.setLayout(jPanelBarKembaliLayout);
        jPanelBarKembaliLayout.setHorizontalGroup(
            jPanelBarKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanelBarKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
        );
        jPanelBarKembaliLayout.setVerticalGroup(
            jPanelBarKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanelBarKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBarKembaliLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelBarKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanelBarLihatGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(jPanelBarTambahGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanelBarLihatGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBarTambahGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBarKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 768));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/logojadwal.png"))); // NOI18N
        jLabel2.setText("SISTEM PENJADWALAN PELAJARAN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 36, -1, -1));

        jPanelUtama.setBackground(new java.awt.Color(255, 255, 255));

        jPanelLihatGuru.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelLihatGuruLayout = new javax.swing.GroupLayout(jPanelLihatGuru);
        jPanelLihatGuru.setLayout(jPanelLihatGuruLayout);
        jPanelLihatGuruLayout.setHorizontalGroup(
            jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        jPanelLihatGuruLayout.setVerticalGroup(
            jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        jPanelTambahGuru.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanelTambahGuruLayout = new javax.swing.GroupLayout(jPanelTambahGuru);
        jPanelTambahGuru.setLayout(jPanelTambahGuruLayout);
        jPanelTambahGuruLayout.setHorizontalGroup(
            jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        jPanelTambahGuruLayout.setVerticalGroup(
            jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelUtamaLayout = new javax.swing.GroupLayout(jPanelUtama);
        jPanelUtama.setLayout(jPanelUtamaLayout);
        jPanelUtamaLayout.setHorizontalGroup(
            jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaLayout.createSequentialGroup()
                .addComponent(jPanelTambahGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaLayout.createSequentialGroup()
                    .addComponent(jPanelLihatGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        jPanelUtamaLayout.setVerticalGroup(
            jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTambahGuru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelLihatGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelUtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 174, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelBarLihatGuruMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatGuruMouseEntered
        jPanelBarLihatGuru.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarLihatGuruMouseEntered

    private void jPanelBarLihatGuruMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatGuruMouseExited
        jPanelBarLihatGuru.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelBarLihatGuruMouseExited

    private void jPanelBarLihatGuruMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatGuruMousePressed
        jPanelBarLihatGuru.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelBarLihatGuruMousePressed

    private void jPanelBarLihatGuruMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatGuruMouseReleased
        jPanelBarLihatGuru.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarLihatGuruMouseReleased

    private void jPanelBarLihatGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatGuruMouseClicked
        jPanelLihatGuru.setVisible(true);
        jPanelTambahGuru.setVisible(false);
    }//GEN-LAST:event_jPanelBarLihatGuruMouseClicked

    private void jPanelBarTambahGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahGuruMouseClicked
        jPanelLihatGuru.setVisible(false);
        jPanelTambahGuru.setVisible(true);
    }//GEN-LAST:event_jPanelBarTambahGuruMouseClicked

    private void jPanelBarTambahGuruMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahGuruMouseEntered
        jPanelBarTambahGuru.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarTambahGuruMouseEntered

    private void jPanelBarTambahGuruMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahGuruMouseExited
        jPanelBarTambahGuru.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelBarTambahGuruMouseExited

    private void jPanelBarTambahGuruMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahGuruMousePressed
        jPanelBarTambahGuru.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelBarTambahGuruMousePressed

    private void jPanelBarTambahGuruMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahGuruMouseReleased
        jPanelBarTambahGuru.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarTambahGuruMouseReleased

    private void jPanelBarKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarKembaliMouseClicked
        this.dispose();
            new JFrameBerandaAdmin().setVisible(true);
    }//GEN-LAST:event_jPanelBarKembaliMouseClicked

    private void jPanelBarKembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarKembaliMouseEntered
        jPanelBarKembali.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarKembaliMouseEntered

    private void jPanelBarKembaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarKembaliMouseExited
        jPanelBarKembali.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelBarKembaliMouseExited

    private void jPanelBarKembaliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarKembaliMousePressed
        jPanelBarKembali.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelBarKembaliMousePressed

    private void jPanelBarKembaliMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarKembaliMouseReleased
        jPanelBarKembali.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarKembaliMouseReleased

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
            java.util.logging.Logger.getLogger(JFrameAdminDataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdminDataGuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBarKembali;
    private javax.swing.JPanel jPanelBarLihatGuru;
    private javax.swing.JPanel jPanelBarTambahGuru;
    private javax.swing.JPanel jPanelLihatGuru;
    private javax.swing.JPanel jPanelTambahGuru;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
