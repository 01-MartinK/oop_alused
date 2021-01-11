/*
Tervitused Mõtisklusega
ülesanne 6.4a
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);

        System.out.println("Sisestage väärtus: ");
        int a = sisend.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("Kurjam");
        }
    }
}