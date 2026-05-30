package aula06.atividade05;

import javax.swing.*;

public class Animal {

    //Atributos
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Metodos
    void emitirSom() {
        JOptionPane.showMessageDialog(null, "Som genérico de animal");
    }


}
