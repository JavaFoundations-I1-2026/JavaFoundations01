package aula1;

import java.util.Scanner;

public class Operadores {
    
    public static void item1(){
        
        //Operadores aritimeticos (+ - * / %)
        
        int primeiroNumero = 10;
        int segundoNumero = 3;
        
        //SOMA
        int soma = primeiroNumero + segundoNumero;          //Resultado: 13
        int subtracao = primeiroNumero - segundoNumero;     //Resultado: 7
        int multiplicacao = primeiroNumero * segundoNumero; //Resultado: 30
        int divisao = primeiroNumero / segundoNumero;       //Resultado: 3
        int resto = primeiroNumero % segundoNumero;         //Resultado: 1
        
        //casting - Converter um tipo int para um tipo double
        double divisaoDecimal = (double) primeiroNumero / segundoNumero;
        
        System.out.println("NUMEROS: " + primeiroNumero + " e " + segundoNumero);
        System.out.println("SOMA: " + soma );
        System.out.println("SUBTRAÇÃO: " + subtracao );
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao );
        System.out.println("DIVISÃO: " + divisao + " (Inteiro)");
        System.out.println("DIVISÃO: " + divisaoDecimal + " (Decimal)");
        System.out.println("MODULO: " + resto );
        
    }
    
    public static void item2(){
        //Operadores relacionais (== != > < >= <=)

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Digite outro numero: ");
        int numero2 = teclado.nextInt();

        System.out.println(numero1 + " == " +numero2 + ": " + simNao(numero1 == numero2));
        System.out.println(numero1 + " != " +numero2 + ": " + simNao(numero1 != numero2) );
        System.out.println(numero1 + " > " +numero2 + ": " + simNao(numero1 > numero2) );
        System.out.println(numero1 + " < " +numero2 + ": " + simNao(numero1 < numero2) );
        System.out.println(numero1 + " >= " +numero2 + ": " + simNao(numero1 >= numero2) );
        System.out.println(numero1 + " <= " +numero2 + ": " + simNao(numero1 <= numero2) );
        
    }

    public static void item3(){
        //Operadores lógicos (&& || !)

        boolean eMaiorDeIdade = false;
        boolean temFilhos = true;
        boolean temCursoSuperior = true;
        boolean temPosGraduacao = true;
        boolean temExperiencia = true;

        if(!eMaiorDeIdade){
            System.out.println("Esta Bloqueado");
        }

        if((temCursoSuperior || temExperiencia) && !temPosGraduacao){
            System.out.println("Esta habilitado para DEV JR.");
        }

        if(temCursoSuperior && temExperiencia){
            System.out.println("Esta habilitado para DEV Pleno.");
        }
        if(temCursoSuperior && temExperiencia && temPosGraduacao){
            System.out.println("Esta habilitado para DEV Senior.");
        }






    }

    public static void item4(){
        //Operadores de incremento e decremento (++ / --)

        int contador = 0;

        contador++;     // passa a valer 1
        contador++;     // passa a valer 2
        contador++;     // passa a valer 3
        System.out.println("contador: " + contador);
        contador--;
        System.out.println("contador: " + contador);

        int indice = 30;

        //pós incremento
        int indiceAnterior = indice++;    // é mesmo que indice = indice + 1;

        System.out.println("indice: " + indice);
        System.out.println("indiceAnterior: " + indiceAnterior);

        //pré incremento
        int novoIndice = ++indice;
        System.out.println("indice: " + indice);
        System.out.println("Novo indice: " + novoIndice);

    }

    public static void item5(){
        //Operadores de atribuição (= += -= *= /= %=)

        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite um numero: ");
        numero1 = teclado.nextInt();
        System.out.println("Digite outro numero: ");
        numero2 = teclado.nextInt();

        //10 2
        numero1 += numero2;
        System.out.println("numero1 += numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);


        numero1 -= numero2;
        System.out.println("numero1 -= numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        numero1 *= numero2;
        System.out.println("numero1 *= numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        numero1 /= numero2;
        System.out.println("numero1 /= numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        numero1 %= numero2;
        System.out.println("numero1 %= numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

    }


    static String simNao(boolean valor){
        return valor?"SIM":"NÃO";
    }


}
