public class exemploPOO02 {
    public static void main(String[] args) {

        Mercado m1 = new Mercado();

        m1.nome = "unidadeDeBlumenau";

        m1.macas = 1000;

        m1.precoMaca = 6.99;

        m1.laranjas = 1500;

        m1.precoLaranja = 4.50;

        System.out.println("Na unidade" + m1.nome + " o estoque de maçãs é de: " + m1.macas + " que custam " + m1.precoMaca);
        System.out.println("Na unidade" + m1.nome + " o estoque de laranjas é de: " + m1.laranjas + " que custam " + m1.precoLaranja);

        Mercado m2 = new Mercado();

        m2.nome = "unidadeDeJoinville";

        m2.macas = 800;

        m2.precoMaca = 5.80;

        m2.laranjas = 1900;

        m2.precoLaranja = 4.90;

        System.out.println("Na unidade" + m2.nome + " o estoque de maçãs é de: " + m2.macas + " que custam " + m2.precoMaca);
        System.out.println("Na unidade" + m2.nome + " o estoque de laranjas é de: " + m2.laranjas + " que custam " + m2.precoLaranja);

        Mercado m3 = new Mercado();

        m3.nome = "unidadeDeFlorianopolis";

        m3.macas = 500;

        m3.precoMaca = 7.90;

        m3.laranjas = 800;

        m3.precoLaranja = 6.70;

        System.out.println("Na unidade" + m3.nome + " o estoque de maçãs é de: " + m3.macas + " que custam " + m3.precoMaca);
        System.out.println("Na unidade" + m3.nome + " o estoque de laranjas é de: " + m3.laranjas + " que custam " + m3.precoLaranja);

    }
}
