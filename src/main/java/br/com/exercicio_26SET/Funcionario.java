package br.com.exercicio_26SET;

public abstract class Funcionario {

    protected String nome;
    protected String matricula;
    protected double salarioBase;


    public Funcionario (String nome, String matricula, double salarioBase){

        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    //Getters
    public String getNome() {
        return nome;
    };
    public String getMatricula() {
        return matricula;
    };
    public double getSalarioBase() {
        return salarioBase;
    };


    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    };
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    };
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método Abtrato para ser implamentado nas subclasses
    public abstract double calcularSalario();

    // Método abtrato deve ser implamentado pela subclasses

    public void exibirDados(){

        System.out.println("Nome: " +nome);
        System.out.println("Matrícula: " +matricula);
        System.out.println("Salario Base:  " +salarioBase);
        System.out.println("Salario Final R$:  " +calcularSalario());
    }
}
