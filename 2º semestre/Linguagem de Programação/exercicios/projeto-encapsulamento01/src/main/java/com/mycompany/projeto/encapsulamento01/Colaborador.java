/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento01;

/**
 *
 * @author arthur.p.chacon
 */
public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo, Double saldo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSaldo() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSaldo(Double saldo) {
        this.salario = saldo;
    }

    @Override
    public String toString() {
        return "---".repeat(20) +
                "\nColaborador: " + nome + 
                "\nCargo: " + cargo + 
                "\nSalário:" + salario;
    }
    
}
