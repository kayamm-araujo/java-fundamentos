import java.io.IOException;
import java.util.Scanner;
public class NotasEMoedas {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
            double reais = scanner.nextDouble();
            long centavos = Math.round(reais * 100);

            long cem = centavos / 10000;
            centavos = centavos % 10000;

            long cinquenta = centavos / 5000;
            centavos = centavos % 5000;

            long vinte = centavos / 2000;
            centavos = centavos % 2000;

            long dez = centavos / 1000;
            centavos = centavos % 1000;

            long cinco = centavos / 500;
            centavos = centavos % 500;

            long dois = centavos / 200;
            centavos = centavos % 200;

            long um = centavos / 100;
            centavos = centavos % 100;

            long cinquentaC = centavos / 50;
            centavos = centavos % 50;

            long vinteEcinco = centavos / 25;
            centavos = centavos % 25;

            long dezC = centavos / 10;
            centavos = centavos % 10;

            long cincoC = centavos / 5;
            centavos = centavos % 5;

            long umC = centavos;

            System.out.println("NOTAS:");
            System.out.println(cem + " nota(s) de R$ 100.00");
            System.out.println(cinquenta + " nota(s) de R$ 50.00");
            System.out.println(vinte + " nota(s) de R$ 20.00");
            System.out.println(dez + " nota(s) de R$ 10.00");
            System.out.println(cinco + " nota(s) de R$ 5.00");
            System.out.println(dois + " nota(s) de R$ 2.00");
            System.out.println("MOEDAS:");
            System.out.println(um + " nota(s) de R$ 1.00");
            System.out.println(cinquentaC + " nota(s) de R$ 0.50");
            System.out.println(vinteEcinco + " nota(s) de R$ 0.25");
            System.out.println(dezC + " nota(s) de R$ 0.10");
            System.out.println(cincoC + " nota(s) de R$ 0.05");
            System.out.println(umC + " nota(s) de R$ 0.01");
        scanner.close();
    }
}

