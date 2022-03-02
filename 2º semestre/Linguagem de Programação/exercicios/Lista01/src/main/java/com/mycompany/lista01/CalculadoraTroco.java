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
public class CalculadoraTroco {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Double valorUnit = null;
        Double valorPago = null;
        Double trocoCliente = null;
        Integer qtdProduto = null;
        
        System.out.println("Qual o valor unitário do produto?");
        valorUnit = leitor.nextDouble();
        
        System.out.println("Qual a quantidade vendida?");
        qtdProduto = leitor.nextInt();
        
        System.out.println("Qual o valor pago pelo cliente?");
        valorPago = leitor.nextDouble();
        
        trocoCliente = valorPago - (qtdProduto * valorUnit);
        
        System.out.println(String.format
        ("Seu troco será de R$ %.2f", trocoCliente));
        
    }
    
}
