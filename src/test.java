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
        rystkulik ristkülik = new rystkulik();

        ristkülik.setKorgus(21.0);
        ristkülik.setLaius(7.2);

        System.out.println(ristkülik.toString());
    }
}