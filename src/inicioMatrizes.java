import java.util.Random;
public class inicioMatrizes {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int [4][4];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int maior = 0;
        int coluna = 0;
        int linha = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Linha: " + (linha+1) + " coluna: " + (coluna+1));
    }
}
