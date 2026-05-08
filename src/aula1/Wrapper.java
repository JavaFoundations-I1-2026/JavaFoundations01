package aula1;

import javax.swing.*;

public class Wrapper {

    public static void item3() {
        //Somar dois numeros que vem do JOptionPane

        String numero1Input = JOptionPane.showInputDialog("Informe o primeiro numero: ");
        String numero2Input = JOptionPane.showInputDialog("Informe o segundo numero: ");

        int soma = Integer.parseInt(numero1Input) + Integer.parseInt(numero2Input);

        System.out.println("A soma é: " + soma);
    }

    public static void item4() {
        //Tirar a média de dois numeros que vem do JOptionPane

        String numero1Input = JOptionPane.showInputDialog("Informe o primeiro numero: ");
        String numero2Input = JOptionPane.showInputDialog("Informe o segundo numero: ");

        double media = Double.parseDouble(numero1Input) + Double.parseDouble(numero2Input) / 2;

        System.out.println("A média dos números é: " + media);
    }

    public static void item5() {

        Integer numero1 = 900;
        Integer numero2 = 900;

        //De preferencia não usar o ==
        System.out.println(numero1 == numero2); //true entre -128 até 127

        //Usar o .equals()
        System.out.println(numero1.equals(numero2)); //true

    }
    
    public static void item6() {
        //Outros metodos
        Integer numero1 = 900;

        numero1.toString();                     //Converte pra string
        int numero = Integer.valueOf("10");     //Converte de uma string para um numero
        System.out.println(numero);

        System.out.println(Integer.toBinaryString(numero1));    //Converte pra binario
        System.out.println(Integer.toHexString(numero1));       //Converte pra hexadecimal
        
    }
    
}
