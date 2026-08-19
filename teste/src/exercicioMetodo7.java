import java.util.Scanner;

public class exercicioMetodo7 {

    public static String estacaoVerao ()
    {
        String num1 ="É verão e o tempo está quente.";
        return num1;
    }
    public static String estacaoOutono ()
    {
        String num2 = "É outono e as folhas caem.";
        return num2;
    }
    public static String estacaoPrimavera()
    {
        String num3 = "É primavera e está florido.";
        return num3;
    }
    public static String estacaoInverno()
    {
        String num4 = "É inverno e esfriou.";
        return num4;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite um número de 1 à 4");
        int numero = input.nextInt();

        if (numero == 1)
        {
            System.out.println(estacaoVerao());
        }
        else if (numero == 2)
        {
            System.out.println(estacaoOutono());
        }
        else if (numero == 3)
        {
            System.out.println(estacaoPrimavera());
        }
        else
        {
            System.out.println(estacaoInverno());
        }

    }
}
