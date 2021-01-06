/*
Male
ülesanne 3.4c
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Scanner
        Scanner sisend = new Scanner(System.in);
        // Kasutaja poolt sisend
        System.out.println("Sisestage täisarv: ");
        int täisarv = sisend.nextInt() - 1;
        int koguNisu = 1;
        int mituNisuAnda = 2;
        int kord = 0;
        int ruutu = 64;

        while (kord < täisarv) {
            if (kord != 0) {
                koguNisu = koguNisu * 2;
                mituNisuAnda += 2;
            } else {
                koguNisu += 1;
            }
            kord++;
        }

        System.out.println("Nisuteri:" + (täisarv + 1) + ". ruudu eest:" + koguNisu);
    }
}
