import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
public class diasFelizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] contagem = new int[5];
        String[] emocoes = {"Feliz", "Triste", "Raiva", "Medo", "Nojo"};

        for(int i = 0; i < 7; i++) {
            System.out.println("Como foi seu " + (i + 1) + " dia da semana?");
            String emocao = scanner.nextLine();
            switch (emocao.toLowerCase()) {

                case "feliz":
                    ++contagem[0];
                    break;
                case "triste":
                    ++contagem[1];
                    break;
                case "raiva":
                    ++contagem[2];
                    break;
                case "medo":
                    ++contagem[3];
                    break;
                case "nojo":
                    ++contagem[4];
                    break;
                default:
                    System.out.println("não condiz");
            }
        }
            int maiorValor = contagem[0];
            int indiceVencedor = 0;
            for (int j = 1; j < contagem.length; j++) {
                if (contagem[j] > maiorValor) {
                    maiorValor = contagem[j];
                    indiceVencedor = j;
                }
            }

                System.out.println("você teve " + contagem[0] + " dias felizes!");
            System.out.println("você teve " + contagem[1] + " dias tristes!");
            System.out.println("você teve " + contagem[2] + " dias raivosos!");
            System.out.println("você teve " + contagem[3] + " dias assustadores!");
            System.out.println("você teve " + contagem[4] + " dias nojentos!");
            System.out.println("Sua semana foi: " + emocoes[indiceVencedor]);

    }
}
