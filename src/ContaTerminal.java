import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Digite o número da conta: ");
            int numero_da_conta = sn.nextInt();

            System.out.print("Digite a agência: ");
            String agencia = sn.next();

            System.out.print("Digite o nome do cliente: ");
            String nome_do_cliente = sn.next();

            System.out.print("Digite o saldo: ");
            float saldo = sn.nextFloat();

            // Agora você pode usar essas variáveis como desejar
            System.out.println("Número da conta: " + numero_da_conta);
            System.out.println("Agência: " + agencia);
            System.out.println("Nome do cliente: " + nome_do_cliente);
            System.out.println("Saldo: " + saldo);
        }
    }
}