package aula06.atividade05;

import javax.swing.*;

public class Cachorro extends Animal {

    String raca;
    
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
    
    void emitirSom() {
        JOptionPane.showMessageDialog(null, "Au au au");
    }


}
