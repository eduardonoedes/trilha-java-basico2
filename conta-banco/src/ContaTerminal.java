import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        // vars: 

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Info in: 
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digitar o número da agência: ");
        agencia = scanner.next();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo; ");
        saldo = scanner.nextDouble();



        // Retorno na tela:

        System.out.println("Olá " + nomeCliente + ", sua agência é " + agencia + " , conta " + numero + " e o saldo de R$ " + saldo + " já está disponivel para seu uso.");




    }
}

