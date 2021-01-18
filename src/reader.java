import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class reader {
    public static ArrayList read(String faili_nimi) {
        ArrayList failiSisu = new ArrayList();
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
        return failiSisu;
    }

}
