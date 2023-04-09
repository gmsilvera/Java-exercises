package objetoCaneta;

public class Caneta {
     // Atributos
    public String modelo;
    public String cor;
    float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("A cor da caneta : " + this.cor); //this - auto referência (nome do objeto que chamou)
        System.out.println("A tem ponta : " + this.ponta);
        System.out.println("A caneta tem carga de : " + this.carga);
        System.out.println("A caneta está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO - caneta tampada, não pode Rabiscar!");
        } else {
            System.out.println("Rabiscando!");
        }
    }

    public void tampar() {
        /*
        Quando o método tampar() é chamado, quem chamou foi c1
        this É REFERENTE AO OBJETO QUE CHAMOU
        this passa a ser o NOME DO OBJETO QUE CHAMOU, nesse caso c1.        
        
        Quando necessário alterar um atributo dentro de uma classe
        
        COLOCAR this NA FRENTE DA LINHA QUE VAI MEXER NESSE ATRIBUTO
        
         */
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
