import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        tööala saepood = new tööala(1200);
        töötaja margus = new töötaja("Margus");
        margus.setKorteri_rent(320);

        tööala.arvuta_palk(margus);

        //teksti väljad
        JLabel palk = new JLabel("palk");
        JLabel tooandjaKuluKokku = new JLabel("Tööandja kulu kokku (palgafond):");
        JLabel brutopalk = new JLabel("brutopalk");
        JLabel netopalk = new JLabel("netopalk");

        JLabel tooandjaKuluKokku_arv = new JLabel("");
        JLabel brutopalga_arv = new JLabel("");
        JLabel netopalga_arv = new JLabel("");

        tooandjaKuluKokku.setBounds(20, 40, 200, 25);
        palk.setBounds(20, 20, 100, 25);
        brutopalk.setBounds(20, 60, 100, 25);
        netopalk.setBounds(20, 80, 100, 25);

        tooandjaKuluKokku_arv.setBounds(210, 40, 200, 25);
        brutopalga_arv.setBounds(80, 60, 200, 25);
        netopalga_arv.setBounds(80, 80, 200, 25);

        //kirjutamis väljad
        JTextField palga_sisestamine = new JTextField("sisesta palga kogu suurus");

        palga_sisestamine.setBounds(50, 20, 200, 25);

        palga_sisestamine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isNumeric(palga_sisestamine.getText())) {
                    brutopalga_arv.setText(palga_sisestamine.getText() + " €");
                    double brutopalk = Double.parseDouble(palga_sisestamine.getText());
                    netopalga_arv.setText(Double.toString(arvutaNetopalk(brutopalk)) + " €");
                    tooandjaKuluKokku_arv.setText(Double.toString(arvutaTooandjaPalk(brutopalk)) + " €");
                } else {
                    brutopalga_arv.setText("Error has occured!");
                    netopalga_arv.setText("Error has occured!");
                    tooandjaKuluKokku_arv.setText("Error has occured!");
                }
            }
        });

        //nupud
        JButton arvuta_palk = new JButton("Arvuta Palganumbrid");

        arvuta_palk.setBounds(20, 100, 200, 25);

        arvuta_palk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isNumeric(palga_sisestamine.getText())) {
                    brutopalga_arv.setText(palga_sisestamine.getText() + " €");
                    double brutopalk = Double.parseDouble(palga_sisestamine.getText());
                    netopalga_arv.setText(Double.toString(arvutaNetopalk(brutopalk)) + " €");
                    tooandjaKuluKokku_arv.setText(Double.toString(arvutaTooandjaPalk(brutopalk)) + " €");
                } else {
                    brutopalga_arv.setText("Error has occured!");
                    netopalga_arv.setText("Error has occured!");
                    tooandjaKuluKokku_arv.setText("Error has occured!");
                }

            }
        });

        //Liides
        JFrame liides = new JFrame("Palga Kalkulaatori ebaõnnestumine");
        liides.add(palk);
        liides.add(palga_sisestamine);
        liides.add(brutopalk);
        liides.add(netopalk);
        liides.add(arvuta_palk);
        liides.add(brutopalga_arv);
        liides.add(netopalga_arv);
        liides.add(tooandjaKuluKokku);
        liides.add(tooandjaKuluKokku_arv);
        liides.setSize(600, 600);
        liides.setLayout(null);
        liides.setVisible(true);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static double arvutaNetopalk(double palk) {
        double tootukindlustusmaks = 0.016 * palk;
        double kogumispension = 0.02 * palk;
        if (palk > 500) {
            double tulumaks = (palk - tootukindlustusmaks - kogumispension - 500) * 0.2;
            double netopalk = palk - tootukindlustusmaks - kogumispension - tulumaks;
            return netopalk;
        } else {
            double netopalk = palk - tootukindlustusmaks - kogumispension;
            return netopalk;
        }

    }

    public static double arvutaTooandjaPalk(double palk) {
        double sotsiaalmaks = palk * 0.33;
        double tootukindlusmaks = palk * 0.008;
        double tooandjaAndudRaha = palk + sotsiaalmaks + tootukindlusmaks;
        return tooandjaAndudRaha;
    }
}