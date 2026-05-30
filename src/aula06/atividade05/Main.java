package aula06.atividade05;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Toto",10,"Labrador");

        Gato gato = new Gato();
        gato.nome = "Sig";
        gato.idade = 5;

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(cachorro);
        animais.add(gato);
        animais.add(new Cachorro("Thunder",7,"Poodle"));
        animais.add(new Gato());
        animais.add(new Capivara());

        for (Animal animal : animais) {
            animal.emitirSom();
        }


    }

}
