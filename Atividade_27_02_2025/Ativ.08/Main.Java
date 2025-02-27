import java.util.Scanner;

public class VerificaValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();
        
        // Verificação e saída de dados
        if (valor >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }
        
        scanner.close();
    }
}
