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
public class CadastroUsuario {
    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        
        String loginUsuario = null;
        String senhaUsuario = null;
        Integer tentativas = null;
        
        System.out.println("Qual seu login?");
        loginUsuario = leitor.next();
        
        System.out.println("Qual sua senha?");
        senhaUsuario = leitor.next();
        
        System.out.println("Quantas tentativas de limite para logar?");
        tentativas = leitorNum.nextInt();
        
        System.out.println(String.format(
        "Seu login é %s e sua senha é %s."
        + " Você tem %d tentativas antes de ser bloqueado",
        loginUsuario, senhaUsuario, tentativas));
        
        
        
    }
    
}
