package com.lista1.lista4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc5 {
    public static void resolucao(){

        // 5) Escreva um programa que sirva como uma lista de compras de
        // mercado. Você irá criar um menu que pergunte se o usuário quer inserir
        // um item ou ver a lista.

        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        int mercado;

        do {
            // Exibe o menu para o usuário
            System.out.println("----- Lista de Compras -----");
            System.out.println("1. Adicionar item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            mercado = scanner.nextInt();
            scanner.nextLine();

            switch (mercado) {
                case 1:
                    System.out.print("Digite o item: ");
                    String item = scanner.nextLine();
                    lista.add(item);
                    System.out.println("Item '" + item + "' adicionado à lista.");
                    break;
                case 2:
                    System.out.println("----- Sua Lista de Compras -----");
                    if(lista.isEmpty()){
                    System.out.println("Lista está vazia");
                    }
                    else{
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(lista.get(i));
                        }
                    } 
                    break;
                case 3:
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Numero Invalido!");
                    break;
            }

        }while (mercado != 4);

}
}



