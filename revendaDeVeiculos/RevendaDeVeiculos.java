package revendaDeVeiculos;

public class RevendaDeVeiculos {
    public static void main(String[] args) {

        Veiculo Carro = new Veiculo(); // Instanciando o Objeto
        Veiculo Moto = new Veiculo(); // Instanciando o Objeto

        Carro.Ano = 2019;
        Carro.Nome = "Nissan";
        Carro.Modelo = "Sentra";

        Moto.Ano = 2020;
        Moto.Nome = "Suzuki";
        Moto.Modelo = "Kawazaki";

        System.out.println(Carro.Ano);
        System.out.println(Carro.Nome);
        System.out.println(Carro.Modelo);

        Carro.Ligar();
        Carro.Acelerar();
        Carro.Frear();

        int QtCarro = 0;

        QtCarro = Carro.CadastrarQuantidade(2, QtCarro);
        System.out.println(QtCarro);

        QtCarro = Carro.CadastrarQuantidade(3, QtCarro);
        System.out.println(QtCarro);

        QtCarro = Carro.CadastrarQuantidade(5, QtCarro);
        System.out.println(QtCarro);

    }
}
