/*
Asdentamine
ülesanne 1.3
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        // Selgitame mida tuleb teha
        System.out.println("Sisestage astmealus!");
        // Küsime et sisestaks astme_aluse
        int astme_alus = sisend.nextInt();
        // Küsime et sisestaks asdendaja
        System.out.println("Sisestage asdendaja");
        int asdendaja = sisend.nextInt();

        int tulemus = (int) Math.pow(astme_alus, asdendaja);
        System.out.println("Tulemus on " + tulemus);
    }
}
