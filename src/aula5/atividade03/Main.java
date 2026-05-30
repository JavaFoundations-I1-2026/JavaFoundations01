package aula5.atividade03;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        //Criar uma conta
        ContaBancaria conta1 = new ContaBancaria("Maria","123456789");
        
        //Solicitar valor de deposito
        String depositoStr = JOptionPane.showInputDialog("Digite o valor a ser depositado:");
        double deposito = Double.parseDouble(depositoStr);
        //Chamar o metodo depositar da conta
        conta1.depositar(deposito);
        
        //Solicitar valor de saque
        String saqueStr = JOptionPane.showInputDialog("Digite o valor a ser sacado:");
        double saque = Double.parseDouble(saqueStr);
        //Chamar o metodo sacar da conta
        conta1.sacar(saque);
        
        //Exibir extrato da conta
        conta1.exibirExtrato();
        
    }
}
