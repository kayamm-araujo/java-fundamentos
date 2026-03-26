import java.util.Arrays;
import java.util.Scanner;
public class ComparacaoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] vetorA = new int[5];
            int[] vetorB = new int[5];

            for(int i = 0 ; i < vetorA.length; i++){
                System.out.println("Digite o " + (i+1) + " numero: ");
                vetorA[i] = scanner.nextInt();
            }
            for(int i = 0 ; i < vetorB.length; i++) {
                System.out.println("Digite o " + (i+1) + " numero: ");
                vetorB[i] = scanner.nextInt();
            }
        boolean result = Arrays.equals(vetorA, vetorB);
            System.out.println("Valores iguais: " + result);
        scanner.close();
    }
}
