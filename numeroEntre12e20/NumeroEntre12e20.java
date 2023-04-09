package numeroEntre12e20;

import java.util.Scanner;

public class NumeroEntre12e20 {

    private static Scanner Teclado;

    public static void main(String[] args) {
        int Numero = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número entre 12 e 20: ");

        Numero = teclado.nextInt();
        
        if (Numero >= 12 && Numero <= 20) {
            int Escolhido = Numero;
            System.out.println("O número está dentro do intervalo: " + "" + Escolhido);

        } else {
            System.out.println("O número está fora do intevalo.");
        }
    }
}