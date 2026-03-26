import java.util.Scanner;
public class aoQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Valor " + (i+1) + ": ");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        for(int j = 0; j < vetorB.length; j++) {
            System.out.println("posição " + (j + 1) + ": " + vetorB[j]);
        }
    }
}
