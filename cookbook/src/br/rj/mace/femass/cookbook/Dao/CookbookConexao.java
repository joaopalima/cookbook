/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.mace.femass.cookbook.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jorge
 */
public class CookbookConexao {
    public static Connection getConexao(){
        Connection conn=null;
        try { 
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/coocbook","postgres","joao"); 
                        
       } catch(SQLException e) {
            e.printStackTrace();
       }
        return conn;
    }
}
