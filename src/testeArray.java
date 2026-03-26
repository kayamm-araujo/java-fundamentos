import java.util.Scanner;

public class testeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos dados você quer salvar: ");
        int x = scanner.nextInt();
        int[] vetorA = new int[x];

        for(int i = 0; i < vetorA.length; i++) {
             vetorA[i] = scanner.nextInt();
        }
        for(int elemento : vetorA) {
            System.out.println("Você escreveu: " + elemento);
        }
    }
}
