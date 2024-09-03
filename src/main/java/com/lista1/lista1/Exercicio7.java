package com.lista1.lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){

/* Escreva um programa que receba quatro notas de um aluno 
 e calcule a média aritmética dessas notas. */

               
         
    System.out.print("Digite o nome do aluno: ");
    Scanner scanner = new Scanner (System.in);
    String nome = scanner.nextLine();

    System.out.println("Digite a disciplina: ");
    String disciplina = scanner.nextLine();

    System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();

    System.out.println("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();

    System.out.println("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();

    System.out.println("Digite a quarta nota: ");
    double nota4 = scanner.nextDouble();


    System.out.println("A média é: "+((nota1+nota2+nota3+nota4)/4));



    }

}
