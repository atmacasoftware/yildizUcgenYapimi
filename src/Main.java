import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }


        for (int i = sayi; i >= 1; i--) {
            for (int j = sayi + 1; j >= i + 1 ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

    }
}