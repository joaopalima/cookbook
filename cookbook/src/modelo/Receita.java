/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jorge
 */
public class Receita {
    
    private int id;
    private String nome;
    private String ingredientes;
    private String preparo;
    private String servir;

    public Receita(int id, String nome, String ingredientes, String preparo, String servir) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preparo = preparo;
        this.servir = servir;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    
    
}
