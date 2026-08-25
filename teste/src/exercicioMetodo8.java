import java.util.Scanner;

public class exercicioMetodo8 {

    public static double mediaAritimetica (double n1, double n2, double n3)
    {
        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 >10 || n3 < 0 || n3 > 0)
        {
            return 0;
        }
        return (n1 + n2 + n3)/3;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        System.out.println(mediaAritimetica(nota1,nota2,nota3));

    }
}
