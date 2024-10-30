import questao1.Questao1;
import questao3.Resolucao;
import questao3.XmlReader;
import questao4.Faturamento;
import questao5.Questao5;

import static questao2.Questao2.isFibonacci;

public class Main {
    public static void main(String[] args) {
        //Questão 1
        System.out.println(Questao1.resolver());

        //Questão 2
        int numero = 55;

        if (isFibonacci(numero)){
            System.out.println("O número informado pertence a sequência de Fibonacci");
        }else{
            System.out.println("O número informado não pertence a sequência de Fibonacci");
        }

        //Questão 3
        XmlReader.lerXml("C:\\Users\\Nathan Ferreira\\Downloads\\dados (2).xml");
        Resolucao questao3 = new Resolucao();

        System.out.println("Maior valor: " + questao3.getMaiorValor() + " no dia " + questao3.getDiaMaiorValor());
        System.out.println("Menor valor: " + questao3.getMenorValor() + " no dia " + questao3.getDiaMenorValor());
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + Resolucao.diasSuperiorMedia());

        //Questão 4
        Faturamento.calcularRepresentacao();

        //Questão 5
        Questao5.reverter("nathanzinho invertido");
    }
}