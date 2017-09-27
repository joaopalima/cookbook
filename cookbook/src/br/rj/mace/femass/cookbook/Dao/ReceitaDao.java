/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.mace.femass.cookbook.Dao;

import br.rj.mace.femass.cookbook.Modelo.Receita;
import br.rj.mace.femass.cookbook.gui.ReceitaGui;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class ReceitaDao {
    
        public static void cadastrar(Object r) throws SQLException {
            
        Receita receita = (Receita) r;
        String sql = "insert into receita (nome, ingredientes, preparo, servir) values (?,?,?,?)";
        PreparedStatement stmt = CookbookConexao.getConexao().prepareStatement(sql);
        
        stmt.setString(1, receita.getNome());
        stmt.setString(2, receita.getIngrediente());
        stmt.setString(3, receita.getPreparo());
        stmt.setString(3, receita.getServir());
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
    
    public List listarTodos() throws SQLException {
        List lista = new ArrayList();
        Connection conn = null;
        try {
            conn = CookbookConexao.getConexao();
            String sql = "select * from receita";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Receita r = new Receita(rs.getString("nome"));
                r.setIngrediente(rs.getString("ingrediente"));
                r.setPreparo(rs.getString("preparo"));
                r.setServir(rs.getString("servir"));
                r.setId(rs.getInt("id"));
                lista.add(r);
            }

            rs.close();
            stmt.close();
            conn.close();
            return lista;
        } catch (SQLException e) {
            throw new SQLException("Erro ao recuperar a lista de receitas. \n" + e.getMessage());
        }
    }

    @Override
    public Object listarPorId(int id) throws SQLException {
        Connection conn = null;
        try {
            conn = CookbookConexao.getConexao();
            String sql = "select * from receita where id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            Receita r = new Receita(rs.getString("nome"));
            r.setIngredientes(rs.getString("ingredientes"));
            r.setPreparo(rs.getString("preparo"));
            r.setId(rs.getInt("id"));
            

            rs.close();
            stmt.close();
            conn.close();
            return r;
        } catch (SQLException e) {
            throw new SQLException("Eroo ao recuperar a receita. \n" + e.getMessage());
        }
    }
    
        
}
