public class TiposeVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        
        int idade = 35;
        double altura  = 1.70;
        String cidade = "Campinas";
        boolean casado = true;
        float peso = 80.5f;

        final double PI = 3.14159; // (FINAL) O VALOR NÃO PODE SER MUDADO OU ALTERADO (TEM QUE ESTAR EM CAIXA ALTA)
        final int IDADE_MAXIMA = 100; //(como nesse exemplo, o valor não pode ser alterado)

        System.out.println("sua idade é : " + idade);
        System.out.println("sua altura é : " + altura + " m");
        System.out.println("sua cidade é : " + cidade);
        System.out.println("você está casado? " + casado);
        System.out.println("seu peso é : " + peso + " kg");


    }
}
