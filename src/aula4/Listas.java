package aula4;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void item01(){

        //Cria uma lista vazia
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(109);
        numeros.add(20);
        numeros.add(67);
        System.out.println(numeros);

        //Adicionando itens na lista
        numeros.add(89);
        System.out.println(numeros);

        //Adicionando itens no meio da lista
        numeros.add(2, 30);
        System.out.println(numeros);

        //Acessando itens da lista
        System.out.println("Primeiro item da lista: " + numeros.get(0)); //primeiro item da lista
        System.out.println("Último item da lista: " + numeros.get(numeros.size()-1)); //último item da lista

        System.out.println("Primeiro item da lista: " + numeros.getFirst());
        System.out.println("Último item da lista: " + numeros.getLast());

        numeros.remove(3);
        System.out.println(numeros);

        System.out.println("Posição do numero 89: " + numeros.indexOf(89));
        numeros.remove(numeros.indexOf(89));
        System.out.println(numeros);

        numeros.add(20);
        System.out.println(numeros);

        //Remover todos os itens que forem iguais a 20
        boolean removeu = numeros.removeIf(n -> n == 20);

        System.out.println(numeros);
        System.out.println("Removido: " + removeu);

        //alterando um item da lista
        numeros.set(0,99);
        System.out.println(numeros);

    }

    public static void item02() {

        //Lista imutavel
        //List<String> produtos = List.of("Mouse", "pendrive", "SSD");

        //Lista mutavel
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("pendrive");
        produtos.add("SSD");
        produtos.add("Mouse");
        System.out.println(produtos);

        System.out.println("Tem mouse na lista? : " + produtos.contains("Mouse"));

        produtos.remove("Mouse");
        System.out.println(produtos);
        System.out.println("Tem mouse na lista? : " + produtos.contains("Mouse"));

        

    }

}
