package br.com.exercicio_26SET;

public class Desenvolvedor extends Funcionario{

    private int horasExtra;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome, String matricula, double salarioBase, int horasExtra, Double valorHoraExtra){
        super(nome, matricula, salarioBase);
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;

    }



    @Override
    public double calcularSalario(){

        return salarioBase + (valorHoraExtra * horasExtra);
    };


    public void registrarHoraExtra(int horasExtra){
        this.horasExtra += horasExtra;
    }


}
