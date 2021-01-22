/*

Loo Hashmap tüüpi objekt main meetodis
võti ja väärtus String
salvesta mapi inimeste nimed - võtmena ja hüüdnimed - väärtusena
kasuta andmete hoidmiseks ainult väikesed tähed

matti - mage
mikael - mixu
arto - arppa

Küsi kasutaja nimi ja trüki tema hüüdnimi

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class test {

    public static Menyy menuu = new Menyy();
    public static Scanner sisend = new Scanner(System.in);

    public static void main(String[] args) {
        run();


    }

    public static void run() {
        System.out.println("Mida soovite teha Lisada menüüse midagi(l) puhastada menüü(p): ");
        String tegevus = sisend.nextLine();

        if (tegevus.equals("l")) {
            System.out.println("Sisestage söögi nime: ");
            String sook = sisend.nextLine();
            menuu.lisaSook(sook);
        } else if (tegevus.equals("p")) {
            menuu.puhastaMenyy();
        }

        System.out.println("Siukene näeb menuu välja");
        System.out.println("");
        menuu.valjastaMenyy();

        System.out.println("");
        System.out.println("Kas soovide edasi redigeerida (jah) või (ei)?");
        tegevus = sisend.nextLine();

        if (tegevus.equals("jah")) {
            run();
        } else if (tegevus.equals("ei")) {
        }
    }
}