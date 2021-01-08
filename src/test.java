/*
Tervitused Mõtisklusega
ülesanne 6.4a
 */

import java.util.Scanner;

public class test {
    // Bänner meetod
    static void tervitus(int kord) {
        System.out.println("Võõrustaja: 'tere!'");
        System.out.println("Täna " + kord + ". kord tervitada, mõtiskleb võõrustaja.");
        System.out.println("Külaline: 'Tere, suur tänu kutse eest!'");
    }

    // main meetod
    public static void main(String[] args) {
        // Scanner
        Scanner sisend = new Scanner(System.in);

        // sisendi muutujad
        System.out.println("Sisestage külaliste arv: ");
        int külalisteArv = sisend.nextInt();

        int kord = 1;
        while (kord <= külalisteArv) {
            tervitus(kord);
            kord++;
        }
    }
}
