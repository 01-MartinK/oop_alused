/*
Peo eelarve
ülesanne 6.3
 */

import java.util.Scanner;

public class test {
    // Bänner meetod
    static int eelarve(int külalisteArv) {
        int makse = (int) Math.round(külalisteArv * 10 + 55);
        return makse;
    }

    // main meetod
    public static void main(String[] args) {
        // Scanner
        Scanner sisend = new Scanner(System.in);

        // sisendi muutujad
        System.out.println("Mitu inimest on kutsutud: ");
        int inimesteArv = sisend.nextInt();
        // tulijad
        System.out.println("Mitu inimest tuleb: ");
        int tulijateArv = sisend.nextInt();

        System.out.println("Maksimaalne summa: " + eelarve(inimesteArv) + " eurot");
        System.out.println("Minimaalnse summa: " + eelarve(tulijateArv) + " eurot");
    }
}
