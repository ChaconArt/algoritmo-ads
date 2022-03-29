/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento01;

/**
 *
 * @author arthur.p.chacon
 */
public class TesteColaborador {
    public static void main(String[] args) {
        
        Colaborador colab1 = new Colaborador("Artur", "Estagiário", 2000.00);
        Colaborador colab2 = new Colaborador("Matheus", "Estagiário", 2000.00); 
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println(colab1.toString());
        System.out.println(colab2.toString());
        
        rh.promoverColaborador(colab1, "Desenvolvedor junior", 3000.00);
        rh.promoverColaborador(colab2, "Desenvolvedor junior", 1000.00);
        
        rh.reajustarSalario(colab2, 500.00);
        
        System.out.println(colab1.toString());
        System.out.println(colab2.toString());
        
        System.out.println(rh.toString());

    }
}
