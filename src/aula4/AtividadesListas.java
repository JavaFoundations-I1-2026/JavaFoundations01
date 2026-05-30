package aula4;

import javax.swing.*;
import java.util.ArrayList;

public class AtividadesListas {

    public static void atividade01(){

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        while(true){
            String entradaStr = JOptionPane.showInputDialog("Informe um número maior que 0: ");

            if (entradaStr == null){
                break;
            }

            Integer entradaInt = Integer.parseInt(entradaStr);

            //verifica se o numero par
            if(entradaInt%2 == 0){
                numeros.add(entradaInt);
            }

        }

        JOptionPane.showMessageDialog(null, numeros);

    }

    public static void atividade02() {

        ArrayList<String> nomes = new ArrayList<>();

        while(true){

            String entrada = JOptionPane.showInputDialog("Informe um nome: ");

            if(entrada == null){
                break;
            }

            if(!nomes.contains(entrada)){
                nomes.add(entrada);
            }

            JOptionPane.showMessageDialog(null, nomes);
        }

        JOptionPane.showMessageDialog(null, nomes);


    }

    public static void atividade03() {

        ArrayList<Integer> numeros = new ArrayList<>();

        while(true){
            String entradaStr = JOptionPane.showInputDialog("Informe um número: ");
            if (entradaStr == null){
                break;
            }
            Integer entradaInt = Integer.parseInt(entradaStr);
            numeros.add(entradaInt);
        }

        JOptionPane.showMessageDialog(null, numeros);

        int numeroAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero a ser substituido: "));
        int novoValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo valor: "));

        int indice = numeros.indexOf(numeroAtual);

        if(indice >=0 && indice <= numeros.size()-1){
            numeros.set(indice, novoValor);
        }

        JOptionPane.showMessageDialog(null, numeros);


    }

    public static void atividade04(){

        ArrayList<String> nomes = new ArrayList<>();

        //Recebe pelo menos 5 nomes do usuario, até ele decidir parar.
        while(true){
            String entrada = JOptionPane.showInputDialog("Informe um nome: ");
            if (entrada == null){
                if(nomes.size()>=5){
                    break;
                }
                else{
                    int faltam = 5 - nomes.size();
                    JOptionPane.showMessageDialog(null, "Ainda faltam "+faltam+" nomes.");
                }
            }
            else {
                nomes.add(entrada);
            }

        }
        JOptionPane.showMessageDialog(null, "A lista tem " + nomes.size() + " nomes.");
        JOptionPane.showMessageDialog(null,
                "Primeiro nome: " + nomes.getFirst()+" \n" +
                "Ultimo nome: " + nomes.getLast());

        String novoNome = JOptionPane.showInputDialog("Informe mais um nome para substituir " + nomes.get(2) + ": ");

        if(nomes.size()<=3){
            nomes.set(2, novoNome);
        }

        String nomeEliminar = JOptionPane.showInputDialog("Informe um nome para eliminar: ");
        boolean removeuNome = nomes.remove(nomeEliminar);

        JOptionPane.showMessageDialog(null, "Nome "+ (removeuNome?"":"não ") +"removido!!");

        String nomeVerificar = JOptionPane.showInputDialog("Escolha outro nome: ");
        if (nomes.contains(nomeVerificar)){
            JOptionPane.showMessageDialog(null,"OK, o nome existe na lista");
        }
        else{
            JOptionPane.showMessageDialog(null,"O nome não existe na lista");
        }

        JOptionPane.showMessageDialog(null, nomes);
    }

    public static void atividade05(){
        
        ArrayList<Double> notas = new ArrayList<>();
        ArrayList<Double> notasAprovadas = new ArrayList<>();
        
        while(true){
            String notaStr = JOptionPane.showInputDialog("Informe a nota" + (notas.size()+1) + ": ");
            if (notaStr == null){
                break;
            }
            Double notaDouble = Double.parseDouble(notaStr);
            notas.add(notaDouble);
            
            if(notaDouble >= 7){
                notasAprovadas.add(notaDouble);
            }
        }

        double soma = 0.0;
        double maiorNota = notas.get(0);
        double menorNota = notas.get(0);
        
        for(int i = 0; i < notas.size(); i++){
            
            soma += notas.get(i);
            
            if (notas.get(i) > maiorNota){
                maiorNota = notas.get(i);
            }
            if (notas.get(i) < menorNota){
                menorNota = notas.get(i);
            }
        }
        
        double media = soma/notas.size();
        
        String mediaStr = String.format("%.1f", media);

        JOptionPane.showMessageDialog(null,
                "A média das notas é: " + mediaStr + "\n" +
                "Maior nota: " + maiorNota + "\n" +
                "Menor nota: " + menorNota + "\n" +
                "Notas aprovadas: " + notasAprovadas        
                );

    }

}
