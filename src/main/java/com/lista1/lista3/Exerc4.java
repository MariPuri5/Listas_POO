package com.lista1.lista3;

import java.util.Scanner;

public class Exerc4 {
    public static void resolucao() {

/*4) Jogo da adivinhação. Peça para alguém escolher um número. Depois peça
para outra pessoa tentar adivinhar. O programa deverá retornar dicas como:
"Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio". */


    int n, adivinhar;

    System.out.println("Jogo da adivinhação");
    System.out.println("Digite um número para outra pessoa advinhar: ");
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();

    
   do {  
    System.out.println("Tente advinhar o numero que alguém escolheu");
   adivinhar = scanner.nextInt();
    
    if (adivinhar == n) {
        System.out.println("Acertou! Parabéns!");
    } 
    else if (Math.abs(n-adivinhar) <=2) {
        System.out.println("Quase, ta muito perto");
    }
    else if (Math.abs(n-adivinhar) <=5) {
        System.out.println("ta perto já");
    }
    else if (Math.abs(n-adivinhar) <=10) {
        System.out.println("perto mas nem tanto ");
    }
    else if (n > adivinhar) {
        System.out.println("Ixi, tá muito baixo");
    }
    else  {
        System.out.println("Eita, tá muito alto");
    }

   } while (adivinhar != n);


}

}



        
 