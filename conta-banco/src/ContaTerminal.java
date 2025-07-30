import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Por favor, digite o número da conta!");
        int account = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da agência!");
        String agency = sc.nextLine();
        System.out.println("Por favor, digite seu nome!");
        String customername = sc.nextLine();
        System.out.println("Por favor, digite seu saldo!");
        double balance = sc.nextDouble();

        System.out.print(" Olá " + customername + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account + " e seu saldo " + balance + " já está disponível para saque ");




        sc.close();

    }
}
