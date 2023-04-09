package idadePeloAnoDeNascimento;

import java.util.Scanner;

public class IdadePeloAnoDeNascimento {
    public static void main(String[] args) {
        // TODO code application logic here

        //ESTRUTURA DE CONTROLE - CONDICIONAL COMPOSTA
        System.out.print("EM QUAL ANO VOCÊ NASCEU? ");
        Scanner t = new Scanner(System.in);
        int nasc = t.nextInt();
        int i = 2022 - nasc;
        System.out.println("SUA IDADE É: " + i + " ANOS.");
        if (i >= 18) {
            System.out.println("MAIOR DE IDADE!");
        } else {
            System.out.println("MENOR DE IDADE!");
        }
    }
}
