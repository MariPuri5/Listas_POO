package com.lista1.lista3;

import java.util.Scanner;

public class Exerc1 {
    public static void resolucao() throws InterruptedException{

 /*1) Escreva um programa que sirva como um cronômetro. O usuário deve
digitar um numero em segundos e o programa deve contabilizar os segundos
digitados. O programa deve receber somente números entre 1 e 59, do
contrário ele retornar um erro e solicitar que o usuário digite um número válido. */


        
        int segundos = 0;
        
        Scanner scanner = new Scanner(System.in);
    
        /* 
       for (int i = 1; i < 60; i++) {
        System.err.println("Digite um nº entre 1 e 59: ");
        segundos = scanner.nextInt();
    */
     do { //o usuario fica aqui nesse sistema de reptição enquanto nao digitar o numero correto.
        System.out.println("Digite um nº entre 1 e 59: ");
        segundos = scanner.nextInt();
           // esse if ta aqui só pra mostrar uma segunda mensagem, msg de erro.
        if (segundos < 1 || segundos > 59) {
            System.out.print("Você digitou o nº errado.\n");
        }
        //se segundos for menor que 1 e maior que 59, ele volta lá pra cima.
     } while (segundos < 1 || segundos > 59);
    
            //depois que um numero correto é inserido, ele vai pra proxima linha de cogido.
        System.out.println("Iniciando cronometro de " + segundos + " segundos");
    
            //  sistema de reptição
        for (int i = 0; i <= segundos;i++) {
            System.out.println(i+" Segundos");
    
            //aqui ele faz uma pausa de 1 segundo
            Thread.sleep(1000);
        }
        //mensagem final
        System.out.println("Tempo esgotado!");
    
    
    }
    
    }











