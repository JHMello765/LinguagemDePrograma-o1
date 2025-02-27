import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Cálculo da temperatura em Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // Saída de dados
        System.out.println("A temperatura em Celsius é: " + celsius + "°C");
        
        scanner.close();
    }
}
