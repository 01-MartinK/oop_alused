/*
Ülesanne
Koosta programm pangakontode loomiseks.
Programmiga peab saama:

Luua uusi kontosid, andes kontole mingi hulga raha
Kanda kontole raha
Kontole ei saa kanda negatiivset summat
Võtta kontolt raha
Kontolt ei saa võtta negatiivset summat
Kontolt ei saa võtta rohkem raha kui kontol on
Kanda ühelt kontolt raha teisele
Kehtivad samad reeglid, mis kontole raha kandmisel ja välja võtmisel

Iga tegevus peab võimalusel olema vormistatud eraldi meetodina
Programm peab olema piisavalt dokumenteeritud

 */

import java.util.HashMap;
import java.util.Scanner;

public class panga_haldur {

    public static HashMap<String, Integer> kontod = new HashMap<String, Integer>();
    public static Scanner sisend = new Scanner(System.in);

    public static void main(String[] args) {

        kontod.put("felix", 5282);
        kontod.put("markus", 9312);

        System.out.println("Sisestage Tegevus mida soovite teha: konto loomine(lk) raha andmine(ar) raha võtmine(vr) raha ülekandmine(rt)");
        String tegevus = sisend.nextLine();

        if (tegevus.equals("lk")) {
            pangaKontoloomine();
        } else if (tegevus.equals("ar")) {
            rahaAndmine();
        } else if (tegevus.equals("vr")) {
            rahaVotmine();
            //}else if (tegevus.equals("rt")){
            //    ulekanne();
        } else {
            System.out.println("Sisestasite tegevust mida me ei saa teha.");
        }

    }

    public static void pangaKontoloomine() {
        // kasutaja käest nime ja summa küsimine
        System.out.println("Sisestage uue konto nime: ");
        String nimi = sisend.nextLine();
        System.out.println("Sisestage uue konto raha summa: ");
        int raha_summa = sisend.nextInt();

        // pangakonto loomine
        if (raha_summa > 0) {
            kontod.put(nimi, raha_summa);
        } else {
            System.out.println("Kontole ei saa negatiivset summat anda");
        }
    }

    public static void rahaAndmine() {
        // kasutaja käest nime ja summa küsimine
        System.out.println("Sisestage konto nime: ");
        String nimi = sisend.nextLine();
        System.out.println("Sisestage konto raha admise summa: ");
        int raha_summa = sisend.nextInt();

        // kontole raha kantmine nime järgi kindlat summat pidi
        if (raha_summa > 0) {
            kontod.put(nimi, kontod.get(nimi) + raha_summa);
        } else {
            // Kui pantakse negatiive summa
            System.out.println("Kontole ei saa negatiivset summat anda");
        }
        System.out.println("Konto " + nimi + " praegune kogu raha summa on " + kontod.get(nimi));
    }

    public static void rahaVotmine() {
        // kasutaja käest nime ja summa küsimine
        System.out.println("Sisestage konto nime: ");
        String nimi = sisend.nextLine();
        System.out.println("Sisestage konto raha admise summa: ");
        int raha_summa = sisend.nextInt();

        // kontole raha väljavõtmine nime järgi kindlat summat pidi ja mitte võtta liiga palju raha ega negatiivset
        if (raha_summa < kontod.get(nimi) && raha_summa > 0) {
            kontod.put(nimi, kontod.get(nimi) - raha_summa);
        } else {
            // Kui pantakse negatiive summa või kui kontol pole niipalju raha
            System.out.println("Kontol ei ole niipalju raha või ei saa negatiivset summat võtta");
        }
        System.out.println("Konto " + nimi + " praegune kogu raha summa on " + kontod.get(nimi));
    }

    public static void ulekanne() {


    }


}
