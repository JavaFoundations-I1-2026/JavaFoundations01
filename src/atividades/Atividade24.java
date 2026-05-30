package atividades;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade24 {

    static String[][] tabuleiro = new String[3][3];

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean finalDoJogo = false;
        String jogadorAtual = "O";

        //inicialização do tabuleiro
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                tabuleiro[i][j] = " ";
            }
        }

        while(!finalDoJogo){


            //Receber a jogada do jogador.
            System.out.println("É a vez do jogador " + jogadorAtual);
            System.out.print("Informe a linha (1-3): ");
            int linhaJogada = teclado.nextInt()-1;
            System.out.print("Informe a coluna (1-3): ");
            int colunaJogada = teclado.nextInt()-1;


            //verificar se a jogada é válida
            if(tabuleiro[linhaJogada][colunaJogada].equals(" ")){
                tabuleiro[linhaJogada][colunaJogada] = jogadorAtual;
                //Alternar o jogador
                jogadorAtual = jogadorAtual.equals("O")?"X":"O";
            }
            else {
                System.out.println("Jogada inválida, tente novamente");
            }

            mostrarTabuleiro();

            if (verificarVitoria()){
                jogadorAtual = jogadorAtual.equals("O")?"X":"O"; //Ajuste técnico para alternar o jogador
                System.out.println("O jogador " + jogadorAtual + " venceu!");
                finalDoJogo = verificarVitoria();
            }
            else if(verificarEmpate()){
                System.out.println("O jogo empatou!");
                finalDoJogo = verificarEmpate();
            }
        }
    }

    public static void mostrarTabuleiro(){

        System.out.println("Mostrando o tabuleiro");

        for(int i=0;i<3;i++){

            System.out.print("|");
            for(int j=0;j<3;j++) {
                System.out.print(tabuleiro[i][j]);
                System.out.print("|");
            }
            System.out.println("");

        }

    }

    public static boolean verificarVitoria(){

        //Verificar horizontais
        for(int i=0; i<3; i++){

            if(!tabuleiro[i][0].equals(" ")){
                if(tabuleiro[i][0].equals(tabuleiro[i][1])){
                    if(tabuleiro[i][0].equals(tabuleiro[i][2])){
                        return true;
                    }
                }
            }
        }

        //Verificar verticais
        for(int j=0; j<3; j++){

            if(!tabuleiro[0][j].equals(" ")){
                if(tabuleiro[0][j].equals(tabuleiro[1][j])){
                    if(tabuleiro[0][j].equals(tabuleiro[2][j])){
                        return true;
                    }
                }
            }
        }

        //Verificar as diagonais

        return false;
    }

    public static boolean verificarEmpate(){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
               if (tabuleiro[i][j].equals(" ")){
                   return false;
               }
            }
        }
        return true;
    }
}
