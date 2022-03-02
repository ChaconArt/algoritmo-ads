/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author arthur
 */
public class ExercicioCalorias {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
//        tempo de atividades 
        Integer tempoAquec = null;
        Integer tempoExer = null;
        Integer tempoMusc = null;
        Integer tempoTotal = null;
        
//        calorias perdidas
        Integer caloAquec = null;
        Integer caloExer = null;
        Integer caloMusc = null;
        Integer caloTotal = null;
        
        System.out.println("Quanto tempo você passou se aquecendo?");
        tempoAquec = leitor.nextInt();
        
        System.out.println("Quanto tempo você fez exercícios aeróbicos?");
        tempoExer = leitor.nextInt();
        
        System.out.println
        ("Quanto tempo você que ele fez exercícios de musculação?");
        tempoMusc = leitor.nextInt();
        
        caloAquec = tempoAquec * 12;
        caloExer = tempoExer * 20;
        caloMusc = tempoMusc * 25;
        
        caloTotal = caloAquec + caloExer + caloMusc;
        tempoTotal = tempoAquec + tempoExer + tempoMusc;
        
        
        System.out.println(String.format
        ("Olá, Jorge. Você fez um total de %d minutos de exercícios"
                + " e perdeu cerca de %d calorias", tempoTotal, caloTotal));
    }
    
}
