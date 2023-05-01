package jFrames;

import Logic.DBAction;
import Models.SellingModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Selling extends javax.swing.JFrame {

    static int selectedProductId = -1;
    static int selectedId = -1;
    String name = "";
    double price = 0.0;
    DefaultTableModel model;

    // Selling - contractor
    public Selling() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }

    // پرنتی مەکە
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        barcodeTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        quantityTxt = new javax.swing.JSpinner();
        discountTxt = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        BackLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "product id", "Barcode", "Quantity", "product name", "product price", "discount"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Selling Productes");

        jLabel2.setText("Barcode");

        jLabel3.setText("Quantity");

        jLabel4.setText("Product Name");

        jLabel5.setText("Product Price");

        jLabel6.setText("Discount");

        barcodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeTxtActionPerformed(evt);
            }
        });

        priceTxt.setEditable(false);

        nameTxt.setEditable(false);

        quantityTxt.setModel(new javax.swing.SpinnerNumberModel());
        quantityTxt.setEditor(new javax.swing.JSpinner.NumberEditor(quantityTxt, ""));

        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setText("reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        BackLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BackLbl.setText("< Back");
        BackLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLblMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton5)
                                                .addGap(20, 20, 20))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(218, 218, 218))))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel3))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(BackLbl,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(3, 3, 3)))
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(barcodeTxt,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton7))
                                                        .addComponent(quantityTxt))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(nameTxt))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(priceTxt,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel6)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(discountTxt,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 92,
                                                                        Short.MAX_VALUE)))))
                                .addGap(32, 32, 32)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(35, 35, 35)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4)
                                                        .addComponent(barcodeTxt,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton7))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(quantityTxt,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(discountTxt,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26,
                                                        Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton5)
                                                        .addComponent(jButton6))
                                                .addGap(12, 12, 12))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(BackLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));

        pack();
    }

    // ئەمە کرداری ئینتەرکردن لەسەر باڕکۆد جێبەجێ دەکات
    // Selling - barcode enter
    private void barcodeTxtActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            // ئەمە کرداری سێرچە بۆ بەرهەم بەپێی باڕکۆد
            ResultSet product = DBAction.getProductByBarcode(barcodeTxt.getText());

            // ئەو بەرهەمەی لەم فەنکشنەوە ئەدۆزرێتەوە بە گەڕان لەناو دەیتابەیسەکە بەپێی
            // باڕکۆد، ئەخرێتە ناو تێکست فیڵدەکانی دانراوە بە دیسەیبڵی
            while (product.next()) {

                // ئایدیەکەی ئەدۆزرێتەوو ئەخرێتە ناو ڤاریابڵە گشتیەکەی ئای دی تێ ئەکەین
                selectedProductId = product.getInt(1);

                // ناو و سیعرەکەی بەهەمان شێوەی ئای دیەکەی ئەخرێتە ناو ئەم ڤاریابڵانەی خوارەوە
                name = product.getString(2);
                price = product.getDouble(3);

                // ئەمەش داخڵکردنی ناو و نرخی دۆزراوەیە بۆ ناو تێکست فێڵدەکانیان
                nameTxt.setText(name);
                priceTxt.setText(Double.toString(price));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // ئەم کردارە هەمان کرداری سێرچە بە باڕکۆ و هەمان کۆدە
    // تەنها جیاوازی ئەوەیە ئەم بە بەتنە
    // Selling - search btn
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            ResultSet product = DBAction.getProductByBarcode(barcodeTxt.getText());
            while (product.next()) {
                selectedProductId = product.getInt(1);
                name = product.getString(2);
                price = product.getDouble(3);
                nameTxt.setText(name);
                priceTxt.setText(Double.toString(price));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // داخڵکردنی ئەو بەرهەمەی ئەتەوێ بیفرۆشی بۆ ناو جەی تەیبڵەکە
    // Selling - Add
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        // ئەگەر هیچ ئای دیەک دیاری نەکرابوو کەواتە هێستا سێرچمان نەکردووە بەپێی باڕکۆد
        if (selectedProductId == -1) {
            JOptionPane.showMessageDialog(this, "please select record first by inputing it's barcode");
            return;
        }
        // وەرگرتنەوەی ژمارەی بەرهەمەکە و داشکان
        int quantity = Integer.parseInt(quantityTxt.getValue().toString());
        int discount = Integer.parseInt(discountTxt.getValue().toString());

        try {
            // ناردنی ئۆبجێکتی زانیاریەکانی فرۆشتن
            SellingModel sellingModel = new SellingModel(selectedProductId, quantity, discount);

            // درووستکردنی ئەرەییەکە بۆ داخڵکردنی ئای دی و ناو و سیعر و ژمارە و داشکاندن
            // لەسەر بەرهەمەکەی ئەیفرۆشی
            Object[] row = { sellingModel.getProdictId(), barcodeTxt.getText(), sellingModel.getQuantity(), name, price,
                    sellingModel.getDiscount() };

            // زیاکردنی بەرهەمەکە بۆ ناوی جەی تەیبڵەکە
            model.addRow(row);
        } catch (Exception e) {
        }
    }

    // ئەبدەیت کردنی ئەو بەرهەمەی ئەتەوێ بیفرۆشی
    // Selling - update btn
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // سەرەتا ئەو بەرهەمە لە جەی تەیبڵەکە ئەسڕینەوە بەپێی ئەوەی ژمارەی رۆوەکەی
        // ئەزانین
        //

        model.removeRow(jTable1.getSelectedRow());

        int quantity = Integer.parseInt(quantityTxt.getValue().toString());
        double discount = Double.parseDouble(discountTxt.getValue().toString());

        // دواتر پرۆسەکە وەک زیاکردنی بەرهەمێکە بۆ ناو جەی تەیبڵەکە وەک لە سەرەوەدا
        // باسمان کردووە
        try {
            SellingModel sellingModel = new SellingModel(selectedProductId, quantity, discount);

            Object[] row = { sellingModel.getProdictId(), barcodeTxt.getText(), sellingModel.getQuantity(), name, price,
                    sellingModel.getDiscount() };

            model.addRow(row);
        } catch (Exception e) {
        }

    }

    // ئەمە کرداری سڕینەوەی ئەو ریزەیە کە بەکارهێنەر دیاری کردووە
    // Selling - delete btn
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        model.removeRow(jTable1.getSelectedRow());
    }

    // بەتاڵکردنەوەی زانیارییەکانی ناو تێکست فیڵدەکان
    // Selling - reset btn
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        barcodeTxt.setText(null);
        quantityTxt.setValue(0);
        nameTxt.setText(null);
        priceTxt.setText(null);
        discountTxt.setValue(0);
    }

    // کرداری پڕکردنەوەی تێکست فێڵدەکان کاتێک یەکێک لە ڕیزەکانی جەی تەیبڵەکە دیاری
    // ئەکرێت
    // Selling - jtable click
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 1) {
            int row = jTable1.getSelectedRow();

            selectedId = (int) jTable1.getModel().getValueAt(row, 0);
            String barcode = jTable1.getModel().getValueAt(row, 1).toString();
            String proName = jTable1.getModel().getValueAt(row, 3).toString();
            String proPrice = jTable1.getModel().getValueAt(row, 4).toString();

            barcodeTxt.setText(barcode);
            quantityTxt.setValue((int) jTable1.getModel().getValueAt(row, 2));
            nameTxt.setText(proName);
            priceTxt.setText(proPrice);
            discountTxt.setValue((double) jTable1.getModel().getValueAt(row, 5));
        }
    }

    // ناردنی هەموو ریزەکانی جەی تەیبڵەکە بۆ دەیتابەیس و فرۆشتن
    // واتە ئەمە کردارە سەرەکییەکەیە کە فرۆشتنە
    // Selling - save btn
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            // جەی تەیبڵەکە لێرەوە ئەنێرین بۆ دەیتابەیس لەڕێگەی ئینسێرتەوە
            boolean isCreated = DBAction.addSelling(model);

            if (isCreated) {
                JOptionPane.showMessageDialog(this, "success");
                model.setRowCount(0);
            } else {
                JOptionPane.showMessageDialog(this, "Bbura keshayak ruida");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bbura keshayak ruida" + e.getMessage());
        }
    }

    // ئەمە پرنتکردنی دەیتاکانە بۆ ناق فایلێک لە سیستمەکە
    // Selling - print btn
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            DBAction.printSelling(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // بەتنی باک و گەڕانەوە بۆ هۆم
    // Selling - back btn
    private void BackLblMouseClicked(java.awt.event.MouseEvent evt) {
        new Home().show();
        this.dispose();
    }

    // پرنتی مەکە
    private javax.swing.JLabel BackLbl;
    private javax.swing.JTextField barcodeTxt;
    private javax.swing.JSpinner discountTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JSpinner quantityTxt;
}
