package heranca;

public class HerancaExercicio {
    public static void main(String[] args) {
        //        Pessoa p1 = new Pessoa();
                /*
                Visitante v1 = new Visitante();
                v1.setNome("Juvenal");
                v1.setIdade(22);
                v1.setSexo("M");
                System.out.println(v1.toString());
                 */
                
                //HERANÇA PARA DIFERENÇA - a classAluno, tem tudo que a classPessoa tem
                //mais tem uma ESPECIALIZAÇÃO, Aluno e uma especialização de pessoa
                //pessoas e uma generalização de aluno.
                Aluno a1 =new Aluno();
                a1.setNome("Cláudio");
                a1.setMatricula(1111);
                a1.setCurso("Informática");
                a1.setIdade(16);
                a1.setSexo("M");
                a1.pagarMensalidade();
                
                Bolsista b1 = new Bolsista();
                b1.setMatricula(222222);
                b1.setNome("Jubileu");
                b1.setBolsa(12.5f);
                b1.setSexo("M");
                b1.pagarMensalidade();
                
            }
        
}
