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
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click here");
        JButton c = new JButton("Test");
        b.setBounds(50, 100, 95, 30);
        c.setBounds(150, 100, 95, 30);
        f.add(b);
        f.add(c);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        //run();


    }

    // Run meetod mis jookseb siis kui tahan
    public static void run() {
        // Küsib tegevust mida tahetakse teha
        System.out.println("Mida soovite teha Lisada menüüse midagi(l) puhastada menüü(p): ");
        String tegevus = sisend.nextLine();

        // kontrollib mis tegevus see on
        if (tegevus.equals("l")) {
            System.out.println("Sisestage söögi nime: ");
            String sook = sisend.nextLine();
            menuu.lisaSook(sook);
        } else if (tegevus.equals("p")) {
            menuu.puhastaMenyy();
        }

        // Näitab praegust menüüd
        System.out.println("Siukene näeb menuu välja");
        System.out.println("");
        menuu.valjastaMenyy();

        // Küsib kas tahate veel midagi teha
        System.out.println("");
        System.out.println("Kas soovide edasi redigeerida menüüd (jah) või (ei)?");
        tegevus = sisend.nextLine();

        // Kontrollib kas nõustusite
        if (tegevus.equals("jah")) {
            run();
        } else if (tegevus.equals("ei")) {
        }
    }
}