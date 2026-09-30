public class ex9 {
    public static void main(String[] args) {

        Carro c1 = new Carro(50);

        System.out.println(c1.getVelocidade());

        c1.acelerarCarro(10);

        System.out.println(c1.getVelocidade());

        c1.reduzirCarro(15);

        System.out.println(c1.getVelocidade());
    }
}
