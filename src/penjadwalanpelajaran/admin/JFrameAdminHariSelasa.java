package penjadwalanpelajaran.admin;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import penjadwalanpelajaran.admin.Config;
import penjadwalanpelajaran.hari.*;

public class JFrameAdminHariSelasa extends javax.swing.JFrame {
    
    String selectedId;

    public JFrameAdminHariSelasa() {
        initComponents();
        setExtendedState(JFrameAdminHariSelasa.MAXIMIZED_BOTH);
        LoadTable();

        jTableAdminHariSelasa.getTableHeader().setFont(new Font("SEGOE UI", Font.BOLD, 12));
        jTableAdminHariSelasa.getTableHeader().setOpaque(false);
        jTableAdminHariSelasa.getTableHeader().setForeground(Color.BLACK);
        jTableAdminHariSelasa.setRowHeight(25);
    }

    private void LoadTable() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Guru Pengajar");
        model.addColumn("Sesi");
        model.addColumn("Kelas");
        model.addColumn("Mata Pelajaran");
        model.addColumn("Ruang");
        model.addColumn("Kode Guru");

        //menampilkan data database kedalam tabel
        try {
            //int no = 1;
            String sql = "SELECT * FROM tb_jadwal_mapel WHERE " + " hari LIKE '%" + "Selasa" + "%' ORDER BY nama_guru ASC ";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString(1),
                    res.getString(6),
                    res.getString(4),
                    res.getString(3),
                    res.getString(7),
                    res.getString(8),
                    res.getString(5)
                });
            }
            jTableAdminHariSelasa.setModel(model);
        } catch (Exception e) {
        }
    }

    public void RefreshCari() {
        Txt_Cari.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelBtnBack = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Txt_Cari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Btn_Cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdminHariSelasa = new javax.swing.JTable();
        Btn_Print = new javax.swing.JButton();
        Btn_Refresh_Cari = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jadwal Pelajaran Hari Selasa");

        jLabelBtnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconbackbutton.png"))); // NOI18N
        jLabelBtnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBtnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guru / Kelas");

        Btn_Cari.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Btn_Cari.setText("Cari");
        Btn_Cari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CariActionPerformed(evt);
            }
        });

        jTableAdminHariSelasa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableAdminHariSelasa.setShowVerticalLines(false);
        jTableAdminHariSelasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAdminHariSelasaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAdminHariSelasa);

        Btn_Print.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Btn_Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconprinter.png"))); // NOI18N
        Btn_Print.setText("Print");
        Btn_Print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PrintActionPerformed(evt);
            }
        });

        Btn_Refresh_Cari.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Btn_Refresh_Cari.setText("Refresh");
        Btn_Refresh_Cari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Refresh_Cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Refresh_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Refresh_CariActionPerformed(evt);
            }
        });

        Btn_Hapus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Btn_Hapus.setText("Hapus");
        Btn_Hapus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Refresh_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Print)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Refresh_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

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

    private void Btn_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CariActionPerformed
        try {
            Statement stat = (Statement) Config.configDB().createStatement();
            ResultSet res = stat.executeQuery("SELECT * FROM tb_jadwal_mapel WHERE " + " nama_guru LIKE '%" + Txt_Cari.getText() + "%' AND " + " hari LIKE '%" + "Selasa" + "%' OR " + " kelas LIKE '%" + Txt_Cari.getText() + "%' AND " + " hari LIKE '%" + "Selasa" + "%' ORDER BY nama_guru ASC ");
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Guru Pengajar");
            model.addColumn("Sesi");
            model.addColumn("Kelas");
            model.addColumn("Mata Pelajaran");
            model.addColumn("Ruang");
            model.addColumn("Kode Guru");

            jTableAdminHariSelasa.setModel(model);
            //int no = 1;
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString(1),
                    res.getString(6),
                    res.getString(4),
                    res.getString(3),
                    res.getString(7),
                    res.getString(8),
                    res.getString(5)
                });
                jTableAdminHariSelasa.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_Btn_CariActionPerformed

    private void jLabelBtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnBackMouseClicked
        this.dispose();
        new JFrameLihatMapel().setVisible(true);
    }//GEN-LAST:event_jLabelBtnBackMouseClicked

    private void Btn_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_PrintActionPerformed

    private void Btn_Refresh_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Refresh_CariActionPerformed
        LoadTable();
        RefreshCari();
    }//GEN-LAST:event_Btn_Refresh_CariActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Menghapus Data ini??", "Comfirmation", JOptionPane.YES_NO_OPTION);
        if (ok == 0)
        try {
            String sql = "DELETE FROM tb_jadwal_mapel WHERE id_jadwal_mapel = '" + selectedId + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
        LoadTable();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void jTableAdminHariSelasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAdminHariSelasaMouseClicked
        int baris = jTableAdminHariSelasa.rowAtPoint(evt.getPoint());
        selectedId = jTableAdminHariSelasa.getValueAt(baris, 0).toString();
    }//GEN-LAST:event_jTableAdminHariSelasaMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminHariSelasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminHariSelasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminHariSelasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminHariSelasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdminHariSelasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cari;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Print;
    private javax.swing.JButton Btn_Refresh_Cari;
    private javax.swing.JTextField Txt_Cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBtnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAdminHariSelasa;
    // End of variables declaration//GEN-END:variables
}
