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
    private String ingrediente;
    private String preparo;
    private String servir;
    private Categoria categoria;

    public Receita(Integer id, String nome, String ingrediente, String preparo, String servir) {
        this.id = id;
        this.nome = nome;
        this.ingrediente = ingrediente;
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

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
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
 
    public void setCategoria(Categoria c){
        this.categoria = c;
        c.setReceita(this);
    }
    
    @Override
    public String toString() {
        return this.nome;  
    }
    
}