import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, digite o número da conta: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do titular da conta: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite a agencia da conta: ");
        String agencia = scanner.next();

        double saldo = new Random().nextDouble() * 10000; // saldo aleatório entre 0 e 10.000
        System.out.printf("Seu saldo: %.2f\n", saldo);
        scanner.close();

        System.out.println("Conta criada com sucesso!");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo);
    }
}
