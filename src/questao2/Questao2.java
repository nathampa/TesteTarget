package questao2;

public class Questao2 {
    public static boolean isFibonacci(int numero){
        if (numero < 0){
            return false;
        }

        int a = 0;
        int b = 1;
        int temp;

        while (a < numero){
            temp = a;
            a = b;
            b = temp + b;
        }

        return numero == a;
    }
}
