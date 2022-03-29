/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento01;

/**
 *
 * @author arthur.p.chacon
 */
public class TreinadorPokemon {
    
    private String nome;
    private Integer nivel;
    
    public void treinarPokemon(Pokemon poke){
        Double aumentoDeForca = poke.getForca() * 0.10;
        poke.setForca(poke.getForca()+aumentoDeForca);
        poke.setDoce(poke.getDoce()+10);
        nivel+=2;
    }
    
    public void evoluirPokemon(Pokemon poke, String nomeEvolucao){
        if(poke.getDoce()>=50) {
            String nomeAntigo = poke.getNome();
            poke.setNome(nomeEvolucao);
            poke.setDoce(poke.getDoce()-50);
            nivel+=10;
            System.out.println(String.format
                ("---".repeat(20)
                + "\nPokémon %s evoluiu para -> %s",
                nomeAntigo, poke.getNome()));
        } else {
            System.out.println("Não foi possível realizar operação");
        }
    }

    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "---".repeat(20) +
                "\nTreinadorPokemon:" + 
                "\nnome=" + nome + 
                "\nnivel=" + nivel;
    }
    
    
    
}
