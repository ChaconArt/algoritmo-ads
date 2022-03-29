/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento01;

/**
 *
 * @author arthur.p.chacon
 */
public class RecursosHumanos {
    
    private Integer totalReajustado;
    private Integer totalPromovidos;

    public Integer getTotalReajustado() {
        return totalReajustado;
    }

    public void setTotalReajustado(Integer totalReajustado) {
        this.totalReajustado = totalReajustado;
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    // o construtor sempre começa com 0 reajuste e promoções
    public RecursosHumanos() {
        this.totalReajustado = 0;
        this.totalPromovidos = 0;
    }
    
    public void reajustarSalario(Colaborador colab, Double valorReajuste) {
        colab.setSaldo(colab.getSaldo() + valorReajuste);
        totalReajustado++;
    }
    
    public void promoverColaborador(Colaborador colab,
            String cargo, Double novoSalario) {
        if (colab.getSaldo()< novoSalario) {
                colab.setCargo(cargo);
                colab.setSaldo(novoSalario);
                totalPromovidos++;
        } else {
            System.out.println("---".repeat(20) + "\noperação inválida");
        }
    }

    @Override
    public String toString() {
        return "---".repeat(20) + 
                "\nTotal de salários reajustados: " + totalReajustado + 
                "\nTotal de colaboradores promovidos: " + totalPromovidos;
    }
    
    
}
