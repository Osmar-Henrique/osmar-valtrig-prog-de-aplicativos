public class Ex1RelEntreObjetos {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(70,75);
        Retangulo r2 = new Retangulo(40,35);
        Retangulo r3 = new Retangulo(50,45);
        Retangulo r4 = new Retangulo(60,55);

        ListaRetangulos l1 = new ListaRetangulos();

        l1.adicionarRetangulo(r1);
        l1.adicionarRetangulo(r2);
        l1.adicionarRetangulo(r3);
        l1.adicionarRetangulo(r4);

        System.out.println(l1.obterMaiorArea());
        System.out.println(l1.obterMaiorPerimetro());

    }
}
