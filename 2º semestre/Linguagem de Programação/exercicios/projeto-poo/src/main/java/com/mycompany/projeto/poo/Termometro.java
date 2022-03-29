/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author arthur.p.chacon
 */
public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public void aumentaTemperatura(Double aumentarTemperatura) {
        if (aumentarTemperatura > temperaturaMax) {
            temperaturaMax = aumentarTemperatura;
        }
    }

    public void diminuiTemperatura(Double diminuirTemperatura) {
        if (diminuirTemperatura > temperaturaMin) {
            temperaturaMin = diminuirTemperatura;
        }
    }

    public Double exibeFahreinheit() {
        Double fahreinheit = temperaturaAtual * 1.8 + 32;
        return fahreinheit;
    }

}
