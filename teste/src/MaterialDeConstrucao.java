import java.util.ArrayList;
import java.util.List;

public class MaterialDeConstrucao {

    private List<Produto> lojaMaterial;

    public MaterialDeConstrucao() {
        lojaMaterial = new ArrayList<Produto>();
    }

    public void adicionaMaterial (Produto p) {
        lojaMaterial.add(p);
    }

    public Produto produtoMaisCaro(String marca) {
        Produto maisCaro = null;

        for (Produto p : lojaMaterial) {
            if (p.getMarca().equalsIgnoreCase(marca)) {
                if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
                    maisCaro = p;
                }
            }

        }
        return maisCaro;
    }

    public List<Produto> produtoPorMarcaEpreco(String marca, double precoX, double precoY) { //o retorno é sempre aquilo que aparece no inicio, no caso,
        List<Produto> resultado = new ArrayList<>();                                         //no caso, uma lista List, entre parenteses são só os parametros


        for (Produto p : lojaMaterial) {
            if (p.getMarca().equalsIgnoreCase(marca) && p.getPreco() >= precoX && p.getPreco()<= precoY){
                resultado.add(p);
            }
        }
        return resultado;
    }

}
