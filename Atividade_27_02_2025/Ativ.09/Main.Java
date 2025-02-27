import java.util.Scanner;

public class CustoMacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();
        
        // Cálculo do custo total
        double precoPorMaca = (quantidade >= 12) ? 1.00 : 1.30;
        double custoTotal = quantidade * precoPorMaca;
        
        // Saída de dados
        System.out.printf("Custo total da compra: R$ %.2f\n", custoTotal);
        
        scanner.close();
    }
}
