package atividades;

import javax.swing.*;

public class Atividade03 {
    public static void main(String[] args) {

        int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID: "));

        String portao = id%2==0 ? "A":"B";
        String naoVip = id%5==0? "":" não";

        String mensagem = "Bem vindo, o seu ID é "+ id + ", acesse pelo portão "+ portao + ".\nVoce"+naoVip+" é um usuário VIP";

        System.out.println(mensagem);
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
