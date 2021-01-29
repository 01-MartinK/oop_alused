import java.text.DecimalFormat;

public class inimene {
    private Integer pikkus;
    private Integer mass;
    private String nimi;

    public inimene(String nimi) {
        this.nimi = nimi;
        this.pikkus = 0;
        this.mass = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Integer getPikkus() {
        return pikkus;
    }

    public void setPikkus(Integer pikkus) {
        this.pikkus = pikkus;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Double kmi() {
        DecimalFormat df = new DecimalFormat("#.##");
        Double b = ((double) this.mass / (this.pikkus * this.pikkus) * 10000);
        return Double.parseDouble(df.format(b));
    }

    public void suurenda_kaal() {
        this.mass++;
    }

    public void suurenda_kaal(int toidu_suurus) {
        this.mass += toidu_suurus;
    }

    public void vähenda_kaalu() {
        this.mass--;
    }

    public void vähenda_kaalu(int trenni_võimsus) {
        this.mass -= trenni_võimsus;
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


    public void tasakaalukus() {
        //see on norm
        while (kmi() <= 19) {
            this.suurenda_kaal(getRandomNumber(1, 5));
        }
        while (kmi() >= 25) {
            this.vähenda_kaalu(getRandomNumber(1, 5));
        }
    }

}
