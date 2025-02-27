import java.util.Scanner;

public class VerificaValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();
        
        // Verificação e saída de dados
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
        
        scanner.close();
    }
}
