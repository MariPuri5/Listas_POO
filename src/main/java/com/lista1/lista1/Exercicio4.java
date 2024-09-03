package com.lista1.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){

/*4- Construa um algoritmo que leia um número inteiro na tela
 e responda o número antecessor e o sucessor. */

        int n1;

        System.out.println("Digite um numero: ");
        Scanner leia = new Scanner(System.in); 
        n1 = leia.nextInt(); 

        System.out.println("O antecessor é: "+(n1-1) + "\n e o sucessor é "+(n1+1));


    }
}
