package br.com.exercicio_26SET;

public class Gerente extends Funcionario{

    private double bonusPerformance;
    private double comissao;

    public Gerente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
        this.bonusPerformance = 0.0;
        this.comissao = 0.0;
    }

    public double getComissao() {
        return comissao;
    }
    public double getBonusPerformance() {
        return bonusPerformance;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public void setBonusPerformance(double bonusPerformance) {
        this.bonusPerformance = bonusPerformance;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusPerformance * comissao;
    }
}
