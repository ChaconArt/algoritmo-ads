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
public class Elevador {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Double pesoLimite = null;
        Integer pessoasLimite = null;
        Double pessoa1 = null;
        Double pessoa2 = null;
        Double pessoa3 = null;
        Double pesoTotal = null;
        
        System.out.println("Qual o limite de peso do elevador?");
        pesoLimite = leitor.nextDouble();
        
        System.out.println("Qual o limite dde pessoas no elevador?");
        pessoasLimite = leitor.nextInt();
        
        System.out.println("Qual o peso da 1ª pessoa que entrou no elevador?");
        pessoa1 = leitor.nextDouble();
        
        System.out.println("Qual o peso da 2ª pessoa que entrou no elevador?");
        pessoa2 = leitor.nextDouble();
        
        System.out.println("Qual o peso da 3ª pessoa que entrou no elevador?");
        pessoa3 = leitor.nextDouble();
        
        pesoTotal = pessoa1 + pessoa2 + pessoa3;
        
        System.out.println(String.format(
        "Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\n" +
        "O peso total no elevador é de %.2f, sendo que ele suporta %.2f\".", 
        pessoasLimite, pesoTotal, pesoLimite));
        
    }
    
}
