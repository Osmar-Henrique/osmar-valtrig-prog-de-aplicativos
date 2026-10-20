import java.util.ArrayList;
import java.util.List;

public class Vendas {

    private List<Floricultura> vendasFlores;

    public Vendas() {
        vendasFlores = new ArrayList<Floricultura>();
    }

    public void adicionarVendas(Floricultura f) {  //como a lista está encapsulada, precisamos usar
        vendasFlores.add(f);                       //esse motodo para adicionar objetos.
    }

    public List<Floricultura> listarFloresPorCliente(String nomeClientes) {             //o metodo é public, mas o retorno
        List<Floricultura> floresCompradas = new ArrayList<>();                         //utilizado será a LISTA de flores, não apenas uma flor
                                                                                         //por esse motivo usamos o List a informação que virá de
        for (Floricultura f : vendasFlores) {                                           //fora do metodo é String, o parametro será String.
            if (f.getNome().equals(nomeClientes)) { //se o nome pesquisado for igual   //precisamos instanciar uma lista vazia para ser preenchida
                floresCompradas.add(f);             //ele adiciona a lista             //aí usamos List<Floricultura> floresCompradas = new Arraylist
            }

        }
        return floresCompradas;

    }
}