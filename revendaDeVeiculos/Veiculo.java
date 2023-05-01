package revendaDeVeiculos;

public class Veiculo {
    int Ano, Qt = 0;
    String Modelo;
    String Nome;

    int CadastrarQuantidade(int Valor, int Qt) {
        Qt += Valor;
        return Qt;
    }

    void Ligar() {
        System.out.println("Ligou Veiculo");
    }

    void Acelerar() {
        System.out.println("Veiculo Acelerando");
    }

    void Frear() {
        System.out.println("Veiculo Parando");
    }
}
