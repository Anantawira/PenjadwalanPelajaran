package penjadwalanpelajaran.admin;

public class JFrameAdminDataMapel extends javax.swing.JFrame {

    public JFrameAdminDataMapel() {
        initComponents();
        setExtendedState(JFrameAdminDataMapel.MAXIMIZED_BOTH);
        jPanelLihatMapel.setVisible(true);
        jPanelTambahMapel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelTambahMapel = new javax.swing.JLabel();
        jLabelLihatMapel = new javax.swing.JLabel();
        jLabelBackButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelUtama = new javax.swing.JPanel();
        jPanelLihatMapel = new javax.swing.JPanel();
        jPanelTambahMapel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/icondatamapel.png"))); // NOI18N
        jLabel1.setText(" Data Mapel");

        jLabelTambahMapel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabelTambahMapel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTambahMapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTambahMapel.setText("Tambah Mapel");
        jLabelTambahMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTambahMapelMouseClicked(evt);
            }
        });

        jLabelLihatMapel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabelLihatMapel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLihatMapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLihatMapel.setText(" Lihat Mapel");
        jLabelLihatMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLihatMapelMouseClicked(evt);
            }
        });

        jLabelBackButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelBackButton.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBackButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconbackbutton.png"))); // NOI18N
        jLabelBackButton.setText("Kembali");
        jLabelBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTambahMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelLihatMapel, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabelBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabelLihatMapel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTambahMapel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
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

        jPanelLihatMapel.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelLihatMapelLayout = new javax.swing.GroupLayout(jPanelLihatMapel);
        jPanelLihatMapel.setLayout(jPanelLihatMapelLayout);
        jPanelLihatMapelLayout.setHorizontalGroup(
            jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanelLihatMapelLayout.setVerticalGroup(
            jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        jPanelTambahMapel.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanelTambahMapelLayout = new javax.swing.GroupLayout(jPanelTambahMapel);
        jPanelTambahMapel.setLayout(jPanelTambahMapelLayout);
        jPanelTambahMapelLayout.setHorizontalGroup(
            jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanelTambahMapelLayout.setVerticalGroup(
            jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelUtamaLayout = new javax.swing.GroupLayout(jPanelUtama);
        jPanelUtama.setLayout(jPanelUtamaLayout);
        jPanelUtamaLayout.setHorizontalGroup(
            jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTambahMapel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelLihatMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelUtamaLayout.setVerticalGroup(
            jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTambahMapel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelLihatMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jLabelBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackButtonMouseClicked
        this.dispose();
        new JFrameBerandaAdmin().setVisible(true);
    }//GEN-LAST:event_jLabelBackButtonMouseClicked

    private void jLabelLihatMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLihatMapelMouseClicked
        jPanelLihatMapel.setVisible(true);
        jPanelTambahMapel.setVisible(false);
    }//GEN-LAST:event_jLabelLihatMapelMouseClicked

    private void jLabelTambahMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTambahMapelMouseClicked
        jPanelLihatMapel.setVisible(false);
        jPanelTambahMapel.setVisible(true);
    }//GEN-LAST:event_jLabelTambahMapelMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameAdminDataMapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataMapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataMapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataMapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdminDataMapel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBackButton;
    private javax.swing.JLabel jLabelLihatMapel;
    private javax.swing.JLabel jLabelTambahMapel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelLihatMapel;
    private javax.swing.JPanel jPanelTambahMapel;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
