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
    public static void main(String[] args) {
        // Loo Konto tüüpi objekt nimega
        konto mkKontoSEB = new konto("mk", 500.0);
        konto mkKontoSWED = new konto("mk");
        // lisame konkreetsed väärtused
        //mkKontoSEB.looKonto("Tere SEB", 20.0);
        //mkKontoSWED.looKonto("Tere SWED", 0.0);

        //mkKontoSEB.lisaRahaSelgitus(mkKontoSEB.lisaRaha(20.0));
        //mkKontoSWED.lisaRahaSelgitus(mkKontoSWED.lisaRaha(-50.0));
        // väljastame tulemuse
        System.out.println("SEB");
        System.out.println("Konto omanik: " + mkKontoSEB.omanik);
        System.out.println("Konto bilans: " + mkKontoSEB.bilans);
        System.out.println("");
        System.out.println("SWD");
        System.out.println("Konto omanik: " + mkKontoSWED.omanik);
        System.out.println("Konto bilans: " + mkKontoSWED.bilans);
        /*
        mkKontoSEB.võtaRaha(10.0);
        System.out.println("Konto bilans: " + mkKontoSEB.bilans);
        mkKontoSEB.teeUlekanne(mkKontoSWED, 10.0);
        System.out.println("Konto bilans: " + mkKontoSEB.bilans);
         */
    }
}