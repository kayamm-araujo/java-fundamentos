import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] alunosNotas = new double[5][3];
        String[] nomes = new String [5];
            for(int i = 0; i < alunosNotas.length; i++) {
                System.out.println("Nome do aluno: ");
                nomes[i] = scanner.nextLine();
                for(int j = 0; j < alunosNotas[i].length; j++) {
                    System.out.println("Nota " + (j +1));
                    alunosNotas[i][j] = scanner.nextDouble();
                    scanner.nextLine();
                }
            }
            double[] media = new double[5];
            double[] soma = new double[5];
            for(int i = 0; i < alunosNotas.length; i++) {
                soma[i] = 0;
                for(int j = 0; j < alunosNotas[i].length; j++) {
                    soma[i] += alunosNotas[i][j];
                    media[i] = soma[i] / alunosNotas[i].length;
                }
            }
            for (int i = 0; i < nomes.length; i++) {
                System.out.println("Aluno: " + nomes[i] + " | Média: " + media[i]);
                if (media[i] < 7) {
                   System.out.println("REPROVADO");
                } else {
                  System.out.println("APROVADO");}
            }
    }
}