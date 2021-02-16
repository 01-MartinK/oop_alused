public class Opetaja {
    private String nimi;

    // Constructor
    public Opetaja(String nimi) {
        this.nimi = nimi;
    }

    // Nime saamine
    public String getNimi() {
        return nimi;
    }

    // Õpetaja õpetab õpilast kuigi õpilane ei saa aru õpib ta teema ikkagi ära
    public void opetab(Opilane opilane, String teema) {
        System.out.println("");
        System.out.println("Õpetaja: Kas te saate aru?");
        System.out.println(opilane.getNimi() + ": Ei!");
        System.out.println("Õpetaja: tubli olete omandanud " + teema + " teema.");
        System.out.println("");
        opilane.opib(teema);
    }
}
