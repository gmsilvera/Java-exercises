package compararString;

public class CompararString {

    public static void main(String[] args) {
        System.out.println("Comparando Strings\n");
        String nome1 = "GEDERSON";
        String nome2 = "GEDERSON";
        String nome3 = new String ("GEDERSON");
        String res;
//        res = (nome1 == nome2) ? "igual":"Diferente";
//        System.out.println("O resultado é:" + res);
//        
        res = (nome1.equals(nome3)) ? "igual":"Diferente";
        System.out.println("O resultado é:" + res + "\n");
    }
}