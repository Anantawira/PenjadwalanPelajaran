package penjadwalanpelajaran;

import java.awt.Color;

public class JFrameBeranda extends javax.swing.JFrame {

    public JFrameBeranda() {
        initComponents();
        setExtendedState(JFrameBeranda.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelHariSenin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelLoginToAdmin = new javax.swing.JLabel();
        jPanelHariSelasa = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanelHariKamis = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanelHariJumat = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanelHariRabu = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/logojadwal.png"))); // NOI18N
        jLabel1.setText("Sistem Penjadwalan Pelajaran");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Copyright By");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText(" Ananta Wira | 2021");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelHariSenin.setBackground(new java.awt.Color(0, 102, 153));
        jPanelHariSenin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelHariSenin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHariSenin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHariSeninMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelHariSeninMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHariSeninMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHariSeninMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHariSeninMouseEntered(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconhari.png"))); // NOI18N
        jLabel7.setText("SENIN");

        javax.swing.GroupLayout jPanelHariSeninLayout = new javax.swing.GroupLayout(jPanelHariSenin);
        jPanelHariSenin.setLayout(jPanelHariSeninLayout);
        jPanelHariSeninLayout.setHorizontalGroup(
            jPanelHariSeninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHariSeninLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariSeninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariSeninLayout.createSequentialGroup()
                    .addGap(0, 109, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 110, Short.MAX_VALUE)))
        );
        jPanelHariSeninLayout.setVerticalGroup(
            jPanelHariSeninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHariSeninLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariSeninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariSeninLayout.createSequentialGroup()
                    .addGap(0, 54, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 54, Short.MAX_VALUE)))
        );

        jLabelLoginToAdmin.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelLoginToAdmin.setForeground(new java.awt.Color(0, 102, 153));
        jLabelLoginToAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconlogintoadmin.png"))); // NOI18N
        jLabelLoginToAdmin.setText("Login");
        jLabelLoginToAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLoginToAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelLoginToAdminMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelLoginToAdminMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginToAdminMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLoginToAdminMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLoginToAdminMouseEntered(evt);
            }
        });

        jPanelHariSelasa.setBackground(new java.awt.Color(0, 102, 153));
        jPanelHariSelasa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelHariSelasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHariSelasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHariSelasaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelHariSelasaMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHariSelasaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHariSelasaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHariSelasaMouseEntered(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconhari.png"))); // NOI18N
        jLabel11.setText("SELASA");

        javax.swing.GroupLayout jPanelHariSelasaLayout = new javax.swing.GroupLayout(jPanelHariSelasa);
        jPanelHariSelasa.setLayout(jPanelHariSelasaLayout);
        jPanelHariSelasaLayout.setHorizontalGroup(
            jPanelHariSelasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHariSelasaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariSelasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariSelasaLayout.createSequentialGroup()
                    .addGap(0, 109, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 110, Short.MAX_VALUE)))
        );
        jPanelHariSelasaLayout.setVerticalGroup(
            jPanelHariSelasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHariSelasaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariSelasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariSelasaLayout.createSequentialGroup()
                    .addGap(0, 54, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 54, Short.MAX_VALUE)))
        );

        jPanelHariKamis.setBackground(new java.awt.Color(0, 102, 153));
        jPanelHariKamis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelHariKamis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHariKamis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHariKamisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelHariKamisMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHariKamisMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHariKamisMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHariKamisMouseEntered(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconhari.png"))); // NOI18N
        jLabel13.setText("KAMIS");

        javax.swing.GroupLayout jPanelHariKamisLayout = new javax.swing.GroupLayout(jPanelHariKamis);
        jPanelHariKamis.setLayout(jPanelHariKamisLayout);
        jPanelHariKamisLayout.setHorizontalGroup(
            jPanelHariKamisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHariKamisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariKamisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariKamisLayout.createSequentialGroup()
                    .addGap(0, 109, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 110, Short.MAX_VALUE)))
        );
        jPanelHariKamisLayout.setVerticalGroup(
            jPanelHariKamisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHariKamisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariKamisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariKamisLayout.createSequentialGroup()
                    .addGap(0, 54, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 54, Short.MAX_VALUE)))
        );

        jPanelHariJumat.setBackground(new java.awt.Color(0, 102, 153));
        jPanelHariJumat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelHariJumat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHariJumat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHariJumatMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelHariJumatMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHariJumatMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHariJumatMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHariJumatMouseEntered(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconhari.png"))); // NOI18N
        jLabel15.setText("JUMAT");

        javax.swing.GroupLayout jPanelHariJumatLayout = new javax.swing.GroupLayout(jPanelHariJumat);
        jPanelHariJumat.setLayout(jPanelHariJumatLayout);
        jPanelHariJumatLayout.setHorizontalGroup(
            jPanelHariJumatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHariJumatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariJumatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariJumatLayout.createSequentialGroup()
                    .addGap(0, 109, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 110, Short.MAX_VALUE)))
        );
        jPanelHariJumatLayout.setVerticalGroup(
            jPanelHariJumatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHariJumatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariJumatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariJumatLayout.createSequentialGroup()
                    .addGap(0, 54, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 54, Short.MAX_VALUE)))
        );

        jPanelHariRabu.setBackground(new java.awt.Color(0, 102, 153));
        jPanelHariRabu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelHariRabu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHariRabu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHariRabuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelHariRabuMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHariRabuMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHariRabuMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHariRabuMouseEntered(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjadwalanpelajaran/gambar/iconhari.png"))); // NOI18N
        jLabel17.setText("RABU");

        javax.swing.GroupLayout jPanelHariRabuLayout = new javax.swing.GroupLayout(jPanelHariRabu);
        jPanelHariRabu.setLayout(jPanelHariRabuLayout);
        jPanelHariRabuLayout.setHorizontalGroup(
            jPanelHariRabuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHariRabuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariRabuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariRabuLayout.createSequentialGroup()
                    .addGap(0, 109, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 110, Short.MAX_VALUE)))
        );
        jPanelHariRabuLayout.setVerticalGroup(
            jPanelHariRabuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHariRabuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelHariRabuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHariRabuLayout.createSequentialGroup()
                    .addGap(0, 54, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 54, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jPanelHariKamis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(jPanelHariJumat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jPanelHariSenin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jPanelHariSelasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(jPanelHariRabu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLoginToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jPanelHariSenin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelLoginToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelHariSelasa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelHariRabu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelHariJumat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHariKamis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
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

    private void jLabelLoginToAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginToAdminMouseClicked
        this.dispose();
            new JFrameLogin().setVisible(true);
    }//GEN-LAST:event_jLabelLoginToAdminMouseClicked

    private void jPanelHariSeninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSeninMouseClicked
        this.dispose();
            new penjadwalanpelajaran.hari.JFrameHariSenin().setVisible(true);
    }//GEN-LAST:event_jPanelHariSeninMouseClicked

    private void jPanelHariSelasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSelasaMouseClicked
        this.dispose();
            new penjadwalanpelajaran.hari.JFrameHariSelasa().setVisible(true);
    }//GEN-LAST:event_jPanelHariSelasaMouseClicked

    private void jPanelHariKamisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariKamisMouseClicked
        this.dispose();
            new penjadwalanpelajaran.hari.JFrameHariKamis().setVisible(true);
    }//GEN-LAST:event_jPanelHariKamisMouseClicked

    private void jPanelHariJumatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariJumatMouseClicked
        this.dispose();
            new penjadwalanpelajaran.hari.JFrameHariJumat().setVisible(true);
    }//GEN-LAST:event_jPanelHariJumatMouseClicked

    private void jPanelHariRabuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariRabuMouseClicked
        this.dispose();
            new penjadwalanpelajaran.hari.JFrameHariRabu().setVisible(true);
    }//GEN-LAST:event_jPanelHariRabuMouseClicked

    private void jPanelHariSeninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSeninMouseEntered
        jPanelHariSenin.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariSeninMouseEntered

    private void jPanelHariSeninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSeninMouseExited
        jPanelHariSenin.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelHariSeninMouseExited

    private void jPanelHariSeninMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSeninMousePressed
        jPanelHariSenin.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelHariSeninMousePressed

    private void jPanelHariSeninMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSeninMouseReleased
        jPanelHariSenin.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariSeninMouseReleased

    private void jPanelHariSelasaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSelasaMouseEntered
        jPanelHariSelasa.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariSelasaMouseEntered

    private void jPanelHariSelasaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSelasaMouseExited
        jPanelHariSelasa.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelHariSelasaMouseExited

    private void jPanelHariSelasaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSelasaMousePressed
        jPanelHariSelasa.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelHariSelasaMousePressed

    private void jPanelHariSelasaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariSelasaMouseReleased
        jPanelHariSenin.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariSelasaMouseReleased

    private void jPanelHariRabuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariRabuMouseEntered
        jPanelHariRabu.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariRabuMouseEntered

    private void jPanelHariRabuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariRabuMouseExited
        jPanelHariRabu.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelHariRabuMouseExited

    private void jPanelHariRabuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariRabuMousePressed
        jPanelHariRabu.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelHariRabuMousePressed

    private void jPanelHariRabuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariRabuMouseReleased
        jPanelHariSenin.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariRabuMouseReleased

    private void jPanelHariKamisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariKamisMouseEntered
        jPanelHariKamis.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariKamisMouseEntered

    private void jPanelHariKamisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariKamisMouseExited
        jPanelHariKamis.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelHariKamisMouseExited

    private void jPanelHariKamisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariKamisMousePressed
        jPanelHariKamis.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelHariKamisMousePressed

    private void jPanelHariKamisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariKamisMouseReleased
        jPanelHariKamis.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariKamisMouseReleased

    private void jPanelHariJumatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariJumatMouseEntered
        jPanelHariJumat.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariJumatMouseEntered

    private void jPanelHariJumatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariJumatMouseExited
        jPanelHariJumat.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jPanelHariJumatMouseExited

    private void jPanelHariJumatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariJumatMousePressed
        jPanelHariJumat.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jPanelHariJumatMousePressed

    private void jPanelHariJumatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHariJumatMouseReleased
        jPanelHariJumat.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jPanelHariJumatMouseReleased

    private void jLabelLoginToAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginToAdminMouseEntered
        jLabelLoginToAdmin.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jLabelLoginToAdminMouseEntered

    private void jLabelLoginToAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginToAdminMouseExited
        jLabelLoginToAdmin.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jLabelLoginToAdminMouseExited

    private void jLabelLoginToAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginToAdminMousePressed
        jLabelLoginToAdmin.setBackground(new Color(0, 77, 128));
    }//GEN-LAST:event_jLabelLoginToAdminMousePressed

    private void jLabelLoginToAdminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginToAdminMouseReleased
        jLabelLoginToAdmin.setBackground(new Color(26, 128, 179));
    }//GEN-LAST:event_jLabelLoginToAdminMouseReleased

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
            java.util.logging.Logger.getLogger(JFrameBeranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBeranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBeranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBeranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBeranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLoginToAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelHariJumat;
    private javax.swing.JPanel jPanelHariKamis;
    private javax.swing.JPanel jPanelHariRabu;
    private javax.swing.JPanel jPanelHariSelasa;
    private javax.swing.JPanel jPanelHariSenin;
    // End of variables declaration//GEN-END:variables
}
