import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de horas trabalhadas no mês, o salário por hora
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salarioHora = scanner.nextDouble();

        // Definir o número de horas regulares em um mês (4 semanas de 40 horas por semana)
        int horasRegularesNoMes = 40 * 4;

        // Calcular o salário base, sem considerar as horas extras
        double salarioBase = horasRegularesNoMes * salarioHora;

        // Se o funcionário trabalhou mais de 160 horas (40 horas por semana * 4 semanas)
        double salarioTotal;

        if (horasTrabalhadas > horasRegularesNoMes) {
            // Calcular as horas extras
            int horasExtras = horasTrabalhadas - horasRegularesNoMes;
            double valorHoraExtra = salarioHora * 1.5;  // 50% de acréscimo
            salarioTotal = salarioBase + (horasExtras * valorHoraExtra);
        } else {
            // Se não houver horas extras
            salarioTotal = horasTrabalhadas * salarioHora;
        }

        // Exibir o salário total
        System.out.printf("O salário total do funcionário é: R$ %.2f\n", salarioTotal);

        // Fechar o scanner
        scanner.close();
    }
}
