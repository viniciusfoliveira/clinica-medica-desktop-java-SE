package br.com.cruzeirodosul.tgi.util;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connections {
    
     
       public static java.sql.Connection getConexao() throws Exception {
        java.sql.Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/tgi","root","root");
         
        return con;
    }

    public static void fechaConexao(java.sql.Connection con, PreparedStatement stm,ResultSet rs) throws SQLException {
        rs.close();
        stm.close();
        con.close();
    }
}
