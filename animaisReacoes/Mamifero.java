package animaisReacoes;

public class Mamifero extends Animal{
    protected String corPelo;

    @Override //SOBREPOSIÇÃO
    public void emitirSom() {
        System.out.println("Som de mamífero.");
    }
    
}

