/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employ_payroll;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author beye
 */
public class db {
  
  public static Connection java_db() {
        try {
            // This is the driver for MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // This connects to the payroll_db you made in XAMPP
            // 'root' is the default username, "" is the empty password
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_db", "root", "");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Connection Error: " + e.getMessage());
            return null;
        }
    }
}

