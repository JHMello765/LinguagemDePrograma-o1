import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();
        
        System.out.print("Digite o valor total das vendas: ");
        double totalVendas = scanner.nextDouble();
        
        System.out.print("Digite o valor recebido por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();
        
        // Cálculo do salário final
        double comissaoPorCarro = carrosVendidos * valorPorCarro;
        double comissaoVendas = totalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoVendas;
        
        // Saída de dados
        System.out.println("O salário final do vendedor é: R$ " + salarioFinal);
        
        scanner.close();
    }
}
