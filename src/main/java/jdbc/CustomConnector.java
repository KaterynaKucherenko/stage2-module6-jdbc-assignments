package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomConnector {
    public Connection getConnection(String url) {
        try{ Connection con1 = DriverManager.getConnection(url);
            return con1;
    }
        catch (SQLException e){
            e.getErrorCode();
            return null;
        }}


    public Connection getConnection(String url, String user, String password) throws SQLException {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException e) {
            e.getErrorCode();
            return null;
        }
    }}


