import java.util.Scanner;

public class EleitoresPercentual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();
        
        // Cálculo dos percentuais
        double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
        double percentualNulos = (votosNulos * 100.0) / totalEleitores;
        double percentualValidos = (votosValidos * 100.0) / totalEleitores;
        
        // Saída de dados
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
        
        scanner.close();
    }
}
