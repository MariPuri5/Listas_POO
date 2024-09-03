package com.lista1.lista2;

import java.util.Scanner;

public class Exerc7 {
    public static void resolucao(){

/* 7) Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
um determinado número informado pelo usuário é divisível por X (Que também
deve ser informado pelo usuário). */


int n1, n2;

        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        n2 = scanner.nextInt();

        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();

        if (n1==0) {
            System.out.println("Divisor não pode ser zero");
            
        } else {

            if (n2 % n1==0) {
                System.out.println(n2 + " é divisível por " + n1);
                
            } else {
                System.out.println(n2 + " não é divisível por " + n1);
                
            }
            
        }
 
}

}
