/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento02;

/**
 *
 * @author arthur.p.chacon
 */
public class TestePlanejamento {
    public static void main(String[] args) {
        
        Planejamento plano1 = new Planejamento("Projeto ITAU", "Arthur", 10);
        
        plano1.terminarAtividade(9);
        
        System.out.println(plano1.toString());
        
        System.out.println(plano1.calcularTempo());;
        
    }
}
