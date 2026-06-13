package aula7.atividade06;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setSalario(10000);

        Gerente gerente = new Gerente();
        gerente.setNome("Joana");
        gerente.setSalario(20000);
        gerente.setBonus(500);

        JOptionPane.showMessageDialog(null,
                funcionario.getNome() +
                "\n Salário Calculado: " + funcionario.calcularSalario(15)
        );


        JOptionPane.showMessageDialog(null,
                gerente.getNome() +
                "\n Salário Calculado: " + gerente.calcularSalario(15)
        );




    }

}
