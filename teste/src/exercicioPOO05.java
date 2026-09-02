public class exercicioPOO05 {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.nome = "João";
        f1.sobrenome = "Batista";
        f1.salario = 1500;

        double reajuste = 0.10;

        System.out.println("Nome completo " + f1.obterNomeCompleto());
        System.out.println("Salário anual: " + f1.obterSalarioAnual());
        System.out.println("Reajuste anual: " + f1.ajustarSalario(reajuste));
    }
}
