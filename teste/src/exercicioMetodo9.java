import java.util.Scanner;

public class exercicioMetodo9 {

    public static boolean verdadeiro (int numero)
    {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if (verdadeiro(numero))
        {
            System.out.println("É verdadeiro! Par!");
        }
        else
        {
            System.out.println("É falso! Impar!");
        }

    }
}
