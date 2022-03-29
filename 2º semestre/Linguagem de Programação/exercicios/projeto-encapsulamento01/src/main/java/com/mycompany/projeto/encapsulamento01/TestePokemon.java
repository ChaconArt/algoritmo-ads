/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento01;

/**
 *
 * @author arthur.p.chacon
 */
public class TestePokemon {
    
    public static void main(String[] args) {
        Pokemon poke1 = new Pokemon("Pikachu", "Elétrico", 30.00, 0);
        Pokemon poke2 = new Pokemon("Bulbasaur", "Planta", 25.00, 0); 
        
        TreinadorPokemon treinador1 = new TreinadorPokemon("Arthur", 0);
        
        for (int i = 1; i <= 5; i++) {
            treinador1.treinarPokemon(poke2);
        }
        
        System.out.println(poke2.toString());
        
        treinador1.evoluirPokemon(poke2, "Ivysaur");
        
        System.out.println(poke2.toString());
        
        for (int i = 1; i < 2; i++) {
            treinador1.treinarPokemon(poke1);
        }
        
        System.out.println(poke1.toString());
        
        treinador1.evoluirPokemon(poke1, "Raichu");
        
        System.out.println(treinador1.toString());
        
    }

}
