public class Moobel {
    private String nimi;
    private String mooblitykk;
    private String stiil;
    private inimene laip;

    public Moobel(String nimi, String mooblitykk, String stiil) {
        this.nimi = nimi;
        this.mooblitykk = mooblitykk;
        this.stiil = stiil;
    }

    public String toString() {
        return String.format(" See mööbel on " + this.nimi + ", " + this.stiil + " stiilis " + " ja see on " + this.mooblitykk + " seda tüüpi mööblitükk.");
    }
}
