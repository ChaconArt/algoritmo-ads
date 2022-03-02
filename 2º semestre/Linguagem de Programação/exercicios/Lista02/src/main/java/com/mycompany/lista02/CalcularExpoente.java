/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author arthur
 */
public class CalcularExpoente {
    
    public static void main(String[] args) {
                
        Scanner leitor = new Scanner(System.in);
        
        Integer base = null;
        Integer expoente = null;
        Integer total = 1;
        
        System.out.println("Entre com o valor base:");
        base = leitor.nextInt();
        
        System.out.println("Entre com o expoente:");
        expoente = leitor.nextInt();
        
        for (int i = expoente; i>=1; i--) {
            total = total * base;
        }
        
        System.out.println("O resultado é: " + total);
    }
    
}
