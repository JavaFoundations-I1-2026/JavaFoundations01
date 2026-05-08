package aula3;

import javax.swing.*;

public class Repeticao {

    public static void item1() {
        //for
        // -> Quando sabemos quantas vezes vai repetir
        // -> Quanto pretendemos usar o indice de array.

        //Contar de 0 a 10
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void item2(){
        //for
        //percorrer e preencher um array
        int[] numerosMegaSena = new int[6];

        for(int i=0; i<6; i++){
            numerosMegaSena[i] = (int)(Math.random()*60)+1;
            System.out.println(i+1 + "º numero: " + numerosMegaSena[i]);
        }

    }

    public static void item3() {
        //for each
        // -> Percorrer um array e fazer algo com cada elemento

        String[] alunos = {"João", "Maria", "Pedro", "Ana", "Isabele"};


        for (String e : alunos) {
            System.out.println("Olá " + e);
        }

    }

    public static void item4() {
        //while
        //Quando temos uma condição especifica para finalizar o loop
        //Não precisamos saber quantas vezes vai repetir

        //como se fosse um for
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

    }

    public static void item5() {

        int opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 0 e 5:"));
        }

    }

    public static void item6() {

        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 0 e 5:"));
        }while (opcao != 0);


    }



}
