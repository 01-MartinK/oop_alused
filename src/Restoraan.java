public class Restoraan {
    private String nimi;
    private String soogiTyyp;

    public Restoraan(String nimi) {
        this.nimi = nimi;
    }

    public Restoraan(String nimi, String soogityyp) {
        this.nimi = nimi;
        this.soogiTyyp = soogityyp;
    }

    public void avaRestoraan() {
        System.out.println("Restoraan on avatud.");
    }

    public String getSoogiTyyp() {
        return soogiTyyp;
    }

    public void setSoogiTyyp(String soogiTyyp) {
        this.soogiTyyp = soogiTyyp;
    }

    @Override
    public String toString() {
        return String.format(" Tere tulemast restoraani " + nimi + ". Me pakume " + soogiTyyp + ".");
    }
}
