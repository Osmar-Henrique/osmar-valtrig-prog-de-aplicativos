import java.util.Scanner;

public class exercicioMetodo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número base: ");
        double base = input.nextDouble();

        System.out.println("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = input.nextDouble();


        numeroBase(base, n1 , n2);

    }

    public static void numeroBase (double base, double n1, double n2){

        double distanciaBase1 = base - n1; //Math.abs(n1 - base);
        double distanciaBase2 = base - n2; //Math.abs(n2 - base);

        if (distanciaBase1 < distanciaBase2)
        {
            System.out.println("O numero " + n1 + " está mais próximo do " + base);
        }
        else if (distanciaBase2 < distanciaBase1)
        {
            System.out.println("O numero " + n2 + " está mais próximo do " + base);
        }
        else
        {
            System.out.println("Ambos os números estão próximos do " + base);
        }

    }

}
