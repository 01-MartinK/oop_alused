/*
Tervitused Mõtisklusega
ülesanne 6.4a
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        File fail = new File("vastuvoetud.txt");
        Scanner sisendFailist = new Scanner(System.in);
        try {
            System.out.println("Katsetame failist lugemine");
            while (sisendFailist.hasNextLine()) {
                String sisu = sisendFailist.nextLine();
                System.out.println(sisu);
            }
            sisendFailist.close();
        } catch (Exception e) {
            System.out.println("Faili Pole");
            e.printStackTrace();
        }
    }
}