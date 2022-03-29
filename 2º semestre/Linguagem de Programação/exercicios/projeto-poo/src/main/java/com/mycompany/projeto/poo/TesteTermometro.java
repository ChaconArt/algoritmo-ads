/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

import java.util.Locale;

/**
 *
 * @author arthur.p.chacon
 */
public class TesteTermometro {

    public static void main(String[] args) {
        
        Termometro temp1 = new Termometro(20.00,26.00,15.00);
        
        System.out.println(String.format
        ("Temperatura atual: %.2f \n"
            + "Temperatura máxima: %.2f \n"
            + "Temperatura mínima: %.2f", 
            temp1.temperaturaAtual, temp1.temperaturaMax, temp1.temperaturaMin));
        
        System.out.println("---".repeat(20));
        System.out.println("Alterando temperatura máxima e mínima");
        System.out.println("---".repeat(20));
        
        temp1.aumentaTemperatura(30.00);
        temp1.diminuiTemperatura(10.00);
        
        System.out.println(String.format
        ("Temperatura atual: %.2f \n"
            + "Temperatura máxima: %.2f \n"
            + "Temperatura mínima: %.2f \n", 
            temp1.temperaturaAtual, temp1.temperaturaMax, temp1.temperaturaMin));
        
        System.out.println(String.format
        ("Temperatura atual convertida em fahreinheit: %.2f",
            temp1.exibeFahreinheit()));
    }

}
