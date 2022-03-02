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
public class Autenticador {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Boolean controlador = true;
        String nomeUser = null;
        String senhaUser = null;
        
        while (controlador) {
            System.out.println("Entre com seu login:");
            nomeUser = input.next();

            System.out.println("Entre com sua senha:");
            senhaUser = input.next();

            if (nomeUser.equals("admin") && senhaUser.equals("#Bandtec")) {
                controlador = false;
            } else {
                System.out.println("Login e/ou senha inválidos”");
            }
        }
        
        System.out.println("Login realizado com sucesso");
    }
    
}
