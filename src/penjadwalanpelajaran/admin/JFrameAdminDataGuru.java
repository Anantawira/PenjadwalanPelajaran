package penjadwalanpelajaran.admin;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameAdminDataGuru extends javax.swing.JFrame {

    //deklarasi
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    String selectedId;

    public JFrameAdminDataGuru() {

        initComponents();
        setExtendedState(JFrameAdminDataGuru.MAXIMIZED_BOTH);
        jPanelLihatGuru.setVisible(true);
        jPanelTambahGuru.setVisible(false);
        LoadTable();

        Tbl_Admin_Data_Guru.getTableHeader().setFont(new Font("SEGOE UI", Font.BOLD, 12));
        Tbl_Admin_Data_Guru.getTableHeader().setOpaque(false);
        Tbl_Admin_Data_Guru.getTableHeader().setForeground(Color.BLACK);
        Tbl_Admin_Data_Guru.setRowHeight(25);
    }

    private void LoadTable() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID");
        model.addColumn("NIP");
        model.addColumn("Nama");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tgl Lahir");
        model.addColumn("Alamat");
        model.addColumn("No Telepon");

        //menampilkan data database kedalam tabel
        try {
            int no = 1;
            String sql = "SELECT * FROM tb_guru ORDER BY nama_guru ASC";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++,
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),
                    res.getString(7)
                });
            }
            Tbl_Admin_Data_Guru.setModel(model);
        } catch (Exception e) {
        }
    }

    private void ResetDataTambah() {
        Txt_Tambah_NIP.setText(null);
        Txt_Tambah_Nama_Guru.setText(null);
        Txt_Tambah_Tgl_Lahir.setText(null);
        Txt_Tambah_Alamat.setText(null);
        Txt_Tambah_No_Telepon.setText(null);
        Txt_Tambah_Tempat_Lahir.setText(null);
    }

    private void ResetDataLihat() {
        Txt_Lihat_NIP.setText(null);
        Txt_Lihat_Nama_Guru.setText(null);
        Txt_Lihat_Tgl_Lahir.setText(null);
        Txt_Lihat_Alamat.setText(null);
        Txt_Lihat_No_Telepon.setText(null);
        Txt_Lihat_Tempat_Lahir.setText(null);
    }

    private void ResetCari() {
        Txt_Cari_Guru.setText(null);
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
        jLabel5 = new javax.swing.JLabel();
        Txt_Cari_Guru = new javax.swing.JTextField();
        Btn_Cari_Guru = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Admin_Data_Guru = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Txt_Lihat_Nama_Guru = new javax.swing.JTextField();
        Txt_Lihat_NIP = new javax.swing.JTextField();
        Txt_Lihat_Tgl_Lahir = new javax.swing.JTextField();
        Txt_Lihat_Alamat = new javax.swing.JTextField();
        Txt_Lihat_No_Telepon = new javax.swing.JTextField();
        Txt_Lihat_Tempat_Lahir = new javax.swing.JTextField();
        Btn_Edit = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Refresh = new javax.swing.JButton();
        jPanelTambahGuru = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Txt_Tambah_NIP = new javax.swing.JTextField();
        Txt_Tambah_Tgl_Lahir = new javax.swing.JTextField();
        Txt_Tambah_Alamat = new javax.swing.JTextField();
        Txt_Tambah_No_Telepon = new javax.swing.JTextField();
        Txt_Tambah_Tempat_Lahir = new javax.swing.JTextField();
        Txt_Tambah_Nama_Guru = new javax.swing.JTextField();
        Btn_Reset_Tambah = new javax.swing.JButton();
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
                            .addComponent(jPanelBarLihatGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jPanelBarTambahGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanelLihatGuru.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel5.setText("Nama Guru ");

        Btn_Cari_Guru.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Cari_Guru.setText("Cari");
        Btn_Cari_Guru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Cari_Guru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cari_GuruActionPerformed(evt);
            }
        });

        Tbl_Admin_Data_Guru.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl_Admin_Data_Guru.setShowVerticalLines(false);
        Tbl_Admin_Data_Guru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_Admin_Data_GuruMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Admin_Data_Guru);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel7.setText("Nama Guru");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel8.setText("NIP");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel9.setText("Alamat");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel10.setText("Tgl Lahir");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel11.setText("Tmpt Lahir");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel12.setText("No Telepon");

        Txt_Lihat_NIP.setEditable(false);

        Btn_Edit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Edit.setText("Edit");
        Btn_Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditActionPerformed(evt);
            }
        });

        Btn_Hapus.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Hapus.setText("Hapus");
        Btn_Hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });

        Btn_Refresh.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Refresh.setText("Refresh");
        Btn_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLihatGuruLayout = new javax.swing.GroupLayout(jPanelLihatGuru);
        jPanelLihatGuru.setLayout(jPanelLihatGuruLayout);
        jPanelLihatGuruLayout.setHorizontalGroup(
            jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLihatGuruLayout.createSequentialGroup()
                .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLihatGuruLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Cari_Guru, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Cari_Guru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Refresh))
                    .addGroup(jPanelLihatGuruLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLihatGuruLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Lihat_Nama_Guru, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Lihat_NIP, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Lihat_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Lihat_Tgl_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Lihat_No_Telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Lihat_Tempat_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelLihatGuruLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(Btn_Hapus)
                                .addGap(35, 35, 35)
                                .addComponent(Btn_Edit)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanelLihatGuruLayout.setVerticalGroup(
            jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLihatGuruLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_Cari_Guru, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Cari_Guru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLihatGuruLayout.createSequentialGroup()
                        .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Lihat_NIP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Lihat_Nama_Guru, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Lihat_Tempat_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Lihat_Tgl_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Lihat_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Lihat_No_Telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLihatGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelTambahGuru.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel14.setText("NIP");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel15.setText("Nama");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel16.setText("Tanggal Lahir");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel17.setText("Alamat");

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel18.setText("No Telepon");

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel19.setText("Tempat Lahir");

        Btn_Reset_Tambah.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Reset_Tambah.setText("Reset");
        Btn_Reset_Tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Reset_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Reset_TambahActionPerformed(evt);
            }
        });

        Btn_Simpan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Btn_Simpan.setText("Simpan");
        Btn_Simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTambahGuruLayout = new javax.swing.GroupLayout(jPanelTambahGuru);
        jPanelTambahGuru.setLayout(jPanelTambahGuruLayout);
        jPanelTambahGuruLayout.setHorizontalGroup(
            jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTambahGuruLayout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(Btn_Reset_Tambah)
                .addGap(30, 30, 30)
                .addComponent(Btn_Simpan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTambahGuruLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Tambah_No_Telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Tambah_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Txt_Tambah_Tempat_Lahir, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Txt_Tambah_NIP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addComponent(Txt_Tambah_Tgl_Lahir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addComponent(Txt_Tambah_Nama_Guru, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))
                .addGap(243, 243, 243))
        );
        jPanelTambahGuruLayout.setVerticalGroup(
            jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTambahGuruLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Tambah_NIP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Tambah_Nama_Guru, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Tambah_Tempat_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Tambah_Tgl_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Tambah_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Tambah_No_Telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelTambahGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Reset_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
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

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        try {
            String sql = "INSERT INTO tb_guru VALUES (default,'" + Txt_Tambah_NIP.getText() + "', '" + Txt_Tambah_Nama_Guru.getText() + "', '" + Txt_Tambah_Tempat_Lahir.getText() + "', '" + Txt_Tambah_Tgl_Lahir.getText() + "', '" + Txt_Tambah_Alamat.getText() + "', '" + Txt_Tambah_No_Telepon.getText() + "')";
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

    private void Btn_Reset_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Reset_TambahActionPerformed
        ResetDataTambah();
    }//GEN-LAST:event_Btn_Reset_TambahActionPerformed

    private void Btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RefreshActionPerformed
        ResetCari();
        LoadTable();
    }//GEN-LAST:event_Btn_RefreshActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Menghapus Data ini??", "Comfirmation", JOptionPane.YES_NO_OPTION);
        if (ok == 0)
        try {
            String sql = "DELETE FROM tb_guru WHERE id_guru = '" + selectedId + "'";
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

    private void Tbl_Admin_Data_GuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_Admin_Data_GuruMouseClicked
        int baris = Tbl_Admin_Data_Guru.rowAtPoint(evt.getPoint());
        selectedId = Tbl_Admin_Data_Guru.getValueAt(baris, 1).toString();
        String NIP = Tbl_Admin_Data_Guru.getValueAt(baris, 2).toString();
        Txt_Lihat_NIP.setText(NIP);
        String nama_guru = Tbl_Admin_Data_Guru.getValueAt(baris, 3).toString();
        Txt_Lihat_Nama_Guru.setText(nama_guru);
        String tempat_lahir = Tbl_Admin_Data_Guru.getValueAt(baris, 4).toString();
        Txt_Lihat_Tempat_Lahir.setText(tempat_lahir);
        String tgl_lahir = Tbl_Admin_Data_Guru.getValueAt(baris, 5).toString();
        Txt_Lihat_Tgl_Lahir.setText(tgl_lahir);
        String alamat = Tbl_Admin_Data_Guru.getValueAt(baris, 6).toString();
        Txt_Lihat_Alamat.setText(alamat);
        String no_telepon = Tbl_Admin_Data_Guru.getValueAt(baris, 7).toString();
        Txt_Lihat_No_Telepon.setText(no_telepon);
    }//GEN-LAST:event_Tbl_Admin_Data_GuruMouseClicked

    private void Btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditActionPerformed
        try {
            String sql = "UPDATE tb_guru SET nip = '" + Txt_Lihat_NIP.getText() + "', nama_guru= '" + Txt_Lihat_Nama_Guru.getText() + "', tempat_lahir = '" + Txt_Lihat_Tempat_Lahir.getText() + "', tgl_lahir = '" + Txt_Lihat_Tgl_Lahir.getText() + "', alamat = '" + Txt_Lihat_Alamat.getText() + "', no_telepon = '" + Txt_Lihat_No_Telepon.getText() + "' WHERE id_guru = '" + selectedId + "'";
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

    private void Btn_Cari_GuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Cari_GuruActionPerformed
        try {
            Statement stat = (Statement) Config.configDB().createStatement();
            ResultSet res = stat.executeQuery("SELECT * FROM tb_guru WHERE " + " nama_guru LIKE '%" + Txt_Cari_Guru.getText() + "%'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("No");
            tbl.addColumn("ID");
            tbl.addColumn("NIP");
            tbl.addColumn("Nama");
            tbl.addColumn("Tempat Lahir");
            tbl.addColumn("Tgl Lahir");
            tbl.addColumn("Alamat");
            tbl.addColumn("No Telepon");

            Tbl_Admin_Data_Guru.setModel(tbl);
            int no = 1;
            while (res.next()) {
                tbl.addRow(new Object[]{no++,
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),
                    res.getString(7)
                });
                Tbl_Admin_Data_Guru.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }

    }//GEN-LAST:event_Btn_Cari_GuruActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAdminDataGuru.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataGuru.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataGuru.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminDataGuru.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton Btn_Cari_Guru;
    private javax.swing.JButton Btn_Edit;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Refresh;
    private javax.swing.JButton Btn_Reset_Tambah;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JTable Tbl_Admin_Data_Guru;
    private javax.swing.JTextField Txt_Cari_Guru;
    private javax.swing.JTextField Txt_Lihat_Alamat;
    private javax.swing.JTextField Txt_Lihat_NIP;
    private javax.swing.JTextField Txt_Lihat_Nama_Guru;
    private javax.swing.JTextField Txt_Lihat_No_Telepon;
    private javax.swing.JTextField Txt_Lihat_Tempat_Lahir;
    private javax.swing.JTextField Txt_Lihat_Tgl_Lahir;
    private javax.swing.JTextField Txt_Tambah_Alamat;
    private javax.swing.JTextField Txt_Tambah_NIP;
    private javax.swing.JTextField Txt_Tambah_Nama_Guru;
    private javax.swing.JTextField Txt_Tambah_No_Telepon;
    private javax.swing.JTextField Txt_Tambah_Tempat_Lahir;
    private javax.swing.JTextField Txt_Tambah_Tgl_Lahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanelBarLihatGuru;
    private javax.swing.JPanel jPanelBarTambahGuru;
    private javax.swing.JPanel jPanelLihatGuru;
    private javax.swing.JPanel jPanelTambahGuru;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
