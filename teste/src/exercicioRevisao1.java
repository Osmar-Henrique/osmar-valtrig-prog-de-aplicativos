import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicioRevisao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Informe o número de matrícula do funcionário: ");
        String matricula = input.next();
        System.out.println("Informe o nome do funcionário: ");
        String nome = input.next();
        System.out.println("Informe a quantidade de horas trabalhadas na semana: ");
        double horas = input.nextDouble();
        System.out.println("Informe o valor da hora do funcionário: ");
        double valorHora = input.nextDouble();


        double resultado;
        resultado = (horas*4)*valorHora;

        System.out.println("---".repeat(20));
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Valor do salário mensal: " + df.format(resultado));
        System.out.println("---".repeat(20));

        input.close();

    }
}
