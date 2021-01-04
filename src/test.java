/*
Nädala ajakulu
ülesanne 1.4a
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Scanner
        Scanner sisend = new Scanner(System.in);
        // Kasutaja poolt sisend
        System.out.println("Sisestage ainepunktide arv: ");
        float ainePunktid = sisend.nextInt();
        System.out.println("Sisestage nädalate arv: ");
        float nädalateArv = sisend.nextInt();
        // Kontroll
        float ajakulu = (ainePunktid * 26 / nädalateArv);
        System.out.print(Math.round(ajakulu));
    }
}
