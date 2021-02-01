package penjadwalanpelajaran.admin;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import penjadwalanpelajaran.Koneksi;

public class JFrameAdminDataKelas extends javax.swing.JFrame {

    //deklarasi
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    public JFrameAdminDataKelas() {
        initComponents();
        setExtendedState(JFrameAdminDataKelas.MAXIMIZED_BOTH);
        jPanelLihatKelas.setVisible(true);
        jPanelTambahKelas.setVisible(false);
        LoadTable();
        
        Tbl_Admin_Data_Kelas.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 12));
        Tbl_Admin_Data_Kelas.getTableHeader().setOpaque(false);
        Tbl_Admin_Data_Kelas.getTableHeader().setForeground(Color.BLACK);
        Tbl_Admin_Data_Kelas.setRowHeight(25);
        
    }
    
    private void LoadTable(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Ruang Kelas");
        model.addColumn("Jurusan / Kelas");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "SELECT * FROM tb_kelas";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
                while(res.next()){
                    model.addRow(new Object[]{no++,
                                            res.getString(2),
                                            res.getString(3) });
                }
                Tbl_Admin_Data_Kelas.setModel(model);
            } catch (Exception e) {
        }
    }
    
    private void ResetDataTambah () {
        Txt_Tambah_Ruang_Kelas.setText(null);
        Txt_Tambah_Jurusan.setText(null);
        
    }
    
    private void ResetDataLihat () {
        Txt_Lihat_Ruang_Kelas.setText(null);
        Txt_Lihat_Jurusan.setText(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelBarLihatKelas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelBarTambahKelas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelBarKembali = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelUtama = new javax.swing.JPanel();
        jPanelLihatKelas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Cari_Ruang = new javax.swing.JTextField();
        Btn_Cari_Ruang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Admin_Data_Kelas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_Lihat_Ruang_Kelas = new javax.swing.JTextField();
        Txt_Lihat_Jurusan = new javax.swing.JTextField();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Edit = new javax.swing.JButton();
        Btn_Refresh = new javax.swing.JButton();
        jPanelTambahKelas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Txt_Tambah_Ruang_Kelas = new javax.swing.JTextField();
        Txt_Tambah_Jurusan = new javax.swing.JTextField();
        Btn_Reset = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/icondatakelas.png"))); // NOI18N
        jLabel1.setText(" Data Kelas");

        jPanelBarLihatKelas.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarLihatKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBarLihatKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarLihatKelasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelBarLihatKelasMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBarLihatKelasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBarLihatKelasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBarLihatKelasMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lihat Kelas");

        javax.swing.GroupLayout jPanelBarLihatKelasLayout = new javax.swing.GroupLayout(jPanelBarLihatKelas);
        jPanelBarLihatKelas.setLayout(jPanelBarLihatKelasLayout);
        jPanelBarLihatKelasLayout.setHorizontalGroup(
            jPanelBarLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBarLihatKelasLayout.setVerticalGroup(
            jPanelBarLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanelBarTambahKelas.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarTambahKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBarTambahKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarTambahKelasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelBarTambahKelasMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBarTambahKelasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBarTambahKelasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBarTambahKelasMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tambah Kelas");

        javax.swing.GroupLayout jPanelBarTambahKelasLayout = new javax.swing.GroupLayout(jPanelBarTambahKelas);
        jPanelBarTambahKelas.setLayout(jPanelBarTambahKelasLayout);
        jPanelBarTambahKelasLayout.setHorizontalGroup(
            jPanelBarTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanelBarTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBarTambahKelasLayout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelBarTambahKelasLayout.setVerticalGroup(
            jPanelBarTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanelBarTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBarTambahKelasLayout.createSequentialGroup()
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
                            .addComponent(jPanelBarLihatKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jPanelBarTambahKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanelBarLihatKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBarTambahKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanelLihatKelas.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel5.setText("Cari Ruang");

        Btn_Cari_Ruang.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Cari_Ruang.setText("Cari");

        Tbl_Admin_Data_Kelas.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl_Admin_Data_Kelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_Admin_Data_KelasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Admin_Data_Kelas);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel7.setText("Ruang Kelas");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel8.setText("Jurusan");

        Btn_Hapus.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });

        Btn_Edit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Edit.setText("Edit");
        Btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditActionPerformed(evt);
            }
        });

        Btn_Refresh.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Refresh.setText("Refresh");
        Btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLihatKelasLayout = new javax.swing.GroupLayout(jPanelLihatKelas);
        jPanelLihatKelas.setLayout(jPanelLihatKelasLayout);
        jPanelLihatKelasLayout.setHorizontalGroup(
            jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                .addGroup(jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addComponent(Txt_Cari_Ruang, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Cari_Ruang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Refresh))
                    .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txt_Lihat_Ruang_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(Txt_Lihat_Jurusan))))
                            .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(Btn_Hapus)
                                .addGap(36, 36, 36)
                                .addComponent(Btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelLihatKelasLayout.setVerticalGroup(
            jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Cari_Ruang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Cari_Ruang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                        .addGroup(jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(Txt_Lihat_Ruang_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLihatKelasLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Lihat_Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanelLihatKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanelTambahKelas.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Nama Ruang Kelas");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("Jurusan / Kelas");

        Btn_Reset.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Reset.setText("Reset");
        Btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResetActionPerformed(evt);
            }
        });

        Btn_Simpan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTambahKelasLayout = new javax.swing.GroupLayout(jPanelTambahKelas);
        jPanelTambahKelas.setLayout(jPanelTambahKelasLayout);
        jPanelTambahKelasLayout.setHorizontalGroup(
            jPanelTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTambahKelasLayout.createSequentialGroup()
                .addGroup(jPanelTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTambahKelasLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(jPanelTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Tambah_Ruang_Kelas, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(Txt_Tambah_Jurusan)))
                    .addGroup(jPanelTambahKelasLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(Btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Btn_Simpan)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanelTambahKelasLayout.setVerticalGroup(
            jPanelTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTambahKelasLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanelTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Tambah_Ruang_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Tambah_Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelTambahKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Btn_Simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelUtamaLayout = new javax.swing.GroupLayout(jPanelUtama);
        jPanelUtama.setLayout(jPanelUtamaLayout);
        jPanelUtamaLayout.setHorizontalGroup(
            jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaLayout.createSequentialGroup()
                .addComponent(jPanelTambahKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaLayout.createSequentialGroup()
                    .addComponent(jPanelLihatKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        jPanelUtamaLayout.setVerticalGroup(
            jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTambahKelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelLihatKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jPanelBarLihatKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatKelasMouseEntered
        jPanelBarLihatKelas.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarLihatKelasMouseEntered

    private void jPanelBarLihatKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatKelasMouseExited
        jPanelBarLihatKelas.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelBarLihatKelasMouseExited

    private void jPanelBarLihatKelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatKelasMousePressed
        jPanelBarLihatKelas.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelBarLihatKelasMousePressed

    private void jPanelBarLihatKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatKelasMouseReleased
        jPanelBarLihatKelas.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarLihatKelasMouseReleased

    private void jPanelBarLihatKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatKelasMouseClicked
        jPanelLihatKelas.setVisible(true);
        jPanelTambahKelas.setVisible(false);
    }//GEN-LAST:event_jPanelBarLihatKelasMouseClicked

    private void jPanelBarTambahKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahKelasMouseClicked
        jPanelLihatKelas.setVisible(false);
        jPanelTambahKelas.setVisible(true);
    }//GEN-LAST:event_jPanelBarTambahKelasMouseClicked

    private void jPanelBarTambahKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahKelasMouseEntered
        jPanelBarTambahKelas.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarTambahKelasMouseEntered

    private void jPanelBarTambahKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahKelasMouseExited
        jPanelBarTambahKelas.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelBarTambahKelasMouseExited

    private void jPanelBarTambahKelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahKelasMousePressed
        jPanelBarTambahKelas.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelBarTambahKelasMousePressed

    private void jPanelBarTambahKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahKelasMouseReleased
        jPanelBarTambahKelas.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarTambahKelasMouseReleased

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

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        try {
            String sql = "INSERT INTO tb_kelas VALUES (default,'"+Txt_Tambah_Ruang_Kelas.getText()+"','"+Txt_Tambah_Jurusan.getText()+"')";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        ResetDataTambah();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResetActionPerformed
        ResetDataTambah();
    }//GEN-LAST:event_Btn_ResetActionPerformed

    private void Tbl_Admin_Data_KelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_Admin_Data_KelasMouseClicked
        int baris = Tbl_Admin_Data_Kelas.rowAtPoint(evt.getPoint());
        String ruang_kelas = Tbl_Admin_Data_Kelas.getValueAt(baris, 1).toString();
            Txt_Lihat_Ruang_Kelas.setText(ruang_kelas);
        String jurusan = Tbl_Admin_Data_Kelas.getValueAt(baris,2).toString();
            Txt_Lihat_Jurusan.setText(jurusan);
    }//GEN-LAST:event_Tbl_Admin_Data_KelasMouseClicked

    private void Btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditActionPerformed
        try {
            String sql ="UPDATE tb_kelas SET ruang_kelas = '"+Txt_Lihat_Ruang_Kelas.getText()+"', jurusan = '"+Txt_Lihat_Jurusan.getText()+"' WHERE ruang_kelas = '"+Txt_Lihat_Ruang_Kelas.getText()+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil diedit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Edit Data Gagal"+e.getMessage());
        }
        LoadTable();
        ResetDataLihat();
    }//GEN-LAST:event_Btn_EditActionPerformed

    private void Btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RefreshActionPerformed
        LoadTable();
    }//GEN-LAST:event_Btn_RefreshActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
         try {
            String sql ="DELETE FROM tb_kelas WHERE ruang_kelas ='"+Txt_Lihat_Ruang_Kelas.getText()+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        LoadTable();
        ResetDataLihat();
    }//GEN-LAST:event_Btn_HapusActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAdminDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdminDataKelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cari_Ruang;
    private javax.swing.JButton Btn_Edit;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Refresh;
    private javax.swing.JButton Btn_Reset;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JTable Tbl_Admin_Data_Kelas;
    private javax.swing.JTextField Txt_Cari_Ruang;
    private javax.swing.JTextField Txt_Lihat_Jurusan;
    private javax.swing.JTextField Txt_Lihat_Ruang_Kelas;
    private javax.swing.JTextField Txt_Tambah_Jurusan;
    private javax.swing.JTextField Txt_Tambah_Ruang_Kelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBarKembali;
    private javax.swing.JPanel jPanelBarLihatKelas;
    private javax.swing.JPanel jPanelBarTambahKelas;
    private javax.swing.JPanel jPanelLihatKelas;
    private javax.swing.JPanel jPanelTambahKelas;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
