import java.util.ArrayList;

public class tuba {
    private double laius;
    private double pikkus;
    private double korgus;
    private double pindala;
    private ArrayList<aknadUksed> aknadUksed;

    public tuba(double pikkus, double laius, double korgus) {
        this.laius = laius;
        this.pikkus = pikkus;
        this.korgus = korgus;

        this.pindala = arvutaPindala(this.pikkus, this.laius, this.korgus);

        this.aknadUksed = new ArrayList<>();
    }

    public void lisaAken(double korgus, double laius) {
        this.aknadUksed.add(new aknadUksed(korgus, laius));
    }

    public double arvutaPindala(double pikkus, double laius, double korgus) {
        return 2 * korgus * (pikkus + laius);
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

    public void tapeediPanek() {
        double laiusteArv = tööPind() / 0.53;
        double pikkusteArv = laiusteArv / this.korgus;
        double rullideArv = Math.round((pikkusteArv / 10.05) * 1.2);

        System.out.println(Math.round(rullideArv) + " rulli tapeedi läheb vaja. Igaks juhuks võta üks juurde.");
    }
}
