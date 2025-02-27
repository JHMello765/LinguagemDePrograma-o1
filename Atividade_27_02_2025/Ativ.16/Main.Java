public class DespesasTrimestrais {

    public static void main(String[] args) {
        // Definindo os gastos de cada mês
        double gastoJaneiro = 15000;  // Janeiro
        double gastoFevereiro = 23000;  // Fevereiro
        double gastoMarco = 17000;  // Março

        // Calculando a despesa total no trimestre
        double despesaTotal = gastoJaneiro + gastoFevereiro + gastoMarco;

        // Calculando a média mensal de gastos
        double mediaMensal = despesaTotal / 3;

        // Imprimindo os resultados
        System.out.println("Despesa total no trimestre: R$ " + despesaTotal);
        System.out.println("Média mensal de gastos: R$ " + mediaMensal);
    }
}
