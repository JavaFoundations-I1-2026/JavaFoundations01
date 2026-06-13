package aula7.atividade06;

public class Funcionario {

    private String nome;
    private double salario;

    public double calcularSalario(int diasTrabalhados){
        return (salario/30) * diasTrabalhados;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
