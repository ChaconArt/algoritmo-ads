/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento02;

/**
 *
 * @author arthur.p.chacon
 */
public class TestePet {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Ted", "Buldogue");
        PetShop ps1 = new PetShop("Pet Vegas", 0.0);
        
        System.out.println(pet1.toString());
        System.out.println(ps1.toString());
        ps1.darBanho(pet1, 100.00);
        ps1.darBanho(pet1, 100.00, 10);
        System.out.println(pet1.toString());
        System.out.println(ps1.toString());
        
        
    }
}
