import java.util.Scanner;
public class multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosA = new int[8];
        int[] numerosB = new int[numerosA.length];
        for(int i = 0; i < numerosA.length; i++ ) {
            System.out.println("Digite o " + (i + 1) + " valor: ");
            numerosA[i] = scanner.nextInt();
            numerosB[i] = numerosA[i] * 2;
        }
        for (int i = 0; i < numerosB.length; i++) {
            System.out.println("Vetor B posição " + i + ": " + numerosB[i]);
        }
    }
}
