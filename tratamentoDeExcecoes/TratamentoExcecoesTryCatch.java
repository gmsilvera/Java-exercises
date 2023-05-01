package tratamentoDeExcecoes;

public class TratamentoExcecoesTryCatch {
    public static void main(String[] args) {
        try {
            falha();
            System.out.print("Z1");
        } catch (RuntimeException ex) {
            System.out.print("Z2");
        } catch (Exception ex1) {
            System.out.print("Z3");
        } finally {
            System.out.print("Z4");
        }
        System.out.print("Z5");
    }

    public static void falha() {
        throw new RuntimeException();
    }
}
