import java.util.Scanner;

public class exercicioMetodo10 {


    public static double limitarDistanciaMaior (double lim1)
    {
        return lim1;
    }
    public static double limitarDistanciaMenor (double lim2)
    {
        return lim2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador =0;

        System.out.println("Digite um valor: ");
        double valor = input.nextDouble();

        if (limitarDistanciaMenor(valor) >= 70 && limitarDistanciaMaior(valor) <= 100)
        {
            contador++;
        }
        if (contador == 1)
        {
            System.out.println("Está nos limites impostos!");
        }
        else
        {
            System.out.println("Não está nos limites impostos.");
        }
        System.out.println(contador);

    }
}
