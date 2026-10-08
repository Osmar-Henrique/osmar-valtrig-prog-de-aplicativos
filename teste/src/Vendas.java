import java.util.ArrayList;
import java.util.List;

public class Vendas {

    private List<Floricultura> vendasFlores;

    public void listaVendasFlores() {
        vendasFlores = new ArrayList<Floricultura>();
    }

    public void adicionarVendas(Floricultura v) {
        vendasFlores.add(v);
    }




}
