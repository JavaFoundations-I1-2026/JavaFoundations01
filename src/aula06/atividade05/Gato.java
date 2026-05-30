package aula06.atividade05;

import javax.swing.*;

public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    void emitirSom() {
        JOptionPane.showMessageDialog(null, "Miaaau");
    }
}
