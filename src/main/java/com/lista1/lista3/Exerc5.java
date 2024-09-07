package com.lista1.lista3;

import java.util.Scanner;

public class Exerc5 {
    public static void resolucao(){

/*5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
algum deles estiver errado o programa deve retornar ao usuário quais das
opções está errada, se é o login ou a senha. O programa deve bloquear o
acesso após 3 tentativas erradas. Quando for a última tentativa ele deve emitir
um alerta: "Última tentativa, mais um erro seu acesso será bloqueado!" */

    String login;
    String senha;
    String loginCerto = "Mari5";
    String senhaCorreta  = "12345";
    int tentativas = 0;
    int maxTentativas = 3;

  
    while (tentativas < maxTentativas) {   
    
    System.out.println("Digite o seu Login: ");
    Scanner scanner = new Scanner(System.in);
    login = scanner.nextLine();

    System.out.println("Digite sua senha: ");
    senha = scanner.nextLine();


        if (login.equals(loginCerto) && senha.equals(senhaCorreta)) {
            System.out.println("Bem vindo usuario!");
                break;
    
            } else {
               if (tentativas == 2) {
                System.out.println("Ultima tentativa e o seu usuario será bloqueado.");
                 }
               if (login.equals(loginCerto) && senha.equals(senhaCorreta)){
                


               }
                System.out.println();
    }

}







    }

}
