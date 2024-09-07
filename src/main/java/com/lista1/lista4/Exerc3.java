package com.lista1.lista4;

import java.util.Scanner;

public class Exerc3 {
    public static void resolucao(){

/*3) Ainda utilizando o exercício do mercado, calcule o ticket médio de
vendas do dia */        
                    
                
    System.out.print("Digite o número de vendas realizadas hoje: ");
    Scanner scanner = new Scanner(System.in);
    int NVendas = scanner.nextInt();
                
               
    double[] vendas = new double[NVendas];
                
                
        for (int i = 0; i < NVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
                }
                
               
            double totalVendas = 0;
            double menorVenda = vendas[0];
            double maiorVenda = vendas[0]; 
                
                
         for (int i = 0; i < NVendas; i++) {
            totalVendas += vendas[i];
                    
                if (vendas[i] < menorVenda) {
                menorVenda = vendas[i];
                    }
                    
                if (vendas[i] > maiorVenda) {
                maiorVenda = vendas[i];
                    }
                }
                
                // Calcula o ticket médio
                double ticketMedio = totalVendas / NVendas;
                
                // Exibe o valor total das vendas, a menor e a maior venda, e o ticket médio
                System.out.println("O fechamento do dia foi: R$ " + totalVendas);
                System.out.println("A menor venda foi: R$ " + menorVenda);
                System.out.println("A maior venda foi: R$ " + maiorVenda);
                System.out.println("O ticket médio foi: R$ " + ticketMedio);
                
                
            }
        }
        








    