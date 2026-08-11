import java.util.Scanner;

public class exercicioRevisao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] v = {1,2,3,4,5};

        int maior = v[0];
        int menor = v[0];
        double soma = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] > maior)
            {
                maior = v[i];
            }
            if (v[i] < menor)
            {
                menor = v[i];
            }
            soma += v[i];
            }

        double media = soma/v.length;

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("O media valor é: " + media);

        }
    }
