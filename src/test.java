/*
If and else Pilvede ülesanne
ülesanne 2.1
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Palun sisestage pilvede kõrgus: ");
        double pilvedeKõrgus = sisend.nextDouble();
        if (pilvedeKõrgus > 6.0) {
            System.out.println("Need on ülemised pilved.");
        } else {
            System.out.println("Need ei ole ülemised pilved.");
        }
    }
}
