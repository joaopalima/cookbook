/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.mace.femass.cookbook.Dao;

import br.rj.mace.femass.cookbook.Modelo.Receita;
import br.rj.mace.femass.cookbook.gui.ReceitaGui;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jorge
 */
public class ReceitaDao {
    
        public static void inserir(Object r) throws SQLException {
            
        Receita receita = (Receita) r;
        String sql = "insert into receita (nome, ingredientes, preparo) values (?,?,?)";
        PreparedStatement stmt = CookbookConexao.getConexao().prepareStatement(sql);
        stmt.setString(1, receita.getNome());
        stmt.setString(2, receita.getIngrediente());
        stmt.setString(3, receita.getPreparo());
        stmt.executeUpdate();
        stmt.close();    
    }
    
        public static void alterar(Object r) throws SQLException {
            
        Receita receita = (Receita) r;
        String sql = "update receita SET nome = ?, ingredientes = ?, preparo = ? WHERE id = ?";
        PreparedStatement stmt = CookbookConexao.getConexao().prepareStatement(sql);
        stmt.setString(1, receita.getNome());
        stmt.setString(2, receita.getIngrediente());
        stmt.setString(3, receita.getPreparo());
        stmt.setInt(4, receita.getId());
        stmt.executeUpdate();
        stmt.close();  
    }
      
        public static void excluir(Object r) throws SQLException {
            
        Receita receita = (Receita) r;
        String sql = "delete from receita where id = ?";
        PreparedStatement stmt = CookbookConexao.getConexao().prepareStatement(sql);
        stmt.setInt(1, receita.getId());
        stmt.executeUpdate();
        stmt.close(); 
    }
    
}
