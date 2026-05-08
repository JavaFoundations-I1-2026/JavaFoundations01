package atividades;

import javax.swing.*;

public class Atividade01 {

    public static void main(String[] args) {

        String nomeAstronauta = JOptionPane.showInputDialog("Informe o nome do Astronauta: ");
        int idadeAstronauta = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Astronauta: "));

        System.out.println("Bem-vindo(a) à Estação Órbita-1, " + nomeAstronauta + "!");
        System.out.println("Idade registrada: " + idadeAstronauta + " anos.");

        JOptionPane.showMessageDialog(null, "Bem-vindo(a) à Estação Órbita-1, " + nomeAstronauta + "!\n"
        + "Idade registrada: " + idadeAstronauta + " anos.");
    }

}
