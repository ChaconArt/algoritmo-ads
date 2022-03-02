/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthur
 */
public class Sorteio {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Random sorteador = new Random();
        
        Integer numUsuario = null;
        Integer numSorteio = null;
        Integer numPar = 0;
        Integer numImpar = 0;
        
        System.out.println("Um número de 1 a 100");
        numUsuario = leitor.nextInt();
        
        for (int i=1; i<=200; i++) {
            numSorteio = sorteador.nextInt(100);
            if(Objects.equals(numUsuario, numSorteio)) {
                System.out.println
                ("o mesmo valor foi sorteado na " + i + "ª tentativa");
            }
            if (numSorteio%2==0) {
                numPar++;
            } else {
                numImpar++;
            }
        }
        
        System.out.println(String.format
        ("Numeros pares sorteados: %d \n"
        + "Numeros impares sorteados: %d", numPar, numImpar));
        
        
        
    }
    
}
