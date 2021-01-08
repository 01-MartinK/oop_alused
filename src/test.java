/*
Bänner
ülesanne 6.1
 */

import java.util.Scanner;

public class test {
    // Bänner meetod
    static String bänner(String reklaamlause) {
        String reklaamLauseSuurteTähtedega = reklaamlause.toUpperCase();
        return reklaamLauseSuurteTähtedega;
    }

    // main meetod
    public static void main(String[] args) {
        // Scanner
        Scanner sisend = new Scanner(System.in);

        // sisendi muutujad
        System.out.println("Sisestage mitu korda tahate näitata reklaami: ");
        int suurus = sisend.nextInt();
        sisend = new Scanner(System.in);
        System.out.println("Sisestage reklaamlause: ");
        String lause = sisend.nextLine();

        int kord = 1;
        while (kord <= suurus) {
            System.out.println(bänner(lause));
            kord++;
        }
    }
}
