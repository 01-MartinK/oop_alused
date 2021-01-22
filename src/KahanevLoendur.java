public class KahanevLoendur {
    private int vaartus;   // objekti muutuja (atribuut), mis hoiab meeles loenduri väärtust
    private int startVaartus;

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
        this.startVaartus = vaartusAlguses;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
    }

    public void kahane() {
        if (this.vaartus != 0) {
            this.vaartus -= 1;
        }
    }

    public void reset() {
        this.vaartus = 0;
    }

    public void algvaartusta() {
        this.vaartus = startVaartus;
    }
}
