/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mysql_connection;
import com.mysql.jdbc.Driver;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author Safiullah Karimi
 */
public class JDBS {
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_magaement_system","root","");
            System.out.println("1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
