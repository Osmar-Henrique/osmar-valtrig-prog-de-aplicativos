public class exercicioMetodo4 {
    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5};

        maiorVetores(vetor);
        menorVetores(vetor);
        somaVetores(vetor);

    }

    public static void maiorVetores(int vetor[]) {
        int maiorVetor = Integer.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorVetor) {
                maiorVetor = vetor[i];
            }
        }
        System.out.println("O maior valor é: " + maiorVetor);
    }

    public static void menorVetores(int vetor[]) {
        int menorVetor = Integer.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorVetor) {
                menorVetor = vetor[i];
            }
        }
        System.out.println("O menor valor é: " + menorVetor);
    }

    public static void somaVetores(int vetor[]) {
        int somaValores = 0;
        int mediaValores;
        int contador=0;
        for (int i = 0; i < vetor.length; i++) {
            somaValores += vetor.length;
            contador++;
        }
        mediaValores = somaValores /contador;
        System.out.println("A média dos valores é: " + mediaValores);
        System.out.println("Total de números para dividir: " + contador);
    }
}
