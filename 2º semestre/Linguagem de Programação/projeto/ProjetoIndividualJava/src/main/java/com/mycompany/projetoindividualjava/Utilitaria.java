/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoindividualjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthur
 */
public class Utilitaria {
    
    void analisarDesempenho() {
        
        Scanner leitorNome = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);
        
        String nomeTime = null;
        
        Double vitoria = null;
        Double empate = null;
        Double derrota = null;
        Double jogos = null;
        Double pontos = null;
        Double pontosPossiveis = null;
        Double aproveitamento = null;
        
        System.out.println("Qual o nome do seu time?");
        nomeTime = leitorNome.next();
        
        System.out.println("Quantas vitórias o time possui?");
        vitoria = leitor.nextDouble();
        
        System.out.println("Quantos empates o time possui?");
        empate = leitor.nextDouble();
        
        System.out.println("Quantas derrotas o time possui?");
        derrota = leitor.nextDouble();
        
        pontos = vitoria * 3 + empate;
        jogos = vitoria + empate + derrota;
        pontosPossiveis = jogos*3;
        aproveitamento = (pontos / pontosPossiveis) * 100;
        
        
        System.out.println(String.format
        ("Time: %s \n"
        + "Pontos: %.0f \n"
        + "Jogos: %.0f \n"
        + "Vitórias: %.0f \n"
        + "Empates: %.0f \n"
        + "Derrotas: %.0f \n"
        + "Aproveitamento: %.2f \n"
        , nomeTime, pontos, jogos, vitoria, empate, derrota, aproveitamento));
    } 
    
    void quizFutebol() {
        
        Scanner leitorQuiz = new Scanner(System.in);
        
        Integer opcao = 5;
        Integer pontuacao = 0;
        
        System.out.println
        ("Bem vindo ao Quiz, serão 5 perguntas, cada uma valendo 2 pontos!");
        
        while (opcao>4) {
        
            System.out.println
            ("---".repeat(20)
            + "\n Quem foi o jogador mais jovem a vencer uma copa do mundo? \n"
            + "1) Edson Arantes do Nascimento \n"
            + "2) Kylian Mbappé \n"
            + "3) Sergio Busquets \n"
            + "4) Ronaldo Nazário");
            
            opcao = leitorQuiz.nextInt();

            if (opcao == 1) {
                System.out.println("Resposta correta!");
                pontuacao+=2;
                opcao =0;
            } else if (opcao ==2 || opcao ==3 || opcao ==4) {
                System.out.println("Resposta errada! A correta é a opção 1.");
                opcao =0;
            } else {
                System.out.println("Digite uma alternativa válida!");
            }
        }
        
        opcao = 5;
        
        while (opcao>4) {
        
            System.out.println
            ("---".repeat(20)
            + "\n Quem é o maior artilheiro da história do futebol? \n"
            + "1) Diego Maradona \n"
            + "2) Cristiano Ronaldo \n"
            + "3) Lionel Messi \n"
            + "4) Edson Arantes do Nascimento");
            
            opcao = leitorQuiz.nextInt();

            if (opcao == 2) {
                System.out.println("SIIIIIIIIU!! Resposta correta!");
                pontuacao+=2;
                opcao =0;
            } else if (opcao ==1 || opcao ==3 || opcao ==4) {
                System.out.println("Resposta errada! A correta é a opção 2.");
                opcao =0;
            } else {
                System.out.println("Digite uma alternativa válida!");
            }
        }
        
        opcao = 5;
        
        while (opcao>4) {
        
            System.out.println
            ("---".repeat(20)
            + "\n Em qual continente foi disputada a primeira copa do mundo? \n"
            + "1) América do Norte \n"
            + "2) América do Sul \n"
            + "3) Europa \n"
            + "4) África");
            
            opcao = leitorQuiz.nextInt();

            if (opcao == 2) {
                System.out.println("Resposta correta!");
                pontuacao+=2;
                opcao =0;
            } else if (opcao ==1 || opcao ==3 || opcao ==4) {
                System.out.println("Resposta errada! A correta é a opção 2.");
                opcao =0;
            } else {
                System.out.println("Digite uma alternativa válida!");
            }
        }
        
        opcao = 5;
        
        while (opcao>4) {
        
            System.out.println
            ("---".repeat(20)
            + "\n Aonde surgiu o futebol? \n"
            + "1) Brasil \n"
            + "2) Alemanha \n"
            + "3) Inglaterra \n"
            + "4) Uruguai");
            
            opcao = leitorQuiz.nextInt();

            if (opcao == 3) {
                System.out.println("Resposta correta!");
                pontuacao+=2;
                opcao =0;
            } else if (opcao ==2 || opcao ==1 || opcao ==4) {
                System.out.println("Resposta errada! A correta é a opção 3.");
                opcao =0;
            } else {
                System.out.println("Digite uma alternativa válida!");
            }
        }
        
        opcao = 5;
        
        while (opcao>4) {
        
            System.out.println
            ("---".repeat(20)
            + "\n Qual clube brasileiro possui 3 mundiais de clubes? \n"
            + "1) Corinthians \n"
            + "2) Flamengo \n"
            + "3) São Paulo \n"
            + "4) Santos");
            
            opcao = leitorQuiz.nextInt();

            if (opcao == 3) {
                System.out.println("Resposta correta!");
                pontuacao+=2;
                opcao =0;
            } else if (opcao ==2 || opcao ==1 || opcao ==4) {
                System.out.println("Resposta errada! A correta é a opção 3.");
                opcao =0;
            } else {
                System.out.println("Digite uma alternativa válida!");
            }
        }
        
        System.out.println(String.format
        ("Apita o árbitro, fim de jogo!! \n"
        + "Sua pontuação final: %d", pontuacao));
        
    }
    
    void sortearJogador() {
        
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        
        Integer jogador = null;
        Integer opcao = null;
        Integer sairContinuar = 2;
        
        while (sairContinuar>1) {
            
            System.out.println("---".repeat(20)
                    + "\nVocê seria:");
            
            jogador = random.nextInt(5);
            
            if (jogador ==1) {
                System.out.println("Cristiano Ronaldo");
            } else if (jogador ==2) {
                System.out.println("Caça Rato");
            } else if (jogador ==3) {
                System.out.println("Neymar");
            } else if (jogador ==4) {
                System.out.println("Neilton");
            } else {
                System.out.println("Messi");
            }
            
            System.out.println
            ("---".repeat(20)
            + "\n Você deseja sortear novamente? \n"
            + "1. Sim \n"
            + "2. Não \n"
            );
            
            opcao = leitor.nextInt();
            
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    sairContinuar = 0;
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
            
            
            
        }
        
    }
    
}
