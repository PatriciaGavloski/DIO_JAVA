import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja muito Bem-Vindo");
        System.out.println("Por favor, digite as informações a seguir!");

        System.out.println("Número da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Número da agência: ");
        int agencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Nome do cliente: ");
        String nome = scanner.nextLine();

    
        float saldo = 500.00f;

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", sua conta é: " + numero + ", e seu saldo de: " + saldo + " já está disponível para saque.");

        System.out.println("Fim");

        scanner.close(); 
    }
}
