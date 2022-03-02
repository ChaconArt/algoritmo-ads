/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoindividualjava;

import java.util.Scanner;

/**
 *
 * @author arthur
 */
public class SoccerAnalysis {
    
    
    public static void main(String[] args) {
        
        Boolean controle = true;
        
        Utilitaria util = new Utilitaria();
        
        Scanner leitorOpcao = new Scanner(System.in);
        
        Integer varOpcao = 5;
        
        while (controle) {
            
        System.out.println("Qual opção você deseja?");
        System.out.println("(1) Analisar desempenho do seu time.");
        System.out.println("(2) Quiz futebol.");
        System.out.println("(3) Qual jogador você seria?");
        System.out.println("(4) Sair.");
        
            varOpcao = leitorOpcao.nextInt();
            
            switch (varOpcao) {
                case 1:
                    util.analisarDesempenho();
                    break;
                case 2:
                    util.quizFutebol();
                    break;
                case 3:
                    util.sortearJogador();
                    break;
                case 4:
                    System.out.println("Programa encerrado!");
                    controle = false;
                    break;
                default:
                    System.out.println
                    ("Opção inválida, escolha uma opção de 1 a 4!");
            }
        }
    }
}
