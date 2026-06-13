package aula6.atividade05;

public class Cachorro extends Animal {

    String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    void emitirSom(){
        System.out.println("Au au au");
        //super.emitirSom();
    }


}
