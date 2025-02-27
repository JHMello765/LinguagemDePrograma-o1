import java.util.Scanner;

public class AprovacaoAluno {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar as notas das 1ª e 2ª avaliações
        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        // Calcular a média
        double media = (nota1 + nota2) / 2;

        // Verificar se o aluno foi aprovado
        if (media >= 6) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }

        // Exibir a média
        System.out.println("Média final: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
