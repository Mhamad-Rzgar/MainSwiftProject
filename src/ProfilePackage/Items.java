package ProfilePackage;

import Models.ItemsModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Items extends javax.swing.JFrame {

    public Items() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#DCE7F7"));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 5, dim.height / 5);

        SaveBtn.setBackground(Color.decode("#1BADDE"));
        SaveBtn.setForeground(Color.white);
        SaveBtn.setBorder(null);

        ClearBtn.setBackground(Color.decode("#F2AB44"));
        ClearBtn.setForeground(Color.white);
        ClearBtn.setBorder(null);

        BackLbl.setForeground(Color.decode("#F2AB44"));

        CommNameTxt.setBackground(Color.decode("#fefefe"));
        nameTxt.setBackground(Color.decode("#fefefe"));
        barcodeTxt.setBackground(Color.decode("#fefefe"));
        BrandTxt.setBackground(Color.decode("#fefefe"));
        TypeTxt.setBackground(Color.decode("#fefefe"));
        UnitTxt.setBackground(Color.decode("#fefefe"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UnitTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        barcodeTxt = new javax.swing.JTextField();
        BrandTxt = new javax.swing.JTextField();
        TypeTxt = new javax.swing.JTextField();
        CommNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        BackLbl = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(777, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        UnitTxt.setBorder(null);
        getContentPane().add(UnitTxt);
        UnitTxt.setBounds(170, 310, 200, 15);

        nameTxt.setBorder(null);
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nameTxt);
        nameTxt.setBounds(170, 190, 200, 15);

        barcodeTxt.setBorder(null);
        getContentPane().add(barcodeTxt);
        barcodeTxt.setBounds(170, 220, 200, 15);

        BrandTxt.setBorder(null);
        getContentPane().add(BrandTxt);
        BrandTxt.setBounds(170, 250, 200, 15);

        TypeTxt.setBorder(null);
        getContentPane().add(TypeTxt);
        TypeTxt.setBounds(170, 280, 200, 15);

        CommNameTxt.setBorder(null);
        CommNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommNameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(CommNameTxt);
        CommNameTxt.setBounds(170, 160, 200, 15);

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Unit");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 310, 120, 15);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Type");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 280, 120, 15);

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Brand");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 250, 120, 15);

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Barcode");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 220, 120, 15);

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("scientific name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 190, 120, 15);

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("commercial name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 160, 120, 15);

        ClearBtn.setText("Clear");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearBtnMouseExited(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ClearBtn);
        ClearBtn.setBounds(50, 380, 100, 25);

        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveBtnMouseExited(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn);
        SaveBtn.setBounds(160, 380, 210, 25);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Rudaw", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("زیادکردنی دەرمان");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 100, 320, 30);

        jPanel1.setBackground(new java.awt.Color(27, 173, 222));
        jPanel1.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfilePackage/kch.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 40, 300, 470);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, -10, 380, 540);

        BackLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BackLbl.setText("< Back");
        BackLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackLblMouseExited(evt);
            }
        });
        getContentPane().add(BackLbl);
        BackLbl.setBounds(20, 20, 60, 15);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void CommNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommNameTxtActionPerformed

    private void ClearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseEntered
        ClearBtn.setBackground(Color.decode("#9CAC82"));
    }//GEN-LAST:event_ClearBtnMouseEntered

    private void ClearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseExited
        ClearBtn.setBackground(Color.decode("#F2AB44"));
    }//GEN-LAST:event_ClearBtnMouseExited

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        CommNameTxt.setText(null);
        nameTxt.setText(null);
        barcodeTxt.setText(null);
        BrandTxt.setText(null);
        TypeTxt.setText(null);
        UnitTxt.setText(null);
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void SaveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseEntered
        SaveBtn.setBackground(Color.decode("#76CEEB"));
    }//GEN-LAST:event_SaveBtnMouseEntered

    private void SaveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseExited
        SaveBtn.setBackground(Color.decode("#1BADDE"));
    }//GEN-LAST:event_SaveBtnMouseExited

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed

        try {

            ItemsModel itemsModel = new ItemsModel(CommNameTxt.getText(), nameTxt.getText(), barcodeTxt.getText(), BrandTxt.getText(), TypeTxt.getText(), UnitTxt.getText());

            JOptionPane.showMessageDialog(this, itemsModel.getStrData(), "You successfully preserve the medical item", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void BackLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLblMouseClicked
        new Home().show();
        this.dispose();
    }//GEN-LAST:event_BackLblMouseClicked

    private void BackLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLblMouseEntered
        BackLbl.setForeground(Color.decode("#9CAC82"));
    }//GEN-LAST:event_BackLblMouseEntered

    private void BackLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLblMouseExited
        BackLbl.setForeground(Color.decode("#F2AB44"));
    }//GEN-LAST:event_BackLblMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLbl;
    private javax.swing.JTextField BrandTxt;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTextField CommNameTxt;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField TypeTxt;
    private javax.swing.JTextField UnitTxt;
    private javax.swing.JTextField barcodeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxt;
    // End of variables declaration//GEN-END:variables
}
