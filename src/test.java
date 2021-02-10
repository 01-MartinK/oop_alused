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
import java.util.function.DoubleUnaryOperator;

class test {

    public static Scanner sisend = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        tuba tb = new tuba(6, 3, 2.7);
        System.out.println(tb.getPindala());

        tb.lisaMoobel("lamp", "lamp", "vanakreeka");
        tb.lisaMoobel("tugitool", "lauatool", "tulevikune");
        tb.lisaAken(1, 1);
        tb.lisaAken(1, 1);
        tb.lisaAken(1, 2);

        System.out.println(tb.tööPind());
        System.out.println(tb.tapeediPanek());
        tb.getMooblid();


        //raam
        JFrame frame = new JFrame();

        //nupud
        JButton naita = new JButton("näita");
        JButton arvutaPindala = new JButton("arvuta Pindala");
        JButton tapeedideHulk = new JButton("Arvuta tapeedide hulga");

        naita.setBounds(50, 100, 150, 25);
        arvutaPindala.setBounds(50, 125, 150, 25);
        tapeedideHulk.setBounds(50, 150, 150, 25);

        //Tekstiväljad
        JLabel text = new JLabel("väljund");
        JLabel warning = new JLabel("!Hoiatus väga katkine!");
        JTextField pikkus = new JTextField("pikkus");
        JTextField laius = new JTextField("laius");
        JTextField korgus = new JTextField("kõrgus");

        text.setBounds(50, 200, 600, 50);
        warning.setBounds(50, 25, 300, 50);
        pikkus.setBounds(250, 100, 150, 25);
        laius.setBounds(250, 125, 150, 25);
        korgus.setBounds(250, 150, 150, 25);

        //????
        Canvas test = new Drawing();

        test.setBounds(0, 200, 1000, 1000);

        //nupu käsud
        arvutaPindala.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (pikkus.getText() != "pikkus" && pikkus.getText() != "" && laius.getText() != "laius" && laius.getText() != "" && korgus.getText() != "" && korgus.getText() != "kõrgus") {
                    text.setText("väljund on: " + String.valueOf(tb.arvutaPindala(Double.parseDouble(pikkus.getText()), Double.parseDouble(laius.getText()), Double.parseDouble(korgus.getText()), false)) + " m.");
                    tb.setSeintePindala(tb.arvutaPindala(Double.parseDouble(pikkus.getText()), Double.parseDouble(laius.getText()), Double.parseDouble(korgus.getText()), false));
                }
            }
        });

        tapeedideHulk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText("väljund on: " + tb.tapeediPanek());
            }
        });

        // raami asjade lisamine
        frame.add(naita);
        frame.add(arvutaPindala);
        frame.add(tapeedideHulk);
        frame.add(pikkus);
        frame.add(laius);
        frame.add(korgus);
        frame.add(text);
        frame.add(warning);
        frame.add(test);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}