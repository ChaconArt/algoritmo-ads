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
public class SalarioChico {
    
    public static void main(String[] args) {
     
        Scanner leitor = new Scanner(System.in);
        
        Double salario = null;
        Double inss = null;
        Double ir = null;
        Double conducao = null;
        Double vt = null;
        Double liquido = null;
        Double desconto = null;
        
        
        System.out.println("Seu salário bruto");
        salario = leitor.nextDouble();
        
        inss = salario * 0.10;
        ir = salario * 0.20;
        
        System.out.println
        ("Quanto custa a condução diária só de ida da casa para o trabalho?");
        conducao = leitor.nextDouble();
        
        vt = (conducao * 2) * 22;
        
        desconto = vt + ir + inss;
        liquido = salario - vt - ir - inss;
        
        System.out.println
        (String.format
        ("Seu salário bruto é R$ %.2f,"
        + " tem um total de R$ %.2f em descontos"
        + " e receberá um líquido de R$ %.2f",
        salario, desconto, liquido));
        
    }
    
}
