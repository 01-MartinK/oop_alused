public class Restoraan {
    private String nimi;
    private String soogiTyyp;
    private Integer teenitudKylalised;

    public Restoraan(String nimi, String soogityyp) {
        this.nimi = nimi;
        this.soogiTyyp = soogityyp;
        this.teenitudKylalised = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public void teenindatudKylalisedPaevas(int kylalised) {
        this.teenitudKylalised += kylalised;
    }

    public Integer getTeenitudKylalised() {
        return teenitudKylalised;
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
