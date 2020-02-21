/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Datubaze {
    private Connection con;
    private String driver = "jdbc:mysql://localhost:3306/itlat_vienica";
    private String user = "root";
    private String password = "";
    
    Datubaze(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void createConnection(){
        try {
            this.con = DriverManager.getConnection(driver,user,password);
        } catch (SQLException ex) {
            Logger.getLogger(Datubaze.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean hasUser(String userName, String password){
        try {
            Statement stmt = con.createStatement();
            System.out.println("SELECT * FROM users WHERE name='"+userName+"' AND "+ "password='" + password + "'");
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE name='"+userName+"' AND "+ "password='" + password + "'");
            
            return rs.next();
            
        } catch (SQLException ex) {
            System.out.println("Something wrong with stmt");
        }
        
        return false;
    }
    
    public boolean hasUserSec(String userName, String password){
        try {
            PreparedStatement prepStmt = con.prepareStatement("SELECT * FROM users WHERE name=? AND password=?");
            prepStmt.setString(1, userName);
            prepStmt.setString(2, password);
            System.out.println(prepStmt.toString());
            ResultSet rs = prepStmt.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            System.out.println("Something wrong with stmt");
        }
        
        return false;
    }    
    
    public boolean hasUserLoop(String userName, String password){
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            
            while(rs.next()){
                if(rs.getString("name").equals(userName) && rs.getString("password").equals(password)){
                    return true;
                }
            }            

        } catch (SQLException ex) {
            System.out.println("Something wrong with stmt");
        }
        
        return false;
    }
    
    
    public void endConnection(){
        try {
            this.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Datubaze.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
