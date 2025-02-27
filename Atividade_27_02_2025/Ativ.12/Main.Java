import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar dois valores
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Verificar qual valor é o maior
        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }

        // Fechar o scanner
        scanner.close();
    }
}
