import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de conta Bancária");

        System.out.print("Digite o Seu Nome :_ ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o Número da sua Conta :_ ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite Sua Agencia :_ ");
        int agencia = scanner.nextInt();
        
        System.out.print("Digite Seu Saldo :_ ");
        scanner.nextLine();
        float saldo = scanner.nextFloat();
        
        System.out.print("Olá '" + nomeCliente);
        System.out.print("', obrigado por criar uma conta em nosso banco, sua agência é '"+ agencia);
        System.out.print("', sua conta é '"+ numeroConta+ "', e seu saldo é de "+saldo+", já está disponível para saque");
        scanner.close();

    }
}
