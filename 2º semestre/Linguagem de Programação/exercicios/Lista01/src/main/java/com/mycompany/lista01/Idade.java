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
public class Idade {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner ano = new Scanner(System.in);
        
        String nomeUsuario = null;
        Integer anoNascimento = null;
        Integer calcIdade = null;
        
        System.out.println("Qual seu nome?");
        nomeUsuario = leitor.next();
        
        System.out.println(String.format(
        "Olá %s, qual o ano do seu nascimento?", nomeUsuario));
        anoNascimento = ano.nextInt();
        
        calcIdade = 2030 - anoNascimento;
        
        System.out.println(String.format("Em 2030 você terá %d anos",
        calcIdade));
                
    }
    
}
