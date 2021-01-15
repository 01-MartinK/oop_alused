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

public class test {

    public static void main(String[] args) {

        Scanner sisend = new Scanner(System.in);

        /*
        System.out.println("Sisestage faili nimi koos laiendiga: ");
        String faili_nimi = sisend.nextLine();

        ArrayList<Integer> failiSisu = new ArrayList<Integer>();

        try {
            File file = new File("src/" + faili_nimi);
            Scanner sisendFail = new Scanner(file);
            while (sisendFail.hasNextLine()) {
                String rida = sisendFail.nextLine();
                failiSisu.add(Integer.parseInt(rida));
            }
            sisendFail.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

         */

        System.out.println("Sisestage nimi: ");
        String nimi = sisend.nextLine();
        nimi = nimi.toLowerCase();

        HashMap<String, String> grupp = new HashMap<String, String>();

        grupp.put("matti", "mage");
        grupp.put("mikael", "mixu");
        grupp.put("arto", "arppa");

        System.out.println("Kasutaja: " + nimi + ", hüüdnimega " + grupp.get(nimi) + ".");

        /*
        for (String i : grupp.keySet()){
            System.out.println("kasutaja: " + i + ", hüüdnimega " + grupp.get(i) + ".");
            }
        }

         */

    }
}