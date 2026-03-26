import java.util.Scanner;
public class arrayPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int pares = 0;
        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }
        for(int elemento : vetorA) {
            if(elemento % 2 == 0){
                pares++;
            }
        }
            System.out.println("Este vetor tem " + pares + " numeros pares");
    }
}
