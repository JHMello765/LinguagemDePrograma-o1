import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();
        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();
        
        // Cálculo do novo salário
        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);
        
        // Saída de dados
        System.out.println("O novo salário é: R$ " + novoSalario);
        
        scanner.close();
    }
}
