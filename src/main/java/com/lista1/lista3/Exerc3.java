package com.lista1.lista3;

import java.util.Scanner;

public class Exerc3 {
    public static void resolucao() {


/*Escreva um código que receba dois números inteiros e escreva todos os
números pares entre eles. */


int n1, n2;

System.out.println("Digite um número: ");
Scanner scanner = new Scanner(System.in);
n1 = scanner.nextInt();

System.out.println("Digite outro número: ");
n2 = scanner.nextInt();

if (n1 > n2){

int temp = n1;
n1 = n2;
n2 = temp;

}

 for (int i = n1; i <= n2; i++){

    if (i % 2 == 0){
        System.out.println(i);
    }
   
   
        
    }

}
}

