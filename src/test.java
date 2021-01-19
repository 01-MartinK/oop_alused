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
    // Kui paned final statici asemel siis ei saa x kuidagi muuta. Panin static kuna seda saab siis muuda main meetodis.
    static int x = 5;

    public static void main(String[] args) {
        test myObj1 = new test();
        test myObj2 = new test();
        myObj2.x += myObj1.x;
        x += 7;
        x += myObj2.x;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        reader failiSisu = new reader();
        //ArrayList text = failiSisu.read("konto.txt");
        System.out.println(failiSisu.read("edm.txt"));
    }
}