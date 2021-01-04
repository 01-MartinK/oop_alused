/*
Spämm
ülesanne 2.3d
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Scanner
        Scanner sisend = new Scanner(System.in);
        // Kasutaja poolt sisend
        System.out.println("Sisestage kirjasuurus: ");
        float kirjaSuurus = sisend.nextFloat();
        System.out.println("Sisestage kirja sisu: ");
        String kirjaTeema = sisend.next();
        System.out.println("Kas kirjal on fail: ");
        Boolean kirjalFail = sisend.nextBoolean();
        // kontroll
        if (kirjaTeema == "" || kirjaSuurus > 1 && kirjalFail) {
            System.out.println("Kiri on spämm.");
        } else {
            System.out.println("Kiri ei ole spämm.");
        }
    }
}
