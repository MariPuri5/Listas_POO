package com.lista1.lista4;

import java.util.Scanner;

public class Exerc1 {
    public static void resolucao(){

/* 1) Voce é gerente de um supermercado e sabe que os valores das
vendas do dia são gravados em um vetor. Digite um código que faça o
fechamento (soma) de vendas do dia de maneira automatizada. */


      
        
        
        System.out.print("Digite o número de vendas realizadas hoje: ");
        Scanner scanner = new Scanner(System.in);
        int NVendas = scanner.nextInt();
        
        // Cria um array para armazenar os valores das vendas
        double[] vendas = new double[NVendas];
        
        // Preenche o array com os valores das vendas
        for (int i = 0; i < NVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
        }
        
        // Calcula a soma total das vendas
        double totalVendas = 0;
        for (int i = 0; i < NVendas; i++) {
            totalVendas += vendas[i];
        }
        
        // Exibe o valor total das vendas
        System.out.println("O fechamento do dia foi: R$ " + totalVendas);
        
        
    }
}

       
 

   