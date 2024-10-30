package questao5;

public class Questao5 {
    public static void reverter(String string){
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
