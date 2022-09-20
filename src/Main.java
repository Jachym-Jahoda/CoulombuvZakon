import java.util.Scanner;

public class Main {
    static final int K=9;

    public static void main(String[] args) {
        Scanner pepa = new Scanner(System.in);
        double Q1,Q2,r;


            System.out.println("Zadejte velikost prvního náboje: ");
            Q1 = pepa.nextDouble();

            System.out.println("Zadejte velikost druhého náboje: ");
            Q2 = pepa.nextDouble();

            do {
                System.out.println("Zadejte jejich vzdálenost: ");
                r = pepa.nextDouble();

                if (r <= 0) {
                    System.out.println("Vzdálenost nemůže být záporné číslo!");
                }
            } while (r <= 0);


            double elSila = K * (Math.abs(Q1 * Q2) / r * r);

            System.out.println("Výsledek je " + elSila + " 10^9");
    }
}