/*
Tervitused Mõtisklusega
ülesanne 6.4a
 */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);

        int[] vastuvõetud = {2803, 2626, 2359, 1927, 2236, 2281, 2394, 2484, 2468};

        System.out.println("Sisesta aasta: ");
        int aasta = sisend.nextInt();

        int massiiviIndeks = aasta - 2011;
        System.out.println("Vastuvõetud on " + vastuvõetud[massiiviIndeks]);
    }
}