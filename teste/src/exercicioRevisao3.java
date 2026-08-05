import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicioRevisao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Informe o seu peso: ");
        double peso = input.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = input.nextDouble();

        double imc;
        imc = peso/(altura*altura);

        if (imc < 18.5)
        {
            System.out.println("Magreza " + df.format(imc));
        }
        if (imc >= 18.5 && imc <= 24.9)
        {
            System.out.println("Saudável " + df.format(imc));
        }
        if (imc == 25 && imc <= 29.9)
        {
            System.out.println("Sobrepeso " + df.format(imc));
        }
        if (imc == 30 && imc <= 34.9)
        {
            System.out.println("Obesidade grau I " + df.format(imc));
        }
        if (imc == 35 && imc <= 39.9)
        {
            System.out.println("Obesidade grau II (SEVERA) " + df.format(imc));
        }
        if (imc >= 40.0)
        {
            System.out.println("Obesidade grau III (MORBIDA) " + df.format(imc));
        }
    }
}
