/*
Minu jaoks segane juhend
 */

public class rystkulik {
    private static Double korgus = 0.0;
    private static Double laius = 0.0;

    public rystkulik(Double korgus, Double laius) {
        Double b = korgus * laius;
    }

    public rystkulik() {
    }

    private static Double vaartuseKontroll(Double väärtus) {
        if (väärtus < 0) {
            return Math.abs(väärtus);
        }
        return väärtus;
    }

    public Double umbermoot(Double a, Double b) {
        return a * 2 + b * 2;
    }

    public Double pindala(Double a, Double b) {
        return a * b;
    }

    public Double getKorgus() {
        return this.korgus;
    }

    public static void setKorgus(Double korgus) {
        if (korgus > 0) {
            rystkulik.korgus = vaartuseKontroll(korgus);
        }
    }

    public Double getLaius() {
        return this.laius;
    }

    public static void setLaius(Double laius) {
        if (laius > 0) {
            rystkulik.laius = vaartuseKontroll(laius);
        }
    }

    public String toString() {
        return "Ristkülik: " + this.laius + " x " + this.korgus;
    }
}
