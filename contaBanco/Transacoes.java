package contaBanco;

public class Transacoes {

    public static void main(String[] args) {

        //JUBILEU
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("JUBILEU");
        p1.abrirConta("CC");
//        p1.fecharConta();
//        p1.fecharConta();
        System.out.println("----------------");
        p1.sacar(150);
        p1.depositar(300);

        p1.estadoAtual();

        //CREUZA
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("CREUZA");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.sacar(500);
        
        
        p2.estadoAtual();

        ContaBanco p3 = new ContaBanco();
        p3.setNumConta(3333);
        p3.setDono("DAVI SILVEIRA");
        p3.abrirConta("CP");
        
        
        p3.estadoAtual();
    }

}
