import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Familia {

    private List<Pessoas> listaPessoas;

    public Familia() {
        listaPessoas = new ArrayList<Pessoas>();
    }

    public void adicionarFamiliares(Pessoas p) {
        listaPessoas.add(p);
    }

    public Pessoas encontraPessoasMaisVelha() {

        LocalDate dataMaisVelha = LocalDate.now();
        Pessoas pessoaMaisVelha = null;

        for (Pessoas p : listaPessoas){
            if (p.getDataNascimento().isBefore(dataMaisVelha)){
                dataMaisVelha = p.getDataNascimento();
                pessoaMaisVelha = p;
            }
        }
        return pessoaMaisVelha;
    }
}
