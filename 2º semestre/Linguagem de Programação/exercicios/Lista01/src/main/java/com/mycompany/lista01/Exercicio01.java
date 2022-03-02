/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author arthur
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        
        Integer filhos0a3 = null;
        Integer filhos4a16 = null;
        Integer filhos17a18 = null;
        
        System.out.println("Quantos filhos de 0 a 3 anos você tem?");
        filhos0a3 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos você tem?");
        filhos4a16 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos você tem?");
        filhos17a18 = leitor.nextInt();
        
        Double bolsa0a3 = filhos0a3 * 25.12;
        Double bolsa4a16 = filhos4a16 * 15.88 ;
        Double bolsa17a18 = filhos17a18 * 12.44;
        
        System.out.println(String.format
        ("Você tem um total de %d filhos e vai receber R$ %.2f  de bolsa",
        filhos0a3, bolsa0a3));
        
        System.out.println(String.format
        ("Você tem um total de %d filhos e vai receber R$ %.2f  de bolsa",
        filhos4a16, bolsa4a16));
        
        System.out.println(String.format
        ("Você tem um total de %d filhos e vai receber R$ %.2f  de bolsa",
        filhos17a18, bolsa17a18));
    }
    
}
