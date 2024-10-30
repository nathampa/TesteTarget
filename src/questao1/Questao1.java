package questao1;

public class Questao1 {
    public static int resolver(){
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice){
            k++;
            soma += k;
        }

        return soma;
        //Sempre irá retornar 91
    }
}
