/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author arthur.p.chacon
 */
public class TesteEncomenda {

    public static void main(String[] args) {

        Encomenda pedido1
            = new Encomenda("p", "Rua dos comerciantes", "Rua dos compradores",
                    30.00, 250.00);

        System.out.println
            (pedido1.calcularFrete(pedido1.tamanho, pedido1.distancia));
        
        pedido1.emitirEtiqueta();
    }

}
