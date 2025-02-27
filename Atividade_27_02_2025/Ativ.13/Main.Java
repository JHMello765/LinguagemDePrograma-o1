import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar dois valores
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Imprimir os valores em ordem crescente
        if (valor1 < valor2) {
            System.out.println("Os valores em ordem crescente são: " + valor1 + " e " + valor2);
        } else {
            System.out.println("Os valores em ordem crescente são: " + valor2 + " e " + valor1);
        }

        // Fechar o scanner
        scanner.close();
    }
}
