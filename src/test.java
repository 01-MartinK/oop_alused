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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public static void main(String[] args) {
        tuba tb = new tuba(6, 3, 2.7);
        System.out.println(tb.getPindala());

        tb.lisaAken(1, 1);
        tb.lisaAken(1, 1);
        tb.lisaAken(1, 2);

        System.out.println(tb.tööPind());
    }
}