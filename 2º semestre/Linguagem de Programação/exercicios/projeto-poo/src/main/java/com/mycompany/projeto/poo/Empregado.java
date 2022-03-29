/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author arthur.p.chacon
 */
public class Empregado {
    
    String nome;
    String cargo;
    Double salario;
    
    public void reajustarSalario (Double reajustePorcentagem) {
        salario += reajustePorcentagem/100 * salario;
    }

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
}
