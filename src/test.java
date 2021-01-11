import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        ArrayList<Double> tehingud = new ArrayList<Double>();

        try {
            File myObj = new File("src/konto.txt");
            Scanner sisendFail = new Scanner(myObj);
            while (sisendFail.hasNextLine()) {
                String rida = sisendFail.nextLine();
                tehingud.add(Double.parseDouble(rida));
                //System.out.println(rida);
            }
            sisendFail.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i = 0; i < tehingud.size(); i++) {
            if (tehingud.get(i) >= 0) {
                System.out.println(tehingud.get(i));
            }
        }

    }
}