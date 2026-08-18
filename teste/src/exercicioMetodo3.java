import java.util.Scanner;

public class exercicioMetodo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        imprimir20Numeros(numero); //tem que colocar a variável de cima para ler o número digitado + metodo abaixo
    }

    public static void imprimir20Numeros (int num){
        for (int i = num; i <= num + 20; i++){
            System.out.println(i);
        }
    }
}
