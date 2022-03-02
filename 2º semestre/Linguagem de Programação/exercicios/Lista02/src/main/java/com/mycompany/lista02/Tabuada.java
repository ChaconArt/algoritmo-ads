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
public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer conta;
        Integer numUsuario;
        
        System.out.println("Digite um número");
        numUsuario = leitor.nextInt();
        
        System.out.println("Tabuada do "+numUsuario);
        
        for (int i = 0; i < 11; i++) {
            conta = i * numUsuario;
            System.out.println(String.format
            ("%d x %d = %d", numUsuario, i, conta));
        }
        
    }
    
}
