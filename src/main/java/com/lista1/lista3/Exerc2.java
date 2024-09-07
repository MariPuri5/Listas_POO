package com.lista1.lista3;

import java.util.Scanner;

public class Exerc2 {
    public static void resolucao(){

/* Desenvolva um programa que receba um número do usuário e escreva a
tabuada dele. */

int n;

Scanner scanner = new Scanner(System.in);

do {
    System.out.println("Digite um número: ");
    n = scanner.nextInt();
    
} while (n <= 0 ); 

for (int i = 0; i <= 10; i++) {
    System.out.println(n + " * " + i + " = " + (n*i));
    
}



    }

}
