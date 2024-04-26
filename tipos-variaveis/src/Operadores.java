public class Operadores {
    public static void main(String[] args) {
        
        int numero = 4;
        System.out.println( ++ numero );
        System.out.println(numero --);

        int a, b;
        a = 20;
        b = 20;

        String resultado = a == b ? "verdadeiro" : "falso"; // operador ternário (==) compara os valores (?) pergunta se é verdadeiro ou falso (:) retorna o valor
        System.out.println("Resultado da comparação: " + resultado);

       // == , != //(igual, diferente)
       // != //não é igual
       // && , || //e, ou
       // =!= //diferente de (não é igual)
        // > , < , >= , <= //maior, menor, maior ou igual, menor ou igual
    }
}
