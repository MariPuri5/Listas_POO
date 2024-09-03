package com.lista1.lista1;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao(){

        //1) Escreva um programa que faça a soma entre 2 números.

		int n1;
		int n2;

		System.out.print("Digite o primeiro número: "); 
		Scanner scannerLeia = new Scanner(System.in);       
		n1 = scannerLeia.nextInt();                        
		
		System.out.print("O primeiro número é: "+n1+"\n");
		
		System.out.println("Digite o segundo número: ");
		n2 = scannerLeia.nextInt();

		System.out.println("O segundo número é: "+n2);

		System.out.println("A soma é: "+(n1+n2));

	}

}

    

