package primeiroprogama;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        System.out.println("Digite seu nome completo: ");
        nome = scanner.nextLine();

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Seu nome completo é: " + nome);
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        System.out.println("Voce tem " + idade + " anos");

        scanner.close();
    }
}
