package com.lista1.lista3;

import java.util.Scanner;

public class Exerc7 {
    public static void resolucao(){

/* 7) Aproveitando o exercício anterior, escreva um programa que consiga
construir um retângulo. O usuário deve informar a largura e a altura em
asteriscos*/
 
        int base, altura;        
 
        System.out.println("Qual a medida da base do seu retângulo: ");
        Scanner scanner = new Scanner(System.in);
        base = scanner.nextInt();

        System.out.println("Qual a medida da altura do seu retângulo: ");
        altura = scanner.nextInt();

       
        for (int i = 0; i < altura; i++) {
            
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
          
            // Mudar de linha após cada linha
            System.out.println();
        }


    }
}
