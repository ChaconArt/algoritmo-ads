/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento02;

/**
 *
 * @author arthur.p.chacon
 */
public class Pet {

    private String nome;
    private String raca;
    private Integer qtdVisitas;
    private Double valorGasto;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitas = 0;
        this.valorGasto = 0.0;
    }

    @Override
    public String toString() {
        return "---".repeat(20)
                + "\nPet:"
                + "\nnome= " + nome
                + "\nraca= " + raca
                + "\nqtdVisitas= " + qtdVisitas
                + "\nvalorGasto= " + valorGasto;
    }

    public Integer getQtdVisitas() {
        return qtdVisitas;
    }

    public void setQtdVisitas(Integer qtdVisitas) {
        this.qtdVisitas = qtdVisitas;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

}
