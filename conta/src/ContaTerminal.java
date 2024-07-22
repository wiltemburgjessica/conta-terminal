
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + "já está disponível para saque.");
    }
}