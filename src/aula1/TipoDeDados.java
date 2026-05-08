package aula1;

import java.util.Scanner;

public class TipoDeDados {

    public static void item1(){
        //Numeros inteiros
        int numero = 10;

        //Numeros decimais
        double numero2 = 10.5; //Precisão de 15 casas decimais
        float numero3 = 10.5f; //Precisão de 7 casas decimais

        //Textos
        String nome = "Daniel";
        char letra = 'a';

        //Valores de estado
        boolean estado = true;

        System.out.println(numero + " é um inteiro");
        System.out.println(numero2 + " é um decimal com precisão de 15 casas" );
        System.out.println(numero3 + " é um decimal com precisão de 7 casas");
        System.out.println(nome + " é uma String");
        System.out.println(letra + " é um caracter");
        System.out.println(estado + " é um estado booleano");
    }
    
    public static void item2() {
        
        Scanner teclado = new Scanner(System.in); //Instanciando um scanner

        System.out.print("Qual é o seu nome? ");
        String nome = teclado.nextLine();
        System.out.print("Qual a sua idade? ");
        int idade = teclado.nextInt();
        System.out.print("Qual a sua pretenção salarial para daqui 5 anos? ");
        double pretencaoSalarial = teclado.nextDouble();
        System.out.print("Atualmente, você esta trabalhando na área de DEV? (S/n) ");
        char resposta = teclado.next().toUpperCase().charAt(0);
        
        boolean estaTrabalhando = resposta == 'S';

        System.out.print("Seu nome é " + nome);
        System.out.println(", você tem " + idade + " anos");
        System.out.println("Sua pretenção salarial é de R$ " + pretencaoSalarial );
        
        //Operador ternario
        String texto = estaTrabalhando? "esta trabalhando" : "não esta trabalhando";
        
        System.out.println("Atualmente, voce " + texto);

    }


}
