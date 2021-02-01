public class loom {
    private int jalgadeArv = 4;
    private String nimi;

    public loom(String loomaNimi) {
        this.nimi = loomaNimi;
    }

    public void haal() {
        System.out.println("Mul " + this.nimi + " on hääl");
    }

    public void jalutan() {
        System.out.println("Mina " + this.nimi + " suutan jaludada");
    }

    public void soon() {
        System.out.println("Mina " + this.nimi + " suudan süüa");
    }

    @Override
    public String toString() {
        return "Olen " + this.nimi + " ja minul on " + this.jalgadeArv + " jalga";
    }
}
