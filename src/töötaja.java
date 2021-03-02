public class töötaja extends inimene {
    private int korteri_rent;
    private int töötundide_arv;
    private String nimi;

    public töötaja(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getTöötundide_arv() {
        return töötundide_arv;
    }

    public void setTöötundide_arv(int töötundide_arv) {
        this.töötundide_arv = töötundide_arv;
    }

    public int getKorteri_rent() {
        return korteri_rent;
    }

    public void setKorteri_rent(int korteri_rent) {
        this.korteri_rent = korteri_rent;
    }
}
