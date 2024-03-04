/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connect_to_sqlserver;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
class ConnectToSQLServer {
    
    public static void main(String[] args) {
        var server = "LAPTOP-LLTJI6NG\\SQLEXPRESS";
        var user = "sa";
        var password = "123";
        var db = "Test";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        ds.setTrustServerCertificate(true);
        try (Connection conn = ds.getConnection()) {
            System.out.println("Kết nối với SQL Server thành công!");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
