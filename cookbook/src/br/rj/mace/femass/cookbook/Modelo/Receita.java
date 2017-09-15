/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.mace.femass.cookbook.Modelo;

/**
 *
 * @author jorge
 */
public class Receita {
    
    private Integer id;
    private String nome;
    private String ingredientes;
    private String preparo;
    private String servir;

    public Receita(Integer id, String nome, String ingredientes, String preparo, String servir) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preparo = preparo;
        this.servir = servir;
    }

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

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
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
 
    @Override
    public String toString() {
        return this.nome;  
    }
    
}