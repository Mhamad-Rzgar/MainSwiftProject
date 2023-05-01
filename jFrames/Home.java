package jFrames;

import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    // constrictor
    public Home() {
        initComponents();
    }

    // پرنتی مەکە
    private void initComponents() {

        items = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LogoutLbl = new javax.swing.JLabel();
        RegisterLbl = new javax.swing.JLabel();
        items1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(777, 500));
        getContentPane().setLayout(null);

        items.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        items.setText("Products");
        items.addMouseListener(new java.awt.event.MouseAdapter() {

        });
        items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsActionPerformed(evt);
            }
        });
        getContentPane().add(items);
        items.setBounds(390, 350, 270, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfilePackage/bloom-37 1.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 80, 350, 240);

        jPanel1.setBackground(new java.awt.Color(27, 173, 222));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Rudaw", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("پڕۆژەی دەرمانخانەی کەوسەر");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 20, 460, 100);

        LogoutLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LogoutLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LogoutLbl.setText("Logout");
        LogoutLbl.addMouseListener(new java.awt.event.MouseAdapter() {

        });
        jPanel1.add(LogoutLbl);
        LogoutLbl.setBounds(704, 30, 60, 19);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-20, -10, 890, 240);

        RegisterLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterLbl.setText("Create New Account");
        RegisterLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegisterLbl.addMouseListener(new java.awt.event.MouseAdapter() {

        });
        getContentPane().add(RegisterLbl);
        RegisterLbl.setBounds(300, 400, 170, 15);

        items1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        items1.setText("Selling");
        items1.addMouseListener(new java.awt.event.MouseAdapter() {

        });
        items1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                items1ActionPerformed(evt);
            }
        });
        getContentPane().add(items1);
        items1.setBounds(110, 350, 270, 40);

        pack();
    }

    // ئەم کردارە بۆ لۆگاوتکردنە و چوونە دەرەوەیە و ڕۆشتنە بۆ لۆگین دوای ئەوەی
    // لۆگینمان کرد
    // logout btn
    private void LogoutLblMouseClicked(java.awt.event.MouseEvent evt) {
        int p = JOptionPane.showConfirmDialog(this, "Do you want to Logout?", "Logging out", JOptionPane.YES_NO_OPTION);

        if (p == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }
    }

    // ئەم چوار مێثۆدەی خوارەوە بۆ چوونە بۆ پەیجەکانی تر
    // products btn
    private void itemsActionPerformed(java.awt.event.ActionEvent evt) {
        new Items().setVisible(true);
        this.dispose();
    }

    // Home - image onClick
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {
        new Items().setVisible(true);
        this.dispose();
    }

    // Home - create new account onClick
    private void RegisterLblMouseClicked(java.awt.event.MouseEvent evt) {
        new Register().show();
        this.dispose();
    }

    // Home - selling btn
    private void items1ActionPerformed(java.awt.event.ActionEvent evt) {
        Selling selling = new Selling();
        selling.setVisible(true);
        this.dispose();
    }

    // پرنتی مەکە
    private javax.swing.JLabel LogoutLbl;
    private javax.swing.JLabel RegisterLbl;
    private javax.swing.JButton items;
    private javax.swing.JButton items1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
}
