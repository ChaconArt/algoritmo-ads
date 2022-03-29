/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento02;

/**
 *
 * @author arthur.p.chacon
 */
public class PetShop {

    private String nome;
    private Double faturamento;

    public PetShop(String nome, Double faturamento) {
        this.nome = nome;
        this.faturamento = faturamento;
    }

    @Override
    public String toString() {
        return "---".repeat(20)
                + "\nPetShop:"
                + "\nnome= " + nome
                + "\nfaturamento= " + faturamento;
    }

    public void darBanho(Pet pet, Double valor) {
        pet.setValorGasto(pet.getValorGasto() + valor);
        pet.setQtdVisitas(pet.getQtdVisitas() + 1);
        faturamento += valor;
    }

    public void darBanho(Pet pet, Double valor, Integer desconto) {
        Double descontoProcessado = valor * (Double.valueOf(desconto) / 100.00);
        pet.setValorGasto(pet.getValorGasto() + (valor - descontoProcessado));
        pet.setQtdVisitas(pet.getQtdVisitas() + 1);
        faturamento += valor - descontoProcessado;
    }

}
