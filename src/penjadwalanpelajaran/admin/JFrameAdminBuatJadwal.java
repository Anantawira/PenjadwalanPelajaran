package penjadwalanpelajaran.admin;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameAdminBuatJadwal extends javax.swing.JFrame {

    //deklarasi
    Connection con;
    Statement stat;
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    String selectedId;

    public JFrameAdminBuatJadwal() {
        initComponents();
        setExtendedState(JFrameAdminDataGuru.MAXIMIZED_BOTH);
        ComboBoxKelas();
        ComboBoxKodeGuru1();
        ComboBoxKodeGuru2();
        ComboBoxKodeGuru3();
        ComboBoxKodeGuru4();
        ComboBoxKodeGuru5();
        ComboBoxKodeGuru6();
        ComboBoxKodeGuru7();
        ComboBoxKodeGuru8();
        ComboBoxKodeGuru9();
        ComboBoxKodeGuru10();
        ComboBoxRuang1();
        ComboBoxRuang2();
        ComboBoxRuang3();
        ComboBoxRuang4();
        ComboBoxRuang5();
        ComboBoxRuang6();
        ComboBoxRuang7();
        ComboBoxRuang8();
        ComboBoxRuang9();
        ComboBoxRuang10();

        Tbl_Detail_Jadwal.getTableHeader().setFont(new Font("SEGOE UI", Font.BOLD, 12));
        Tbl_Detail_Jadwal.getTableHeader().setOpaque(false);
        Tbl_Detail_Jadwal.setForeground(Color.BLACK);
        Tbl_Detail_Jadwal.setRowHeight(25);
    }

    public void PilihComboBoxKodeGuru1() {
        String item = (String) Cmbx_Kode_Guru_1.getSelectedItem();
        String sql = "SELECT * FROM tb_mapel WHERE kode_guru=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, item);
            rs = pst.executeQuery();

            if (rs.next()) {
                String add = rs.getString("nama_guru");
                Txt_Mapel_1.setText(add);
            }
        } catch (Exception e) {
        }
    }

    public void ComboBoxKelas() {
        try {
            String sql = "SELECT jurusan FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kelas.addItem(res.getString("jurusan"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru1() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_1.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru2() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_2.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru3() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_3.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru4() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_4.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru5() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_5.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru6() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_6.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru7() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_7.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru8() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_8.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru9() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_9.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxKodeGuru10() {
        try {
            String sql = "SELECT kode_guru FROM tb_mapel";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Kode_Guru_10.addItem(res.getString("kode_guru"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang1() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_1.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang2() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_2.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang3() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_3.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang4() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_4.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang5() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_5.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang6() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_6.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang7() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_7.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang8() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_8.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang9() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_9.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ComboBoxRuang10() {
        try {
            String sql = "SELECT ruang_kelas FROM tb_kelas";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                Cmbx_Ruang_10.addItem(res.getString("ruang_kelas"));                   // fungsi ini bertugas menampung isi dari database
            }
            res.close();
            stm.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cmbx_Hari = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Cmbx_Kelas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cmbx_Kode_Guru_1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Cmbx_Kode_Guru_2 = new javax.swing.JComboBox<>();
        Cmbx_Kode_Guru_3 = new javax.swing.JComboBox<>();
        Cmbx_Kode_Guru_4 = new javax.swing.JComboBox<>();
        Cmbx_Kode_Guru_5 = new javax.swing.JComboBox<>();
        Cmbx_Kode_Guru_6 = new javax.swing.JComboBox<>();
        Cmbx_Kode_Guru_7 = new javax.swing.JComboBox<>();
        Cmbx_Kode_Guru_8 = new javax.swing.JComboBox<>();
        Cmbx_Kode_Guru_9 = new javax.swing.JComboBox<>();
        Cmbx_Kode_Guru_10 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Txt_Mapel_1 = new javax.swing.JTextField();
        Txt_Mapel_2 = new javax.swing.JTextField();
        Txt_Mapel_3 = new javax.swing.JTextField();
        Txt_Mapel_4 = new javax.swing.JTextField();
        Txt_Mapel_5 = new javax.swing.JTextField();
        Txt_Mapel_6 = new javax.swing.JTextField();
        Txt_Mapel_7 = new javax.swing.JTextField();
        Txt_Mapel_8 = new javax.swing.JTextField();
        Txt_Mapel_9 = new javax.swing.JTextField();
        Txt_Mapel_10 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Detail_Jadwal = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonKembali = new javax.swing.JButton();
        Cmbx_Ruang_1 = new javax.swing.JComboBox<>();
        Cmbx_Ruang_2 = new javax.swing.JComboBox<>();
        Cmbx_Ruang_3 = new javax.swing.JComboBox<>();
        Cmbx_Ruang_4 = new javax.swing.JComboBox<>();
        Cmbx_Ruang_5 = new javax.swing.JComboBox<>();
        Cmbx_Ruang_6 = new javax.swing.JComboBox<>();
        Cmbx_Ruang_7 = new javax.swing.JComboBox<>();
        Cmbx_Ruang_8 = new javax.swing.JComboBox<>();
        Cmbx_Ruang_9 = new javax.swing.JComboBox<>();
        Cmbx_Ruang_10 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel1.setText("Hari");

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MEmBUAT JADWAL PELAJARAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Cmbx_Hari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Hari--", "Senin", "Selasa", "Rabu", "Kamis", "Jumat" }));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel3.setText("Kelas");

        Cmbx_Kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jurusan--" }));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel4.setText("1");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setText("Jam");

        Cmbx_Kode_Guru_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Cmbx_Kode_Guru_1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setText("5");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel7.setText("6");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setText("4");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel9.setText("8");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel10.setText("3");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel11.setText("2");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel12.setText("9");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel13.setText("7");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel14.setText("10");

        Cmbx_Kode_Guru_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));

        Cmbx_Kode_Guru_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));

        Cmbx_Kode_Guru_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));

        Cmbx_Kode_Guru_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));

        Cmbx_Kode_Guru_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));

        Cmbx_Kode_Guru_7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));

        Cmbx_Kode_Guru_8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));

        Cmbx_Kode_Guru_9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));

        Cmbx_Kode_Guru_10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ruangan");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Mata Pelajaran");

        Tbl_Detail_Jadwal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tbl_Detail_Jadwal);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Detail Jadwal Pelajaran");

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setText("Simpan");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton3.setText("Hapus");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton4.setText("Terapkan");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonKembali.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonKembali.setText("Kembali");
        jButtonKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonKembaliMouseClicked(evt);
            }
        });

        Cmbx_Ruang_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        Cmbx_Ruang_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        Cmbx_Ruang_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        Cmbx_Ruang_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        Cmbx_Ruang_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        Cmbx_Ruang_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        Cmbx_Ruang_7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        Cmbx_Ruang_8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        Cmbx_Ruang_9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        Cmbx_Ruang_10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Ruangan--" }));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Kode Guru");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cmbx_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Cmbx_Hari, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Cmbx_Kode_Guru_1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cmbx_Kode_Guru_2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cmbx_Kode_Guru_3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cmbx_Kode_Guru_4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cmbx_Kode_Guru_5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cmbx_Kode_Guru_6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cmbx_Kode_Guru_7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cmbx_Kode_Guru_8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cmbx_Kode_Guru_9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cmbx_Kode_Guru_10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cmbx_Ruang_1, 0, 136, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cmbx_Ruang_2, 0, 136, Short.MAX_VALUE)
                    .addComponent(Cmbx_Ruang_3, 0, 136, Short.MAX_VALUE)
                    .addComponent(Cmbx_Ruang_4, 0, 136, Short.MAX_VALUE)
                    .addComponent(Cmbx_Ruang_5, 0, 136, Short.MAX_VALUE)
                    .addComponent(Cmbx_Ruang_6, 0, 136, Short.MAX_VALUE)
                    .addComponent(Cmbx_Ruang_7, 0, 136, Short.MAX_VALUE)
                    .addComponent(Cmbx_Ruang_8, 0, 136, Short.MAX_VALUE)
                    .addComponent(Cmbx_Ruang_9, 0, 136, Short.MAX_VALUE)
                    .addComponent(Cmbx_Ruang_10, 0, 136, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Mapel_10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 137, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jButtonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jButton4)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cmbx_Hari, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cmbx_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKembaliMouseClicked
        this.dispose();
        new JFrameBerandaAdmin().setVisible(true);
    }//GEN-LAST:event_jButtonKembaliMouseClicked

    private void Cmbx_Kode_Guru_1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_1PopupMenuWillBecomeInvisible
        String item = (String) Cmbx_Kode_Guru_1.getSelectedItem();
        String sql = "SELECT * FROM tb_mapel WHERE kode_guru=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, item);
            rs = pst.executeQuery();

            if (rs.next()) {
                String add = rs.getString("nama_guru");
                Txt_Mapel_1.setText(add);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_1PopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(JFrameAdminBuatJadwal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminBuatJadwal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminBuatJadwal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminBuatJadwal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdminBuatJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cmbx_Hari;
    private javax.swing.JComboBox<String> Cmbx_Kelas;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_1;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_10;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_2;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_3;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_4;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_5;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_6;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_7;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_8;
    private javax.swing.JComboBox<String> Cmbx_Kode_Guru_9;
    private javax.swing.JComboBox<String> Cmbx_Ruang_1;
    private javax.swing.JComboBox<String> Cmbx_Ruang_10;
    private javax.swing.JComboBox<String> Cmbx_Ruang_2;
    private javax.swing.JComboBox<String> Cmbx_Ruang_3;
    private javax.swing.JComboBox<String> Cmbx_Ruang_4;
    private javax.swing.JComboBox<String> Cmbx_Ruang_5;
    private javax.swing.JComboBox<String> Cmbx_Ruang_6;
    private javax.swing.JComboBox<String> Cmbx_Ruang_7;
    private javax.swing.JComboBox<String> Cmbx_Ruang_8;
    private javax.swing.JComboBox<String> Cmbx_Ruang_9;
    private javax.swing.JTable Tbl_Detail_Jadwal;
    private javax.swing.JTextField Txt_Mapel_1;
    private javax.swing.JTextField Txt_Mapel_10;
    private javax.swing.JTextField Txt_Mapel_2;
    private javax.swing.JTextField Txt_Mapel_3;
    private javax.swing.JTextField Txt_Mapel_4;
    private javax.swing.JTextField Txt_Mapel_5;
    private javax.swing.JTextField Txt_Mapel_6;
    private javax.swing.JTextField Txt_Mapel_7;
    private javax.swing.JTextField Txt_Mapel_8;
    private javax.swing.JTextField Txt_Mapel_9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
