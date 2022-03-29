/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento02;

/**
 *
 * @author arthur.p.chacon
 */
public class Planejamento {

    private String atividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Planejamento(String atividade, String responsavel, Integer diasEstimados) {
        this.atividade = atividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public void terminarAtividade(Integer diasUsados) {
        this.diasUsados=diasUsados;
    }

    public String calcularTempo() {
        
        String aviso;
        
        if(diasUsados>diasEstimados) {
            aviso = 
            "Você estimou " +diasEstimados+  " dias, mas a tarefa" +
            " foi feita em " + diasUsados + " dias. Melhore a estimativa!";
        } else if (diasEstimados==diasUsados){
            aviso = 
            "Você estimou " +diasEstimados+ " dias,"
            + " e a tarefa foi feita em " +diasUsados+ " dias,"
            + " atendendo a estimativa com precisão!";
        } else {
            aviso = 
            "Você estimou " +diasEstimados+ " dias,"
            + " e a tarefa foi feita em " +diasUsados+ " dias. Parabéns!";
        }
        
        return aviso;
    }

    @Override
    public String toString() {
        return "---".repeat(20) +
                "\nPlanejamento:" + 
                "\natividade=" + atividade + 
                "\nresponsavel=" + responsavel + 
                "\ndiasEstimados=" + diasEstimados + 
                "\ndiasUsados=" + diasUsados;
    }
    
    

}
