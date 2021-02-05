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
        jaatisekiosk mugul = new jaatisekiosk("Mugul");

        mugul.lisaJaatis("Vanilla");
        mugul.lisaJaatis("Šokolaad");
        mugul.lisaJaatis("Mint");

        System.out.println(mugul);


        // Windowsi osad
        JFrame f = new JFrame("Button Example");
        JLabel l = new JLabel();
        JTextField tf = new JTextField();

        tf.setBounds(50, 100, 200, 32);
        l.setBounds(50, 50, 640, 20);

        JButton b = new JButton("Vaata restorani");
        JButton lisaAatis = new JButton("lisa Jäätis");
        JButton kustutaJaatis = new JButton("Kustuta jäätis");

        b.setBounds(50, 150, 95, 30);
        lisaAatis.setBounds(150, 150, 95, 30);
        kustutaJaatis.setBounds(250, 150, 128, 30);

        Timer tmr = new Timer(5000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Restoraan avatud");
            }
        });
        tmr.start();
        kustutaJaatis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (mugul.jaatised() != 0) {
                    mugul.kustutaJaatis();
                }
            }
        });

        lisaAatis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mugul.lisaJaatis(tf.getText());
                tf.setText("");
            }
        });


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText(mugul.toString());
            }
        });
        f.add(b);
        f.add(l);
        f.add(tf);
        f.add(lisaAatis);
        f.add(kustutaJaatis);
        f.setSize(640, 640);
        f.setLayout(null);
        f.setVisible(true);

    }
}