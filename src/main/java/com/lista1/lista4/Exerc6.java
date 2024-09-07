package com.lista1.lista4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc6 {
    public static void resolucao() {

        /*6) Aproveite a questão anterior e adiciona a opção do usuário remover
um item. */

        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        int mercado;

        do {
           
            System.out.println("----- Lista de Compras -----");
            System.out.println("1. Adicionar item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Remover item");
            System.out.println("4. Sair");
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
                    // Exibir lista de compras
                    System.out.println("----- Sua Lista de Compras -----");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i));
                        }
                    }
                    break;
                case 3:
                    // Remover item da lista
                    System.out.println("----- Remover Item da Lista -----");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia. Não há itens para remover.");
                    } else {
                        System.out.println("Escolha o número do item que deseja remover:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i));
                        }

                        int itemRemover = scanner.nextInt();
                        scanner.nextLine(); 

                        if (itemRemover > 0 && itemRemover <= lista.size()) {
                            String removido = lista.remove(itemRemover - 1);
                            System.out.println("Item '" + removido + "' removido da lista.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                case 4:
                    // Sair do programa
                    System.out.println("Programa Finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (mercado != 4);

    }
}
