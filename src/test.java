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
        inimene matti = new inimene("Matti");

        matti.setPikkus(180);
        matti.setMass(120);

        System.out.println(matti.getNimi() + ", kehamassiindeks: " + matti.kmi());
        matti.tasakaalukus();
        System.out.println("Pärast natuke aega " + matti.getNimi() + ", kehamassiindeks on " + matti.kmi());

    }
}