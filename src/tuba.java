import java.util.ArrayList;

public class tuba {
    private double pindala;
    private ArrayList<aknadUksed> aknadUksed;

    public tuba(double pikkus, double laius, double korgus) {
        this.pindala = 2 * korgus * (pikkus + laius);

        this.aknadUksed = new ArrayList<>();
    }

    public void lisaAken(double korgus, double laius) {
        this.aknadUksed.add(new aknadUksed(korgus, laius));
    }

    public double tööPind() {
        double uusPindala = this.pindala;

        for (int i = 0; i != aknadUksed.size(); i++) {
            uusPindala = uusPindala - aknadUksed.get(i).getPindala();
        }
        return uusPindala;
    }

    public double getPindala() {
        return this.pindala;
    }
}
