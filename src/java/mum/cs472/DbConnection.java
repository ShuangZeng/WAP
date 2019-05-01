/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Shuang Zeng
 */
public class DbConnection {

    private static final String dBHost = "127.0.0.1";
    private static final String dbPort = "3306";
    private static final String dbName = "entries";
    private static final String username = "root";
    private static final String password = "root";
    private static Connection conn = null;

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%s", dBHost, dbPort, dbName), username, password);
        }
        return conn;
    }
}
