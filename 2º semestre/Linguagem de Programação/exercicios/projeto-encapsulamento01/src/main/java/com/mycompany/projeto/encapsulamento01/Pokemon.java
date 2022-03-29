/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento01;

/**
 *
 * @author arthur.p.chacon
 */
public class Pokemon {
    
    private String nome;
    private String tipo;
    private Double forca;
    private Integer doce;

    public Pokemon(String nome, String tipo, Double forca, Integer doce) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doce = doce;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoce() {
        return doce;
    }

    public void setDoce(Integer doce) {
        this.doce = doce;
    }

    @Override
    public String toString() {
        return "---".repeat(20) +
                "\nPokemon:" + 
                "\nnome=" + nome + 
                "\ntipo=" + tipo + 
                "\nforca=" + forca + 
                "\ndoce=" + doce;
    }
    
    
    
}
