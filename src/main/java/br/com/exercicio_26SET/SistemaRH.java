package br.com.exercicio_26SET;

public class SistemaRH {

    public static void main(String[] args) {

        //Criando Funcionários - POLIMORFISMO
        Funcionario[] funcionarios = new Funcionario[3];

        Desenvolvedor dev = new Desenvolvedor("Ana", "DEV001", 5000, 50, 145.00);
        dev.registrarHoraExtra(10);
        funcionarios[0] = dev;


        Gerente gerente = new Gerente("Carlos", "GER001", 8000);
        gerente.setBonusPerformance(1000);
        gerente.setComissao(500);
        funcionarios[1] = gerente;

        Estagiario estagiario = new Estagiario("Pedro", "EST001", 15.00);

        estagiario.registrarHoras(35);
        funcionarios[2]= estagiario;

        System.out.println("=== FOLHA DE PAGAMENTO ===");
        double totalFolha = 0;

        for (Funcionario func : funcionarios){
            func.exibirDados();
            totalFolha += func.calcularSalario();
            System.out.println("---");

        }

        System.out.println("TOTAL DA FOLHA: R$" + totalFolha);

        //Demostração de Polimorfismo
        System.out.println("\n=== DEMOSTRAÇÃO DE POLIMORFISMO ===");
        for (Funcionario func : funcionarios){
            System.out.println(func.getNome()+ "- Salário: R$" + func.calcularSalario());
        }

    }
}
