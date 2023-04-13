package calculadoraTemperatura;

import java.util.Scanner;

public class CalculadoraTemperatura {
    public static void main(String[] args) {

        Temperatura Temperatura = new Temperatura();

//        for (int i = 0; i <= 1; i++) {
        int i = 0;
        do {
            int Opcao;
            System.out.print("Digite a Conversão desejada: \n"
                    + "1 - Celcius para Fahrenheit: F = C*(1,8) + 32 \n"
                    + "2 - Fahrenheit para Celcius: C = (F − 32) / 1,8 \n"
                    + "3 - Kelvin para Celcius: C = K – 273,15 \n"
                    + "4 - Celcius para Kelvin: K = C + 273,15 \n"
                    + "5 - Kelvin para Fahrenheit: F = 1,8(K-273) + 32 \n"
                    + "Qual sua opção? ");

            Opcao = new Scanner(System.in).nextInt();

            double ValorCalcular, Resultado = 0;
            System.out.print("Digite o valor a Converter: ");
            ValorCalcular = new Scanner(System.in).nextDouble();

            switch (Opcao) {
                case 1:
                    Resultado = Temperatura.CelsiusFahrenheit(ValorCalcular);
                    break;
                case 2:
                    Resultado = Temperatura.FahrenheitCelsius(ValorCalcular);

                    break;
                case 3:
                    Resultado = Temperatura.KelvinCelsius(ValorCalcular);

                    break;
                case 4:
                    Resultado = Temperatura.CelsiusKelvin(ValorCalcular);

                    break;
                case 5:
                    Resultado = Temperatura.KelvinFahrenheit(ValorCalcular);
                    break;

                default:
                    System.out.println("Erro");
            }
            System.out.print("O RESULTADO É: " + Resultado + "\n");
            
            
            System.out.println("Deseja continuar? digite i! ");
            
            i++;

        } while (i < 3);

//            int novamente;
//            novamente = new Scanner(System.in).nextInt();
//            if(novamente == 9){
//                i--;
//            }
//        }
    }
}
