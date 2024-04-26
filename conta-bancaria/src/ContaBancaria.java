import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
      
        
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os dados da conta
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha pendente após nextInt()

        String nomeCliente = "";
        boolean nomeClienteValido = false;
        while (!nomeClienteValido) {
            System.out.println("Por favor, digite o nome do Cliente:");
            nomeCliente = scanner.nextLine();
            if (nomeCliente.matches(".*\\d+.*")) {
                System.out.println("Proibido usar números no nome do cliente.");
            } else {
                nomeClienteValido = true;
            }
        }

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo mensagem com os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                           ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close(); // Fechando o scanner
    }
}

    
