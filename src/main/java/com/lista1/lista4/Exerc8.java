package com.lista1.lista4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exerc8 {
    public static void resolucao() {

        /* 8) Aproveite os códigos anteriores e implemente a função de impressão
        por ordem de preço (crescente). */

        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>(); 
        List<Double> preco = new ArrayList<>();  

        int mercado;
        do {
            
            System.out.println("----- Lista de Compras -----");
            System.out.println("1. Adicionar item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Remover item");
            System.out.println("4. Ordenar lista por preço (crescente)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            mercado = scanner.nextInt();
            scanner.nextLine();  

            switch (mercado) {
                case 1:
                    
                    System.out.print("Digite o item: ");
                    String item = scanner.nextLine();
                    System.out.print("Digite o preço do item: ");
                    double precoItem = scanner.nextDouble();
                    scanner.nextLine();                      
                    lista.add(item);
                    preco.add(precoItem);

                    System.out.println("Item '" + item + "' com preço R$" + precoItem + " adicionado à lista.");
                    break;

                case 2:
                   
                    System.out.println("----- Sua Lista de Compras -----");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i) + " - R$" + preco.get(i));
                        }
                    }
                    break;

                case 3:
                    
                    System.out.println("----- Remover Item da Lista -----");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia. Não há itens para remover.");
                    } else {
                        System.out.println("Escolha o número do item que deseja remover:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i) + " - R$" + preco.get(i));
                        }

                        int itemRemover = scanner.nextInt();
                        scanner.nextLine(); 

                        if (itemRemover > 0 && itemRemover <= lista.size()) {
                            String removido = lista.remove(itemRemover - 1);
                            double precoRemovido = preco.remove(itemRemover - 1);
                            System.out.println("Item '" + removido + "' com preço R$" + precoRemovido + " removido da lista.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 4:
                    
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        
                        List<ItemPreco> listaOrdenada = new ArrayList<>();
                        for (int i = 0; i < lista.size(); i++) {
                            listaOrdenada.add(new ItemPreco(lista.get(i), preco.get(i)));
                        }

                        
                        listaOrdenada.sort(Comparator.comparingDouble(ItemPreco::getPreco));

                        // Exibe a lista ordenada por preço
                        System.out.println("----- Lista Ordenada por Preço (Crescente) -----");
                        for (int i = 0; i < listaOrdenada.size(); i++) {
                            System.out.println((i + 1) + ". " + listaOrdenada.get(i).getItem() + " - R$" + listaOrdenada.get(i).getPreco());
                        }
                    }
                    break;

                case 5:
                    
                    System.out.println("Programa Finalizado.");
                    break;

                default:
                    
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (mercado != 5);
    }

    // Ajuda a armazenar um item e seu preço
    static class ItemPreco {
        private String item;
        private double preco;

        public ItemPreco(String item, double preco) {
            this.item = item;
            this.preco = preco;
        }

        public String getItem() {
            return item;
        }

        public double getPreco() {
            return preco;
        }
    }
}
