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

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class test {

    public static Scanner sisend = new Scanner(System.in);

    public static void main(String[] args) {
        Restoraan restorant = new Restoraan("Mega punch", "šokolaad");
        Restoraan bigMac = new Restoraan("macdonalts", "puhas rasv");
        Restoraan jäätis = new Restoraan("Külm Lõbu", "jäätised");

        System.out.println(restorant);
        System.out.println(jäätis);
        System.out.println(bigMac);

        restorant.avaRestoraan();
        bigMac.avaRestoraan();
        jäätis.avaRestoraan();
    }
}