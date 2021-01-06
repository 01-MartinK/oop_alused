/*
Jänesevanemate mure 1
ülesanne 3.2
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Scanner
        Scanner sisend = new Scanner(System.in);
        // Kasutaja poolt sisend
        System.out.println("Sisestage ringidearv: ");
        int ringideArv = sisend.nextInt();
        int porganditeArv = 0;
        int porganditeAndmine = 0;

        int i = 0;
        if (porganditeArv % 2 != 0) {
            porganditeArv -= 1;
        }

        while (i < ringideArv) {
            i++;
            if (i != porganditeAndmine) {
                porganditeAndmine += 2;
            } else {
                porganditeArv += porganditeAndmine;
            }
        }
        System.out.println(porganditeArv);
    }
}
