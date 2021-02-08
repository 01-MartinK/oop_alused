public class aknadUksed {
    private double pindala = 0;

    public aknadUksed(double korgus, double laius) {
        this.pindala = laius * korgus;
    }

    public double getPindala() {
        return pindala;
    }
}