/*
    pacote e um agrupamento de class
    class e um agrupamento de objeto, atributos e metodos
    PROTECTED - So quem pode ter acesso e a super class ou subclasse
    PRIVATE - SOMENTE A CLASSE TEM ACESSO
*/
package calculadoraTemperatura;

public class Temperatura {
    double Fahrenheit, Celsius, Kelvin;

    // Celcius para Fahrenheit: F = C*(1,8) + 32
    double CelsiusFahrenheit(double Celsius) {
        Fahrenheit = Celsius * (1.8) + 32;
        return Fahrenheit;
    }

    // Fahrenheit para Celcius: C = (F − 32) / 1,8
    double FahrenheitCelsius(double Fahrenheit) {
        Celsius = (Fahrenheit - 32) / 1.8;
        return Celsius;
    }

    // Kelvin para Celcius: C = K – 273,15
    double KelvinCelsius(double Kelvin) {
        Celsius = Kelvin - 273.15;
        return Celsius;
    }

    // Celcius para Kelvin: K = C + 273,15
    double CelsiusKelvin(double Celsius) {
        Kelvin = Celsius + 273.15;
        return Kelvin;
    }

    // Kelvin para Fahrenheit: F = 1,8(K-273) + 32
    double KelvinFahrenheit(double Kelvin) {
        Fahrenheit = 1.8 * (Kelvin - 273) + 32;
        return Fahrenheit;
    }
    
//    void loopOpcao(){
//        if (opcao )
//    }
}
