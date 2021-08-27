/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

/**
 *
 * @author Dinuja pinto
 */
public class Connectionget {

    private static Connectionget connectionget;
    private static String url = "jdbc:mysql://localhost:3306/dammikatex";
    private static String user = "root";
    private static String pass = "dinu5615011*/";
    private static Connection con;

    private Connectionget() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
    }

    public static Connectionget getInstatnce() throws ClassNotFoundException, SQLException {
        if (connectionget == null) {
            connectionget = new Connectionget();
        }
        return connectionget;
    }

    public Connection getConnection() {
        return con;
    }
}
