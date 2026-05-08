package atividades;

import javax.swing.*;

public class Atividade06 {

    public static void main(String[] args) {

        String temperaturaFstr = JOptionPane.showInputDialog("Informe a temperatura (F):");
        double temperaturaFdbl = Double.parseDouble(temperaturaFstr);

        double temperaturaC = (temperaturaFdbl - 32) * 5 / 9;

        String temperaturaCstr = String.format("%.1f", temperaturaC);

        JOptionPane.showMessageDialog(null, "Temperatura em ºC: " + temperaturaCstr);


    }
}
