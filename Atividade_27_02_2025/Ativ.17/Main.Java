import java.util.Scanner;

public class CalculoMediaLP1 {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar as notas e dados necessários
        System.out.print("Digite a nota da P1: ");
        double P1 = scanner.nextDouble();

        System.out.print("Digite a nota da E1: ");
        double E1 = scanner.nextDouble();

        System.out.print("Digite a nota da E2: ");
        double E2 = scanner.nextDouble();

        System.out.print("Digite a nota da API: ");
        double API = scanner.nextDouble();

        System.out.print("Digite a nota da X: ");
        double X = scanner.nextDouble();

        System.out.print("Digite a nota do SUB: ");
        double SUB = scanner.nextDouble();

        // Cálculo da média de LP1 de acordo com a fórmula fornecida
        double mediaBase = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4);
        double parte1 = mediaBase * 0.5;
        double parte2 = Math.max((mediaBase - 5.9), 0) / (mediaBase - 5.9);
        double parte3 = parte2 * (API * 0.5);
        double parte4 = X;
        double parte5 = SUB * 0.3;

        // Cálculo final da média de LP1
        double mediaLP1 = parte1 + parte3 + parte4 + parte5;

        // Exibir a média calculada
        System.out.printf("A média de LP1 do aluno é: %.2f\n", mediaLP1);

        // Fechar o scanner
        scanner.close();
    }
}
