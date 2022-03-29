/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author arthur.p.chacon
 */
public class Encomenda {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    public Double calcularFrete(String tamanhoCliente, Double distanciaCliente) {

        Double calculoTamanho;
        Double calculoDistancia;

        switch (tamanhoCliente) {
            case "p":
                calculoTamanho = valorEncomenda * 0.01;
                break;
            case "m":
                calculoTamanho = valorEncomenda * 0.03;
                break;
            default:
                calculoTamanho = valorEncomenda * 0.05;
                break;
        }

        if (distanciaCliente <= 50.00) {
            calculoDistancia = 3.00;
        } else if (distanciaCliente > 50 && distanciaCliente <= 200.00) {
            calculoDistancia = 5.00;
        } else {
            calculoDistancia = 7.00;
        }

        return calculoDistancia + calculoTamanho;

    }

    public void emitirEtiqueta() {
        System.out.println(String.format("***** ETIQUETA PARA ENVIO *****\n"
                + "\n"
                + "Endereço do remetente: %s\n"
                + "\n"
                + "Endereço do destinatário: %s\n"
                + "\n"
                + "Tamanho: %s\n"
                + "\n"
                + "--------------------------------------------------\n"
                + "\n"
                + "Valor encomenda: R$ %.2f\n"
                + "\n"
                + "Valor frete: R$ %.2f\n"
                + "\n"
                + "--------------------------------------------------\n"
                + "\n"
                + "Valor total: R$ %.2f",
                enderecoRemetente, enderecoDestinatario, tamanho, valorEncomenda,
                calcularFrete(tamanho, distancia),
                calcularFrete(tamanho, distancia) + valorEncomenda));
    }

    public Encomenda(String tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorEncomenda) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

}
