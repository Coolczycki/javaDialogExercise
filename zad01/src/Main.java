import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //zad 1.1 - 1/3
        double ziemniakiCena = Double.parseDouble(JOptionPane.showInputDialog(null, "Ile kosztuje kilo ziemniakow?"));
        double ziemniakiTotal = ziemniakiCena * 5;
        JOptionPane.showMessageDialog(null, "Cena za 5kg ziemniakow to " + ziemniakiTotal);

        //zad 1.1 - 2/3
        double ziemniakiCenaDwa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ile kosztuje kilo ziemniakow?"));
        double ziemniakiKilo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ile kilo chcesz kupic ziemniakow?"));
        double ziemniakiTotalDwa = ziemniakiKilo * ziemniakiCenaDwa;
        JOptionPane.showMessageDialog(null,"Do zaplaty bedzie " + String.format("%.2f", ziemniakiTotalDwa));

        //zad 1.1 - 3/3
        double ziemniakiCenaFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ile kosztuje kilo ziemniakow?"));
        double bananyCenaFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ile kosztuje kilo bananow?"));

        double ziemniakiKiloFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ile kilo chcesz kupic ziemniakow?"));
        double bananyKiloFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ile kilo chcesz kupic bananow?"));

        double ziemniakiTotalFinal = ziemniakiCenaFinal * ziemniakiKiloFinal;
        double bananyTotalFinal = bananyCenaFinal * bananyKiloFinal;
        double totalFinal = ziemniakiTotalFinal + bananyTotalFinal;

        JOptionPane.showMessageDialog(null,"Ziemniaki beda kosztowac " + String.format("%.2f", ziemniakiTotalFinal)
                + " Banany beda kosztowac " + String.format("%.2f", bananyTotalFinal) + " Razem do zaplaty bedzie " + String.format("%.2f", totalFinal));

        if (bananyTotalFinal > ziemniakiTotalFinal) {
            JOptionPane.showMessageDialog(null, "Za banany zaplacisz wiecej niz za ziemniaki");
        } else {
            JOptionPane.showMessageDialog(null, "Za ziemniaki zaplacisz wiecej niz za banany");
        }
    }
}