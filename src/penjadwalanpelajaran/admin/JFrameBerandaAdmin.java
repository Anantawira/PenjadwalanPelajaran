package penjadwalanpelajaran.admin;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import penjadwalanpelajaran.JFrameBeranda;

public class JFrameBerandaAdmin extends javax.swing.JFrame {

    public JFrameBerandaAdmin() {
        initComponents();
        setExtendedState(JFrameBerandaAdmin.MAXIMIZED_BOTH);
        
        tanggal_waktu_sekarang();
    }
    
    public void tanggal_waktu_sekarang(){
        Thread p=new Thread(){
            public void run(){
                for(;;){
                    Calendar cal = new GregorianCalendar();
                    int hari = cal.get(Calendar.DAY_OF_MONTH);
                    int bulan = cal.get(Calendar.MONTH);
                    int tahun = cal.get(Calendar.YEAR);
                    jLabelTanggal.setText(hari+"/"+(bulan+1)+"/"+tahun);
                    
                    int jam = cal.get(Calendar.HOUR);
                    int menit = cal.get(Calendar.MINUTE);
                    int detik = cal.get(Calendar.SECOND);
                    int AM_PM = cal.get(Calendar.AM_PM);
                    
                    String day_night = "";
                        if (AM_PM == 1){
                            day_night = "PM";
                        } else {
                            day_night = "AM";                         
                        }
                        
                    String waktuu = jam + ":" + menit + ":" + detik + " " + day_night;
                    jLabelWaktu.setText(waktuu);
                    
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JFrameBeranda.class.getName()).log(Level.SEVERE, null, ex);
                    }               
                }
            }
        };
        p.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelLihatJadwal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelBuatJadwal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelDataKelas = new javax.swing.JPanel();
        jLabelDataKelas = new javax.swing.JLabel();
        jPanelDataMapel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelDataGuru = new javax.swing.JPanel();
        jLabelDataGuru = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabelLogOut = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelTanggal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabelWaktu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 134));

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/logojadwal.png"))); // NOI18N
        jLabel1.setText("SISTEM PENJADWALAN PELAJARAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 73));

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Copyright By");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ananta Wira | 2021");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(598, 598, 598)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLihatJadwal.setBackground(new java.awt.Color(0, 102, 153));
        jPanelLihatJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelLihatJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelLihatJadwalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelLihatJadwalMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLihatJadwalMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelLihatJadwalMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelLihatJadwalMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconlihatjadwal.png"))); // NOI18N
        jLabel4.setText(" Lihat Jadwal");

        javax.swing.GroupLayout jPanelLihatJadwalLayout = new javax.swing.GroupLayout(jPanelLihatJadwal);
        jPanelLihatJadwal.setLayout(jPanelLihatJadwalLayout);
        jPanelLihatJadwalLayout.setHorizontalGroup(
            jPanelLihatJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLihatJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLihatJadwalLayout.setVerticalGroup(
            jPanelLihatJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLihatJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelBuatJadwal.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBuatJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBuatJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBuatJadwalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelBuatJadwalMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBuatJadwalMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBuatJadwalMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBuatJadwalMouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconbuatjadwal.png"))); // NOI18N
        jLabel5.setText("Buat Jadwal");

        javax.swing.GroupLayout jPanelBuatJadwalLayout = new javax.swing.GroupLayout(jPanelBuatJadwal);
        jPanelBuatJadwal.setLayout(jPanelBuatJadwalLayout);
        jPanelBuatJadwalLayout.setHorizontalGroup(
            jPanelBuatJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuatJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBuatJadwalLayout.setVerticalGroup(
            jPanelBuatJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuatJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelDataKelas.setBackground(new java.awt.Color(0, 102, 153));
        jPanelDataKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelDataKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelDataKelasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelDataKelasMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDataKelasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelDataKelasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelDataKelasMouseEntered(evt);
            }
        });

        jLabelDataKelas.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabelDataKelas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataKelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDataKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/icondatakelas.png"))); // NOI18N
        jLabelDataKelas.setText(" Data Kelas");

        javax.swing.GroupLayout jPanelDataKelasLayout = new javax.swing.GroupLayout(jPanelDataKelas);
        jPanelDataKelas.setLayout(jPanelDataKelasLayout);
        jPanelDataKelasLayout.setHorizontalGroup(
            jPanelDataKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataKelasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDataKelasLayout.setVerticalGroup(
            jPanelDataKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataKelasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelDataMapel.setBackground(new java.awt.Color(0, 102, 153));
        jPanelDataMapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelDataMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelDataMapelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelDataMapelMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDataMapelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelDataMapelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelDataMapelMouseEntered(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/icondatamapel.png"))); // NOI18N
        jLabel7.setText(" Data Mapel");

        javax.swing.GroupLayout jPanelDataMapelLayout = new javax.swing.GroupLayout(jPanelDataMapel);
        jPanelDataMapel.setLayout(jPanelDataMapelLayout);
        jPanelDataMapelLayout.setHorizontalGroup(
            jPanelDataMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDataMapelLayout.setVerticalGroup(
            jPanelDataMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelDataGuru.setBackground(new java.awt.Color(0, 102, 153));
        jPanelDataGuru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelDataGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelDataGuruMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelDataGuruMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDataGuruMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelDataGuruMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelDataGuruMouseEntered(evt);
            }
        });

        jLabelDataGuru.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabelDataGuru.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataGuru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDataGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/icondataguru.png"))); // NOI18N
        jLabelDataGuru.setText(" Data Guru");

        javax.swing.GroupLayout jPanelDataGuruLayout = new javax.swing.GroupLayout(jPanelDataGuru);
        jPanelDataGuru.setLayout(jPanelDataGuruLayout);
        jPanelDataGuruLayout.setHorizontalGroup(
            jPanelDataGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataGuruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataGuru, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDataGuruLayout.setVerticalGroup(
            jPanelDataGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataGuruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataGuru, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/loginasadmin.png"))); // NOI18N
        jLabel9.setText("Login as Admin");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelLogOut.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelLogOut.setForeground(new java.awt.Color(0, 102, 153));
        jLabelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconlogout.png"))); // NOI18N
        jLabelLogOut.setText("LogOut");
        jLabelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Tanggal :");

        jLabelTanggal.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabelTanggal.setForeground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Waktu :");

        jLabelWaktu.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabelWaktu.setForeground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWaktu, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelWaktu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jPanelDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(jPanelDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jPanelDataMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jPanelLihatJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jPanelBuatJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBuatJadwal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelLihatJadwal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDataMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        this.dispose();
        new penjadwalanpelajaran.JFrameBeranda().setVisible(true);
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jPanelLihatJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLihatJadwalMouseClicked
        this.dispose();
            new JFrameLihatMapel().setVisible(true);
    }//GEN-LAST:event_jPanelLihatJadwalMouseClicked

    private void jPanelDataKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataKelasMouseClicked
        this.dispose();
            new JFrameAdminDataKelas().setVisible(true);
    }//GEN-LAST:event_jPanelDataKelasMouseClicked

    private void jPanelDataGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataGuruMouseClicked
        this.dispose();
            new JFrameAdminDataGuru().setVisible(true);
    }//GEN-LAST:event_jPanelDataGuruMouseClicked

    private void jPanelDataMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataMapelMouseClicked
        this.dispose();
            new JFrameAdminDataMapel().setVisible(true);
    }//GEN-LAST:event_jPanelDataMapelMouseClicked

    private void jPanelLihatJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLihatJadwalMouseEntered
        jPanelLihatJadwal.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelLihatJadwalMouseEntered

    private void jPanelLihatJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLihatJadwalMouseExited
        jPanelLihatJadwal.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelLihatJadwalMouseExited

    private void jPanelLihatJadwalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLihatJadwalMousePressed
        jPanelLihatJadwal.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelLihatJadwalMousePressed

    private void jPanelLihatJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLihatJadwalMouseReleased
        jPanelLihatJadwal.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelLihatJadwalMouseReleased

    private void jPanelBuatJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuatJadwalMouseClicked
        this.dispose();
            new JFrameAdminBuatJadwal().setVisible(true);
    }//GEN-LAST:event_jPanelBuatJadwalMouseClicked

    private void jPanelBuatJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuatJadwalMouseEntered
        jPanelBuatJadwal.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBuatJadwalMouseEntered

    private void jPanelBuatJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuatJadwalMouseExited
        jPanelBuatJadwal.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelBuatJadwalMouseExited

    private void jPanelBuatJadwalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuatJadwalMousePressed
        jPanelBuatJadwal.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelBuatJadwalMousePressed

    private void jPanelBuatJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuatJadwalMouseReleased
        jPanelBuatJadwal.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelBuatJadwalMouseReleased

    private void jPanelDataKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataKelasMouseEntered
        jPanelDataKelas.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelDataKelasMouseEntered

    private void jPanelDataKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataKelasMouseExited
        jPanelDataKelas.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelDataKelasMouseExited

    private void jPanelDataKelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataKelasMousePressed
        jPanelDataKelas.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelDataKelasMousePressed

    private void jPanelDataKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataKelasMouseReleased
        jPanelDataKelas.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelDataKelasMouseReleased

    private void jPanelDataGuruMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataGuruMouseEntered
        jPanelDataGuru.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelDataGuruMouseEntered

    private void jPanelDataGuruMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataGuruMouseExited
        jPanelDataGuru.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelDataGuruMouseExited

    private void jPanelDataGuruMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataGuruMousePressed
        jPanelDataGuru.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelDataGuruMousePressed

    private void jPanelDataGuruMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataGuruMouseReleased
        jPanelDataGuru.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelDataGuruMouseReleased

    private void jPanelDataMapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataMapelMouseEntered
        jPanelDataMapel.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelDataMapelMouseEntered

    private void jPanelDataMapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataMapelMouseExited
        jPanelDataMapel.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelDataMapelMouseExited

    private void jPanelDataMapelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataMapelMousePressed
        jPanelDataMapel.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelDataMapelMousePressed

    private void jPanelDataMapelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDataMapelMouseReleased
        jPanelDataMapel.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelDataMapelMouseReleased

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
            java.util.logging.Logger.getLogger(JFrameBerandaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBerandaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBerandaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBerandaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBerandaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDataGuru;
    private javax.swing.JLabel jLabelDataKelas;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelTanggal;
    private javax.swing.JLabel jLabelWaktu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelBuatJadwal;
    private javax.swing.JPanel jPanelDataGuru;
    private javax.swing.JPanel jPanelDataKelas;
    private javax.swing.JPanel jPanelDataMapel;
    private javax.swing.JPanel jPanelLihatJadwal;
    // End of variables declaration//GEN-END:variables
}
