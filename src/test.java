/*

Ülesanne 6.4b
Mündid

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static int pronksiarvu_summa(ArrayList<Integer> a) {
        int b = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < 10) {
                b = b + a.get(i);
            }
        }
        return b;
    }

    public static void main(String[] args) {

        Scanner sisend = new Scanner(System.in);

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

        System.out.println("Hoiupõrsasse läheb " + pronksiarvu_summa(failiSisu) + " senti.");

    }
}