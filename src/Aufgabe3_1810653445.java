import javax.swing.*;

public class Aufgabe3_1810653445 {

    public static void main(String[] args) {

        String eingabe = JOptionPane.showInputDialog("Bitte etwas eingeben");

        double alter = Double.parseDouble(JOptionPane.showInputDialog("bitte geben Sie Ihr alter ein"));
        JOptionPane.showMessageDialog(null, alter);

        int alter1 = Integer.parseInt(JOptionPane.showInputDialog("bitte geben Sie Ihr alter ein"));
        JOptionPane.showMessageDialog(null, alter1);

        boolean alter2 = Boolean.parseBoolean(JOptionPane.showInputDialog("bitte geben Sie Ihr alter ein"));
        JOptionPane.showMessageDialog(null, alter2);

        long alter3 = Long.parseLong(JOptionPane.showInputDialog("bitte geben Sie Ihr alter ein"));
        JOptionPane.showMessageDialog(null, alter3);

        char alter4 = eingabe.charAt(0);
        JOptionPane.showMessageDialog(null, alter4);

        byte alter5 = Byte.parseByte(JOptionPane.showInputDialog("bitte geben Sie Ihr alter ein"));
        JOptionPane.showMessageDialog(null, alter5);

        short alter6 = Short.parseShort(JOptionPane.showInputDialog("bitte geben Sie Ihr alter ein"));
        JOptionPane.showMessageDialog(null, alter6);

        float alter7 = Float.parseFloat(JOptionPane.showInputDialog("bitte geben Sie Ihr alter ein"));
        JOptionPane.showMessageDialog(null, alter7);

        String neu = String.valueOf(alter);
        JOptionPane.showMessageDialog(null, "Wert neu: " + neu);
    }

}
