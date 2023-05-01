package ProfilePackage;

import Logic.DBAction;
import Models.RegisterModel;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    String fname = "";
    String user;
    String pass;
    String mob = "";
    int age = 0;

    public Register() {
        initComponents();

        passErrorLbl.setText("");
        male.setActionCommand("male");
        female.setActionCommand("female");
    }

    // پرنتی مەکە
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        fnameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mobTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        SaveBtn = new javax.swing.JButton();
        passTxt = new javax.swing.JPasswordField();
        ageTxt = new javax.swing.JSpinner();
        ErrorLbl = new javax.swing.JLabel();
        passErrorLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RegisterLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 253, 254));
        setMinimumSize(new java.awt.Dimension(777, 500));
        setSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
        });
        addMouseListener(new java.awt.event.MouseAdapter() {

        });
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 150, 80, 15);

        fnameTxt.setBorder(null);
        fnameTxt.setPreferredSize(new java.awt.Dimension(100, 19));
        fnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        getContentPane().add(fnameTxt);
        fnameTxt.setBounds(140, 149, 160, 20);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 180, 80, 15);

        userTxt.setBorder(null);
        userTxt.setPreferredSize(new java.awt.Dimension(100, 19));
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        getContentPane().add(userTxt);
        userTxt.setBounds(140, 180, 160, 19);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 210, 80, 15);

        mobTxt.setBorder(null);
        mobTxt.setPreferredSize(new java.awt.Dimension(100, 19));
        mobTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        getContentPane().add(mobTxt);
        mobTxt.setBounds(140, 240, 160, 19);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Mobile");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 240, 80, 15);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Age");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 270, 80, 15);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 300, 80, 20);

        male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male);
        male.setForeground(new java.awt.Color(51, 51, 51));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        getContentPane().add(male);
        male.setBounds(140, 300, 70, 23);

        female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female);
        female.setForeground(new java.awt.Color(51, 51, 51));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        getContentPane().add(female);
        female.setBounds(220, 300, 70, 23);

        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn);
        SaveBtn.setBounds(40, 380, 270, 30);

        passTxt.setBorder(null);
        passTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passTxtKeyPressed(evt);
            }
        });
        getContentPane().add(passTxt);
        passTxt.setBounds(140, 210, 160, 20);

        ageTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(ageTxt);
        ageTxt.setBounds(140, 270, 160, 20);
        getContentPane().add(ErrorLbl);
        ErrorLbl.setBounds(66, 233, 0, 0);

        passErrorLbl.setForeground(new java.awt.Color(255, 51, 51));
        passErrorLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passErrorLbl.setText("Error Lable");
        getContentPane().add(passErrorLbl);
        passErrorLbl.setBounds(40, 340, 270, 30);

        jPanel1.setBackground(new java.awt.Color(27, 173, 222));
        jPanel1.setLayout(null);

        ExitBtn.setText("Exit");
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            }
        });
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ExitBtn);
        ExitBtn.setBounds(230, 410, 130, 30);

        ClearBtn.setText("Clear");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ClearBtn);
        ClearBtn.setBounds(90, 410, 120, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfilePackage/GRAPHICS.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 60, 300, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, -10, 440, 540);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Rudaw", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("خۆتۆمارکردن");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 80, 260, 50);

        RegisterLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RegisterLbl.setText("Login to your account");
        RegisterLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegisterLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterLblMouseClicked(evt);
            }
        });
        getContentPane().add(RegisterLbl);
        RegisterLbl.setBounds(70, 420, 240, 15);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {
        fnameTxt.setText(null);
        userTxt.setText(null);
        passTxt.setText(null);
        mobTxt.setText(null);
        mobTxt.setText(null);
        ageTxt.setValue(0);
        buttonGroup1.clearSelection();
    }

    // کرداری سەرەکی خۆتۆمارکردن
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {

        // وەرگرتنی نرخەکانی بەکارهێنەر داخوڵی کردووە
        fname = fnameTxt.getText();
        user = userTxt.getText();
        char[] password = passTxt.getPassword();
        pass = new String(password);
        mob = mobTxt.getText();
        age = (int) ageTxt.getValue();

        try {
            // درووستکردنی مۆدێل یاخود کڵاسی ڕیجیستەر و پێدانی ئەونرخانەی بەکارهێنەر داخڵی
            // کردووە
            RegisterModel regMod = new RegisterModel(mob, fname, user, pass, "gander", age, "slimany");

            // وەرگرتنی جێندەر
            // ئەگەر بەتاڵبێت بەکارهێنەر ئاگادار دەکرێتەوە کە تکایە رەگەزەگەت دیاریکە
            if (buttonGroup1.getSelection() == null) {
                JOptionPane.showMessageDialog(this, "Gender must be selected", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // پێدانی نرخی جێندەر بە کڵاسی ڕیجیستەر
            regMod.setGender(buttonGroup1.getSelection().getActionCommand());

            // دەسپێکردنی ئیشە سەرەکیەکانی ریجیستەر
            // ناردنی ناردنی نرخەکانی بەکارهێنەر داخڵی کردووە بۆ دەیتابەیس لەرێگەی
            // کڵاس یاخود مۆدێلی ڕیجیستەرەوە
            boolean isRegisterd = DBAction.registerAction(regMod);

            // ئەنجامی بانگکردنی ئەو فەنکشنەی سەرەوە بە بوولیەن یەتەوە
            // ئەگەر تروو بوو کەواتە سەرکەوتوو بووە و پڕۆگرامەکە ئەچێتە شاشەی لۆگین
            // بۆ ئەوەی بەو ناو و پاسۆردە لۆگین بکات
            if (isRegisterd) {
                Login login = new Login();
                login.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Bbura keshayak ruida");
            }
            // بەکارهێنەر هەریەکێک لە زانیارییەکان بە هەڵە پڕبکاتەوە لێرە ئاگادار دەکرێتەوە
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // داواکردنی داخستنەوەی بەرنامەکە
    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int p = JOptionPane.showConfirmDialog(this, "Do you want to exit this app?", "Exit", JOptionPane.YES_NO_OPTION);

        if (p == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // ئەم کردارە کرداری نووسینە لەسەر تێکست فیلدی پاسۆرد
    // هەر وشەیەک لە پاسۆرددا داخڵ بکرێت لێرە سێری درێژی پاسۆردەکە
    // دەکرێت دوای داخڵکردنەکە
    // ئەگەر لە هەشت کەمتر و لە ١٦ زیاتربێت ئەوە لە شوێنی ئیرەرەکان
    // ئیرەرمان پشانەیات

    // keyPressed ناسراوە بە textField ئەم کردارە لەسەر
    // keyPressed ئەتوانی بەکاربهێنیت لەڕێگەی بەکارهێنانی
    private void passTxtKeyPressed(java.awt.event.KeyEvent evt) {
        int passLen = passTxt.getText().length();

        if (8 <= passLen && passLen < 16) {
            passErrorLbl.setText("");
        } else {
            passErrorLbl.setText("<html>You must enter more then 8 char or less then 16 char</html>");
        }
    }

    // کرداری بەتنی ڕۆشتنە بۆ لۆگین
    private void RegisterLblMouseClicked(java.awt.event.MouseEvent evt) {
        new Login().show();
        this.dispose();
    }

    // ئەم کردارەی خوارەوەیە کە مەینی هەموو ئاپەکەیە و بەرنامەکە لێرەوە ڕەن ئەبێت
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // پرنتی مەکە
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel ErrorLbl;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel RegisterLbl;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JSpinner ageTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobTxt;
    private javax.swing.JLabel passErrorLbl;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
}
