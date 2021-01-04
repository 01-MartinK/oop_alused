/*
Kandideerimine
ülesanne 2.2
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);

        System.out.println("Palun sisestage punktide summa: ");
        // Kasutaja poolt sisend
        double punktid = sisend.nextDouble();
        // Kontroll
        if (punktid >= 0 && punktid < 66) {
            System.out.println("Vähem kui kandeerimiseks vajalik.");
        } else if (punktid >= 66 && punktid < 85) {
            System.out.println("Kandideerimine vastuvõtule.");
        } else if (punktid >= 85 && punktid <= 100) {
            System.out.println("Vastuvõtt tagatud.");
        } else if (punktid < 0 || punktid > 100) {
            System.out.println("Vigane Tulemus.");
        }
    }
}
