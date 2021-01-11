/*



Ülesanne 5.4a
Jukebox

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sisend = new Scanner(System.in);

        System.out.println("Sisestage faili nimi koos laiendiga: ");
        String faili_nimi = sisend.nextLine();

        ArrayList<String> laulud = new ArrayList<String>();

        try {
            File file = new File("src/" + faili_nimi);
            Scanner sisendFail = new Scanner(file);
            while (sisendFail.hasNextLine()) {
                String rida = sisendFail.nextLine();
                laulud.add(rida);
            }
            sisendFail.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i = 0; i < laulud.size(); i++) {
            System.out.println(i + ". " + laulud.get(i));

        }

        System.out.println("Sisestage soovitud laulu järjekorranumber: ");
        int laulu_number = sisend.nextInt();
        System.out.println(laulud.get(laulu_number));

    }
}