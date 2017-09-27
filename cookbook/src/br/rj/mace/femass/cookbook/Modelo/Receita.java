/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.mace.femass.cookbook.Modelo;

import java.util.List;

/**
 *
 * @author jorge
 */
public class Receita {
    
    private Integer id;
    private String nome;
    private String preparo;
    private String servir;
    private Categoria categoria;
    private List<Ingrediente> ingredientes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    public String getServir() {
        return servir;
    }

    public void setServir(String servir) {
        this.servir = servir;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Receita(Integer id, String nome, String preparo, String servir, Categoria categoria, List<Ingrediente> ingredientes) {
        this.id = id;
        this.nome = nome;
        this.preparo = preparo;
        this.servir = servir;
        this.categoria = categoria;
        this.ingredientes = ingredientes;
    }
    
    
    @Override
    public String toString() {
        return this.nome;  
    }
    
    
}