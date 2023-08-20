package com.mycompany.dowhile;

import java.util.Scanner;

/**
 *
 * @author gederson
 */
public class Dowhile {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        
        // loop com doWhile até o número especificado.
        int c = 0;
        do {
            System.out.println("Incrementou");
            c++;
        } while (c < 4);
         */

        //Somar número com entrada do usuário
        int n, s = 0;
        String resposta;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            s += n; // s = s + n;
            System.out.println("Quer continuar? s / n");
            resposta = teclado.next();
        } while (resposta.equals("s"));
        System.out.println("A soma dos valores é: " + s);
    }
}
