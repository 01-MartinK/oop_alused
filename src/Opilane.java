import java.util.ArrayList;
import java.util.Random;

public class Opilane {
    private String nimi;
    private ArrayList<String> teadmised = new ArrayList<>();

    // Constructor
    public Opilane(String nimi) {
        this.nimi = nimi;
    }

    // Nime saamine
    public String getNimi() {
        return nimi;
    }

    // Teadmiste saamine
    public ArrayList<String> getTeadmised() {
        return teadmised;
    }

    // Õpilane ise õpib ja saab teema selkeks
    public void opib(String teema) {
        // Kontrollida kas ikka ta üldse seda teemat on õppinud
        if (teadmised.contains(teema)) {
            System.out.println("Ta on juba õppinud selle teema.");
        } else {
            teadmised.add(teema);
        }
    }

    // Õpilane unustab teema kuna ta ei kordanud piisavalt
    public void unusta(String teema) {
        // Kontrollida kas ikka ta üldse seda teemat on õppinud
        if (teadmised.contains(teema)) {
            teadmised.remove(teema);
        } else {
            System.out.println("Ta pole õppinud seda teemat veel.");
        }
    }

    // Juhuslik päev kolmevalikuga
    public void juhuslikPaev() {
        Random random = new Random();
        int randInt = random.nextInt(3);

        // Mida ta tegi sellel juhuslikul päeval
        if (randInt == 0) {
            System.out.println(this.nimi + "l oli tavaline päev oli ta ei õppinud vaid lõbutses.");
        } else if (randInt == 1) {
            System.out.println(this.nimi + "l lihtsalt laiskles ja tundub nagu unustas ka midagi.");
            teadmised.remove(teadmised.get(random.nextInt(teadmised.size())));
        } else if (randInt == 2) {
            System.out.println(this.nimi + "l kordas varem õpitud teemat kuna tal ei jäänud see hästi pähe.");
        }

    }
}
