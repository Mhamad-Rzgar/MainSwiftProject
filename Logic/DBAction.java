package Logic;

import Models.ItemsModel;
import Models.LoginModel;
import Models.RegisterModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBAction {

    // لینکی دەیتابەیسەکە
    private static final String URL = "jdbc:mysql://localhost:3307/Pharmacy";

    // مێثۆدی لۆگین
    public static boolean loginUser(LoginModel loginModel) throws Exception {
        // connect to db
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        // سەلێکت کردنی یوزەر بەپێی ناو و پاسۆرد
        String query = "select * from user where username=? AND password=?";

        PreparedStatement pst = conn.prepareStatement(query);

        // ئەمە لەجێدانانی نیشانە پرسیارەکانە لەناو کیوریەکە بۆ چارەسەری سقڵ ئینجێکشن
        pst.setString(1, loginModel.getUserName());
        pst.setString(2, loginModel.getPassword());

        // جێبەجێکردنی کیوریەکە
        ResultSet data = pst.executeQuery();

        boolean result = false;

        // ئەگەر یوزەرەکە دۆزرایەوە لێرە ریزوڵت ئەکرێ بە تروو و ئاگاداری یوزەر ئەکەین کە
        // لۆگین ئەبێ و توزەر و پاسی راستە
        if (data.next()) {
            result = true;
        }

        conn.close();
        return result;
    }

    public static boolean registerAction(RegisterModel regMod) throws Exception {
        // connect to db
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        // turn off AutoCommit to make the request with transaction
        conn.setAutoCommit(false);

        // کیوری: درووستکردنی یوزەر و بەستنەوەی بە پرۆفایل، کە لەرێگەی وەرگرتنەوەی کۆتا
        // ئای دی داخڵکراو ئەبێت.
        String sql = "INSERT INTO profile (name, phoneNumber, age, gender, address) VALUES(?, ?, ?, ?, ?);";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, regMod.getName());
        stmt.setString(2, regMod.getMobile());
        stmt.setString(3, Integer.toString(regMod.getAge()));
        stmt.setString(4, regMod.getGender());
        System.out.println(regMod.getAddress());
        stmt.setString(5, regMod.getAddress());

        int rowsInserted2 = stmt.executeUpdate();

        // کیوری: درووستکردنی یوزەر و بەستنەوەی بە پرۆفایل، کە لەرێگەی وەرگرتنەوەی کۆتا
        // ئای دی داخڵکراو ئەبێت.
        sql = "INSERT INTO user (username, password, profileId) VALUES(?, ?, LAST_INSERT_ID());";
        stmt = conn.prepareStatement(sql);

        // ئەمە لەجێدانانی نیشانە پرسیارەکانە لەناو کیوریەکە بۆ چارەسەری سقڵ ئینجێکشن
        stmt.setString(1, regMod.getUsername());
        stmt.setString(2, regMod.getPassword());

        int rowsInserted = stmt.executeUpdate();

        boolean result = false;

        if (rowsInserted > 0 && rowsInserted2 > 0) {
            result = true;
        }

        // بە ڕەنکردنی کۆمیت، هەردوو کیوریەکە بەیەکەوە ڕەن ئەبن یەک لەدوای یەک
        conn.commit();
        conn.close();
        return result;
    }

    public static boolean addProduct(ItemsModel itemsModel) throws Exception {
        // connect to db
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        // زیاکردنی بەرهەم
        String sql = "INSERT INTO products (barcode, scientificName, commercialName, category, brand, type, quanitity, expireDate, buyingPrice, sellingPrice) VALUES(?, ?, ?, ?, ?, ?, ? , ? , ? , ?);";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, itemsModel.getBarcode());
        stmt.setString(2, itemsModel.getScinteficName());
        stmt.setString(3, itemsModel.getCommercialName());
        stmt.setString(4, itemsModel.getCatigory());
        stmt.setString(5, itemsModel.getBrand());
        stmt.setString(6, itemsModel.getType());

        stmt.setString(7, itemsModel.getQuantity());
        stmt.setString(8, itemsModel.getExpireDate());
        stmt.setString(9, itemsModel.getBuyingPrice());
        stmt.setString(10, itemsModel.getSellingPrice());

        int rowsInserted = stmt.executeUpdate();

        boolean result = false;

        if (rowsInserted > 0) {
            result = true;
        }

        conn.close();
        return result;
    }

    public static boolean updateProductById(ItemsModel itemsModel, int selectedId) throws Exception {
        // connect to db
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        // ئابدەیت کردنەوەی بەرهەم بە ئای دی
        String sql = "UPDATE products SET barcode = ?, scientificName = ?, commercialName = ?, category = ?, brand = ?, type = ?, quanitity = ?, expireDate = ?, buyingPrice = ?, sellingPrice = ? WHERE id = ?;";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, itemsModel.getBarcode());
        stmt.setString(2, itemsModel.getScinteficName());
        stmt.setString(3, itemsModel.getCommercialName());
        stmt.setString(4, itemsModel.getCatigory());
        stmt.setString(5, itemsModel.getBrand());
        stmt.setString(6, itemsModel.getType());
        stmt.setString(7, itemsModel.getQuantity());
        stmt.setString(8, itemsModel.getExpireDate());
        stmt.setString(9, itemsModel.getBuyingPrice());
        stmt.setString(10, itemsModel.getSellingPrice());

        // ئەمە لەجێدانانی نیشانە پرسیارەکانە لەناو کیوریەکە بۆ چارەسەری سقڵ ئینجێکشن
        stmt.setInt(11, selectedId);

        int rowsInserted = stmt.executeUpdate();

        boolean result = false;

        if (rowsInserted > 0) {
            result = true;
        }

        conn.close();
        return result;
    }

    public static boolean deleteProduct(int productId) throws Exception {
        // connect to db
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        // سڕینەوەی بەرهەم بە ئای دی
        String query = "DELETE FROM products WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);

        // ئەمە لەجێدانانی نیشانە پرسیارەکانە لەناو کیوریەکە بۆ چارەسەری سقڵ ئینجێکشن
        stmt.setInt(1, productId);

        int rowsAffected = stmt.executeUpdate();

        boolean success = false;

        if (rowsAffected > 0) {
            success = true;
        }

        stmt.close();

        return success;
    }

    public static ResultSet getAllProducts() throws Exception {
        // connect to db
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        // گەڕانەوەی هەموو زانیاریەکانی خشتەی بەرهەم، بۆ پشاندانەوەی لە جەی تەیبڵەکەمان
        // دواتر
        String sql = "select * from products;";

        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet data = stmt.executeQuery();
        return data;
    }

    public static ResultSet getProductByBarcode(String barcode) throws Exception {
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        // گەڕانەوەی ناوی بەرهەم و نرخی بەرهەم بە باڕکۆد، ئەمە بەکارمان هێناوە لە
        // سێرچکردن بە باڕکۆدا
        String sql = "select id, scientificName, sellingPrice from products where barcode=?";

        PreparedStatement stmt = conn.prepareStatement(sql);

        // ئەمە لەجێدانانی نیشانە پرسیارەکانە لەناو کیوریەکە بۆ چارەسەری سقڵ ئینجێکشن
        stmt.setString(1, barcode);

        ResultSet data = stmt.executeQuery();
        return data;
    }

    public static boolean addSelling(DefaultTableModel model) throws Exception {

        // connect to db
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        boolean result = false;

        // دیاریکردنی ژمارەی ڕیز و ستوونەکان لەو زانیاریەی بەشێوەی جەی تەیبڵ بۆمان
        // هاتووە
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        // درووستکردنی ئەڕەی بۆ ئەو مەبەستە کە درێژیەکەی پێکیەک لە درێژی جەی تەیبڵەکە
        Object[][] data = new Object[rowCount][columnCount];

        // ئەم دوو فۆڕە لەناویەکا بەکاریەت بۆ وەرگرتنی زانیەکریەکانی ناو جەی تەیبڵەکە بۆ
        // ناو ئەڕەیە دوو دیەکەی سەرەوە
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                data[i][j] = model.getValueAt(i, j);
            }
        }

        // turn off AutoCommit to make the request with transaction
        conn.setAutoCommit(false);

        // ئەمە دوو کیوریە کە یەکێکیان فرۆشتنە و یەکێکی تریان کەمکردنەوەی بەرهەمی
        // فرۆشراوە لە ژمارەی بەرهەمەکان، بەتەئکید بە بەکارهێنانی ترانزاکشن

        // داخڵکردنی یەک ریز لە زانیاری بۆ ناو تەیبڵی فرۆشتن
        String sql = "INSERT INTO selling (productId, quantity, discount) VALUES(?, ?, ?);";
        PreparedStatement stmt = conn.prepareStatement(sql);

        // کەمکردنەوەی ژمارەی فرۆشراوەکان لە بەرهەمێک
        String sql2 = "UPDATE products SET quanitity = quanitity - ? WHERE id = ?;";
        PreparedStatement stmt2 = conn.prepareStatement(sql2);

        // ئێمە چەن بەرهەمێک بەیەک جار ئەفرۆشین بۆیە ئەم فۆڕەمان پێویستە بۆ ئەوەی بەپێی
        // کیوریەکەی سەرەوە هەموو زانیاریەکان لەجێی نیشانەی پرسیارەکان دابنیین ریز بە
        // ریز
        //
        // کەواتە چەن ریزبێ ئەوەنە کیوری لەجۆری ئینسێرت زیادەکرێت
        for (int i = 0; i < rowCount; i++) {
            stmt.setString(1, data[i][0].toString());
            stmt.setString(2, data[i][2].toString());
            stmt.setString(3, data[i][5].toString());
            // ئەم مێثۆدە کیوریەکە زیادەکات بۆ لیستی کیوریەکانی پێویستە جێبەجێبکرێن و هەموو
            // بەرهەمەکان بەیەکەوە بفرۆشرێن
            stmt.addBatch();
        }

        // بەهەمان شێوەی سەرەوە چۆن هەموو بەرهەمەنا بەیەکەوە زیادەکرێن بۆ تەیبڵی کڕین،
        // بەهەمان شێوە پێویاتە هەموو بەرهەمەکان بەهەمان شێوە رێژەکانیان کەم ببێتەوە
        for (int i = 0; i < rowCount; i++) {
            stmt2.setString(1, data[i][2].toString());
            stmt2.setString(2, data[i][0].toString());
            // ئەم مێثۆدە کیوریەکە زیادەکات بۆ لیستی کیوریەکانی پێویستە جێبەجێبکرێن و هەموو
            // بەرهەمەکان بەیەکەوە نرخەکانیان کەم بکرێتەوە
            stmt2.addBatch();
        }

        // ئەم دوو ڵاینە تایبەتە بە جێبەجێکردنی هەموو کیوریەکان.
        int[] rowsInserted = stmt.executeBatch();
        int[] rowsInserted2 = stmt2.executeBatch();

        if (rowsInserted.length > 0 && rowsInserted2.length > 0) {
            result = true;
        }

        // بە ڕەنکردنی کۆمیت، هەردوو کیوریەکە بەیەکەوە ڕەن ئەبن یەک لەدوای یەک
        conn.commit();
        conn.close();
        return result;
    }

    // ئەمە کرداری پرنتکردنی هەموو دەیتاکانی ناو جەی تەیبڵەکەیە بۆ ناوی فایلێک
    public static void printSelling(DefaultTableModel model) throws Exception {

        // وەرگرتنی فایلەکە بەناوە
        File file = new File("table_data.txt");

        // ئەگەر فایلەکە بوونی نەبوو خۆی درووستی ئەکات بەم شێوەیە
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);

        // ئەم بەشە هێدەری تەیبڵەکە درووستەکات، واتە ناوی کۆڵۆمەکان لەناو فایلەکە
        // درووستەکات
        for (int i = 0; i < model.getColumnCount(); i++) {
            bw.write(model.getColumnName(i) + "\t");
        }

        // بەکارهاتووە بۆ چوونە لاینی تازە
        bw.write("\n");

        // ئەمە بەکاریەت بۆ نەقڵکردنی زانیارییەکان لە جەی تەیبڵەکەوە بۆ فایلەکە
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                bw.write(model.getValueAt(i, j) + "\t");
            }
            bw.write("\n");
        }

        JOptionPane.showMessageDialog(null, "success");
        bw.close();
        writer.close();
    }
}
