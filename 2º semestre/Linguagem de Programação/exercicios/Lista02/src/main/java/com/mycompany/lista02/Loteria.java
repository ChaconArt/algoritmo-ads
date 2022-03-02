/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthur
 */
public class Loteria {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        
        Integer contador = 0;
        Integer numSorteado = 0;
        Integer numUsuario = 200;
        Boolean controlador = true;
        
        while (controlador) {
            
            System.out.println("Digite um numero de 1 a 10");
            numUsuario = input.nextInt();
            numSorteado = gerador.nextInt(10);
            
            if (numUsuario ==numSorteado) {
                controlador = false;
            } else {
                System.out.println(String.format
                ("Seu número: %d \n"
                + "Número sorteado: %d \n"
                + "---".repeat(10), numUsuario, numSorteado));
                contador++;
            }
        }
        
        if (contador<=3) {
            System.out.println("Você é MUITO sortudo");
        } else if (contador>3 && contador<=10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
        
        
        
        
    }
    
}
