import java.time.LocalDate;

public class Ex9RelObj {
    public static void main(String[] args) {


        Pessoas p1 = new Pessoas("Carlos", LocalDate.of(2005,10,25));
        Pessoas p2 = new Pessoas("Maria", LocalDate.of(2004,8,27));

        Familia f1 = new Familia();

        f1.adicionarFamiliares(p1);
        f1.adicionarFamiliares(p2);

        System.out.println(f1.encontraPessoasMaisVelha());
    }
}
