/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author arthur.p.chacon
 */
public class TesteEmpregado {
    
    public static void main(String[] args) {
        
        Empregado empregado1 = 
                new Empregado("João", "Analista de Sistemas", 5400.00);
        Empregado empregado2 = 
                new Empregado("Arthur", "Dev FullStack", 10000.00);
        
        empregado1.reajustarSalario(15.00);
        empregado2.reajustarSalario(100.00);
        
        System.out.println(String.format("Nome: %s \nCargo: %s \nSalário: %.2f",
            empregado1.nome, empregado1.cargo, empregado1.salario));
        System.out.println(String.format("Nome: %s \nCargo: %s \nSalário: %.2f",
            empregado2.nome, empregado2.cargo, empregado2.salario));
        
    }
    
}
