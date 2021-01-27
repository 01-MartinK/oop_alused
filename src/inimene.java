import java.text.DecimalFormat;

public class inimene {
    Integer pikkus;
    Integer mass;
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

}
