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


}
