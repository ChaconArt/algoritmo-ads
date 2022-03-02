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
public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Double numUsuario = null;
        Double numUsuario2 = null;
        Double soma = null;
        Double subtracao = null;
        Double multiplicacao = null;
        Double divisao = null;
        
        System.out.println("Entre com o 1º numero");
        numUsuario = leitor.nextDouble();
        
        System.out.println("Entre com o 2º numero");
        numUsuario2 = leitor.nextDouble();
        
        soma = numUsuario + numUsuario2;
        subtracao = numUsuario - numUsuario2;
        multiplicacao = numUsuario * numUsuario2;
        divisao = numUsuario / numUsuario2;
        
        System.out.println(String.format
            ("A soma dos dois são: %.2f \n"
            + "a subtração resulta em: %.2f \n"
            + "a multiplicação resulta em: %.2f \n"
            + "e a divisão resulta em: %.2f",
            soma, subtracao, multiplicacao, divisao));
        
    }
    
}
