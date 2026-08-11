import java.util.Scanner;

public class exercicioRevisao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;
        String inscricao;
        double altura;
        double maisAlto = -1;
        double maisBaixo = Double.MAX_VALUE;
        double somaALturas = 0;
        String inscricaoAlto = "";
        String inscricaoBaixo = "";

        System.out.println("Digite a inscrição do atleta: ");
        inscricao = input.next();
        System.out.println("Digite a altura do atleta: ");
        altura = input.nextDouble();

        while (inscricao.equals("0") || altura > 0) {

            somaALturas += altura;

            if (altura == 0 || inscricao.equals("0"))
            {
                break;
            }

            if (altura > maisAlto) {
                maisAlto = altura;
                inscricaoAlto = inscricao;
            }
            if (altura < maisBaixo) {
                maisBaixo = altura;
                inscricaoBaixo = inscricao;
            }
            System.out.println("Digite a inscrição do atleta: ");
            inscricao = input.next();
            System.out.println("Digite a altura do atleta: ");
            altura = input.nextDouble();
            contador++;



        }

            System.out.println("O atleta mais alto é: " + inscricaoAlto +  "com" +  maisAlto + "metros");
            System.out.println("O atleta mais baixo é: " + inscricaoBaixo + "com" + maisBaixo + "metros" );
            System.out.println("A média de altura dos atletas é  " + (somaALturas/contador));
            System.out.println("A quantidade de atletas é: "+ contador);
        }
    }
