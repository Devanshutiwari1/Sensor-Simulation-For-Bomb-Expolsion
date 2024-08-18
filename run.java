
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class run extends javax.swing.JPanel {

    public run() {
        initComponents();
    }

    private void initComponents() {
        JLabel timeLabel;
        timeLabel = new JLabel("Time: ");
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lablong1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnsen1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        lablat1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lablong2 = new javax.swing.JLabel();
        btnsen2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lablat2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabelstop = new javax.swing.JLabel();
        btnserver = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        btntruncate = new javax.swing.JButton();
        btnshowdata = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableModel = new DefaultTableModel();
        tblsql = new javax.swing.JTable(tableModel);

        setBackground(new java.awt.Color(234, 239, 229));
        setToolTipText("");
        setFocusCycleRoot(true);

        jPanel1.setBackground(new java.awt.Color(0, 62, 132));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new Font("SansSerif", Font.BOLD, 18));
        jLabel1.setText("SENSOR SIMULATION");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLIENT-SERVER");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COMMUNICATION");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PROJECT");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drdo_logo_0.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 125, 125));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("!! COMMAND LINE !!");

        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("SansSerif", Font.ITALIC, 13));
        timeLabel.setBounds(50, 150, 200, 30);
        jPanel1.add(timeLabel);

        // Update time label
        Timer timer = new Timer(1000, (ActionEvent e) -> {
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date(System.currentTimeMillis());
            timeLabel.setText("Time: " + formatter.format(date));
        });
        timer.start();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jLabel6)
                                                                .addGap(177, 177, 177)
                                                                .addComponent(jLabel2)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(34, 34, 34)
                                                                .addComponent(jLabel7,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 464,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        320, Short.MAX_VALUE)))
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel5,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3,
                                                                javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(35, 35, 35)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 119,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N

        lablong1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lablong1.setText("73.0443 ° E");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel18.setText("Longitude :");

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel19.setText("Latitude    :");

        btnsen1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnsen1.setText("START");
        btnsen1.setMargin(new java.awt.Insets(3, 8, 3, 8));
        btnsen1.addContainerListener(new java.awt.event.ContainerAdapter() {
            @Override
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                btnsen1ComponentRemoved(evt);
            }
        });
        btnsen1.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnsen1ActionPerformed(evt);
        });

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel20.setText("Sensor 1 :");

        lablat1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lablat1.setText("26.3427 ° N");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnsen1))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addGap(18, 18, 18)
                                                .addComponent(lablong1))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addGap(18, 18, 18)
                                                .addComponent(lablat1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(lablat1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(lablong1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(btnsen1, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(16, Short.MAX_VALUE)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N
        jPanel4.setMaximumSize(new java.awt.Dimension(300, 200));
        jPanel4.setPreferredSize(new java.awt.Dimension(255, 150));

        lablong2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lablong2.setText("73.0046  ° E");

        btnsen2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnsen2.setText("START");
        btnsen2.setMargin(new java.awt.Insets(3, 8, 3, 8));
        btnsen2.addContainerListener(new java.awt.event.ContainerAdapter() {
            @Override
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                btnsen2ComponentRemoved(evt);
            }
        });
        btnsen2.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnsen2ActionPerformed(evt);
        });

        jLabel23.setText("Latitude    :");

        jLabel24.setText("Longitude :");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Sensor 2   : ");

        lablat2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lablat2.setText("26.2626  ° N");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnsen2))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel24)
                                                        .addComponent(jLabel23))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lablat2)
                                                        .addComponent(lablong2))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel23))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel4Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(lablat2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(lablong2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnsen2, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("START SERVER :");

        jLabelstop.setBackground(new java.awt.Color(204, 204, 204));
        jLabelstop.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabelstop.setForeground(new java.awt.Color(102, 102, 102));
        jLabelstop.setText("");

        btnserver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnserver.setText("START");
        btnserver.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnserverActionPerformed(evt);
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnserver, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabelstop)
                                                .addGap(87, 87, 87)))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(11, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnserver)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelstop)
                                .addGap(12, 12, 12))
        );

        jPanel5.setBackground(new java.awt.Color(234, 239, 229));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N

        jToggleButton1.setText("Click");
        jToggleButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jToggleButton1ActionPerformed(evt);
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Time Format Location :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jToggleButton1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        btntruncate.setText("DELETE DATA");
        btntruncate.addActionListener((java.awt.event.ActionEvent evt) -> {
            btntruncateActionPerformed(evt);
        });

        btnshowdata.setText("SHOW DATA");
        btnshowdata.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnshowdataActionPerformed(evt);
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("DATABASE TABLE");

        tblsql.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{{null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
                },
                new String[]{
                    "ID", "SensorID", "latitude ", "longitude_°E", "Current_Day", "TimeStamp", "site_on_going",
                    "sensor_health", "capacity_KT"
                }));

        jScrollPane2.setViewportView(tblsql);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8)
                                                .addGap(284, 284, 284))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnshowdata)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btntruncate))
                                                        .addComponent(jScrollPane2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 662,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel6,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jPanel2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel4,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 111,
                                                                        Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                        Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnshowdata)
                                                        .addComponent(btntruncate))))
                                .addGap(75, 75, 75)));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>

    private void btnsen1ComponentRemoved(java.awt.event.ContainerEvent evt) {
        // TODO add your handling code here:
    }

    private void btnserverActionPerformed(ActionEvent evt) {
        // JOptionPane.showMessageDialog(this, "SERVER IS STARTING");

        new Thread(() -> {
            try {
                // Your server start logic here
                ProcessBuilder serverBuilder = new ProcessBuilder(
                        "javac",
                        "src/net/UDPser.java",
                        "src/serverfiles/Networkinfoserver.java",
                        "src/Databasefiles/Databasehandler.java"
                );
                serverBuilder.redirectErrorStream(true);
                Process serverProcess = serverBuilder.start();

                BufferedReader serverOutput = new BufferedReader(
                        new InputStreamReader(serverProcess.getInputStream()));
                String output;
                while ((output = serverOutput.readLine()) != null) {
                    System.out.println(output);
                }
                serverProcess.waitFor();

                // Check if compilation was successful
                if (serverProcess.exitValue() == 0) {
                    System.out.println("Compilation successful.");

                    // Run the compiled Java program from the 'bin' directory
                    ProcessBuilder runBuilder = new ProcessBuilder(
                            "java", "src/net/UDPser.java");
                    runBuilder.redirectErrorStream(true);
                    Process runProcess = runBuilder.start();
                    BufferedReader runOutput = new BufferedReader(
                            new InputStreamReader(runProcess.getInputStream()));
                    while ((output = runOutput.readLine()) != null) {
                        System.out.println(output);
                    }
                    runProcess.waitFor();
                } else {
                    System.out.println("Compilation failed.");
                }

                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(null, "SERVER STARTED");
                });
            } catch (IOException | InterruptedException ex) {
                ex.printStackTrace();
            }
        }).start();
    }

    private void btnsen1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "SENSOR 1 IS STARTING");

        new Thread(() -> {
            try {
                // Compile the client files
                ProcessBuilder compileBuilder = new ProcessBuilder(
                        "javac", "src/files/Networkdetail.java", "src/net/UDPcli.java"
                );
                compileBuilder.redirectErrorStream(true);
                Process compileProcess = compileBuilder.start();

                BufferedReader compileOutput = new BufferedReader(
                        new InputStreamReader(compileProcess.getInputStream()));
                String output;
                while ((output = compileOutput.readLine()) != null) {
                    System.out.println(output);
                }
                compileProcess.waitFor();

                if (compileProcess.exitValue() == 0) {
                    // Start the client if compilation is successful
                    ProcessBuilder runBuilder = new ProcessBuilder(
                            "java", "src/net/UDPcli.java"
                    );
                    runBuilder.redirectErrorStream(true);
                    Process runProcess = runBuilder.start();

                    BufferedReader runOutput = new BufferedReader(
                            new InputStreamReader(runProcess.getInputStream()));
                    while ((output = runOutput.readLine()) != null) {
                        System.out.println(output);
                    }
                    runProcess.waitFor();
                } else {
                    System.out.println("Compilation failed.");
                }

                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(null, "SENSOR 1 DATA SENT !!");
                });
            } catch (IOException | InterruptedException ex) {
                ex.printStackTrace();
            }
        }).start();
    }

    private void btnsen2ComponentRemoved(java.awt.event.ContainerEvent evt) {
        // TODO add your handling code here:
    }

    private void btnsen2ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "SENSOR 2 IS STARTING");

        new Thread(() -> {
            try {
                // Compile the client files
                ProcessBuilder compileBuilder = new ProcessBuilder(
                        "javac",
                        "src/files/Networkdetail.java",
                        "src/net/UDPcli1.java"
                );
                compileBuilder.redirectErrorStream(true);
                Process compileProcess = compileBuilder.start();

                BufferedReader compileOutput = new BufferedReader(
                        new InputStreamReader(compileProcess.getInputStream()));
                String output;
                while ((output = compileOutput.readLine()) != null) {
                    System.out.println(output);
                }
                compileProcess.waitFor();

                if (compileProcess.exitValue() == 0) {
                    // Start the client if compilation is successful
                    ProcessBuilder runBuilder = new ProcessBuilder(
                            "java", "src/net/UDPcli1.java"
                    );
                    runBuilder.redirectErrorStream(true);
                    Process runProcess = runBuilder.start();

                    BufferedReader runOutput = new BufferedReader(
                            new InputStreamReader(runProcess.getInputStream()));
                    while ((output = runOutput.readLine()) != null) {
                        System.out.println(output);
                    }
                    runProcess.waitFor();
                } else {
                    System.out.println("Compilation failed.");
                }

                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(null, "SENSOR 2 DATA SENT !!");
                });
            } catch (IOException | InterruptedException ex) {
                System.out.println("Database error: " + ex.getMessage());
            }
        }).start();
    }

    //SQL DATABASE
    private void fetchDataFromDatabase() {
        String url = "jdbc:mysql://localhost:3306/drdo_server";
        String username = "root";
        String password = "9160";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Create and execute the query
            statement = connection.createStatement();
            String query = "SELECT * FROM sensordata"; // Replace with your table name
            resultSet = statement.executeQuery(query);

            // Get the table model
            DefaultTableModel tableModel = (DefaultTableModel) tblsql.getModel();

            // Clear any existing data
            tableModel.setRowCount(0);
            tableModel.setColumnCount(0);

            // Get metadata to dynamically add columns
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Add column names to the table model
            for (int column = 1; column <= columnCount; column++) {
                tableModel.addColumn(metaData.getColumnName(column));
            }

            // Add rows to the table model
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int column = 1; column <= columnCount; column++) {
                    rowData[column - 1] = resultSet.getObject(column);
                }
                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        } finally {
            // Clean up database resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());
            }
        }
    }

    private void TruncateSensorData() {

        String url = "jdbc:mysql://localhost:3306/drdo_server"; // Your database URL
        String username = "root"; // Your database username
        String password = "9160"; // Your database password

        Connection connection = null;
        Statement statement = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Create the statement object
            statement = connection.createStatement();

            // Execute the TRUNCATE command
            String sql = "TRUNCATE sensordata";
            statement.executeUpdate(sql);
            System.out.println("Table 'sensordata' has been truncated successfully.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            // Clean up database resources
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());
            }
        }

    }

    private void btntruncateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        TruncateSensorData();
        JOptionPane.showMessageDialog(this, "DATA SUCCESSFULLY DELETED");
        fetchDataFromDatabase();
    }

    private void btnshowdataActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        fetchDataFromDatabase();
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jToggleButton1.addActionListener((ActionEvent e) -> {
            // Get the current number from the label

            String lat1Text = lablat1.getText().replaceAll("[^0-9.]", "").trim();
            String lat2Text = lablat2.getText().replaceAll("[^0-9.]", "").trim();
            String long1Text = lablong1.getText().replaceAll("[^0-9.]", "").trim();
            String long2Text = lablong2.getText().replaceAll("[^0-9.]", "").trim();

            // Parse the cleaned strings to doubles
            double latitude_1 = Double.parseDouble(lat1Text);
            double latitude_2 = Double.parseDouble(lat2Text);
            double longitude_1 = Double.parseDouble(long1Text);
            double longitude_2 = Double.parseDouble(long2Text);

            // Toggle the number
            if (latitude_1 == 26.3427 || latitude_2 == 26.2626) {
                int latDegrees_1 = (int) latitude_1;
                double latMinutes_1 = (latitude_1 - latDegrees_1) * 60;
                int latSeconds_1 = (int) ((latMinutes_1 - (int) latMinutes_1) * 60);
                char latHemisphere_1 = latitude_1 >= 0 ? 'N' : 'S';

                int latDegrees_2 = (int) latitude_2;
                double latMinutes_2 = (latitude_2 - latDegrees_2) * 60;
                int latSeconds_2 = (int) ((latMinutes_2 - (int) latMinutes_2) * 60);
                char latHemisphere_2 = latitude_2 >= 0 ? 'N' : 'S';

                // Format and print the coordinates
                String formattedLatitude_1 = String.format("%d° %.2f' %d\" %c", latDegrees_1, latMinutes_1, latSeconds_1, latHemisphere_1);
                String formattedLatitude_2 = String.format("%d° %.2f' %d\" %c", latDegrees_2, latMinutes_2, latSeconds_2, latHemisphere_2);
                lablat1.setText(formattedLatitude_1);
                lablat2.setText(formattedLatitude_2);

            } else {
                lablat1.setText("26.3427 ° N");
                lablat2.setText("26.2626 ° N");
            }

            if (longitude_1 == 73.0443 && longitude_2 == 73.0046) {
                int lonDegrees_1 = (int) longitude_1;
                double lonMinutes_1 = (longitude_1 - lonDegrees_1) * 60;
                int lonSeconds_1 = (int) ((lonMinutes_1 - (int) lonMinutes_1) * 60);
                char lonHemisphere_1 = longitude_1 >= 0 ? 'E' : 'W';

                int lonDegrees_2 = (int) longitude_2;
                double lonMinutes_2 = (longitude_2 - lonDegrees_2) * 60;
                int lonSeconds_2 = (int) ((lonMinutes_2 - (int) lonMinutes_2) * 60);
                char lonHemisphere_2 = longitude_2 >= 0 ? 'E' : 'W';

                // Format and print the coordinates
                String formattedLongitude_1 = String.format("%d° %.2f' %d\" %c", lonDegrees_1, lonMinutes_1, lonSeconds_1, lonHemisphere_1);
                String formattedLongitude_2 = String.format("%d° %.2f' %d\" %c", lonDegrees_2, lonMinutes_2, lonSeconds_2, lonHemisphere_2);
                lablong1.setText(formattedLongitude_1);
                lablong2.setText(formattedLongitude_2);

            } else {
                lablong1.setText("73.0443 ° E");
                lablong2.setText("73.0046 ° E");
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnsen1;
    private javax.swing.JButton btnsen2;
    private javax.swing.JButton btnserver;
    private javax.swing.JButton btnshowdata;
    private javax.swing.JButton btntruncate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelstop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lablat1;
    private javax.swing.JLabel lablat2;
    private javax.swing.JLabel lablong1;
    private javax.swing.JLabel lablong2;
    private javax.swing.JTable tblsql;
    private DefaultTableModel tableModel;

    // End of variables declaration
    public static void main(String[] args) {

        JFrame frame = new JFrame("JAVA SENSOR SIMULATION FOR BOMB DETECTION");
        ImageIcon icon = new ImageIcon("server.png");
        frame.setIconImage(icon.getImage());
        frame.setContentPane(new run());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
