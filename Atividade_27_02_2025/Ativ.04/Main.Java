import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        
        // Definição das porcentagens
        double percentualDistribuidor = 28.0;
        double percentualImpostos = 45.0;
        
        // Cálculo do custo final ao consumidor
        double valorDistribuidor = custoFabrica * percentualDistribuidor / 100;
        double valorImpostos = custoFabrica * percentualImpostos / 100;
        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;
        
        // Saída de dados
        System.out.println("O custo final ao consumidor é: R$ " + custoFinal);
        
        scanner.close();
    }
}
