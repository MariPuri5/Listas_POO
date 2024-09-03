package com.lista1.lista2;

import java.util.Scanner;

public class Exerc6 {
    public static void resolucao(){

       /*6) Crie um programa que receba as notas de um aluno e informe se ele foi
 aprovado ou reprovado. Se o aluno ficar com média acima de 6 nas 2 primeiras
 provas ele passou. Senão o programa deverá perguntar a nota de recuperação
 que irá substituir a menor nota. A pergunta de recuperação deverá aparecer
 somente para os alunos que precisarem. */ 


        int n1, n2, recuperacao;
        String nome;
        
    System.out.println("Digite seu nome: ");
    Scanner scanner = new Scanner(System.in);
    nome = scanner.nextLine();

    System.out.println("Digite sua primeira nota: ");
    n1 = scanner.nextInt();

    System.out.println("Digite sua segunda nota: ");
    n2 = scanner.nextInt();     


    if ((n1+n2)/2 >= 6) {
        System.out.println("Você está aprovado, boas ferias!");

        
    } else  {
        System.out.println("Você está reprovado.");
               

    }
     
    System.out.println("Qual a nota da sua recuperação: ");
    recuperacao = scanner.nextInt();

    if ((recuperacao+n1)/2 > 6) {
        System.out.println("Você está aprovado, boas ferias!");
        
    } else if ((recuperacao+n2)/2 > 6) {
        System.out.println("Você está aprovado, boas ferias!");
    }

    else {
        System.out.println("Você está reprovado.");
    }


    }
}
