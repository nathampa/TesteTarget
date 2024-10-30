package questao4;

public class Faturamento {
    private static double faturamentoSP = 67836.43;
    private static double faturamentoRJ = 36678.66;
    private static double faturamentoMG = 29229.88;
    private static double faturamentoES = 27165.48;
    private static double faturamentoOutros = 19849.53;

    public static double calcularTotal(){
        return faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;
    }

    public static void calcularRepresentacao(){
        System.out.println("Faturamento total: " + calcularTotal());
        System.out.printf("Percentual de SP: %.2f%%%n", (faturamentoSP / calcularTotal()) * 100);
        System.out.printf("Percentual de RJ: %.2f%%%n", (faturamentoRJ / calcularTotal()) * 100);
        System.out.printf("Percentual de MG: %.2f%%%n", (faturamentoMG / calcularTotal()) * 100);
        System.out.printf("Percentual de ES: %.2f%%%n", (faturamentoES / calcularTotal()) * 100);
        System.out.printf("Percentual de Outros: %.2f%%%n", (faturamentoOutros / calcularTotal()) * 100);
    }
}
