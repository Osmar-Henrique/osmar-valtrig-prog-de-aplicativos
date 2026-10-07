public class ex10 {
    public static void main(String[] args) {

        Livro l1 = new Livro("livro1", false);
        Livro l2 = new Livro("livro2", true);

        l1.emprestar();
        System.out.println(l1);

        l2.devolver();
        System.out.println(l2);
    }
}
