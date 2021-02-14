package penjadwalanpelajaran.admin;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameAdminDataMapel extends javax.swing.JFrame {

    //deklarasi
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    String selectedId;

    public JFrameAdminDataMapel() {
        initComponents();
        setExtendedState(JFrameAdminDataMapel.MAXIMIZED_BOTH);
        jPanelLihatMapel.setVisible(true);
        jPanelTambahMapel.setVisible(false);
        LoadTable();
        ComboBoxTambahPengajar();
        ComboBoxLihatPengajar();

        Tbl_Admin_Data_Mapel.getTableHeader().setFont(new Font("SEGOE UI", Font.BOLD, 12));
        Tbl_Admin_Data_Mapel.getTableHeader().setOpaque(false);
        Tbl_Admin_Data_Mapel.getTableHeader().setForeground(Color.BLACK);
        Tbl_Admin_Data_Mapel.setRowHeight(25);
    }

    private void LoadTable() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID");
        model.addColumn("Mata Pelajaran");
        model.addColumn("Guru Pengajar");
        model.addColumn("Kode Guru");

        //menampilkan data database kedalam tabel
        try {
            int no = 1;
            String sql = "SELECT * FROM tb_mapel ORDER BY mapel ASC";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++,
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4)});
            }
            Tbl_Admin_Data_Mapel.setModel(model);
        } catch (Exception e) {
        }
    }

    private void ResetDataTambah() {
        Txt_Tambah_Mapel.setText(null);
        Cmbx_Tambah_Guru_Pengajar.setSelectedIndex(0);
        Txt_Tambah_Kode_Guru.setText(null);
    }

    private void ResetDataLihat() {
        Txt_Lihat_Mapel.setText(null);
        Cmbx_Tambah_Guru_Pengajar.setSelectedIndex(0);
        Txt_Lihat_Kode_Guru.setText(null);
    }

    private void ResetCari() {
        Txt_Cari_Mapel.setText(null);
    }

    public void ComboBoxTambahPengajar() {
        try {
            String sql = "SELECT nama_guru FROM tb_guru";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Tambah_Guru_Pengajar.addItem(res.getString("nama_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxLihatPengajar() {
        try {
            String sql = "SELECT nama_guru FROM tb_guru";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Lihat_Guru_Pengajar.addItem(res.getString("nama_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelBarLihatMapel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelBarTambahMapel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelBarKembali = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelUtama = new javax.swing.JPanel();
        jPanelLihatMapel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Cari_Mapel = new javax.swing.JTextField();
        Btn_Cari_Mapel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Admin_Data_Mapel = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Txt_Lihat_Mapel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Edit = new javax.swing.JButton();
        Btn_Refresh = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Txt_Lihat_Kode_Guru = new javax.swing.JTextField();
        Cmbx_Lihat_Guru_Pengajar = new javax.swing.JComboBox<>();
        jPanelTambahMapel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Txt_Tambah_Mapel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Btn_Reset = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Txt_Tambah_Kode_Guru = new javax.swing.JTextField();
        Cmbx_Tambah_Guru_Pengajar = new javax.swing.JComboBox<>();

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

        jPanelBarLihatMapel.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarLihatMapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBarLihatMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarLihatMapelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelBarLihatMapelMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBarLihatMapelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBarLihatMapelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBarLihatMapelMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lihat Mapel");

        javax.swing.GroupLayout jPanelBarLihatMapelLayout = new javax.swing.GroupLayout(jPanelBarLihatMapel);
        jPanelBarLihatMapel.setLayout(jPanelBarLihatMapelLayout);
        jPanelBarLihatMapelLayout.setHorizontalGroup(
            jPanelBarLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBarLihatMapelLayout.setVerticalGroup(
            jPanelBarLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanelBarTambahMapel.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarTambahMapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBarTambahMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarTambahMapelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelBarTambahMapelMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBarTambahMapelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBarTambahMapelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBarTambahMapelMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tambah Mapel");

        javax.swing.GroupLayout jPanelBarTambahMapelLayout = new javax.swing.GroupLayout(jPanelBarTambahMapel);
        jPanelBarTambahMapel.setLayout(jPanelBarTambahMapelLayout);
        jPanelBarTambahMapelLayout.setHorizontalGroup(
            jPanelBarTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanelBarTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBarTambahMapelLayout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelBarTambahMapelLayout.setVerticalGroup(
            jPanelBarTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanelBarTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBarTambahMapelLayout.createSequentialGroup()
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
                            .addComponent(jPanelBarLihatMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jPanelBarTambahMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanelBarLihatMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBarTambahMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanelLihatMapel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel5.setText("Cari Mapel");

        Btn_Cari_Mapel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Cari_Mapel.setText("Cari");
        Btn_Cari_Mapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cari_MapelActionPerformed(evt);
            }
        });

        Tbl_Admin_Data_Mapel.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl_Admin_Data_Mapel.setShowVerticalLines(false);
        Tbl_Admin_Data_Mapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_Admin_Data_MapelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Admin_Data_Mapel);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel7.setText("Mata Pelajaran");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel8.setText("Guru Pengajar");

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

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel12.setText("Kode Guru");

        Cmbx_Lihat_Guru_Pengajar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Guru Pengajar--" }));

        javax.swing.GroupLayout jPanelLihatMapelLayout = new javax.swing.GroupLayout(jPanelLihatMapel);
        jPanelLihatMapel.setLayout(jPanelLihatMapelLayout);
        jPanelLihatMapelLayout.setHorizontalGroup(
            jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLihatMapelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLihatMapelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Cari_Mapel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Cari_Mapel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Refresh))
                    .addGroup(jPanelLihatMapelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLihatMapelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_Lihat_Mapel, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(Txt_Lihat_Kode_Guru, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(Cmbx_Lihat_Guru_Pengajar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelLihatMapelLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(Btn_Hapus)
                                .addGap(37, 37, 37)
                                .addComponent(Btn_Edit)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanelLihatMapelLayout.setVerticalGroup(
            jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLihatMapelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Cari_Mapel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Cari_Mapel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLihatMapelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLihatMapelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Lihat_Mapel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Lihat_Guru_Pengajar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Lihat_Kode_Guru, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanelTambahMapel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Mata Pelajaran");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("Guru Pengajar");

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

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setText("Kode Guru");

        Cmbx_Tambah_Guru_Pengajar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Guru Pengajar--" }));

        javax.swing.GroupLayout jPanelTambahMapelLayout = new javax.swing.GroupLayout(jPanelTambahMapel);
        jPanelTambahMapel.setLayout(jPanelTambahMapelLayout);
        jPanelTambahMapelLayout.setHorizontalGroup(
            jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTambahMapelLayout.createSequentialGroup()
                .addGroup(jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTambahMapelLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Tambah_Mapel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(Txt_Tambah_Kode_Guru, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(Cmbx_Tambah_Guru_Pengajar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelTambahMapelLayout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(Btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(Btn_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanelTambahMapelLayout.setVerticalGroup(
            jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTambahMapelLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Tambah_Mapel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmbx_Tambah_Guru_Pengajar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Tambah_Kode_Guru, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );

        javax.swing.GroupLayout jPanelUtamaLayout = new javax.swing.GroupLayout(jPanelUtama);
        jPanelUtama.setLayout(jPanelUtamaLayout);
        jPanelUtamaLayout.setHorizontalGroup(
            jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaLayout.createSequentialGroup()
                .addComponent(jPanelTambahMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaLayout.createSequentialGroup()
                    .addComponent(jPanelLihatMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
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

    private void jPanelBarLihatMapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatMapelMouseEntered
        jPanelBarLihatMapel.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarLihatMapelMouseEntered

    private void jPanelBarLihatMapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatMapelMouseExited
        jPanelBarLihatMapel.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelBarLihatMapelMouseExited

    private void jPanelBarLihatMapelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatMapelMousePressed
        jPanelBarLihatMapel.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelBarLihatMapelMousePressed

    private void jPanelBarLihatMapelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatMapelMouseReleased
        jPanelBarLihatMapel.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarLihatMapelMouseReleased

    private void jPanelBarLihatMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarLihatMapelMouseClicked
        jPanelLihatMapel.setVisible(true);
        jPanelTambahMapel.setVisible(false);
    }//GEN-LAST:event_jPanelBarLihatMapelMouseClicked

    private void jPanelBarTambahMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahMapelMouseClicked
        jPanelLihatMapel.setVisible(false);
        jPanelTambahMapel.setVisible(true);
    }//GEN-LAST:event_jPanelBarTambahMapelMouseClicked

    private void jPanelBarTambahMapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahMapelMouseEntered
        jPanelBarTambahMapel.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarTambahMapelMouseEntered

    private void jPanelBarTambahMapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahMapelMouseExited
        jPanelBarTambahMapel.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelBarTambahMapelMouseExited

    private void jPanelBarTambahMapelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahMapelMousePressed
        jPanelBarTambahMapel.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelBarTambahMapelMousePressed

    private void jPanelBarTambahMapelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarTambahMapelMouseReleased
        jPanelBarTambahMapel.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBarTambahMapelMouseReleased

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
            String sql = "INSERT INTO tb_mapel VALUES (default,'" + Txt_Tambah_Mapel.getText() + "','" + Cmbx_Tambah_Guru_Pengajar.getSelectedItem() + "','" + Txt_Tambah_Kode_Guru.getText() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        LoadTable();
        ResetDataTambah();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResetActionPerformed
        ResetDataTambah();
    }//GEN-LAST:event_Btn_ResetActionPerformed

    private void Btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RefreshActionPerformed
        ResetCari();
        LoadTable();
    }//GEN-LAST:event_Btn_RefreshActionPerformed

    private void Tbl_Admin_Data_MapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_Admin_Data_MapelMouseClicked
        int baris = Tbl_Admin_Data_Mapel.rowAtPoint(evt.getPoint());
        selectedId = Tbl_Admin_Data_Mapel.getValueAt(baris, 1).toString();
        String mapel = Tbl_Admin_Data_Mapel.getValueAt(baris, 2).toString();
        Txt_Lihat_Mapel.setText(mapel);
        String nama_guru = Tbl_Admin_Data_Mapel.getValueAt(baris, 3).toString();
        Cmbx_Lihat_Guru_Pengajar.setSelectedItem(nama_guru);
        String kode_guru = Tbl_Admin_Data_Mapel.getValueAt(baris, 4).toString();
        Txt_Lihat_Kode_Guru.setText(kode_guru);
    }//GEN-LAST:event_Tbl_Admin_Data_MapelMouseClicked

    private void Btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditActionPerformed
        try {
            String sql = "UPDATE tb_mapel SET mapel = '" + Txt_Lihat_Mapel.getText() + "', nama_guru = '" + Cmbx_Lihat_Guru_Pengajar.getSelectedItem() + "', kode_guru = '" + Txt_Lihat_Kode_Guru.getText() + "' WHERE id_mapel = '" + selectedId + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Edit Data Gagal" + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Data Berhasil diedit");
        LoadTable();
        ResetDataLihat();
    }//GEN-LAST:event_Btn_EditActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Menghapus Data ini??", "Comfirmation", JOptionPane.YES_NO_OPTION);
        if (ok == 0)
        try {
            String sql = "DELETE FROM tb_mapel WHERE id_mapel = '" + selectedId + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        LoadTable();
        ResetDataLihat();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_Cari_MapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Cari_MapelActionPerformed
        try {
            Statement stat = (Statement) Config.configDB().createStatement();
            ResultSet res = stat.executeQuery("SELECT * FROM tb_mapel WHERE " + " mapel LIKE '%" + Txt_Cari_Mapel.getText() + "%'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("No");
            tbl.addColumn("ID");
            tbl.addColumn("Mapel");
            tbl.addColumn("Nama Guru");
            tbl.addColumn("Kode Guru");

            Tbl_Admin_Data_Mapel.setModel(tbl);
            int no = 1;
            while (res.next()) {
                tbl.addRow(new Object[]{no++,
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),});
                Tbl_Admin_Data_Mapel.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_Btn_Cari_MapelActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAdminDataMapel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataMapel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataMapel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataMapel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton Btn_Cari_Mapel;
    private javax.swing.JButton Btn_Edit;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Refresh;
    private javax.swing.JButton Btn_Reset;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JComboBox<String> Cmbx_Lihat_Guru_Pengajar;
    private javax.swing.JComboBox<String> Cmbx_Tambah_Guru_Pengajar;
    private javax.swing.JTable Tbl_Admin_Data_Mapel;
    private javax.swing.JTextField Txt_Cari_Mapel;
    private javax.swing.JTextField Txt_Lihat_Kode_Guru;
    private javax.swing.JTextField Txt_Lihat_Mapel;
    private javax.swing.JTextField Txt_Tambah_Kode_Guru;
    private javax.swing.JTextField Txt_Tambah_Mapel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanelBarLihatMapel;
    private javax.swing.JPanel jPanelBarTambahMapel;
    private javax.swing.JPanel jPanelLihatMapel;
    private javax.swing.JPanel jPanelTambahMapel;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
