import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicioRevisao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");


        System.out.println("Digite o nome do vendedor: ");
        String nome = input.next();
        System.out.println("Digite o salário do vendedor: ");
        double salario = input.nextDouble();
        System.out.println("Digite o total das vendas realizadas no mês: ");
        double vendas = input.nextDouble();

        double comissao;
        comissao = vendas*0.15;
        double salarioTotal;
        salarioTotal = comissao + salario;

        System.out.println("---".repeat(20));
        System.out.println("Vendedor: " + nome);
        System.out.println("Total a receber: " + df.format(salarioTotal));

    }
}
