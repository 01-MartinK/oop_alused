public class konto {
    // muutujad
    public String omanik;
    public Double bilans;

    // Konstruktor
    // See genereerumis käsk on jummala hea. Kuid sellel on oma probleemid
    public konto(String omanik) {
        this.omanik = omanik;
    }

    public konto(String omanikuNimi, Double summa) {
        this.looKonto(omanikuNimi, summa);
    }

    // meetodi
    public void looKonto(String omanikuNimi, Double summa) {
        this.omanik = omanikuNimi;
        this.bilans = summa;
    }

    public boolean lisaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa pole võimalik lisada");
            return false;
        } else {
            this.bilans = this.bilans + summa;
            System.out.println("Kontole lisatud summa: " + summa);
            return true;
        }
    }

    public boolean võtaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa pole võimalik võtta kontost");
            return false;
        } else {
            if (summa <= this.bilans) {
                this.bilans = this.bilans - summa;
                System.out.println("Kontost on võetud: " + summa + " ära.");
                return true;
            } else {
                System.out.println("Kontol pole piisavalt raha");
                return false;
            }

        }
    }

    public boolean teeUlekanne(konto teineKonto, Double summa) {
        if (summa < 0) {
            System.out.println("Pole võimalik negatiivset rahasummat ülekanda");
            return false;
        } else {
            if (this.bilans >= summa) {
                this.bilans = this.bilans - summa;
                teineKonto.bilans = teineKonto.bilans + summa;
                System.out.println("Teisele kontole ülekantud " + summa + " bilanssi.");
                return true;
            } else {
                System.out.println("Pole piisavalt raha kontol!");
                return false;
            }
        }
    }

    public void lisaRahaSelgitus(Boolean tegevus) {
        if (tegevus == true) {
            System.out.println("Raha on lisatud");
        } else {
            System.out.println("Raha ei ole lisatud - negativne summa");
        }
    }
}
