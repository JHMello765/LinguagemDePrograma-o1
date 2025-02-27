import java.util.Scanner;

public class VerificaVoto {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o ano atual e o ano de nascimento
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Calcular a idade da pessoa
        int idade = anoAtual - anoNascimento;

        // Verificar se a pessoa pode votar
        if (idade >= 16) {
            System.out.println("Você pode votar este ano!");
        } else {
            System.out.println("Você não pode votar este ano.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
