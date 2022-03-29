/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author arthur.p.chacon
 */
public class App {
    
    public static void main(String[] args) {
        
        Bolo bolo1 = new Bolo("chocolate", 35.00, 0); 
        Bolo bolo2 = new Bolo("cenoura", 40.00, 0); 
        Bolo bolo3 = new Bolo("ninho", 45.00, 0); 
        
        bolo1.comprarBolo(5);
        bolo1.exibirRelatorio(bolo1.sabor);
        
        bolo2.comprarBolo(5);
        bolo2.exibirRelatorio(bolo2.sabor);
        
        bolo3.comprarBolo(5);
        bolo3.exibirRelatorio(bolo3.sabor);
        
    }
    
}
