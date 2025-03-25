import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite o numero da conta: ");
        numero = sc.nextInt();

        System.out.println("Agencia: ");
        agencia = sc.next();
        sc.nextLine();
        System.out.println("Nome Cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Saldo: ");
        saldo = sc.nextDouble();

        System.out.printf("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + " conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");

        sc.close();
    }
}