package com.lista1.lista4;

import java.util.Scanner;

public class Exerc2 {
    public static void resolucao(){

/*2) Agora que voce sabe o fechamento do dia, monte um código que
identifique a compra de menor valor e a compra de maior valor */


        
       
        System.out.print("Digite o número de vendas realizadas hoje: ");
        Scanner scanner = new Scanner(System.in);
        int numVendas = scanner.nextInt();
                
        double[] vendas = new double[numVendas];
        
                for (int i = 0; i < numVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
        }
        
        // Menor e maior valor
        double totalVendas = 0;
        double menorVenda = vendas[0]; // atribui o primeiro valor
        double maiorVenda = vendas[0]; // atribuímos o primeiro valor
        
        // Calcula a soma total das vendas e encontra o menor e maior valor
        for (int i = 0; i < numVendas; i++) {
            totalVendas += vendas[i];
            
            if (vendas[i] < menorVenda) {
                menorVenda = vendas[i];
            }
            
            if (vendas[i] > maiorVenda) {
                maiorVenda = vendas[i];
            }
        }
        
        // Exibe o valor total das vendas, a menor e a maior venda
        System.out.println("O fechamento do dia foi: R$ " + totalVendas);
        System.out.println("A menor venda foi: R$ " + menorVenda);
        System.out.println("A maior venda foi: R$ " + maiorVenda);
        
      
    }
}






