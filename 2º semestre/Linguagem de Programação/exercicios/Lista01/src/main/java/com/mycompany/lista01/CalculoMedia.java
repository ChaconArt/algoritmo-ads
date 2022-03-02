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
public class CalculoMedia {
    
    public static void main(String[] args) {
        
        Scanner nome = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);
        
        String nomeUsuario = null;
        Double nota1 = null;
        Double nota2 = null;
        Double media = null;
        
        System.out.println("Qual seu nome?");
        nomeUsuario = nome.next();
        
        System.out.println("Qual sua primeira nota?");
        nota1 = leitor.nextDouble();
        
        System.out.println("Qual sua segunda nota?");
        nota2 = leitor.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f",
        nomeUsuario, media));
    }
    
}
