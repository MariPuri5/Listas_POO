package com.lista1.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao(){

/*Escreva uma calculadora que receba um valor em reais e converta 
 * para dólar. Considere o valor do dólar a R$5,25. */

            double dolar, reais;

        System.out.print("Digite o valor em reais: "); 
        Scanner scanner = new Scanner(System.in);
        reais = scanner.nextDouble();

        dolar = reais / 5.25; 

        System.out.println("Seu valor em Dólar é $ " +dolar);





    }




}
