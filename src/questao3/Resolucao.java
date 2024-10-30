package questao3;

public class Resolucao {

    private int diaMaiorValor = 0;
    private int diaMenorValor = -1;

    public int getDiaMaiorValor() {
        return this.diaMaiorValor;
    }

    public int getDiaMenorValor() {
        return this.diaMenorValor;
    }

    public double getMaiorValor(){
        double maiorValor = 0;

        for (int i = 0; i < XmlReader.getValores().length; i++) {
            if (XmlReader.getValores()[i] > maiorValor){
                maiorValor = XmlReader.getValores()[i];
                this.diaMaiorValor = i + 1;
            }
        }

        return maiorValor;
    }

    public double getMenorValor(){
        double menorValor = getMaiorValor();

        for (int i = 0; i < XmlReader.getValores().length; i++) {
            if ((XmlReader.getValores()[i] > 0) && (XmlReader.getValores()[i] < menorValor)){
                menorValor = XmlReader.getValores()[i];
                this.diaMenorValor = i + 1;
            }
        }

        return menorValor;
    }

    public static double calcularMedia(){
        double soma = 0;
        int diasValidos = 0;

        for (int i = 0; i < XmlReader.getValores().length; i++) {
            if (XmlReader.getValores()[i] > 0){
                soma += XmlReader.getValores()[i];
                diasValidos++;
            }
        }

        return soma / diasValidos;
    }

    public static int diasSuperiorMedia(){
        int count = 0;

        for (int i = 0; i < XmlReader.getValores().length; i++) {
            if (XmlReader.getValores()[i] > calcularMedia()){
                count++;
            }
        }

        return count;
    }
}
