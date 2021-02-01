import java.awt.*;

public class kass extends loom {
    private Color karvavarv;

    public kass(String nimi, Color varv) {
        super(nimi);
        this.karvavarv = varv;
    }

    @Override
    public void haal() {
        System.out.println("Mau Mau");
    }
}
