package aula1;
import javax.swing.*;

public class Strings {

    public static void item1(){
        //Comparação de Strings

        String nome1 = "Daniel";
        String sobrenome1 = "Campos Pereira";

        String nomeCompleto1 = nome1 + " " + sobrenome1;    //Daniel Campos Pereira
        String nomeCompleto2 = "Daniel Campos Pereira";     //Daniel Campos Pereira

        System.out.println(nomeCompleto1);
        System.out.println(nomeCompleto2);

        //NÃO FAZER -> usar o ==
        System.out.println("Comparação com == : " + (nomeCompleto1 == nomeCompleto2));

        //O QUE FAZER
        System.out.println("Comparação com .equals()" + nomeCompleto1.equals(nomeCompleto2));

    }

    public static void item2(){
        //Métodos STRING

        String nome = JOptionPane.showInputDialog("Informe seu nome: ");

        System.out.println("Nome em MAIUSCULAS :" + nome.toUpperCase() );
        System.out.println("Nome em minusculas :" + nome.toLowerCase() );
        System.out.println("Primeira letra do nome :" + nome.charAt(0) );
        System.out.println("Quantidade de letras do nome :" + nome.length() );
        System.out.println("Ultima letra do nome :" + nome.charAt(nome.length()-1) );

        String primeiroNome = nome.substring(0, nome.indexOf(" "));
        String segundoNome = nome.substring(nome.indexOf(" "), nome.lastIndexOf(" "));

        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Segundo nome: " + segundoNome);

        String nomes[] = nome.split(" ");

        String idadeString = JOptionPane.showInputDialog("Informe sua idade: ");
        int idadeInt = Integer.parseInt(idadeString);

        System.out.println("Idade: " + idadeString);




    }

  

}
