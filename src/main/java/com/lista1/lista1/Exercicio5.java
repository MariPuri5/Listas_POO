package com.lista1.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){  

/*5- Construa um algoritmo que calcule o valor de um terreno baseado
 na sua area e o valor por m2. */

double largura, comprimento, preco_mt2;

System.out.print("Largura do seu Terreno: ");
Scanner scanner = new Scanner(System.in);
largura = scanner.nextDouble();

System.out.print("Comprimento do seu Terreno: ");
comprimento = scanner.nextDouble();

System.out.println("O Valor do metro quadrado: ");
preco_mt2= scanner.nextDouble();

double Area = (largura*comprimento);

double total = (Area * preco_mt2);

System.out.println("A area é: " +Area);
System.out.println("Total do terreno é: " +total);


    }
}