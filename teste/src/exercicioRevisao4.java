import java.util.Scanner;

public class exercicioRevisao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;
        String inscricao = "0";
        double altura = 1;
        double maisAlto = -1;
        double maisBaixo = 2;
        double somaALturas = 0;

        while (altura > 0) {
            System.out.println("Digite a inscrição do atleta: ");
            inscricao = input.next();
            System.out.println("Digite a altura do atleta: ");
            altura = input.nextDouble();
            contador++;

            if (altura == 0)
            {
                contador--;
                break;
            }

            if (altura > maisAlto) {
                maisAlto = altura;
            }
            if (altura < maisBaixo) {
                maisBaixo = altura;
            }

            somaALturas += altura;

        }

            System.out.println("O atleta mais alto é: "  + maisAlto);
            System.out.println("O atleta mais baixo é: "  + maisBaixo);
            System.out.println("A média de altura dos atletas é  " + (somaALturas/contador));
            System.out.println("A quantidade de atletas é: "+ contador);
        }
    }
