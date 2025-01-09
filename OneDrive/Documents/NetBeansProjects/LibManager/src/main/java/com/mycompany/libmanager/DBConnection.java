/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libmanager;

import java.sql.*;

/**
 *
 * @author Shalin
 */
public class DBConnection {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","21101105");
            return con;
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
