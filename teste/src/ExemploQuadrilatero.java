public class ExemploQuadrilatero {
    public static void main(String[] args) {

        Quadrilatero q1 = new Quadrilatero();

        q1.altura = 5;
        q1.largura = 4.5;

        System.out.println(q1.obterPerimetro());


        Quadrilatero q2 = new Quadrilatero();

        q2.altura = 8;
        q2.largura = 6;

        System.out.println(q2.obterPerimetro());
    }
}
