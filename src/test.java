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
    public static Random random = new Random();

    public static int getRandomNumber(int min, int max) {
        return (int) ((random.nextInt(5) * (max - min)) + min);
    }


    public static void main(String[] args) {
        //inimene mat = new inimene();
        //inimene cat = new inimene();
        //inimene sat = new inimene();


        ArrayList<sodur> armee1 = new ArrayList<sodur>();
        ArrayList<sodur> armee2 = new ArrayList<sodur>();


        for (int i = 0; i <= 20; i++) {
            int randomValue = 1 + random.nextInt(2);
            //System.out.println(randomValue);
            if (randomValue == 1) {
                armee1.add(new sodur());
            } else if (randomValue == 2) {
                armee2.add(new sodur());
            }
        }

        System.out.println("1 Armee");
        for (int i = 0; i < armee1.size(); i++) {
            System.out.println(armee1.get(i) + " id-ga " + armee1.get(i).getId());
        }

        System.out.println("2 Armee");
        for (int i = 0; i < armee2.size(); i++) {
            System.out.println(armee2.get(i) + " id-ga " + armee2.get(i).getId());
        }

    }
}