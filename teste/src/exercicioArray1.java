import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioArray1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> numero = new ArrayList<>();


        numero.add(29);
        numero.add(35);
        numero.add(48);
        numero.add(55);
        numero.add(58);
        numero.add(90);
        numero.add(87);
        numero.add(17);

        System.out.println("Digite um número: ");
        int novoNumero = input.nextInt();

        int indice = numero.indexOf(novoNumero);

        if (indice != -1){
            System.out.println(indice);
        }
        else {
            System.out.println("Não está na lista");
        }

//        alternativa mais 'lenta'
//        if (numero.contains(novoNumero)) {
//            System.out.println(numero.indexOf(novoNumero));
//        }
//        else {
//            System.out.println("Numero não encontrado.");
//        }

    }
}
