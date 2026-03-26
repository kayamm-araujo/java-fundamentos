import java.util.Scanner;
public class notasBimestrais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Peso do peixe: ");
            double peso = scanner.nextDouble();
        if (peso > 50) {
            double diferenca = peso - 50;
            double precoF = diferenca * 4;
            System.out.println("Multa de R$" + precoF);
        }
        else {
            System.out.println("Você está dentro da lei.");
        }
    }
}