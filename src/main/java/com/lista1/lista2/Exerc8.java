package com.lista1.lista2;

import java.util.Scanner;

public class Exerc8 {
    public static void resolucao() {


        /* 8) Crie um joguinho de perguntas e respostas múltipla escolha. O programa
           deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo. Se
           o usuário chegar até o final o programa deve exibir o número de acertos. */

        int acertos = 0;
        int erros =0 ;
       String nome;
        

        System.out.println("Qual seu nome: ");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();

        System.out.println("Bem vindo ao Jogo de conhecimentos gerais \n");
      
        
        // Pergunta número 1
        System.out.println("1.De quem é a famosa frase “Penso, logo existo”?");
        System.out.println("a) Platão");
        System.out.println("b) Galileu Galilei");
        System.out.println("c) Descartes");
        System.out.println("d) Sócrates");
        System.out.println("e) Francis Bacon");
        
        String pergunta = scanner.nextLine();

        if (pergunta.equals("c") || pergunta.equals("C")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
        }

        //Pergunta 2
        System.out.println("2. De onde é a invenção do chuveiro elétrico?");
        System.out.println("a) França");
        System.out.println("b) Inglaterra");
        System.out.println("c) Austrália");
        System.out.println("d) Itália");
        System.out.println("e) Brasil");

        pergunta = scanner.nextLine();

        if (pergunta.equals("e") || pergunta.equals("E")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
        }

        //Pergunta 3
        System.out.println("3. Quantas casas decimais tem o número pi?");
        System.out.println("a) Duas");
        System.out.println("b) Centenas");
        System.out.println("c) Infinitas");
        System.out.println("d) Vinte");
        System.out.println("e) Milhares");

        pergunta = scanner.nextLine();

        if (pergunta.equals("c") || pergunta.equals("C")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
            if (erros >= 3) {
                System.out.println("Você perdeu! Acertou: " + acertos + " e errou: " + erros);
                return;
            }
        }


        //Pergunta 4
        System.out.println("4. Em que país se localizava Auschwitz, o maior campo de concentração nazi?");
        System.out.println("a) Rússia");
        System.out.println("b) Japão");
        System.out.println("c) Estados Unidos");
        System.out.println("d) Alemanha");
        System.out.println("e) Polônia");
      
        pergunta = scanner.nextLine();

        if (pergunta.equals("e") || pergunta.equals("E")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
            if (erros >= 3) {
                System.out.println("Você perdeu! Acertou: " + acertos + " e errou: " + erros);
                return;
            }
        }


        //Pergunta 5

        System.out.println("Quem é o autor do famoso discurso \"Eu tenho um sonho\"?");
        System.out.println("a) Nelson Mandela");
        System.out.println("b) Barack Obama");
        System.out.println("c) Zumbi dos Palmares");
        System.out.println("d) Martin Luther King");
        System.out.println("e) Carlota Joaquina");

        pergunta = scanner.nextLine();

        if (pergunta.equals("d") || pergunta.equals("D")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
            if (erros >= 3) {
                System.out.println("Você perdeu! Acertou: " + acertos + " e errou: " + erros);
                return;
            }
        }

        if (acertos >= 3) {
            System.out.println("\nPARABÉNS " +nome);
            System.out.println("\nVocê ganhou");
            System.out.println("\nVocê acertou: " + acertos + " e errou: "+ erros);
        }

}


}