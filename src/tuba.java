import java.util.ArrayList;

public class tuba {
    private double laius;
    private double pikkus;
    private double korgus;
    private double koguPindala;
    private double seintePindala;
    private ArrayList<aknadUksed> aknadUksed;
    private ArrayList<Moobel> mooblid;

    public tuba(double pikkus, double laius, double korgus) {
        this.laius = laius;
        this.pikkus = pikkus;
        this.korgus = korgus;

        this.seintePindala = arvutaPindala(this.pikkus, this.laius, this.korgus, false);
        this.koguPindala = arvutaPindala(this.pikkus, this.laius, this.korgus, true);

        this.aknadUksed = new ArrayList<>();
        this.mooblid = new ArrayList<>();
    }

    public void lisaAken(double korgus, double laius) {
        this.aknadUksed.add(new aknadUksed(korgus, laius));
    }

    public double arvutaPindala(double pikkus, double laius, double korgus, boolean koguPindala) {
        double pindala = 2 * (pikkus * laius + pikkus * korgus + laius * korgus);
        if (koguPindala) {
            return pindala;
        } else {
            return pindala - (2 * (pikkus * laius));
        }
    }

    public void getMooblid() {
        for (int i = 0; i < mooblid.size(); i++) {
            System.out.println(mooblid.get(i));
        }
    }

    public void setSeintePindala(double seintePindala) {
        this.seintePindala = seintePindala;
    }

    public void lisaMoobel(String nimi, String mooblitykk, String stiil) {
        boolean add = mooblid.add(new Moobel(nimi, mooblitykk, stiil));
    }

    public double tööPind() {
        double uusPindala = this.seintePindala;

        for (int i = 0; i != aknadUksed.size(); i++) {
            uusPindala = uusPindala - aknadUksed.get(i).getPindala();
        }
        return uusPindala;
    }

    public double getPindala() {
        return this.seintePindala;
    }

    public String tapeediPanek() {
        double laiusteArv = tööPind() / 0.53;
        double pikkusteArv = laiusteArv / this.korgus;
        double rullideArv = Math.round((pikkusteArv / 10.05) * 1.2);

        return (Math.round(rullideArv) + " rulli tapeedi läheb vaja. Igaks juhuks võta üks juurde.");
    }
}
