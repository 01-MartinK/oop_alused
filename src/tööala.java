public class tööala {
    private static int palk;

    public tööala(int palk) {
        this.palk = palk;
    }

    public static void arvuta_palk(töötaja töötaja) {
        double tootukindlustusmaks = 0.02 * palk - 4.8;
        double kogumispension = 0.02 * palk;
        double netopalk = palk - tootukindlustusmaks - kogumispension - töötaja.getKorteri_rent();
        double brutopalk = palk;
        System.out.println("Töötaja nimega " + töötaja.getNimi() + ". Tema brutopalk on " + brutopalk + " €.");
        System.out.println("Töötaja nimega " + töötaja.getNimi() + ". Tema netopalk on " + netopalk + " €.");
    }

    public int getPalk() {
        return palk;
    }
}
