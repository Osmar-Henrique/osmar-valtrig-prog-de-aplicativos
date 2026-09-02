public class Funcionario {

    String identificacao;

    String nome;

    String sobrenome;

    double salario;


    public String obterNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double obterSalarioAnual() {
        return salario * 12;
    }

    public double ajustarSalario(double reajuste) {
        return salario * reajuste + salario;
    }
}
