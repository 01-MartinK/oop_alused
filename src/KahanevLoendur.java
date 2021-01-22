public class KahanevLoendur {
    private int vaartus;   // objekti muutuja (atribuut), mis hoiab meeles loenduri väärtust

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
    }

    public void kahane() {
        this.vaartus -= 1;
    }
}
