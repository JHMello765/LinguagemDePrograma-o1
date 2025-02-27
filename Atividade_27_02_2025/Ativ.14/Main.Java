import java.util.Scanner;

public class DuracaoJogoXadrez {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar a hora de início e a hora de fim
        System.out.print("Digite a hora de início do jogo (em horas inteiras): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo (em horas inteiras): ");
        int horaFim = scanner.nextInt();

        // Calcular a duração do jogo
        int duracao;
        
        // Caso o jogo tenha terminado no dia seguinte
        if (horaFim >= horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        // Exibir a duração do jogo
        System.out.println("A duração do jogo foi de " + duracao + " horas.");

        // Fechar o scanner
        scanner.close();
    }
}
