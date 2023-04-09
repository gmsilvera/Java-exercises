package objetoCaneta;

/*
PROGRAMAÇÃO COM NATURALIDADE
 */
public class TestarCaneta {

    public static void main(String[] args) {
        /*
        public e protected = posso utilizar, se meu método main
        estiver utilizando um objeto de uma class.
        mais não posso utilizar métodos private.
         */

        System.out.println("CANETA 1");
        Caneta c1 = new Caneta(); //objeto caneta
        c1.modelo = "BIC CRISTAL"; //
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;

        /*
        acesso a um atributo private pelo metodo public tampar() dentro
        da classe public caneta().
         */
        c1.tampar();
        c1.rabiscar();
        c1.status();

        /*
        //chamada e/ou referencia a ATRIBUTO
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 50;

        //chamada e/ou referencia a METODO
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("");
        
        System.out.println("CANETA 2");
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 0.8f;
        c2.modelo = "HELLO";
        c2.carga = 80;
        c2.destampar();
        c2.status();
        c2.rabiscar();
         */
    }
}