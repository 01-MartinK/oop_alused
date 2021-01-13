/*

Ülesanne 5.4c
Tahvli juurde

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sisend = new Scanner(System.in);

        System.out.println("Sisestage faili nimi koos laiendiga: ");
        String faili_nimi = sisend.nextLine();

        ArrayList<String> failiSisu = new ArrayList<String>();

        try {
            File file = new File("src/" + faili_nimi);
            Scanner sisendFail = new Scanner(file);
            while (sisendFail.hasNextLine()) {
                String rida = sisendFail.nextLine();
                failiSisu.add(rida);
            }
            sisendFail.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        LocalDateTime tänanekuupäev = LocalDateTime.now();
        System.out.println(tänanekuupäev);
        DateTimeFormatter tänasekuupäevaVormistus = DateTimeFormatter.ofPattern("dd");
        String vormistatudKuupäev = tänanekuupäev.format(tänasekuupäevaVormistus);
        System.out.println(vormistatudKuupäev);
        /*
        for (int i = 0;i < failiSisu.size();i++){
            System.out.println(i+". "+failiSisu.get(i));
        }
         */
        System.out.println("Tänane õpilane kes tuleb tahvlile on " + failiSisu.get(Integer.parseInt(vormistatudKuupäev)));
    }
}