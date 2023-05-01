package jFrames;

import Logic.DBAction;
import Models.LoginModel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    // پرنتی مەکە
    private void initComponents() {

        LoginBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        RegisterLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(777, 500));
        setPreferredSize(new java.awt.Dimension(777, 500));
        getContentPane().setLayout(null);

        LoginBtn.setText("Login");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {

        });
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn);
        LoginBtn.setBounds(50, 300, 240, 25);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("UserName");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 180, 60, 15);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 220, 60, 15);

        userTxt.setBorder(null);
        getContentPane().add(userTxt);
        userTxt.setBounds(130, 180, 160, 15);

        passTxt.setBorder(null);
        getContentPane().add(passTxt);
        passTxt.setBounds(130, 220, 160, 15);

        jPanel1.setBackground(new java.awt.Color(27, 173, 222));
        jPanel1.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfilePackage/GRAPHICS.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 50, 300, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 0, 440, 540);

        RegisterLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RegisterLbl.setText("Create New Account");
        RegisterLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegisterLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterLblMouseClicked(evt);
            }
        });
        getContentPane().add(RegisterLbl);
        RegisterLbl.setBounds(50, 330, 240, 15);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Rudaw", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("چوونە ژوورەوە");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 110, 240, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ئەم بەتنە کاری لۆگین جێبەجێ ئەکات
    // login - Login btn
    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            // درووستکردنی مۆدێلی لۆگین بۆی بەیەک جار پاسۆرد و یوزەرنەیم بنێرین بۆ دەیتابەیس
            LoginModel login = new LoginModel(userTxt.getText(), new String(passTxt.getPassword()));

            /*
             * ناردنی مۆدێلی لۆگین بە پاسۆرد و یوزەرەوە بۆ دەیتابەیس لەڕێگەی ئەم کردارەی
             * خوارەوە
             * نەتیجەکەی وەرەگرینەوە بەشێوەی بوولیەن کە پێمان ئەڵێت لۆگینی کردووە یاخود نا
             */
            boolean isLogin = DBAction.loginUser(login);

            // ئەمە ئەگەری ئەوەیە کە لۆگینی کردبێت
            if (isLogin) {
                Home home = new Home();
                home.setVisible(true);
                this.dispose();
            } else { // ئێڵسەکەش ئەگەر لۆگین نەکات پێی دەڵێت پاسۆرد یاخود ناو هەڵەیە
                JOptionPane.showMessageDialog(this, "User name yan Password halaya");
            }
            // لێرە ئەگەر کێشەیەک ڕوویدا لە داخڵکردنی ناو و پاسۆرد بەکارهێنەر ئاگادار
            // دەرکرێتەوە
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }

    // ڕۆشتن بۆ پەیجی خۆتۆمارکردن ئەگەر دەسمان با بە بەتنی خۆتۆمارکردن
    // login - create new account btn
    private void RegisterLblMouseClicked(java.awt.event.MouseEvent evt) {
        new Register().show();
        this.dispose();
    }

    // پرنتی مەکە
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel RegisterLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
}
