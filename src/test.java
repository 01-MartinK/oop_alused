/*
õunamahla tekemine
ülesanne 6.2
 */

import java.util.Scanner;

public class test {
    // Bänner meetod
    static int mahlapack(double õuntekogus) {
        int pakkideArv = (int) Math.round(õuntekogus * 0.4 / 3);
        return pakkideArv;
    }

    // main meetod
    public static void main(String[] args) {
        // Scanner
        Scanner sisend = new Scanner(System.in);

        // sisendi muutujad
        System.out.println("Sisestage õuntekogus: ");
        double õunteArv = sisend.nextDouble();

        System.out.println(mahlapack(õunteArv));
    }
}
