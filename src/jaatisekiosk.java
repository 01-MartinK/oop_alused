import java.util.ArrayList;

public class jaatisekiosk extends Restoraan {

    private ArrayList<String> jaatiseValik = new ArrayList<String>();

    public jaatisekiosk(String nimi) {
        super(nimi, "jäätis");
    }

    public void lisaJaatis(String nimi) {
        this.jaatiseValik.add(nimi);
    }

    public void kustutaJaatis() {
        this.jaatiseValik.remove(0);
    }

    public int jaatised() {
        return jaatiseValik.size();
    }

    @Override
    public String toString() {
        return String.format(" Tere tulemast restoraani " + this.getNimi() + ". Me pakume " + jaatiseValik);
    }

}
