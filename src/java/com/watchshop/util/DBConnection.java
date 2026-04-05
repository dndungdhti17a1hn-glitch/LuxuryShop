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
    private final String serverName = "localhost";
    private final String dbName = "LuxuryShop";
    private final String portNumber = "3306";
    private final String userID = "root";
    private final String password = ""; 

    public Connection getConnection() throws Exception {
        String url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName;
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        return DriverManager.getConnection(url, userID, password);
    }
}

