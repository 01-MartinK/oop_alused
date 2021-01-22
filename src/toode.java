public class toode {
    public String nimetus;
    public Double hind;
    public Integer kogus;

    public toode() {
    }

    public toode(String nimetus, double hind, int kogus) {
        this.nimetus = nimetus;
        this.hind = hind;
        this.kogus = kogus;
    }

    public void valjastaToode() {
        System.out.println(nimetus + ", hind " + hind + "€, kogus " + kogus);
    }
}
