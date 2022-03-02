/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Random;

/**
 *
 * @author arthur
 */
public class Acumulador {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();
        
        Integer acumulador = 100;
        Integer total = 0;
        
        while (acumulador!=0) {
            acumulador = gerador.nextInt(100);
            total+=acumulador;
        }
        
        System.out.println("Valor acumulado: " + total);
    }
    
}
