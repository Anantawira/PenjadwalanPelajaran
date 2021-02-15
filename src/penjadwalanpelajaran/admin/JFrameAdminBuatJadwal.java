package penjadwalanpelajaran.admin;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        //LoadTable();

        Tbl_Detail_Jadwal.getTableHeader().setFont(new Font("SEGOE UI", Font.BOLD, 12));
        Tbl_Detail_Jadwal.getTableHeader().setOpaque(false);
        Tbl_Detail_Jadwal.setForeground(Color.BLACK);
        Tbl_Detail_Jadwal.setRowHeight(25);
    }

    private void ResetData1() {
        Cmbx_Kode_Guru_1.setSelectedIndex(0);
        Cmbx_Ruang_1.setSelectedIndex(0);
        Txt_Mapel_1.setText(null);
        Txt_Nama_Guru_1.setText(null);
    }

    private void ResetData2() {
        Cmbx_Kode_Guru_2.setSelectedIndex(0);
        Cmbx_Ruang_2.setSelectedIndex(0);
        Txt_Mapel_2.setText(null);
        Txt_Nama_Guru_2.setText(null);
    }

    private void ResetData3() {
        Cmbx_Kode_Guru_3.setSelectedIndex(0);
        Cmbx_Ruang_3.setSelectedIndex(0);
        Txt_Mapel_3.setText(null);
        Txt_Nama_Guru_3.setText(null);
    }

    private void ResetData4() {
        Cmbx_Kode_Guru_4.setSelectedIndex(0);
        Cmbx_Ruang_4.setSelectedIndex(0);
        Txt_Mapel_4.setText(null);
        Txt_Nama_Guru_4.setText(null);
    }

    private void ResetData5() {
        Cmbx_Kode_Guru_5.setSelectedIndex(0);
        Cmbx_Ruang_5.setSelectedIndex(0);
        Txt_Mapel_5.setText(null);
        Txt_Nama_Guru_5.setText(null);
    }

    private void ResetData6() {
        Cmbx_Kode_Guru_6.setSelectedIndex(0);
        Cmbx_Ruang_6.setSelectedIndex(0);
        Txt_Mapel_6.setText(null);
        Txt_Nama_Guru_6.setText(null);
    }

    private void ResetData7() {
        Cmbx_Kode_Guru_7.setSelectedIndex(0);
        Cmbx_Ruang_7.setSelectedIndex(0);
        Txt_Mapel_7.setText(null);
        Txt_Nama_Guru_7.setText(null);
    }

    private void ResetData8() {
        Cmbx_Kode_Guru_8.setSelectedIndex(0);
        Cmbx_Ruang_8.setSelectedIndex(0);
        Txt_Mapel_8.setText(null);
        Txt_Nama_Guru_8.setText(null);
    }

    private void ResetData9() {
        Cmbx_Kode_Guru_9.setSelectedIndex(0);
        Cmbx_Ruang_9.setSelectedIndex(0);
        Txt_Mapel_9.setText(null);
        Txt_Nama_Guru_9.setText(null);
    }

    private void ResetData10() {
        Cmbx_Kode_Guru_10.setSelectedIndex(0);
        Cmbx_Ruang_10.setSelectedIndex(0);
        Txt_Mapel_10.setText(null);
        Txt_Nama_Guru_10.setText(null);
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
        Lbl_1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cmbx_Kode_Guru_1 = new javax.swing.JComboBox<>();
        Lbl_5 = new javax.swing.JLabel();
        Lbl_6 = new javax.swing.JLabel();
        Lbl_4 = new javax.swing.JLabel();
        Lbl_8 = new javax.swing.JLabel();
        Lbl_3 = new javax.swing.JLabel();
        Lbl_2 = new javax.swing.JLabel();
        Lbl_9 = new javax.swing.JLabel();
        Lbl_7 = new javax.swing.JLabel();
        Lbl_10 = new javax.swing.JLabel();
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
        Btn_Reset_Table = new javax.swing.JButton();
        Btn_Simpan_1 = new javax.swing.JButton();
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
        Btn_Simpan_2 = new javax.swing.JButton();
        Btn_Simpan_3 = new javax.swing.JButton();
        Btn_Simpan_4 = new javax.swing.JButton();
        Btn_Simpan_5 = new javax.swing.JButton();
        Btn_Simpan_6 = new javax.swing.JButton();
        Btn_Simpan_7 = new javax.swing.JButton();
        Btn_Simpan_8 = new javax.swing.JButton();
        Btn_Simpan_9 = new javax.swing.JButton();
        Btn_Simpan_10 = new javax.swing.JButton();
        Txt_Nama_Guru_1 = new javax.swing.JTextField();
        Txt_Nama_Guru_2 = new javax.swing.JTextField();
        Txt_Nama_Guru_3 = new javax.swing.JTextField();
        Txt_Nama_Guru_4 = new javax.swing.JTextField();
        Txt_Nama_Guru_5 = new javax.swing.JTextField();
        Txt_Nama_Guru_6 = new javax.swing.JTextField();
        Txt_Nama_Guru_7 = new javax.swing.JTextField();
        Txt_Nama_Guru_8 = new javax.swing.JTextField();
        Txt_Nama_Guru_9 = new javax.swing.JTextField();
        Txt_Nama_Guru_10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Btn_Hapus = new javax.swing.JButton();

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

        Lbl_1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_1.setText("1");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setText("Sesi");

        Cmbx_Kode_Guru_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_1ItemStateChanged(evt);
            }
        });

        Lbl_5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_5.setText("5");

        Lbl_6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_6.setText("6");

        Lbl_4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_4.setText("4");

        Lbl_8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_8.setText("8");

        Lbl_3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_3.setText("3");

        Lbl_2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_2.setText("2");

        Lbl_9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_9.setText("9");

        Lbl_7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_7.setText("7");

        Lbl_10.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Lbl_10.setText("10");

        Cmbx_Kode_Guru_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_2ItemStateChanged(evt);
            }
        });

        Cmbx_Kode_Guru_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_3ItemStateChanged(evt);
            }
        });

        Cmbx_Kode_Guru_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_4ItemStateChanged(evt);
            }
        });

        Cmbx_Kode_Guru_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_5ItemStateChanged(evt);
            }
        });

        Cmbx_Kode_Guru_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_6ItemStateChanged(evt);
            }
        });

        Cmbx_Kode_Guru_7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_7ItemStateChanged(evt);
            }
        });

        Cmbx_Kode_Guru_8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_8ItemStateChanged(evt);
            }
        });

        Cmbx_Kode_Guru_9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_9ItemStateChanged(evt);
            }
        });

        Cmbx_Kode_Guru_10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kode Guru--" }));
        Cmbx_Kode_Guru_10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmbx_Kode_Guru_10ItemStateChanged(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ruangan");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Mata Pelajaran");

        Tbl_Detail_Jadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sesi", "Ruang", "Mata Pelajaran", "Guru Pengajar", "Kode Guru"
            }
        ));
        jScrollPane1.setViewportView(Tbl_Detail_Jadwal);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Detail Jadwal Pelajaran");

        Btn_Reset_Table.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Reset_Table.setText("Reset");
        Btn_Reset_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Reset_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Reset_TableActionPerformed(evt);
            }
        });

        Btn_Simpan_1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_1.setText("Simpan");
        Btn_Simpan_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_1ActionPerformed(evt);
            }
        });

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

        Btn_Simpan_2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_2.setText("Simpan");
        Btn_Simpan_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_2ActionPerformed(evt);
            }
        });

        Btn_Simpan_3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_3.setText("Simpan");
        Btn_Simpan_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_3ActionPerformed(evt);
            }
        });

        Btn_Simpan_4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_4.setText("Simpan");
        Btn_Simpan_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_4ActionPerformed(evt);
            }
        });

        Btn_Simpan_5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_5.setText("Simpan");
        Btn_Simpan_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_5ActionPerformed(evt);
            }
        });

        Btn_Simpan_6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_6.setText("Simpan");
        Btn_Simpan_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_6ActionPerformed(evt);
            }
        });

        Btn_Simpan_7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_7.setText("Simpan");
        Btn_Simpan_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_7ActionPerformed(evt);
            }
        });

        Btn_Simpan_8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_8.setText("Simpan");
        Btn_Simpan_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_8ActionPerformed(evt);
            }
        });

        Btn_Simpan_9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_9.setText("Simpan");
        Btn_Simpan_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_9ActionPerformed(evt);
            }
        });

        Btn_Simpan_10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Simpan_10.setText("Simpan");
        Btn_Simpan_10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Simpan_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_10ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Guru");

        Btn_Hapus.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Btn_Hapus.setText("Hapus");
        Btn_Hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Lbl_10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(Lbl_9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Cmbx_Kode_Guru_9, javax.swing.GroupLayout.Alignment.LEADING, 0, 120, Short.MAX_VALUE)
                            .addComponent(Cmbx_Kode_Guru_8, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Kode_Guru_7, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Kode_Guru_6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Kode_Guru_5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Kode_Guru_4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Kode_Guru_3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Kode_Guru_10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Cmbx_Ruang_9, javax.swing.GroupLayout.Alignment.LEADING, 0, 122, Short.MAX_VALUE)
                            .addComponent(Cmbx_Ruang_8, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Ruang_7, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Ruang_6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Ruang_5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Ruang_4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Ruang_3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cmbx_Ruang_10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cmbx_Hari, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Lbl_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(Lbl_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cmbx_Kode_Guru_1, 0, 120, Short.MAX_VALUE)
                            .addComponent(Cmbx_Kode_Guru_2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cmbx_Ruang_1, 0, 122, Short.MAX_VALUE)
                            .addComponent(Cmbx_Ruang_2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Mapel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Nama_Guru_1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Simpan_1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel16)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jButtonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(Btn_Reset_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cmbx_Hari, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Kode_Guru_10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Mapel_10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmbx_Ruang_10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Simpan_10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nama_Guru_10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Reset_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
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

    private void Cmbx_Kode_Guru_1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_1ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_1.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_1.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_1ItemStateChanged

    private void Cmbx_Kode_Guru_2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_2ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_2.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_2.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_2ItemStateChanged

    private void Cmbx_Kode_Guru_3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_3ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_3.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_3.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_3ItemStateChanged

    private void Cmbx_Kode_Guru_4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_4ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_4.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_4.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_4ItemStateChanged

    private void Cmbx_Kode_Guru_5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_5ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_5.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_5.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_5ItemStateChanged

    private void Cmbx_Kode_Guru_6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_6ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_6.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_6.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_6ItemStateChanged

    private void Cmbx_Kode_Guru_7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_7ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_7.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_7.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_7ItemStateChanged

    private void Cmbx_Kode_Guru_8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_8ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_8.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_8.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_8ItemStateChanged

    private void Cmbx_Kode_Guru_9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_9ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_9.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_9.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_9ItemStateChanged

    private void Cmbx_Kode_Guru_10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmbx_Kode_Guru_10ItemStateChanged
        try {
            String kode_guru = evt.getItem().toString();
            String sql = "SELECT * FROM tb_mapel WHERE kode_guru='" + kode_guru + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if (res.next()) {
                String mapel = res.getString("mapel");
                Txt_Mapel_10.setText(mapel);
                String nama_guru = res.getString("nama_guru");
                Txt_Nama_Guru_10.setText(nama_guru);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_Cmbx_Kode_Guru_10ItemStateChanged

    private void Btn_Simpan_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_1ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_1.getText() + "', '" + Cmbx_Kode_Guru_1.getSelectedItem() + "', '" + Txt_Nama_Guru_1.getText() + "', '" + Txt_Mapel_1.getText() + "', '" + Cmbx_Ruang_1.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_1.getText(),
            Cmbx_Ruang_1.getSelectedItem(),
            Txt_Mapel_1.getText(),
            Txt_Nama_Guru_1.getText(),
            Cmbx_Kode_Guru_1.getSelectedItem()});
        ResetData1();
    }//GEN-LAST:event_Btn_Simpan_1ActionPerformed

    private void Btn_Simpan_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_2ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_2.getText() + "', '" + Cmbx_Kode_Guru_2.getSelectedItem() + "', '" + Txt_Nama_Guru_2.getText() + "', '" + Txt_Mapel_2.getText() + "', '" + Cmbx_Ruang_2.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_2.getText(),
            Cmbx_Ruang_2.getSelectedItem(),
            Txt_Mapel_2.getText(),
            Txt_Nama_Guru_2.getText(),
            Cmbx_Kode_Guru_2.getSelectedItem()});
        ResetData2();
    }//GEN-LAST:event_Btn_Simpan_2ActionPerformed

    private void Btn_Simpan_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_3ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_3.getText() + "', '" + Cmbx_Kode_Guru_3.getSelectedItem() + "', '" + Txt_Nama_Guru_3.getText() + "', '" + Txt_Mapel_3.getText() + "', '" + Cmbx_Ruang_3.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_3.getText(),
            Cmbx_Ruang_3.getSelectedItem(),
            Txt_Mapel_3.getText(),
            Txt_Nama_Guru_3.getText(),
            Cmbx_Kode_Guru_3.getSelectedItem()});
        ResetData3();
    }//GEN-LAST:event_Btn_Simpan_3ActionPerformed

    private void Btn_Simpan_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_4ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_4.getText() + "', '" + Cmbx_Kode_Guru_4.getSelectedItem() + "', '" + Txt_Nama_Guru_4.getText() + "', '" + Txt_Mapel_4.getText() + "', '" + Cmbx_Ruang_4.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_4.getText(),
            Cmbx_Ruang_4.getSelectedItem(),
            Txt_Mapel_4.getText(),
            Txt_Nama_Guru_4.getText(),
            Cmbx_Kode_Guru_4.getSelectedItem()});
        ResetData4();
    }//GEN-LAST:event_Btn_Simpan_4ActionPerformed

    private void Btn_Simpan_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_5ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_5.getText() + "', '" + Cmbx_Kode_Guru_5.getSelectedItem() + "', '" + Txt_Nama_Guru_5.getText() + "', '" + Txt_Mapel_5.getText() + "', '" + Cmbx_Ruang_5.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_5.getText(),
            Cmbx_Ruang_5.getSelectedItem(),
            Txt_Mapel_5.getText(),
            Txt_Nama_Guru_5.getText(),
            Cmbx_Kode_Guru_5.getSelectedItem()});
        ResetData5();
    }//GEN-LAST:event_Btn_Simpan_5ActionPerformed

    private void Btn_Simpan_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_6ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_6.getText() + "', '" + Cmbx_Kode_Guru_6.getSelectedItem() + "', '" + Txt_Nama_Guru_6.getText() + "', '" + Txt_Mapel_6.getText() + "', '" + Cmbx_Ruang_6.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_6.getText(),
            Cmbx_Ruang_6.getSelectedItem(),
            Txt_Mapel_6.getText(),
            Txt_Nama_Guru_6.getText(),
            Cmbx_Kode_Guru_6.getSelectedItem()});
        ResetData6();
    }//GEN-LAST:event_Btn_Simpan_6ActionPerformed

    private void Btn_Simpan_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_7ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_7.getText() + "', '" + Cmbx_Kode_Guru_7.getSelectedItem() + "', '" + Txt_Nama_Guru_7.getText() + "', '" + Txt_Mapel_7.getText() + "', '" + Cmbx_Ruang_7.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_7.getText(),
            Cmbx_Ruang_7.getSelectedItem(),
            Txt_Mapel_7.getText(),
            Txt_Nama_Guru_7.getText(),
            Cmbx_Kode_Guru_7.getSelectedItem()});
        ResetData7();
    }//GEN-LAST:event_Btn_Simpan_7ActionPerformed

    private void Btn_Simpan_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_8ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_8.getText() + "', '" + Cmbx_Kode_Guru_8.getSelectedItem() + "', '" + Txt_Nama_Guru_8.getText() + "', '" + Txt_Mapel_8.getText() + "', '" + Cmbx_Ruang_8.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_8.getText(),
            Cmbx_Ruang_8.getSelectedItem(),
            Txt_Mapel_8.getText(),
            Txt_Nama_Guru_8.getText(),
            Cmbx_Kode_Guru_8.getSelectedItem()});
        ResetData8();
    }//GEN-LAST:event_Btn_Simpan_8ActionPerformed

    private void Btn_Simpan_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_9ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_9.getText() + "', '" + Cmbx_Kode_Guru_9.getSelectedItem() + "', '" + Txt_Nama_Guru_9.getText() + "', '" + Txt_Mapel_9.getText() + "', '" + Cmbx_Ruang_9.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_9.getText(),
            Cmbx_Ruang_9.getSelectedItem(),
            Txt_Mapel_9.getText(),
            Txt_Nama_Guru_9.getText(),
            Cmbx_Kode_Guru_9.getSelectedItem()});
        ResetData9();
    }//GEN-LAST:event_Btn_Simpan_9ActionPerformed

    private void Btn_Simpan_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_10ActionPerformed
        try {
            String sql = "INSERT INTO tb_jadwal_mapel VALUES (default,'" + Cmbx_Hari.getSelectedItem() + "', '" + Cmbx_Kelas.getSelectedItem() + "', '" + Lbl_10.getText() + "', '" + Cmbx_Kode_Guru_10.getSelectedItem() + "', '" + Txt_Nama_Guru_10.getText() + "', '" + Txt_Mapel_10.getText() + "', '" + Cmbx_Ruang_10.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
        model.addRow(new Object[]{
            Lbl_10.getText(),
            Cmbx_Ruang_10.getSelectedItem(),
            Txt_Mapel_10.getText(),
            Txt_Nama_Guru_10.getText(),
            Cmbx_Kode_Guru_10.getSelectedItem()});
        ResetData10();
    }//GEN-LAST:event_Btn_Simpan_10ActionPerformed

    private void Btn_Reset_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Reset_TableActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Mereset Data?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            DefaultTableModel dm = (DefaultTableModel) Tbl_Detail_Jadwal.getModel();
            while (dm.getRowCount() > 0) {
                dm.removeRow(0);
            }
        }
    }//GEN-LAST:event_Btn_Reset_TableActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Menghapus Data ini??", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE * FROM tb_jadwal_mapel WHERE id_jadwal_mapel = '" + selectedId + "'";
                PreparedStatement st = con.prepareStatement(sql);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Anda Berhasil Menghapus");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Anda Gagal Menghapus");
            }
        }
    }//GEN-LAST:event_Btn_HapusActionPerformed

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
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Reset_Table;
    private javax.swing.JButton Btn_Simpan_1;
    private javax.swing.JButton Btn_Simpan_10;
    private javax.swing.JButton Btn_Simpan_2;
    private javax.swing.JButton Btn_Simpan_3;
    private javax.swing.JButton Btn_Simpan_4;
    private javax.swing.JButton Btn_Simpan_5;
    private javax.swing.JButton Btn_Simpan_6;
    private javax.swing.JButton Btn_Simpan_7;
    private javax.swing.JButton Btn_Simpan_8;
    private javax.swing.JButton Btn_Simpan_9;
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
    private javax.swing.JLabel Lbl_1;
    private javax.swing.JLabel Lbl_10;
    private javax.swing.JLabel Lbl_2;
    private javax.swing.JLabel Lbl_3;
    private javax.swing.JLabel Lbl_4;
    private javax.swing.JLabel Lbl_5;
    private javax.swing.JLabel Lbl_6;
    private javax.swing.JLabel Lbl_7;
    private javax.swing.JLabel Lbl_8;
    private javax.swing.JLabel Lbl_9;
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
    private javax.swing.JTextField Txt_Nama_Guru_1;
    private javax.swing.JTextField Txt_Nama_Guru_10;
    private javax.swing.JTextField Txt_Nama_Guru_2;
    private javax.swing.JTextField Txt_Nama_Guru_3;
    private javax.swing.JTextField Txt_Nama_Guru_4;
    private javax.swing.JTextField Txt_Nama_Guru_5;
    private javax.swing.JTextField Txt_Nama_Guru_6;
    private javax.swing.JTextField Txt_Nama_Guru_7;
    private javax.swing.JTextField Txt_Nama_Guru_8;
    private javax.swing.JTextField Txt_Nama_Guru_9;
    private javax.swing.JButton jButtonKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
