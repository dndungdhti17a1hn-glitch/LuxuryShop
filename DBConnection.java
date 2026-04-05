/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.watchshop.util;

/**
 *
 * @author ngocd
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Thay đổi các thông số bên dưới cho phù hợp với máy của bạn
    private final String serverName = "localhost";
    private final String dbName = "LuxuryShop";
    private final String portNumber = "3306";
    private final String userID = "root";
    private final String password = ""; // Mật khẩu MySQL của bạn

    public Connection getConnection() throws Exception {
        // 1. Khai báo chuỗi URL kết nối
        String url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName;
        
        // 2. Load Driver (Với phiên bản mới không bắt buộc nhưng nên viết để đảm bảo)
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // 3. Trả về đối tượng Connection
        return DriverManager.getConnection(url, userID, password);
    }

    // Test thử kết nối
    public static void main(String[] args) {
        try {
            DBConnection db = new DBConnection();
            if (db.getConnection() != null) {
                System.out.println("Kết nối MySQL thành công!");
            }
        } catch (Exception e) {
            System.err.println("Kết nối thất bại: " + e.getMessage());
        }
    }
}

