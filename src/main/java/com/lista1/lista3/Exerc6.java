package com.lista1.lista3;

import java.util.Scanner;

public class Exerc6 {
    public static void resolucao() {

        /* Escreva um programa que seja capaz de desenhar uma pirâmide de
        asteriscos. O usuário deverá informar quantos andares ele deseja que a
        pirâmide tenha. */

        

        System.out.println("Quantos andares a pirâmide deve ter? ");
        Scanner scanner = new Scanner(System.in);
        int andares = scanner.nextInt();

        for (int i = 1; i <= andares; i++) {
            // Desenhar os espaços em branco
            for (int j = 1; j <= andares - i; j++) {
                System.out.print(" ");
            }
            // Desenhar os asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Mudar de linha após cada andar
            System.out.println();
        }

        scanner.close();  
    }

    }

