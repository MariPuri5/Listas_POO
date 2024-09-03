package com.lista1.lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao(){


/* 8- Suponha que você trabalhe em um laboratório e seu colega mediu
a temperatura de um objeto em Fahrenheit. Escreva um programa capaz de converter em celsius.*/

double celsius;

System.out.println("Digite a temperatura em Celsius: ");
Scanner scanner = new Scanner(System.in); 
celsius = scanner.nextDouble();

double Fahrenheit = (celsius * 1.8) + 32;

System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);


    }
        
    }

