package com.lista1.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){

/* 6- Constua que leia 1 - a distância percorrida por um veículo em km
 2- o total em combustível em L. No final deverá ser respondido o consumo médio
 deste veículo em km/l. */

double distancia_percorrida_em_km, total_gasto;

        System.out.print("Distancia percorrida (km): ");
        Scanner scanner = new Scanner(System.in);
        distancia_percorrida_em_km = scanner.nextDouble();


        System.out.print("Total gasto de combustivel: ");
        total_gasto = scanner.nextDouble();

        double consumo_medio = (distancia_percorrida_em_km / total_gasto);


        System.out.println("O consumo médio é: " + consumo_medio);  

    }
}
