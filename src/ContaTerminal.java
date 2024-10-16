import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        

        System.out.println("Por favor, o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o quanto quer depositar: ");
        double saldo = scanner.nextDouble();  

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + " e seu saldo " + saldo  + " já está disponível para saque");

        //fechar o scanner evita vazamento de dados.
        scanner.close();
    }

    public static String mensagem (int numero, String agencia, String nomeCliente, double saldo){
        return "Olá ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia).concat(", conta")
            .concat(String.valueOf(numero))
            .concat(" e seu saldo ")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível para saque");
    }
}
