/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author arthur.p.chacon
 */
public class Bolo {
    
    String sabor;
    Double valor;
    Integer quantidadeVendida;

    public Bolo(String sabor, Double valor, Integer quantidadeVendida) {
        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = quantidadeVendida;
    }
    
    public void comprarBolo (Integer quantidadeDesejada){
        
        if(quantidadeDesejada>100) {
            System.out.println
        ("seu pedido ultrapassou nosso limite diário de bolo");
        } else {
            quantidadeVendida+=quantidadeDesejada;
        }
        
    }
    
    public void exibirRelatorio (String sabor) {
        
        Double dinheiroBolo = valor * Double.valueOf(quantidadeVendida);
        
        System.out.println
        (String.format(
            "O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f",
            sabor, quantidadeVendida, dinheiroBolo));
    } 
}
