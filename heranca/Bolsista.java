package heranca;

//superClass de aluno
public class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);

    }
    //com uso do método final, em um método, não será possível
    //a sobreposição
    //*** final tambem pode ser usado em class
    //porem uma class não pode ter filhos, ou seja, subclass
    //consequentemente a subclass não pode extends tambem.
    
    
    @Override //Sobreposição de método
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
