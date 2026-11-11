public class ex6RelObj {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("SC","Blumenau", "89050-000", "Rua exemplo 1","01");
        Endereco e2 = new Endereco("SC", "Gaspar","88050-000","Rua exemplo 2", "02");


        Pessoa p1 = new Pessoa("Simao",e1);

        System.out.println(p1);
    }
}
